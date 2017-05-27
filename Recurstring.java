import java.io.*;
class Recurstring
{
String str,revst;
Recurstring()
{
str="";revst="";
}
void input()throws IOException
{
BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter String");
str=in.readLine();
}
void rev(int n)
{
if(n<str.length())
{
char ch=str.charAt(n);
revst=ch+revst;
rev(n+1);
}
}
void check()
{
rev(0);
if(str.equals(revst))
{
System.out.println("Palindrome String");
}
else
{
System.out.println("Not a Palindrome String");
}
}
void main()throws IOException
{
Recurstring ob=new Recurstring();
ob.input();
System.out.println("Output:");
ob.check();
}
}
