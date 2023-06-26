/*Create an abstract class called Employee with the following private attributes:
String name: Represents the name of the employee.
int employeeId: Represents the unique employee ID.
double salary: Represents the salary of the employee.*/
abstract class Employee{
  private String name;
  private int employeeId;
  private double salary;
  Employee(String name,int employeeId,double salary){
    this.name=name;
    this.employeeId=employeeId;
    this.salary=salary;
  }
}