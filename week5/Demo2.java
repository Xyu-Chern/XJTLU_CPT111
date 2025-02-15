public class Demo2 {
    public static class GlobalVariableDemo {
        // 将全局变量x和y修改为私有的，然后提供对应的访问器（getter和setter）方法，以便其他类可以间接地访问和修改这些变量
        private static int x = 4;   // private global variables
        private static int y;

        public static int larger(int a, int b) {
            if (a > b) {
                return a;
            }
            return b;
        }

        public static void main(String[] args) {
            int a = 2;
            int b = 5;
            System.out.println(larger(a, b));
            System.out.println(getX());
        }

        // Getter and setter methods for x and y
        public static int getX() {
            return x;
        }

        public static void setX(int value) {
            x = value;
        }

        public static int getY() {
            return y;
        }

        public static void setY(int value) {
            y = value;
        }
    }
}

