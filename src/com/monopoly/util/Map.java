package com.monopoly.util;
import java.util.*;

import com.monopoly.Lands.Land;
import com.monopoly.Events.Event;


/**
 * Created by matthew on 2016/11/5.
 */
public class Map {
    ArrayList<Land> landList;
    ArrayList<Event> eventPool;

    // initialize Map
    public Map (String packageCode) {

    }

    public Land getLandbyIndex(int index) {
        return landList.get(index);
    }

    public ArrayList<Event> getEventPool() {
        return this.eventPool;
    }




}
