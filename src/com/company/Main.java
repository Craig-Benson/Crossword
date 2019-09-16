package com.company;

import java.io.*;
import java.lang.reflect.Array;
import java.nio.charset.StandardCharsets;
import java.util.Random;

public class Main {

    public static void main(String[] args) throws IOException {

        File file = new File(System.getProperty("user.dir")+"\\test.txt");
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        Random rndPosition = new Random();
        PrintWriter printWriter = new PrintWriter("test.txt", StandardCharsets.UTF_8);
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter((file), true));


        String text = "hello";
        int row = 10;
        int column = 10;
        //variable generates random number for index of where to put the word int the line
        int position = rndPosition.nextInt(column);
        int intTextLength = text.length();
        String replaced;
        int acc = 0;

        //calls and passes how many rows and columns,
        createTable(row, column);


        //reads and stores the first line
        BufferedReader readLine = new BufferedReader(new FileReader(file));

        String Line = readLine.readLine();
        //returns the position 'hello' will be placed
        position = checkLength(position, column, intTextLength, acc);

        //get the string to be replaced
        char firstChar = Line.charAt(position);
        char endChar = Line.charAt(text.length() - 1);
        replaced = Line.substring(position);



        //create a new string by importing a line adding hello and re writing
       String endLine = Line.substring(position,text.length());
       String startLine= Line.replace(replaced, text);

       String newLine =startLine+endLine;


    bufferedWriter.write(newLine);
    bufferedWriter.close();

    }
    //check length to see if hello is in range forward
    public static int checkLength(int position, int length, int textLength, int Acc) {

        Random rndPos = new Random();

        if (position == 0) {
            return Acc;
        }
        if ((length - position) >= textLength) {
            return Acc = position;

        }
        return (checkLength(position = rndPos.nextInt(length), length, textLength, Acc));


    }


    //change to Recursion, creates the a textfile and writes random charachters

    public static void createTable(int numRows, int numColumn) throws IOException {
        File file = new File(System.getProperty("user.dir")+"\\test.txt");
        PrintWriter printWriter = new PrintWriter(file, StandardCharsets.UTF_8);
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, true));
        Random rnd = new Random();
        String[][] List =new String[1][10];

//re do this
        for (int i = 0; i < 1; i++) {

            for (int j = 0; j < numColumn; j++) {
                String charachters="";
                for(int k = 0; k<numColumn;k++){

                    char c = (char) (rnd.nextInt(26) + 'a');

                            charachters += c;


                    //add another nested loop

                }

                        List[i][j] = charachters;


                bufferedWriter.append(List[i][j]);
                bufferedWriter.newLine();
            }


        }
        bufferedWriter.close();


    }
}
