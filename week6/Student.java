package week6;

public class Student {
      
    private String name;
    private String id;
    private double chi;
    private double math;
    private double eng;
    private static int studentAmount=0;

    // Constructor
    public Student(String name, String id,double chi ,double math,double eng, int studentAmount){
        this.name = name;
        this.id = id;
        this.chi=chi;
        this.math=math;
        this.eng =eng;
        studentAmount++;

        }

    public double getTotal(){
        return chi+math+eng;
    }

    public double getaverageTotal(){
        return (chi+math+eng)/3.0;
    }

    public String getName(){
        return name;
    }

    public int getsa() {
        return studentAmount;
    }
    
    public String getid(){
        return id;
    }
   
   

}


        
    


