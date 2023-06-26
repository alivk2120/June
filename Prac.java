/*Create an abstract class called Student with the following attributes:
id (int): The unique ID of the student.
name (String): The name of the student.
grade (int): The grade or year of study for the student.*/
abstract class Student{
  private int id;
  private String Name;
  private String Grade;

  Student(int id,String Name,String Grade){
    this.id=id;
    this.Name=Name;
    this.Grade=Grade;
  }
  public int getId() {
    return id;
  }
  public void setId(int id) {
    this.id = id;
  }
  public String getName() {
    return Name;
  }
  
  public void setName(String name) {
    this.Name = name;
  }
  
  public String getGrade() {
    return Grade;
  }

  public void setGrade(String grade) {
    this.Grade = grade;
  }
}
interface Study{
  void studyMaterials();
  void submitAssignment();
}

class RegularStudent extends Student implements Study{
  String department;
  
  RegularStudent(int id, String Name, String Grade, String department){
    super(id, Name, Grade);
    this.department=department;
  }
  public void studyMaterials(){
    System.out.println("study materials include notebooks");
  }
  public void submitAssignment(){
    System.out.println("assignment submitted");
  }
  
  public String getDepartment() {
    return department;
  }
  
  public void setDepartment(String department) {
    this.department = department;
  }
}
class DistanceLearningStudent extends Student implements Study{
  private String location;

  DistanceLearningStudent(int id,String name,int grade,String location){
    super(id, name, grade);
    this.location=location;
  }
  public void studyMaterials(){
    System.out.println("study materials include notebooks");
  }
  public void submitAssignment(){
    System.out.println("assignment submitted");
  }
public String getLocation() {
    return location;
}
public void setLocation(String location) {
    this.location = location;
}
}
class Prac{
  public static void main(String args[]){
    RegularStudent st=new RegularStudent(123,"Ali","A","cse");
  System.out.println(st.getId()+" "+st.getName()+" "+st.getGrade()+" "+st.getDepartment());
    //RegularStudent rg=new RegularStudent("cse");
    //System.out.print(st.getDepartment());
  }
}