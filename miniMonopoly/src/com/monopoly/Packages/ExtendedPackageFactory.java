package com.monopoly.Packages;

/**
 * Created by matthew on 2016/11/5.
 */
public class ExtendedPackageFactory extends PackageFactory {

    public EventsPackage getEventsPackage() {
        return new ExtendedEventsPackage();
    }

    public LandsPackage getLandsPackage() {
        return new ExtendedLandsPackage();
    }
}
