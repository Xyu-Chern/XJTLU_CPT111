import java.util.ArrayList;
import java.util.List;
// ArrayList 是 Java 集合框架中的一个类，用于动态管理对象的可变长度数组。它提供了一些方便的方法来操作存储在列表中的元素。而 [] 是 Java 中的数组表示法。

// 下面是 ArrayList 和 [] 数组的一些区别：

// 大小调整：ArrayList 的大小是可以动态调整的，可以根据需要添加或删除元素。而数组的大小在创建时就被确定，无法直接改变。
// 类型：ArrayList 可以存储任意类型的元素，包括基本类型的封装类（如 Integer、Double 等）和自定义类型。而数组只能存储同一种类型的元素。
// 方法和功能：ArrayList 提供了一系列方法来方便地操作集合，例如添加、删除、插入元素，获取元素的个数等。而数组的操作相对较少，需要手动编写代码来实现这些功能。
// 长度：ArrayList 可以根据需要动态增长或缩减，没有固定长度限制。而数组的长度在创建时就固定了，无法直接改变。
// 使用 ArrayList 的好处是它提供了更多的灵活性和便利性，可以方便地进行元素的增删改查操作，并且可以根据需要动态调整大小。而数组则更适合在已知大小且元素类型固定的情况下使用，更加简洁高效

public class Dice1 {
    public static int[] generateDice(int[] input) {
        for (int i = 0; i < input.length; i++) {
            double rand = (Math.random() * 6) + 1;
            int dice = (int) rand;
            input[i] = dice;
            System.out.println("Result is " + dice);
        }
        return input;  
    }
    public static int findTotal(int[] input){
        int total = 0;
        for (int i = 0; i < input.length; i++) {
            total = total + input[i];
            System.out.println("This dice value is " + input[i]);
        }
        return total;
    }

    public static void printInts(int[] nums) {
        // System.out.print()方法不会自动换行
        System.out.print("[");
        for(int i = 0; i < nums.length; i++) {
            if(i != nums.length-1)
                System.out.print(nums[i] + ", ");
            else
                System.out.print(nums[i]);
            }
        System.out.println("]");
    }

    public static int findMax(int[] input) {
        int max = input[0];
        for (int i = 1; i < input.length; i++) {
            if (input[i] > max) {
                max = input[i];
            }
        }
        return max;
    }
    
    // public static int findMaxLoc(int[] input) {
    //     int max = input[0];
    //     int maxLocation = 0;
    //     for (int i = 1; i < input.length; i++) {
    //         if (input[i] > max) {
    //             max = input[i];
    //             maxLocation = i;
    //         }
    //     }
    //     return maxLocation;
    //     }
   
    public static List<Integer> findMaxLoc(int[] input) {
        int max = input[0];
        List<Integer> maxLocations = new ArrayList<>();
        maxLocations.add(0); // 将第一个索引添加到列表中
    
        for (int i = 1; i < input.length; i++) {
            if (input[i] > max) {
                max = input[i];
                maxLocations.clear(); // 清空之前的最大值索引
                maxLocations.add(i); // 将当前索引添加到列表中
            } else if (input[i] == max) {
                maxLocations.add(i); // 如果当前元素等于最大值，则将当前索引添加到列表中
            }
        }
    
        return maxLocations;
    }

    public static void main(String[] args) {
        int[] diceList = new int[4];   
        diceList = generateDice(diceList);
        printInts(diceList);
        int total = findTotal(diceList);
        System.out.println("The total is " + total);
        int max = findMax(diceList);
        System.out.println("The max value is " + max);
        List<Integer> loc = findMaxLoc(diceList);
        System.out.println("The index value is " + loc);
        }
           
                     
}
