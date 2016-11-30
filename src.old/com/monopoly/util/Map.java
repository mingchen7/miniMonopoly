package com.monopoly.util;
import java.util.*;

import com.monopoly.Lands.Land;
import com.monopoly.Events.Event;
import com.monopoly.Packages.ExtendedPackageFactory;
import com.monopoly.Packages.PackageFactory;
import com.monopoly.Packages.EventsPackage;
import com.monopoly.Packages.LandsPackage;
import com.monopoly.Packages.StandardPackageFactory;

import static com.monopoly.Constants.Constant.*;


/**
 * Created by matthew on 2016/11/5.
 */
public class Map {
    private static Map instance;
    private static ArrayList<Land> landsList;
    private static ArrayList<Event> eventsDeck;
    private EventsPackage eventsPackage;
    private LandsPackage landsPackage;
    private static String packageCode;

    // singular mode
    public static Map getInstance(String packageCode) {
        if (instance == null) {
            instance = new Map(packageCode);
        }
        return instance;
    }

    // initialize Map
    public Map (String packageCode) {
        this.packageCode = packageCode;
        PackageFactory packageFactory;
        if (packageCode == STANDARD_PACKAGE_CODE) {
            System.out.println("Standard package chosen.");
            packageFactory = new StandardPackageFactory();
        }
        else {
            System.out.println("Extended package chosen.");
            packageFactory = new ExtendedPackageFactory();
        }

        this.eventsPackage = packageFactory.getEventsPackage();
        this.landsPackage = packageFactory.getLandsPackage();


        System.out.println("Created events and lands package");

        this.eventsDeck = eventsPackage.getEvents();
        this.landsList = landsPackage.getLandList();

        System.out.println("Number of lands = " + landsList.size());
        System.out.println("Number of events = " + eventsDeck.size());

    }

    // get the land by position index
    public static Land getLandbyIndex(int index) {
        return landsList.get(index);
    }

    // pick a random event
    public static Event pickAEvent () {
        Random rand = new Random();
        int pos;
        if (Map.packageCode == STANDARD_PACKAGE_CODE) {
            pos = rand.nextInt(NUM_EVENT_STANDARD);
        }
        else {
            pos = rand.nextInt(NUM_EVENT_EXTENDED);
        }
        return eventsDeck.get(pos);
    }

    public static String getPackageCode() {
        return packageCode;
    }
}
