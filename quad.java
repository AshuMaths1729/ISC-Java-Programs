import java.io.*;
class quad
{
float a,b,c,x1,x2;
quad(float p,float q,float r)
{
a=p;b=q;c=r;
}
float discriminant()
{
float y=(b*b)-4*a*c;
return y;
}
void root_equal()
{
System.out.println("Roots are equal");
}
void imag()
{
System.out.println("Roots are imaginary");
}
void root_real()
{
System.out.println("Roots are real and unequal");
}
void root()
{
float y=discriminant();
if(y<0)
{
imag();
}
if(y==0)
{
x1=-b/(2*a);
x2=-b/(2*a);
root_equal();
System.out.println("Roots are="+x1+","+x2);
}
if(y>0)
{
x1=(float)(-b+(Math.sqrt(y)))/(2*a);
x2=(float)(-b-(Math.sqrt(y)))/(2*a);
root_real();
System.out.println("Roots are="+x1+","+x2);
}
}
void main()throws IOException
{
BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter values");
float m=Float.parseFloat(in.readLine());
float n=Float.parseFloat(in.readLine());
float p=Float.parseFloat(in.readLine());
quad ob=new quad(m,n,p);
System.out.println("Output:");
ob.root();
}
}