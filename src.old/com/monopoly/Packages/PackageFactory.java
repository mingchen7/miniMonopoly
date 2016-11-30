package com.monopoly.Packages;

/**
 * Created by matthew on 2016/11/5.
 */
abstract public class PackageFactory {

    abstract public EventsPackage getEventsPackage();
    abstract public LandsPackage getLandsPackage();
}
