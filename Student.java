class Student 
{
int rollNo;
String name;
double height;
double weight;
double marks;

public void displayData(String studentName) 
{
System.out.println(studentName + " Data");
System.out.println("Roll No: " + rollNo);
System.out.println("Name: " + name);
System.out.println("Height: " + height);
System.out.println("Weight: " + weight);
System.out.println("Marks: " + marks);
System.out.println("-----------------------------------");
}

public static void main(String[] args) 
{
Student obj1 = new Student();
obj1.rollNo = 1;
obj1.name = "Abhay Rana";
obj1.height = 120;
obj1.weight = 65.2;
obj1.marks = 20;

Student obj2 = new Student();
obj2.rollNo = 2;
obj2.name = "Ashutosh Arya";
obj2.height = 165.0;
obj2.weight = 60.0;
obj2.marks = 89;
obj1.displayData("Student 1");
obj2.displayData("Student 2");
}
}
