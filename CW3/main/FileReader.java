package main;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FileReader {

    private String title = "";
    private Map<String, Integer> map;

    public FileReader(String datapath) {
        this.map = fileRead(datapath);
    }

    public Map<String, Integer> getMap() {
        return this.map;
    }

    public String getTitle() {
        return this.title;
    }
    
    private Map<String, Integer> fileRead(String datapath) {
        Map<String, Integer> map = new HashMap<>();
        String FullEnitiy = "";
        int sum = 0;
        try {
            Scanner input = new Scanner(new File(datapath));
            int i = 0;
            while (input.hasNextLine()) {
                String name = input.nextLine();
                if (name.isEmpty()) { // avoid space
                    break;
                }
                if (i >= 2) {
                    List<String> list = new ArrayList<>();
                    for (String splitedName : name.split(" ")) {
                        list.add(splitedName);
                    }
                    if (list.size() == 1 && i > 2 ) {
                        throw new IllegalArgumentException("Data format exception at line " + (i + 1));
                    }
                    if ( !list.get(list.size() - 1).matches("\\d+")||list.get(list.size() - 1).startsWith("-") || list.get(list.size() - 1).equals("0")) {
                        throw new IllegalArgumentException("Data must be positive");
                    }
                    int num = Integer.parseInt(list.get(list.size() - 1));
                    String nameall = ""; 
                    for (int indexList = 0; indexList < list.size() - 1; indexList++) {
                        if (list.get(indexList).matches("\\d+")){
                            throw new IllegalArgumentException("Data overflow");
                        }
                        nameall = nameall + " " + list.get(indexList);
                        }
                    map.put(nameall, num);
                    sum += num;
                }
                if (i == 1) {
                    FullEnitiy = name;
                }
                if (i == 0) {
                    this.title = name;
                }
                i++;
            }
            input.close();
        } catch (IOException | IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
            System.exit(0); 
        }
        map.put(FullEnitiy, sum);
        return map;
    }
}
    
   


