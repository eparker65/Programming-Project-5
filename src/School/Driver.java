package School;


/**
 *
 * @author sande
 */
public class Driver {

    
    public static void main(String[] args) {
        Course cs331 = new Course("Data Structures and Algorithms");
        Student Austin = new Student(001212666, "Austin");
        Student Elijah = new Student(001221333, "Elijah");
        Student MisterPickle = new Student(001256777, "MisterPickle");
        
        
        
        cs331.addStudent(Austin);
        cs331.addStudent(Elijah);
        cs331.addStudent(MisterPickle);
        Austin.addGrade();
        Elijah.addGrade();
        MisterPickle.addGrade();
        Austin.average();
        
        
        
        
    }
    
}
