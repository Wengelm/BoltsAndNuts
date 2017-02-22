package ru.boltsandnuts;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

/**
 * Created by wenge on 21.02.2017.
 */
public class Main {

    public static void main(String[] args) throws IOException {
        CreateFIles file = new CreateFIles();
        Operations operations = new Operations();

        file.createInput("input.txt", "1000", "10", "100", "1200", "20", "90");

        List<String> lines = Files.readAllLines(Paths.get("input.txt"));

        int[] bolts = Arrays.stream(lines.get(0).split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] nuts = Arrays.stream(lines.get(1).split(" ")).mapToInt(Integer::parseInt).toArray();

      /*    int k1 = bolts[0];
            int l1 = bolts[1];
            int m1 = bolts[2];
            int k2 = nuts[0];
            int l2 = nuts[1];
            int m2 = nuts[2];     */

        String costOfLost = Integer.toString(operations.lostPrice(bolts[0], bolts[1], bolts[2], nuts[0], nuts[1], nuts[2]));
        file.createOutput("output.txt", costOfLost);


    }


}

