package week13;

public class Employee {

    protected String name;//在Java中，protected关键字表示保护性访问修饰符，它的作用是允许子类访问父类中被protected修饰的成员变量和成员方法。

   public Employee(String name) {
      this.name = name;
   }

   public String toString() {
      return "Name: " + name;
   }
}