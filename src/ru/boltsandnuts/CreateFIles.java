package ru.boltsandnuts;

import java.io.*;

import static java.lang.Integer.parseInt;

/**
 * Created by wenge on 21.02.2017.
 */
public class CreateFIles {


    public static void createInput(String fileName, String kBolts, String lBolts, String mBolts, String kNuts, String lNuts, String mNuts) throws FileNotFoundException {
        File file = new File(fileName);
        PrintWriter writeInFile = new PrintWriter(file.getAbsoluteFile());

        try {

            if (!file.exists()) {
                file.createNewFile();
            }

            try {

                String infoBoltsAndNuts = kBolts + " " + lBolts + " " + mBolts + "\n" + kNuts + " " + lNuts + " " + mNuts;
                writeInFile.print(infoBoltsAndNuts);


            } finally {
                writeInFile.close();

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

    public static void createOutput(String fileName, String costOfLost) throws FileNotFoundException {

        File file = new File(fileName);
        PrintWriter out = new PrintWriter(file.getAbsoluteFile());

        try {
            if (!file.exists()) {
                file.createNewFile();
            }

            try {

                out.print(costOfLost);

            } finally {
                out.close();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }


}

