package com.monopoly.Packages;

import java.util.*;
import com.monopoly.Lands.Land;

/**
 * Created by matthew on 11/5/2016.
 */
public class StandardLandsPackage extends LandsPackage {

    public void createLands() {
        this.lands = new HashSet<Land>();
    }
}
