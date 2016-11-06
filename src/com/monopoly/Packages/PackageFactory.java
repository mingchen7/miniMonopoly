package com.monopoly.Packages;

/**
 * Created by matthew on 2016/11/5.
 */
abstract public class PackageFactory {
    abstract EventsPackage getEventsPackage();
    abstract LandsPackage getLandsPackage();
}
