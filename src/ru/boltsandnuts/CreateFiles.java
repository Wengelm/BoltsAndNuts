package ru.boltsandnuts;

import java.io.*;

/**
 * Created by wenge on 21.02.2017.
 */
public class CreateFiles {

    public static final String SPACE = " ";
    public static final String LINE_BR = "\n";

    public static void createInput(String fileName, String countBolts, String lostBolts, String boltsPrice, String countNuts, String lostNuts, String nutsPrice) throws FileNotFoundException {
        File file = new File(fileName);

        PrintWriter writeInFile = new PrintWriter(file.getAbsoluteFile());

        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            try {
                String infoBoltsAndNuts = countBolts + SPACE + lostBolts + SPACE + boltsPrice + LINE_BR + countNuts + SPACE + lostNuts + SPACE + nutsPrice;
                writeInFile.print(infoBoltsAndNuts);
            } finally {
                writeInFile.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void createOutput(String fileName, String costOfLostDetails) throws FileNotFoundException {

        File file = new File(fileName);
        PrintWriter out = new PrintWriter(file.getAbsoluteFile());

        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            try {
                out.print(costOfLostDetails);
            } finally {
                out.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

