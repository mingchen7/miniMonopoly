package com.monopoly.Packages;

import java.util.*;
import com.monopoly.Lands.Land;
import com.monopoly.Lands.EventTypeLand;
import com.monopoly.Lands.EstateTypeLand;
import static com.monopoly.Constants.Constant.*;

/**
 * Created by matthew on 11/5/2016.
 */
public class StandardLandsPackage extends LandsPackage {

    public void createLands() {
        this.lands = new ArrayList<Land>();

        int ratio = NUM_ESTATE_LAND_STANDARD / NUM_EVENT_LAND_STANDARD;
        for (int i = 0; i < NUM_CELLS_ON_MAP_STANDARD; i++) {
            if (i % ratio == 0) {
                lands.add(new EventTypeLand());
            }
            else {
                lands.add(new EstateTypeLand());
            }
        }
    }
}
