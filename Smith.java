import java.io.*;
class Smith
{
int n;
Smith(int num)
{
n=num;
}
int sum(int p)
{
int s=0;
while(p!=0)
{
int d=p%10;
s=s+d;
p=p/10;
}
return s;
}
void display()
{
int s=0;
int m=sum(n);
int i=2;
while(n>1)
{
if(n%i==0)
{
int a=sum(i);
s=s+a;
n=n/i;
}
else
{
i++;
}
}
if(m==s)
{
System.out.println("SMITH Number");
}
else
{
System.out.println("NOT SMITH Number");
}
}
void main()throws IOException
{
BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter Number");
int y=Integer.parseInt(in.readLine());
Smith ob=new Smith(y);
ob.display();
}
}
