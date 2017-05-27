import java.io.*;
class ques3 
{
void main()throws IOException
{
matrix2 ob=new matrix2();
ob.readLimit();
ob.input_a();
ob.input_b();
ob.showmats();
ob.showmatrix();
}
}
class matrix1
{
double a[][],b[][];
int m,n,r,c;
matrix1()
{
m=0;n=0;r=0;c=0;
}
void readLimit()throws IOException
{
BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter rows and columns for 1st matrix");
m=Integer.parseInt(in.readLine());
n=Integer.parseInt(in.readLine());
System.out.println("Enter rows and columns for 2nd matrix");
r=Integer.parseInt(in.readLine());
c=Integer.parseInt(in.readLine());
}
void input_a()throws IOException
{
BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter matrix a elements");
a=new double[m][n];
for(int i=0;i<m;i++)
{
for(int j=0;j<n;j++)
{
a[i][j]=Integer.parseInt(in.readLine());
}
}
}
void input_b()throws IOException
{
BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter matrix b elements");
b=new double[r][c];
for(int i=0;i<r;i++)
{
for(int j=0;j<c;j++)
{
b[i][j]=Double.parseDouble(in.readLine());
}
}
}
void showmats()
{
System.out.println("Matrix a:");
for(int i=0;i<m;i++)
{
for(int j=0;j<n;j++)
{
System.out.print(a[i][j]+" ");
}
System.out.println();
}
System.out.println("Matrix b:");
for(int i=0;i<r;i++)
{
for(int j=0;j<c;j++)
{
System.out.print(b[i][j]+" ");
}
System.out.println();
}
}
}
class matrix2 extends matrix1
{
double d[][];
matrix2()
{
d=new double[m][c];
}
void findproduct()
{
d=new double[m][c];
if(n==r)
{
for(int i=0;i<m;i++)
{
for(int j=0;j<c;j++)
{
d[i][j]=0;
for(int k=0;k<m;k++)
{
d[i][j]+=a[i][k]*b[k][j];
}
}
}
}
}
void showmatrix()
{
if(n!=r)
{
System.out.println("matrix a and matrix b can not be multiplied");
}
else
{
findproduct(); 
System.out.println("multiplication of matrix a and matrix b:");
for(int i=0;i<m;i++)
{
for(int j=0;j<c;j++)
{
System.out.print(d[i][j]+" ");
}
System.out.println();
}
}
}
}

