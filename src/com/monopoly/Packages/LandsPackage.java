package com.monopoly.Packages;

import java.util.*;
import com.monopoly.Lands.Land;

/**
 * Created by matthew on 11/5/2016.
 */
abstract public class LandsPackage {
    HashSet<Land> lands;

    abstract void createLands();
}
