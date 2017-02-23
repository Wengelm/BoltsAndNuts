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

    public static int lostPrice(int countBolts, int loseBolts, int boltsPrice, int countNuts, int loseNuts, int nutsPrice) throws NullPointerException {
        int costOfLost;
        int costOfLostAvailableBolts;
        int costOfLostAvailableNuts;

        int lostBolts = lostItems(countBolts, loseBolts);
        int lostNuts = lostItems(countNuts, loseNuts);

        int costOfLostBolts = lostBolts * boltsPrice;
        int costOfLostNuts = lostNuts * nutsPrice;

        int availableBolts = countBolts - lostBolts;
        int availableNuts = countNuts - lostNuts;

        if (availableBolts > availableNuts) {
            costOfLostAvailableBolts = availableBolts - availableNuts;
            int lostAvailableBolts1 = costOfLostAvailableBolts * boltsPrice;
            costOfLost = lostAvailableBolts1 + costOfLostBolts + costOfLostNuts;
        } else {
            costOfLostAvailableNuts = availableNuts - availableBolts;
            int lostAvailableNuts1 = costOfLostAvailableNuts * nutsPrice;
            costOfLost = lostAvailableNuts1 + costOfLostBolts + costOfLostNuts;
        }
        return costOfLost;
    }
}
