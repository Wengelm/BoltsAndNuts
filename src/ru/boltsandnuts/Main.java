package ru.boltsandnuts;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

/**
 * Created by wenge on 21.02.2017.
 */
public class Main {

    public static final String COUNTBOLTS = "1000";
    public static final String LOSTBOLTS = "10";
    public static final String PRICEBOLTS = "100";
    public static final String COUNTNUTS = "1200";
    public static final String LOSTNUTS = "20";
    public static final String PRICENUTS = "90";
    public static final String INPUTTILENAME = "input.txt";
    public static final String OUTPUTFILENAME = "output.txt";

    public static void main(String[] args) throws IOException {
        CreateFiles file = new CreateFiles();


        file.createInput(INPUTTILENAME, COUNTBOLTS, LOSTBOLTS, PRICEBOLTS, COUNTNUTS, LOSTNUTS, PRICENUTS);

        List<String> lines = Files.readAllLines(Paths.get("input.txt"));

        int[] bolts = Arrays.stream(lines.get(0).split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] nuts = Arrays.stream(lines.get(1).split(" ")).mapToInt(Integer::parseInt).toArray();

        String costOfLost = Integer.toString(Operations.lostPrice(bolts[0], bolts[1], bolts[2], nuts[0], nuts[1], nuts[2]));
        file.createOutput(OUTPUTFILENAME, costOfLost);


    }


}

