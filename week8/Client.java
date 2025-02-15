package week8;

public class Client {

public static void main(String[] args) {
        Book[] swordsmanTroop = new Book[3];
        swordsmanTroop[0] = new Book("Kyojuro1", 1000, "Fire1");
        swordsmanTroop[1] = new Fiction("Kyojuro2", 1000, "Fire2");
        swordsmanTroop[2] = new NonFiction("Kyojuro3", 1000, "Fire3");
        for (int i = 0; i < swordsmanTroop.length; i++) {
            System.out.println(swordsmanTroop[i]);
        }
    } 
}
