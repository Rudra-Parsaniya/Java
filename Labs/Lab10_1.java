import java.io.*;
import java.util.Scanner;
public class Lab10_1{
    public static void main(String[] args) {
        try{
                File file = new File("java file.txt");
                Scanner scn = new Scanner(file);
                int charCount=0, wordCount=0, lineCount=0;
                while (scn.hasNext()) {
                        String line = scn.nextLine();
                        lineCount++;
                        charCount += line.length();
                        wordCount += line.split("\\s+").length;
                }
                System.out.println("Lines: " + lineCount);
                System.out.println("Characters: " + charCount);
                System.out.println("Words: " + wordCount);
        } 
        catch(FileNotFoundException e){
            System.out.println("File not found." + e.getMessage());
        }
    }
}