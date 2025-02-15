package week10;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import week8.Pillar;
import week8.Swordsman;

public class FileWriteStore {
    public static void main(String[] args){


        // File file0 = new File("data/text0.txt");
        // if (file0.exists()) {
        //     System.out.println("File already exists!");
        //     System.exit(0);//exit the program
        // }
        try {
            //IOException是Java中的一个异常类，它用于表示输入输出操作中可能发生的异常，PrintWriter的构造函数可能会抛出IOException异常，因为在创建文件并打开输出流时可能会遇到各种错误，例如文件已存在、无法创建文件等
            PrintWriter output = new PrintWriter(new File("data/text0.txt"));
            output.println("This is the content of the new file.");
            output.close();
            System.out.println("File created and written successfully.");
        } 
        catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }


        // File file1 = new File("data/text1.txt");
        // if (file1.exists()) {
        //     System.out.println("File already exists!");
        //     System.exit(0);//exit the program
        // }
        try {
            PrintWriter output = new PrintWriter(new File("data/text1.txt"));
            output.println("Tanjiro");
            output.println("Zenitsu");
            output.println("Inosuke");
            output.close();
            System.out.println("File created and written successfully.");
        } 
        catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }
        
        // File file2 = new File("data/text2.txt");
        // if (file2.exists()) {
        //     System.out.println("File already exists!");
        //     System.exit(0);
        // }
        try {
            BufferedWriter buffer = new BufferedWriter(new FileWriter("data/text2.txt"));
            buffer.write("Tanjiro");
            buffer.newLine();
            buffer.write("Zenitsu");
            buffer.newLine();
            // buffer.flush() 是Java中用于清空缓冲区的方法。在使用缓冲区（例如BufferedWriter或PrintWriter）写入数据到文件或网络连接时，数据首先会被缓存到内存中的缓冲区中，然后再根据一定的条件将缓冲区中的数据写入到目标位置。
            // 当调用buffer.flush()方法时，它会强制将缓冲区中的所有数据立即写入到目标位置，而不管缓冲区是否已满。这样做可以确保数据的实时性，即使缓冲区中的数据量较小也能及时传输到目标位置。
            buffer.flush();
            buffer.write("Inosuke");
            buffer.newLine();
            buffer.close();
        } 
        catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }


        // File file2 = new File("data/text2.txt");
        try {
            Scanner input = new Scanner(new File("data/text2.txt"));
            while (input.hasNextLine()) {
                String name = input.nextLine();
                Swordsman swordsman = new Swordsman(name);
                System.out.println(swordsman);
            }
            input.close();
        } 
        catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }


        // File file3 = new File("data/demonslayerdata.csv");
        try {
            Scanner input = new Scanner(new File("data/demonslayerdata.csv"));
            while (input.hasNextLine()) {
                String line = input.nextLine();
                // System.out.println(line);
                String[] values = line.split(",");
                String name = values[0];
                int numDemonsKilled = Integer.parseInt(values[1]);
                Swordsman swordsman = new Pillar(name, numDemonsKilled,"fire");
                System.out.println(swordsman);
            }
            input.close();
        } 
        catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }


        // File file = new File("data/text1.txt");
        try {
            // FileReader fileReader = new FileReader(new File("data/text1.txt"));

            //****BufferedReader reads once from file into memory to accessed later
            BufferedReader reader = new BufferedReader(new FileReader(new File("data/text1.txt")));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } 
        catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }

    }
}

