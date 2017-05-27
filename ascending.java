import java.io.*;
class ascending
{
int a[];
int size;
ascending(int n)
{
size=n;
a=new int[size];
}
void input()throws IOException
{
BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter array elements");
for(int i=0;i<size;i++)
{
a[i]=Integer.parseInt(in.readLine());
}
}
void sort()
{
for(int i=0;i<size;i++)
{
for(int j=0;j<size-1;j++)
{
if(a[j]>a[j+1])
{
int t=a[j];
a[j]=a[j+1];
a[j+1]=t;
}
}
}
}
void displaylist()
{
for(int i=0;i<size;i++)
{
System.out.print(a[i]+" ");
}
}
ascending merge(ascending obj)
{
ascending ob=new ascending(obj.size+size);
for(int i=0;i<size;i++)
{
ob.a[i]=a[i];
}
for(int j=0;j<obj.size;j++)
{
ob.a[size+j]=obj.a[j];
}
int m=ob.size;
for(int x=0;x<ob.size;x++)
{
for(int i=0;i<m;i++)
{
for(int j=i+1;j<m;j++) 
{
if(ob.a[i]==ob.a[j])
{
while(j<(m-1)) 
{
ob.a[j]=ob.a[j+1];
j++;
}   
m--;
}
}
}
}
ob.size=m;
return ob;
}
void main()throws IOException
{
BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter size");
int m=Integer.parseInt(in.readLine());
ascending ob1=new ascending(m);
ascending ob2=new ascending(m);
ob1.input();
ob2.input();
ob1.sort();
ob2.sort();
ob2=ob1.merge(ob2);
System.out.println("Output:");
ob2.displaylist();
}
}
