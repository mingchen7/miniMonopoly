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
    int size;
    private static ArrayList<Land> landsList;
    private static ArrayList<Event> eventsDeck;
    private EventsPackage eventsPackage;
    private LandsPackage landsPackage;
    private static String packageCode;

    // initialize Map
    public Map (String packageCode) {
        this.packageCode = packageCode;
        PackageFactory packageFactory;
        if (packageCode == STANDARD_PACKAGE_CODE) {
            packageFactory = new StandardPackageFactory();
        }
        else {
            packageFactory = new ExtendedPackageFactory();
        }

        this.eventsPackage = packageFactory.getEventsPackage();
        this.landsPackage = packageFactory.getLandsPackage();

        this.eventsDeck = eventsPackage.getEvents();
        this.landsList = landsPackage.getLandList();

    }

    // get the land by position index
    public static Land getLandbyIndex(int index) {
        return landsList.get(index);
    }

    // pick a random event
    public static Event pickAEvent () {
        Random rand = new Random();
        if (Map.packageCode == STANDARD_PACKAGE_CODE) {
            int pos = rand.nextInt(NUM_EVENT_STANDARD);
            return eventsDeck.get(pos);
        }
        else {
            int pos = rand.nextInt(NUM_EVENT_EXTENDED);
            return eventsDeck.get(pos);
        }
    }
}
