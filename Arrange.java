import java.io.*;
class Arrange
{
int arr[];
int brr[];
int size;
Arrange(int n)
{
size=n;
}
void input()throws IOException
{
BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter elements");
arr=new int[size];
for(int i=0;i<size;i++)
{
arr[i]=Integer.parseInt(in.readLine());
}
}
void arrange()
{
for(int i=0;i<size;i++)
{
for(int j=0;j<size-1;j++)
{
if(arr[j]<arr[j+1])
{
int t=arr[j];
arr[j]=arr[j+1];
arr[j+1]=t;
}
}
}
int mid=size/2;
brr=new int[size];
brr[mid]=arr[0];int x=1;
for(int i=1;i<size;)
{
brr[mid-x]=arr[i];
brr[mid+x]=arr[i+1];
i=i+2;
x++;
}
}
void display()
{
for(int i=0;i<size;i++)
{
System.out.print(brr[i]+",");
}
}
void main()throws IOException
{
BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter size");
int m=Integer.parseInt(in.readLine());
if(m%2==1)
{
Arrange ob=new Arrange(m);
ob.input();
ob.arrange();
System.out.println("Output:");
ob.display();
}
else
{
System.out.println("Re-enter value of size odd");
}
}
}

