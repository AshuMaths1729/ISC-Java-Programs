import java.io.*;
class Dequeue
{
int capacity,front,rear;
int job[];int newjob;
Dequeue(int n)
{
capacity=n;
front=-1;
rear=-1;
createJob();
}
void createJob()
{
job=new int[capacity];
}
void addLast()
{
if(rear==capacity-1)
{
System.out.println("job is full,cannot add any more");
}
else
{
rear++;
job[rear]=newjob;
}
if(front==-1)
{
front++;
}
}
void removeLast()
{
if((front==-1 && rear==-1) || (front>rear))
{
front=-1;rear=-1;
System.out.println("job is empty");
}
else
{
rear--;
}
}
void addFirst()
{
if(front<=0)
{
System.out.println("job is full,cannot add any more");
}
else
{
front--;
job[front]=newjob;
}
}
void removeFirst()
{
if((front==-1 && rear==-1) || (front>rear))
{
front=-1;rear=-1;
System.out.println("job is empty");
}
else
{
front++;
}
}
void main()throws IOException
{
BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter size of Dequeue");
int m=Integer.parseInt(in.readLine());
int ch;
Dequeue ob=new Dequeue(m);
do
{
System.out.println("Enter 1 for adding element at last");
System.out.println("Enter 2 removing element at last");
System.out.println("Enter 3 adding element at front");
System.out.println("Enter 4 removing element from front");
System.out.println("Enter 5 for printing queue elements");
System.out.println("Enter 6 for termination of program");
System.out.println("Enter choice");
ch=Integer.parseInt(in.readLine());
switch(ch)
{
case 1:
System.out.println("Enter job");
ob.newjob=Integer.parseInt(in.readLine());
ob.addLast();
break;
case 2:
ob.removeLast();
break;
case 3:
System.out.println("Enter job");
ob.newjob=Integer.parseInt(in.readLine());
ob.addFirst();
break;
case 4:
ob.removeFirst();
break;
case 5:
System.out.println("Dequeue Elements:");
if(ob.front!=-1)
{
for(int i=ob.front;i<=ob.rear;i++)
{
System.out.print(ob.job[i]);
}
System.out.println();
}
break;
case 6:
System.out.println("Program Terminated");
break;
default:
System.out.println("Invalid Input,enter code from 1 to 6 only");
}
}
while(ch!=6);
}
}