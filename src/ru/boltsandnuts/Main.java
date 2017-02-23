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

    public static final String COUNT_BOLTS = "1000";
    public static final String LOST_BOLTS = "10";
    public static final String PRICE_BOLTS = "100";
    public static final String COUNT_NUTS = "1200";
    public static final String LOST_NUTS = "20";
    public static final String PRICE_NUTS = "90";
    public static final String INPUT_FILE_NAME = "input.txt";
    public static final String OUTPUT_FILE_NAME = "output.txt";
    public static final String SPLIT_SPACE = " ";

    public static void main(String[] args) throws IOException {
        CreateFiles file = new CreateFiles();


        file.createInput(INPUT_FILE_NAME, COUNT_BOLTS, LOST_BOLTS, PRICE_BOLTS, COUNT_NUTS, LOST_NUTS, PRICE_NUTS);

        List<String> lines = Files.readAllLines(Paths.get(INPUT_FILE_NAME));

        int[] bolts = Arrays.stream(lines.get(0).split(SPLIT_SPACE)).mapToInt(Integer::parseInt).toArray();
        int[] nuts = Arrays.stream(lines.get(1).split(SPLIT_SPACE)).mapToInt(Integer::parseInt).toArray();

        String costOfLost = Integer.toString(Operations.lostPrice(bolts[0], bolts[1], bolts[2], nuts[0], nuts[1], nuts[2]));
        file.createOutput(OUTPUT_FILE_NAME, costOfLost);


    }


}

