package week11;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LearnList {
    public static void main(String[] args){
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add(1, "X");//在 index=1添加X---->[A, X, B, C]
        list.set(2, "Y");//在 index=2讲B换成Y---->[A, X, Y, C]
        System.out.println(list);
        list.clear();//remove all
        System.out.println(list);//[]

        List<Integer> list0=new ArrayList<>();
        //List<Integer> list1 = new ArrayList<Integer>();
        list0.add(12);
        list0.add(23);

        for (int x : list0) {
            System.out.print(x + "，");
        }
        System.out.print("\n");
        System.out.println("Max is "+findMaxInt(list0));
        
        System.out.println(list0.size());//2
        System.out.println(list0.get(0));//12
        list0.remove(0);
        System.out.println(list0.size());//1
        System.out.println(list0.get(0));//23


        // 创建一个空的LinkedList对象
        LinkedList<String> linkedList = new LinkedList<>();

        // 添加元素到列表末尾
        linkedList.add("Alice");
        linkedList.add("Bob");
        linkedList.add("Charlie");

        // 在指定位置插入元素
        linkedList.add(1, "David");

        // 获取第二个元素
        String secondElement = linkedList.get(1);
        System.out.println("Second element: " + secondElement);

        // 修改第三个元素
        linkedList.set(2, "Eve");

        // 删除第一个元素
        linkedList.removeFirst();

        // 遍历列表并打印每个元素
        for (String element : linkedList) {
            System.out.println(element);
        }

    }

    public static int findMaxInt(List<Integer> list) {        
        int max = list.get(0);        
        for (int num : list) {
            if (num > max) {
                max = num;
            }
        }        
        return max;
    }
        
    
}

//“collection”指的是一组对象的容器。在编程中，我们经常需要处理多个对象，并对它们进行管理和操作

// Java Collections Framework（JCF）是Java提供的一套用于管理对象集合的强大而灵活的工具。它提供了一组接口、实现和算法，用于操作和处理各种类型的集合数据。
// Java Collections Framework的主要目标是提供一个通用的、高性能的集合框架，以便开发人员可以更方便地操作和管理集合数据。它的设计基于以下几个关键原则
// 接口与实现分离：JCF定义了一系列接口，如List、Set、Map等，以及它们的各种实现类（如ArrayList、LinkedList、HashSet、HashMap等）。这种设计使得开发人员可以基于接口编程，并在不同的实现类之间进行切换，而无需修改太多的代码。
// 标准化的算法：JCF提供了一些通用的算法，如排序、搜索、迭代等，可以应用于不同类型的集合。这些算法被定义为集合类的通用方法，使得开发人员可以方便地对集合进行操作，而无需自己重新实现这些算法。
// 通用性和类型安全：JCF中的集合类都是泛型化的，可以指定存储的元素类型，从而提供了类型安全的操作。这意味着开发人员可以在编译时捕获到一些潜在的类型错误，而不是在运行时才发现。
// 通过使用Java Collections Framework，开发人员可以更加方便地操作和管理集合数据，无论是列表、集合、映射还是其他类型的集合。它提供了丰富的功能和良好的性能，成为Java中不可或缺的一部分。

// List<Integer> list = new ArrayList<Integer>();
// 在 Java 中，List 是一个接口（interface），它定义了一组操作，可以用来操作一个列表。
//List 接口规定了常见的列表操作，例如添加元素、删除元素、获取元素等等。实现 List 接口的类需要提供这些操作的具体实现。
// ArrayList 则是 List 接口的一个实现类（implementation）。它提供了 List 接口中定义的所有操作，并且使用了数组Resizing Array作为底层数据结构来存储元素。
//****ArrayList 支持快速随机访问和线性遍历，但插入和删除操作可能比较慢****
// 需要注意的是，ArrayList 并不是 List 接口的唯一实现类。Java 标准库还提供了其他的 List 实现类，例如 LinkedList 等
//LinkedList 使用双向链表 Doubly Linked List作为底层数据结构来存储元素，因此****支持高效的插入和删除操作，但随机访问操作则可能比较慢****

// 在Java中，集合（例如List、Set等）只能处理对象类型，而不能处理基本类型。这是因为Java中的泛型是通过类型擦除来实现的，无法直接支持基本类型。
// Java为每个基本类型提供了对应的包装类（Wrapper Class），这些包装类将基本类型封装成对象。例如，int类型的包装类是Integer，double类型的包装类是Double，以此类推。
// 当我们需要使用泛型来创建集合时，Java要求我们使用这些包装类作为泛型类型参数。因此，我们应该使用List<Integer>而不是List<int>。这样，我们就可以在列表中存储整数的对象。
// 在使用这些包装类时，Java会自动进行自动装箱（Autoboxing）和自动拆箱（Unboxing）操作，使得基本类型和对应的包装类之间可以进行转换。
// 这样，我们可以像使用基本类型一样使用这些包装类对象，同时还能够享受到泛型带来的类型安全和其他好处