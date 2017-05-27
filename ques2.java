import java.io.*;
class ques2
{
int a[][];
int m,n,pos1,pos2,pos3,pos4;
ques2(int p,int q)
{
m=p;
n=q;
a=new int[m][n];
}
void input()throws IOException
{
BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
if(m>2 && n>2 && m<20 && n<20)
{
System.out.println("Enter values");
for(int i=0;i<m;i++)
{
for(int j=0;j<n;j++)
{
a[i][j]=Integer.parseInt(in.readLine());
}
}
}
}
void display()
{
System.out.println("INPUT:");
System.out.println("M="+m);
System.out.println("N="+n);
System.out.println("Entered values:");
for(int i=0;i<m;i++)
{
for(int j=0;j<n;j++)
{
System.out.print(a[i][j]+" ");
}
}
}
void matrix()
{
System.out.println("\n"+"Original matrix:");
for(int i=0;i<m;i++)
{
for(int j=0;j<n;j++)
{
System.out.print(a[i][j]+" ");
}
System.out.println();
}
}
void max()
{
int big=0;
for(int i=0;i<m;i++)
{
for(int j=0;j<n;j++)
{
if(big<a[i][j])
{
big=a[i][j];
pos1=i;
pos2=j;
}}}
System.out.println("Largest Number="+big);
System.out.println("Row="+pos1);
System.out.println("Column="+pos2);
}
void min()
{
int i=0;
int j=0;
int sm=a[i][j];
for(i=0;i<m;i++)
{
for(j=0;j<n;j++)
{
if(sm>a[i][j])
{
sm=a[i][j];
pos3=i;
pos4=j;
}
}
}
System.out.println("Minimum Number="+sm);
System.out.println("Row="+pos3);
System.out.println("Column="+pos4);
}
void sort()
{
System.out.println("Rearranged Matrix:");
int arr[]=new int[m*n];
int c=0;
for(int i=0;i<m;i++)
{
for(int j=0;j<n;j++)
{
arr[c]=a[i][j];
c++;
}
}
for(int i=0;i<m*n;i++)
{
for(int j=0;j<((m*n)-1);j++)
{
if(arr[j]>arr[j+1])
{
int temp=arr[j];
arr[j]=arr[j+1];
arr[j+1]=temp;
}
}
}
int k=0;
for(int i=0;i<m;i++)
{
for(int j=0;j<n;j++)
{
a[i][j]=arr[k];
System.out.print(a[i][j]+" ");
k++;
}
System.out.println();
}
}
void main()throws IOException
{
ques2 ob=new ques2(m,n);
ob.input();
ob.display();
ob.matrix();
ob.max();
ob.min();
ob.sort();
}
}

