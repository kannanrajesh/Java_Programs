package project.task2;

public class Student {
int student_Id;
String student_Name;
int sub1;
int sub2;
int sub3;

public void getStuData(int Id,String Name)

{
	student_Id = Id;
	student_Name = Name;
}
public void getStuMarks(int s1,int s2, int s3) {
sub1 = s1;
sub2 = s2;
sub3 = s3;
}
public void totalMark() {
int total = sub1 + sub2 + sub3;
System.out.println("student id  " +   student_Id);
System.out.println("student name  " +   student_Name);
System.out.println("Total Marks " + total);
}
public static void main(String[] args) {
	Student stu = new Student();
	stu.getStuData(100, "RAM");
	stu.getStuMarks(100, 100, 100);
	stu.totalMark();
}
}
