import java.util.Scanner;
public class employee
{
String name,eid;
int total,salary,per,deduction,day;

void getdata()
{
Scanner ob=new Scanner(System.in);
System.out.println("enter the name of the student");
name=ob.nextLine();
System.out.println("enter the employee id");
eid=ob.nextLine();
System.out.println("enter the per day income");
per=ob.nextInt();
System.out.println("enter the number of days");
day=ob.nextInt();
}
void putdata()
{
System.out.println("thea name of the employee is :"+name);
System.out.println("the employee id id: "+eid);
System.out.println("the number of days he has worked are :"+day);
salary=day*per;
System.out.println("the salary after deduction is :"+salary);
total=31*per;
deduction=total-salary;
System.out.println("the deducted salary is :"+deduction);
}
}