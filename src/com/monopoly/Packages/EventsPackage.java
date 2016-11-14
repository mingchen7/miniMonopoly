package com.monopoly.Packages;
import java.util.*;
import com.monopoly.Events.Event;

/**
 * Created by matthew on 11/5/2016.
 */
abstract public class EventsPackage {
    ArrayList<Event> events;
    abstract void createEvents();
    public ArrayList<Event> getEvents() {
        return this.events;
    }

    protected void shuffle(int numEvents) {
        Random rand = new Random();
        // random generate a number from 100 to 200 as number of times to shuffle
        int n = 100 + rand.nextInt(100);
        for (int i = 0; i < n; i++) {
            int first = rand.nextInt(numEvents);
            int second = rand.nextInt(numEvents);

            // swap
            Event tmp = this.events.get(first);
            this.events.set(first, this.events.get(second));
            this.events.set(second, tmp);
        }
    }
}
