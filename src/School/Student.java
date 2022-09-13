
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
                     
    public void addGrade(){
        double grade;
        System.out.println("Enter grade to be Added to this Student: ");
        Scanner in = new Scanner(System.in);
        grade = in.nextDouble();
        grades.add(grade);
   
    }

    public String getName() {
        return name;
    }
    
    public double average(){
        double total = 0;
        double average;
        for(int i = 0; i < grades.size(); i++){
            total = total + grades.get(i);
        }
        
        average = total/grades.size();
        System.out.println("The grade average for " + name + " is " + average);
        return average;
    }
}
