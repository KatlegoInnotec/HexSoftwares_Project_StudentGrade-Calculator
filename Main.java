
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         Scanner scNum = new Scanner(System.in);
        List<Student> studList = new ArrayList<>();
        String addStudent = "1";
        
        while(addStudent.equals("1")) {
            System.out.print("Enter student name: " );
            String name = sc.nextLine();
        
            System.out.print("Enter student no: " );
            String studID = sc.nextLine(); 
        
            System.out.print("Enter student grade: " );
            Double grade = scNum.nextDouble();
            
            
            studList.add(new Student(name,studID,grade));
            
            System.out.println("Do you want to add a student? \nEnter 1 to continue or \n2 to end"  );
            addStudent = sc.nextLine();
            
        }

        for(Student stud: studList){
             System.out.println(stud );
        }
        
        int classAve =0;
        int getMarks = 0;
        
        for(Student stud: studList){
            getMarks += stud.getGrade();
        }
        classAve = getMarks/studList.size();
         System.out.println("Class avg: " +classAve );
 
    }
}

class Student {
    private String name, studID;
    private Double grade;
    
    public Student(String name, String studID, Double grade) {
        this.name = name;
        this.studID = studID;
        this.grade = grade;
    }
    
    
    private String getStatus() {
        return grade < 50 ? "Failed" : "Passed";
    }
    
   
    public Double getGrade(){
        return grade;
    }
    
    public String getName(){
        return name;
    }
    
    public String getstudID(){
        return studID;
    }
     @Override
    public String toString() {
        return "Student Name: " + name + ", ID: " + studID + ", Grade: " + grade  + " Status: " + getStatus();
    }
    
}
