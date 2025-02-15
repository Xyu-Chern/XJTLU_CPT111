package week8;

public class DemonSlayerCrops {
public static void main(String[] args) {
        Swordsman[] swordsmanTroop = new Swordsman[3];
        swordsmanTroop[0] = new Swordsman("Tanjiro");
        swordsmanTroop[1] = new Pillar("Kyojuro", 10000, "Fire");
        swordsmanTroop[2] = new Successor("Kanao", "Shinobu");
        for (int i = 0; i < swordsmanTroop.length; i++) {
            System.out.println(swordsmanTroop[i]);
        }
    } 
}

