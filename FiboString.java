import java.io.*;
class FiboString
{
String x,y,z;
int n;
FiboString()
{
x="a";
y="b";
z="ba";
n=0;
}
void accept()throws IOException
{
BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter no. of terms");
n=Integer.parseInt(in.readLine());
}
void generate()
{
if(n==1)
{
System.out.println(x);
}
else if(n==2)
{
System.out.println(x+","+y);
}
else if(n==3)
{
System.out.print(x+","+y+","+z);
}
else if(n>3)
{
System.out.print(x+","+y+","+z+",");
for(int i=4;i<=n;i++)
{
x=z+y;
y=z;
z=x;
System.out.print(x+",");
}
}
}
void main()throws IOException
{
FiboString ob=new FiboString();
ob.accept();
System.out.println("Output:");
ob.generate();
}
}

