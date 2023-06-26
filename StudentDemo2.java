import java.util.*;  
class Student{  
int id;  
String name;
int marks;  
public Student(int id, String name, int marks) {  
    this.id = id;  
    this.name = name;  
    this.marks = marks;
}  
}  
public class StudentDemo2 {  
public static void main(String[] args) {  
    HashSet<Student> set=new HashSet<Student>();   
    Student s1=new Student(101,"ali",89);  
    Student s2=new Student(102,"saad",49);  
    Student s3=new Student(103,"muba",68); 
    set.add(s1);  
    set.add(s2);  
    set.add(s3);    
    for(Student s:set){  
    System.out.println(s.id+" "+s.name+" "+s.marks);  
    }  
}  
}  