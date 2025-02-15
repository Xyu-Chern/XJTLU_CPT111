package week6;

public class ALL_Person {
    public static void main(String[] args) {
        person p1 = new person("James Bond", "M", "London", "1921-11-11",12);
        person p2 = new person("Jackie Chan", "M","Hong  Kong", "1954-4-7",13);

        System.out.println(p1.getName());
        System.out.println(p2.getName());

        person [] people= new person[2];
        people[0] =p1;
        people[1] =p2;

        // 比较以下俩种地址输出的区别，p1和p2都代表的是地址，people这个array有空间存储最新的地址，不会产生链接导致在p1更改时，p2更改
        person p3 = p1;
        System.out.println(p3.getName());//James Bond

        p1 = p2;
        System.out.println(p1.getName());//Jackie Chan
        System.out.println(p3.getName());//James Bond

        System.out.println(people[0].getName());//James Bond
        System.out.println(people[1].getName());//Jackie Chan
        System.out.println(p1==p2);

        System.out.println(p1.equals(p3));
        System.out.println(p1.equals(p2));

        System.out.println(p1.toString());//week6.person@7fbe847c




    }
}
