
package School;
import java.util.ArrayList;
import java.util.Scanner;

public class Student {
    
    private int ID;
    private String name;
    ArrayList<Double> grades = new ArrayList<>();
    
    
    public Student(int ID, String name){
        this.ID = ID;
        this.name = name;
    }
                     


    public String getName() {
        return name;
    }
    
   
        
       
}
