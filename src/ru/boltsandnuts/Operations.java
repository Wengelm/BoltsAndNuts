package ru.boltsandnuts;

import static java.lang.Integer.parseInt;

/**
 * Created by wenge on 21.02.2017.
 */
public class Operations {

    public static Integer lostItems(int k, int l) {
        int lostItems = k * l / 100;
        return lostItems;
    }

    public static int lostPrice(int kBolts, int lBolts, int mBolts, int kNuts, int lNuts, int mNuts) throws NullPointerException {
        int costOfLost;
        int costOfLostAvailableBolts;
        int costOflostAvailableNuts;

        int lostBolts = lostItems(kBolts, lBolts);
        int lostNuts = lostItems(kNuts, lNuts);

        int costOfLostBolts = lostBolts * mBolts;
        int costOfLostNuts = lostNuts * mNuts;

        int aviableBolts = kBolts - lostBolts;
        int aviableNuts = kNuts - lostNuts;

        if (aviableBolts > aviableNuts) {
            costOfLostAvailableBolts = aviableBolts - aviableNuts;
            int lostavailableBolts1 = costOfLostAvailableBolts * mBolts;
            costOfLost = lostavailableBolts1 + costOfLostBolts + costOfLostNuts;
        } else {
            costOflostAvailableNuts = aviableNuts - aviableBolts;
            int lostAvailableNuts1 = costOflostAvailableNuts * mNuts;
            costOfLost = lostAvailableNuts1 + costOfLostBolts + costOfLostNuts;
        }


        return costOfLost;


    }
}
