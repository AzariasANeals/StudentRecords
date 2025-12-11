
/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{
    public static void main(String[] args){
        Student student1 = new Student(1, "Mark", 2.9);
        Student student2 = new Student(2, "Stephanie", 3.9);
        Student student3 = new Student(3, "John", 1.9);
        Student student4 = new Student(4, "Beth", 3.5);
        Student student5 = new Student(5, "Barry", 1.2);
        Student student6 = new Student(6, "Stewart", 3.2);

        StudentRecordManager manager = new StudentRecordManager();
        System.out.println("All students in StudentRecordManager");
        manager.insertStudent(student1);
        manager.insertStudent(student2);
        manager.insertStudent(student3);
        manager.insertStudent(student4);
        manager.insertStudent(student5);
        manager.insertStudent(student6);
        manager.displayStudentRecords();
        
        System.out.println("Update student2's gpa to 3.7");
        student2.setGPA(3.7);
        manager.updateStudent(student2);
        manager.displayStudentRecords();
        
        System.out.println("Removing student5 from StudentRecordManager");
        manager.removeStudent(student5);
        manager.displayStudentRecords();
        
        System.out.println("Updating student6 ID value");
        student6 = new Student(7, "Bradley", 4.0);
        manager.updateInsertStudent(student6);
        manager.displayStudentRecords();
        
        System.out.println("Displaying student's with a GPA higher than 3.0");
        System.out.println(manager);
        manager.displayStudentRecords(3.0);
        
        Student mark = manager.retrieveStudentRecord(1);
        System.out.println(mark);
        System.out.println("\n");
    }
}