package com.monopoly.Packages;
import java.util.*;
import com.monopoly.Events.Event;

/**
 * Created by matthew on 11/5/2016.
 */
abstract public class EventsPackage {
    HashSet<Event> events;
    abstract void createEvents();
}
