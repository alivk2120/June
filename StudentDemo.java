import java.util.*;
class Student{
  private String name;
  private int id;
  private int marks;
  Student(String name,int id,int marks){
    this.name=name;
    this.id=id;
    this.marks=marks;
  }
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getMarks() {
	return marks;
}
public void setMarks(int marks) {
	this.marks = marks;
}
  
}
class StudentDemo{
   Scanner s = new Scanner(System.in);
  ArrayList<Student> stu = new ArrayList<Student>();
   public void addStudent() {
    System.out.println("enter 5 Student details");
    int j = 1;
    for (int i = 0; i < 5; i++) {
      System.out.println("Enter Student " + j + " details");
      System.out.println("Enter Student name");
      String name = s.next();
      System.out.println("Enter Student id");
      int id = s.nextInt();
      System.out.println("Enter Student marks");
      int marks = s.nextInt();

 

      stu.add(new Student(name, id, marks));
      j++;
    }
  }
  public static void main(String args[]){
    StudentDemo st=new StudentDemo();
    st.addStudent();
    System.out.println("5 student details entered successfully");
  }
}