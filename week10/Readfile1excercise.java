package week10;

import java.io.*;

public class Readfile1excercise {
    public static void main(String[] args){
        printStatFile("data/TestFile1.txt");
        System.out.println(countVowelFile("data/TestFile1.txt"));
    }

    public static void printStatFile(String fileName) {

        try {
            BufferedReader reader = new BufferedReader(new FileReader(new File(fileName)));
            int intline=0;
            int intWord=0;
            int intChar=0;
            String line;
            while ((line = reader.readLine()) != null) {
                intline++;
                String[] stringLine=line.split(" ");
                intWord=intWord+stringLine.length;
                for (int i=0;i<stringLine.length;i++){
                    intChar=intChar+stringLine[i].length();
                }
            }
            System.out.println(intline);
            System.out.println(intWord);
            System.out.println(intChar);
            reader.close();
        } 
        catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }

    }


    public static int countVowelFile(String fileName) {
        int vowelCount = 0;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(new File(fileName)));
            String line;
    
            while ((line = reader.readLine()) != null) {

                // char[] charArray = line.toCharArray();
                // for (int i = 0; i < charArray.length; i++) {
                //     char c = charArray[i];
                //     // 在此处执行具体操作
                // }以上是for (char c : line.toCharArray()) 扩展开来写法
                for (char c : line.toCharArray()) {
                    if (isVowel(c)) {
                        vowelCount++;
                    }
                }
            }
    
            reader.close();
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }
        return vowelCount;
    }
    
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
    
}

