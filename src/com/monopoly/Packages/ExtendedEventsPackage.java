package com.monopoly.Packages;

import java.util.*;
import com.monopoly.Events.Event;
import com.monopoly.Events.FineEvent;
import com.monopoly.Events.JailEvent;
import com.monopoly.Events.RollAgainEvent;

import static com.monopoly.Constants.Constant.*;

/**
 * Created by matthew on 11/5/2016.
 */
public class ExtendedEventsPackage extends EventsPackage {
    public ExtendedEventsPackage() {
        createEvents();
    }

    public void createEvents() {
        this.events = new ArrayList<Event>();
        for (int i = 0; i < NUM_ROLLAGAIN_EVENT_EXTENDED; i++) {
            this.events.add(new RollAgainEvent());
        }

        for (int i = 0; i < NUM_JAIL_EVENT_EXTENDED; i++) {
            this.events.add(new JailEvent());
        }

        for (int i = 0; i < NUM_FINE_EVENT_EXTENDED; i++) {
            this.events.add(new FineEvent());
        }

        super.shuffle(NUM_EVENT_EXTENDED);
    }
}
