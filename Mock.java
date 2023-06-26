interface StudentInterface{
  abstract void insertStudentDetails();
  abstract void updateStudentDetails();
  abstract void deleteStudentDetails();
  abstract void searchStudentDetails();
}
class Student{
  private String name;
  private int id;
  private int marks;
  public Student(String name,int id,int marks){
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

class StudentDetails implements StudentInterface{
  Student s[]=new Student[3];
  Scanner st=new Scanner(System.in);
  public void insertStudentDetails(){
    for(int i=0;i<s.length;s++){
      s[i]=new Student();
      System.out.println("Enter student name");
      s[i].setName(st.next());
      System.out.println("enter student id");
      s[i].setId(st.nextInt());
      System.out.println("enter student marks");
      s[i].setMarks(st.nextInt());
      
    }
  }
}