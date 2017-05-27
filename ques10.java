import java.io.*;
class ques10
{
void main()throws IOException
{
meritlist ob=new meritlist();
ob.readdetails();
ob.printmerit();
}
}
class student
{
double tot[]=new double[10];
String stud[]=new String[10];
void readdetails()throws IOException
{
BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter marks");
for(int i=0;i<10;i++)
{
tot[i]=Double.parseDouble(in.readLine());
if(tot[i]>500.0)
{
System.out.println("Re-enter marks");
i--;
}
}
System.out.println("Enter names");
for(int i=0;i<10;i++)
{
stud[i]=in.readLine();
}
}
void printresult()
{
for(int i=0;i<10;i++)
{
for(int j=0;j<9;j++)
{
if(tot[j]<tot[j+1])
{
double t=tot[j];
tot[j]=tot[j+1];
tot[j+1]=t;
String temp=stud[j];
stud[j]=stud[j+1];
stud[j+1]=temp;
}
}
}
System.out.println("Highest marks="+tot[0]+" "+"Student-"+stud[0]);
System.out.println("Lowest marks="+tot[9]+" "+"Student-"+stud[9]);
}
}
class meritlist extends student
{
void printmerit()
{
printresult();
System.out.println("Merit List:");
System.out.println("Names:"+"\t"+"Marks:");
for(int i=0;i<10;i++)
{
System.out.print(stud[i]+"\t"+tot[i]);
System.out.println();
}
}
}
