import java.util.*;

class juet{
    String Name;
    int age;
    void setName(String Name){
        this.Name=Name;
    }
    void setAge(int age){
        this.age=age;
    }
    String getName(){
        return this.Name;
    };
    int getAge(){
        return this.age;
    }
    
}

public class LE0
{
	public static void main(String[] args) {
	    
	    juet one=new juet();
	    one.setName("Dhruv");
	    one.setAge(21);
	   System.out.println("Name: "+one.getName()+", Age: "+one.getAge());
	}
}