package com.monopoly;

import static com.monopoly.Constants.Constant.*;

import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.monopoly.util.Map;
import com.monopoly.Players.Player;


public class Main {

    public static void main(String[] args) throws IOException {
	    // write your code here
        System.out.println("-------------------------------- Mini Monopoly Game --------------------------------");

        try {
            String packageCode = promptPackageOption();
            Map map = Map.getInstance(packageCode);
            int numPlayers = promptPlayerNumber();

            ArrayList<Player> players = new ArrayList<>();
            for (int i = 0; i < numPlayers; i++) {
                String name = promptPlayerName(i);
                players.add(new Player(name));
            }

            // main logic
            while (getAlivePlayers(players) > 1) {
                for (Player player: players) {
                    if (player.alive()) {
                        player.play();
                    }
                }
            }

            Player winner = getWinner(players);
            System.out.println("The winner is " + winner.getName() + "with total asset = " + winner.getTotalAsset());
            System.out.println("Bye!");
        }
        catch(IOException e) {
            System.err.println(e.getMessage());
        }
    }

    public static String promptPackageOption() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter 1 to choose standard package or 2 to choose extended package");
        String s = br.readLine();
        String code = "";
        if (s.equals("1")) {
            code = STANDARD_PACKAGE_CODE;
        }
        else if (s.equals("2")) {
            code = EXTENDED_PACAKGE_CODE;
        }
        else {
            System.out.println("Invalid input");
            promptPackageOption();
        }

        return code;
    }

    public static int promptPlayerNumber() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter player numbers: range in 2 to 6");
        String s = br.readLine();
        int numPlayer = Integer.parseInt(s);
        if (numPlayer < 2 || numPlayer > 6) {
            System.out.println("Invalid number of players");
            promptPlayerNumber();
        }
        return numPlayer;
    }

    public static String promptPlayerName(int id) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter the name for player " + id);
        String s = br.readLine();
        return s;
    }

    public static int getAlivePlayers(ArrayList<Player> players) {
        int count = 0;
        for (Player player: players) {
            if (player.alive()) {
                count++;
            }
        }
        return count;
    }

    public static Player getWinner(ArrayList<Player> players) {
        Player winner = null;
        for (Player player: players) {
            if (player.alive()) {
                winner = player;
                break;
            }
        }

        return winner;
    }
}
