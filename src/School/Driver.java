package School;


/**
 *
 * @author sande
 */
public class Driver {

    
    public static void main(String[] args) {
        Course cs331 = new Course("Data Structures and Algorithms");
        Student Austin = new Student(001212666, "Austin");
        
        cs331.addStudent(Austin);
        Austin.addGrade();
        Austin.addGrade();
        Austin.addGrade();
        Austin.average();
        
        
    }
    
}
