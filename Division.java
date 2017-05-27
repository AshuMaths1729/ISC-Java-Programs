import java.io.*;
class Division
{
int num,den;
Division(int a,int b)
{
num=a;
den=b;
}
int hcf(int c,int d)
{
int h=1;
for(int i=1;i<=(c*d);i++)
{
if(c%i==0 && d%i==0)
{
h=i;
}
}
return h;
}
int lcm(int e,int f)
{
int l=(e*f)/hcf(e,f);
return l;
}
void reduce()
{
int x=num/hcf(num,den);
int y=den/hcf(num,den);
num=x;
den=y;
}
Division addTo(Division q)
{
int l=lcm(den,q.den);
int i=num*(l/den)+q.num*(l/q.den);
q.num=i/hcf(i,l);
q.den=l/hcf(i,l);
return q;
}
void main()throws IOException
{
BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter numerator and denominator");
int m=Integer.parseInt(in.readLine());
int n=Integer.parseInt(in.readLine());
int p=Integer.parseInt(in.readLine());
int q=Integer.parseInt(in.readLine());
if(n==0 || q==0)
{
System.out.println("Infinity");
}
else
{
Division ob1=new Division(m,n);
Division ob2=new Division(p,q);
ob1=ob1.addTo(ob2);
System.out.println("Output:");
System.out.println(ob1.num+"/"+ob1.den);
}
} 
}