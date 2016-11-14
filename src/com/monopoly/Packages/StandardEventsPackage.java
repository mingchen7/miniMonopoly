package com.monopoly.Packages;

import java.util.*;
import com.monopoly.Events.Event;
import com.monopoly.Events.RollAgainEvent;
import com.monopoly.Events.JailEvent;
import com.monopoly.Events.FineEvent;

import static com.monopoly.Constants.Constant.*;

/**
 * Created by matthew on 11/5/2016.
 */
public class StandardEventsPackage extends EventsPackage {
    public StandardEventsPackage() {
        createEvents();
    }

    public void createEvents() {
        this.events = new ArrayList<Event>();
        for (int i = 0; i < NUM_ROLLAGAIN_EVENT_STANDARD; i++) {
            this.events.add(new RollAgainEvent());
        }

        for (int i = 0; i < NUM_JAIL_EVENT_STANDARD; i++) {
            this.events.add(new JailEvent());
        }

        for (int i = 0; i < NUM_FINE_EVENT_STANDARD; i++) {
            this.events.add(new FineEvent());
        }

        super.shuffle(NUM_EVENT_STANDARD);
    }



}
