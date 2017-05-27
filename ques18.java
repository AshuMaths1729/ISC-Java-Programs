import java.io.*;
class ques18
{
void main()throws IOException
{
BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter marks in accounts,economics,physics and maths");
double macc=Double.parseDouble(in.readLine());
double meco=Double.parseDouble(in.readLine());
double mphy=Double.parseDouble(in.readLine());
double mmath=Double.parseDouble(in.readLine());
System.out.println("Enter name,address and rollno");
String n=in.readLine();
String a=in.readLine();
int r=Integer.parseInt(in.readLine());
CommerceStudent ob1=new CommerceStudent(n,a,r,macc,meco);
ScienceStudent ob2=new ScienceStudent(n,a,r,mphy,mmath);
ob1.display();
ob2.display();
}
}
class Student
{
protected String name;
protected String address;
protected int rollno;
Student(String nm,String add,int r)
{
name=nm;
address=add;
rollno=r;
}
void display()
{
System.out.println("Name="+name);
System.out.println("Address="+address);
System.out.println("Rollno="+rollno);
}
}
class CommerceStudent extends Student
{
private double marksacc;
private double markseco;
CommerceStudent(String nm,String add,int r,double mac,double mae)
{
super(nm,add,r);
marksacc=mac;
markseco=mae;
}
double average()
{
double a=(marksacc+markseco)/2;
return a;
}
void display()
{
super.display();
System.out.println("Marks of accounts="+marksacc);
System.out.println("Marks of economics="+markseco);
double y=average();
System.out.println("Average of accounts and economics marks="+y);
}
}
class ScienceStudent extends Student
{
private double marksphy;
private double marksmaths;
ScienceStudent(String nm,String add,int r,double ph,double math)
{
super(nm,add,r);
marksphy=ph;
marksmaths=math;
}
double average()
{
double a=(marksphy+marksmaths)/2;
return a;
}
void display()
{
System.out.println("Marks of physics="+marksphy);
System.out.println("Marks of maths="+marksmaths);
double y=average();
System.out.println("Average of physics and maths marks="+y);
}
}

