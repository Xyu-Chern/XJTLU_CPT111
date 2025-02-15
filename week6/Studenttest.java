package week6;

public class Studenttest {

    public static String getbeststudent(Student[] arraylsit){
        if (arraylsit[0].getTotal()>= arraylsit[1].getTotal()){
            return arraylsit[0].getName();
        }
        return arraylsit[1].getName();
    }
    public static void main(String[] args) {
        Student s1 = new Student("Teng", "1101", 92, 93, 91, 1);
        Student s2 = new Student("Teng1", "1101", 92, 93, 94, 1);

        Student [] student= new Student[2];
        student[0]=s1;
        student[1]=s2;

        System.out.println(getbeststudent(student));




    }
    
}
