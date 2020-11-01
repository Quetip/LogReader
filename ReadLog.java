package com.company.Projects;

import org.w3c.dom.Text;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadLog {

    public static void main(String[] args) throws IOException {

        Player player1 = new Player("test");

        File f1=new File("C:\\Users\\wrous\\AppData\\Roaming\\.minecraft\\logs\\latest.log"); //Creation of File Descriptor for input file
        String[] words= null;  //Intialize the word Array
        FileReader fr = new FileReader(f1);  //Creation of File Reader object
        BufferedReader br = new BufferedReader(fr); //Creation of BufferedReader object
        String strLine;
        String input="slain";   // Input word to be searched
        int count = 0, countWhiteSpace = 0,countWord = 0;   //Intialize the word to zero
        ArrayList<String> player = new ArrayList<String>();


        while((strLine=br.readLine())!=null)   //Reading Content from the file
        {
            words=strLine.split(" ");  //Split the word using space
            System.out.println(strLine);
            for (String word : words)
            {
                 if (word.equals(input))   //Search for the given word
                 {
                     if((strLine = br.readLine()) != null) {
                         String[] wordList = strLine.split("\\s+");
                         countWord += wordList.length;
                         countWhiteSpace += countWord - 1;
                     }
                     System.out.println(countWhiteSpace);
                     System.out.println(strLine);
//                     player.add(strLine);
                     //add just the player

                     count++;    //If Present increase the count by one
                     if (count == 3) {
                         System.out.println(player);
                     }
                 }
            }
        }
//        ArrayList<String> player = new ArrayList<String>();
//            String input="slain";   // Input word to be searched
//            int count=0;   //Intialize the word to zero
//            while((strLine=br.readLine())!=null)   //Reading Content from the file
//            {
//                words=strLine.split(" ");  //Split the word using space
//                for (String word : words)
//                {
//                    if (word.equals(input))   //Search for the given word
//                    {
//                        System.out.println(strLine);
//                        //add just the player
//
//                        count++;    //If Present increase the count by one
//                    }
//                }
//            }
        if(count!=0)  //Check for count not equal to zero
        {
            System.out.println("Deaths: "+count);
        }
        else
        {
            System.out.println("No deaths recorded");
        }
//        String[] moreWords = message.split(" ");
//        int startIndex = message.indexOf("[CHAT]");

    }
}
