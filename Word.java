import java.io.*;
class Word
{
int check(String s)
{
for(int i=0;i<s.length();i++)
{
char ch=s.charAt(i);
if(ch==' ')
{
return 0;
}
}
return 1;
}
void print(String s)
{
s=s.toUpperCase();
String w="";
char ch=s.charAt(s.length()-1);
ch=Character.toLowerCase(ch);
for(int i=0;i<s.length()-1;i++)
{
char c=s.charAt(i);
w=w+c;
}
w=w+ch;
int l=w.length();
int m=(2*l)-1;
int r=0,c=-1,y=m,x=0;
Character arr[][]=new Character[m][m];
while(m>0)
{
for(int i=1;i<=m;i++)
{
arr[r][++c]=w.charAt(x);
}
for(int i=1;i<=m-1;i++)
{
arr[++r][c]=w.charAt(x);
}
for(int i=1;i<=m-1;i++)
{
arr[r][--c]=w.charAt(x);
}
for(int i=1;i<=m-2;i++)
{
arr[--r][c]=w.charAt(x);
}
x++;
m=m-2;
}
for(int i=0;i<y;i++)
{
for(int j=0;j<y;j++)
{
System.out.print(arr[i][j]);
}
System.out.println();
}
}
void main()throws IOException
{
BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter string");
String str=in.readLine();
int y=check(str);
if(y==1)
{
Word ob=new Word();
System.out.println("Input:"+str);
System.out.println("Output:");
ob.print(str);
}
else if(y==0)
{
System.out.println("WRONG INPUT SPACES NOT ALLOWED.INPUT AGAIN....");
}
}
}
