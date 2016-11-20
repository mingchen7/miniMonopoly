package com.monopoly.Packages;

import java.util.*;
import com.monopoly.Lands.EstateTypeLand;
import com.monopoly.Lands.EventTypeLand;
import com.monopoly.Lands.Land;

import static com.monopoly.Constants.Constant.*;

/**
 * Created by matthew on 11/5/2016.
 */
public class ExtendedLandsPackage extends LandsPackage {
    public ExtendedLandsPackage() {
        createLands();
    }

    public void createLands() {
        this.lands = new ArrayList<Land>();

        int ratio = NUM_ESTATE_LAND_EXTENDED / NUM_EVENT_LAND_EXTENDED;
        for (int i = 0; i < NUM_CELLS_ON_MAP_EXTENDED; i++) {
            if (i % ratio == 0) {
                lands.add(new EventTypeLand());
            }
            else {
                lands.add(new EstateTypeLand());
            }
        }
    }

}
