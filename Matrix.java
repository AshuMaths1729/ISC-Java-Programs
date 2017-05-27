import java.io.*;
class Matrix
{
int arr[][]=new int[4][4];
void input()throws IOException
{
BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter matrix elements");
for(int i=0;i<4;i++)
{
for(int j=0;j<4;j++)
{
arr[i][j]=Integer.parseInt(in.readLine());
}
}
}
Matrix product(Matrix M)
{
Matrix ob=new Matrix();
for(int i=0;i<4;i++)
{
for(int j=0;j<4;j++)
{
ob.arr[i][j]=0;
for(int k=0;k<4;k++)
{
ob.arr[i][j]+=arr[i][k]*M.arr[k][j];
}
}
}
return ob;
}
void print()
{
System.out.println("Multiplied Matrix:");
for(int i=0;i<4;i++)
{
for(int j=0;j<4;j++)
{
System.out.print(arr[i][j]+" ");
}
System.out.println();
}
}
void main()throws IOException
{
Matrix ob1=new Matrix();
Matrix ob2=new Matrix();
ob1.input();
ob2.input();
ob2=ob1.product(ob2);
ob2.print();
}
}
