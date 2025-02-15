import java.util.Arrays;

public class ArrayTest {
    public static void main(String[] args){
        // You cannot change the size of an array after creating it. 
        int [] myArray = new int[5];
        myArray[0]=100;
        myArray[1]=100;
        myArray[2]=100;
        myArray[3]=100;
        myArray[4]=100;
        System.out.println(myArray.length);//5
        // 在Java中，当直接打印一个数组对象时，输出的结果是数组的类型标识符（以[I开头，代表整型数组）以及数组的哈希码。
        // 哈希码（Hash Code）是Java中用于表示对象的整数值。它是由对象的哈希函数生成的，并且在对象的生命周期中保持不变。
        // 哈希码在Java中有很多用途，其中一个主要用途是在哈希表（例如HashMap、HashSet等）和其他基于哈希的数据结构中作为对象的索引。哈希码可以用于快速查找、插入和删除元素，以提高性能。
        // 在Java中，每个对象都有一个默认的hashCode()方法实现，它返回对象的哈希码。这个默认实现通常基于对象的内存地址，也就是说，两个不同的对象通常具有不同的哈希码。

        System.out.println(myArray);//[I@368102c8
        System.out.println(Arrays.toString(myArray));//[100, 100, 100, 100, 100]
        System.out.println(myArray[0]);//100

        int[] myArray1 = {100, 200, 300, 400, 500};
        System.out.println(myArray1);
        System.out.println(Arrays.toString(myArray1));

        String [] myArray2 = {"a", "b", "c", "d", "e"};
        myArray2[1] = "hello";
        System.out.println(Arrays.toString(myArray2));

        for (int i = 0; i < myArray2.length; i++) {
            System.out.println(myArray2[i]);
            }
        // boolean[] myArray3 = {true, false, true};

    }
    
}
