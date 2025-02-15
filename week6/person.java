package week6;

public class person {
    // Static means that there is only one instance for the entire class
    // If it is static, each object will overwrite the previous variable
    // private static String name;如果写成这种形式，进行多个实例化时，导入参数会覆盖原来参数，保证这个name只有唯一值，输出结果p1.getname/p2.getname也会是一样的值
    
    private String name;
    private String gender;
    private String city;
    private String dateOfBirth;
    private int idNumber;

    // Constructor
    public person(String name, String gender, String city, String dOB,int id){
        this.name = name;
        this.gender = gender;
        this.city = city;
        this.dateOfBirth = dOB;
        this.idNumber = id;
        }
   
    public String getName(){
        return name;
    }
     
    public String getGender(){
        return gender;
    }
    public String getCity(){
        return city;
    }
    public String getDateOfBirth(){
        return dateOfBirth;
    }
    public int getIdNumber(){
        return idNumber;
    }

    public void setName(String name){
        this.name = name;
    }

    public boolean samePerson(person that){
        if(!this.name.equals(that.getName())){
            return false;
        }
        if(!this.gender.equals(that.getGender())){
            return false;
        }
        if(this.idNumber != that.getIdNumber()){
            return false;
        }
        return true;
        }
        


}


        
    

