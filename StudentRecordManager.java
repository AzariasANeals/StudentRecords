import java.util.*;

/**
 * Write a description of class StudentRecordManager here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StudentRecordManager
{
    TreeMap<Integer, Student> studentRecords;
    
    public StudentRecordManager(){
        studentRecords = new TreeMap<Integer, Student>();
    }
    
    public void insertStudent(Student student){
        if(student == null){
            return;
        }
        
        // Prevent duplicate studentIDs
        if(studentRecords.containsKey(student.getStudentID())){
            return;
        }
        
        studentRecords.put(student.getStudentID(), student);
    }
    
    public void updateStudent(Student student){
        if(student == null){
            return;
        }
        
        // first remove student, then insert new student in its place
        
        if(studentRecords.containsKey(student.getStudentID())){
            removeStudent(student);
            insertStudent(student);
        }
        
    }
    
    public void removeStudent(Student student){
        if(student == null){
            return;
        }
        if(studentRecords.containsKey(student.getStudentID())){
            studentRecords.remove(student.getStudentID());
        }
    }
    
    public void updateInsertStudent(Student student){
        if(student == null){
            return;
        }
        
        // if the record does not exist, it will create one, if it does it will replace it
        if(studentRecords.containsKey(student.getStudentID())){
            updateStudent(student);
        }
        else{
            insertStudent(student);
        }
        
    }
    
    public void displayStudentRecords(){
        for(Map.Entry<Integer, Student> entry: studentRecords.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        System.out.println("");
    }
    
    public void displayStudentRecords(double gpaFilter){
        for(Map.Entry<Integer, Student> entry : studentRecords.entrySet()){
            if(entry.getValue().getGPA() > gpaFilter){
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
        System.out.println("");
    }
    
    public Student retrieveStudentRecord(int studentID){
        return studentRecords.get(studentID);
    }
    
    public int getNumberOfRecords(){
        return studentRecords.size();
    }
    
    public String toString(){
        String buffer = "";
        for(Map.Entry<Integer, Student> entry : studentRecords.entrySet()){
            buffer += (entry.getKey() + ": " + entry.getValue()) + "\n";
        }
        buffer += "\n";
        return buffer;
    }
}