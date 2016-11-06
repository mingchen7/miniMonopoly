package com.monopoly.Packages;

/**
 * Created by matthew on 2016/11/5.
 */
public class StandardPackageFactory extends PackageFactory {
    public EventsPackage getEventsPackage() {
        return new StandardEventsPackage();
    }

    public LandsPackage getLandsPackage() {
        return new StandardLandsPackage();
    }
}
