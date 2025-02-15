package week9;
import java.util.Scanner;
import javax.swing.JFrame;

public class Picture {
    public static void make_sure(String word, Shape[] shapes) {
        Shape selectedShape = null;

        //这是一个 for-each 循环，用来遍历 shapes 数组中的每个元素，将当前元素赋给 shape 变量
        for (Shape shape : shapes) {
        // 在 Java 中，对于比较字符串，使用 == 比较的是对象的引用，而不是字符串的内容。而 equals 方法或 equalsIgnoreCase 方法是用来比较两个字符串的内容是否相等。
        // 当你使用 shape.getType() == word 时，它实际上比较的是两个字符串对象的引用是否相等，而不是它们的内容。即使两个字符串的内容相同，它们也可能指向不同的内存地址，所以使用 == 进行比较可能会得到错误的结果。
        // 在 Java 中，equals 方法和 equalsIgnoreCase 方法都是用来比较字符串的内容是否相等。它们之间的区别在于对待大小写的方式。
            if (shape.getType().equalsIgnoreCase(word)) {
                selectedShape = shape;
                break;
            }
        }

        if (selectedShape != null) {
            JFrame frame = new JFrame("Draw " + selectedShape.getType());
            frame.setSize(300, 300);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.add(selectedShape);
            frame.setVisible(true);
        } 
        else {
            System.out.println("No such shape exists");
        }
    }
    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        shapes[0] = new Circle(100, 100);
        shapes[1] = new Square(100, 100);

        for (int i = 0; i < shapes.length; i++) {
            System.out.println(shapes[i]);
        }

        System.out.println("Which type do you want to print?");
        Scanner kb = new Scanner(System.in);
        String word = kb.nextLine();

        make_sure(word, shapes);

        kb.close();
    }


}
