import java.io.*;
class Decode
{
String editnreverse(String s)
{
String y="";
char ch=s.charAt(0);
ch=Character.toUpperCase(ch);
String sub=s.substring(1,s.length());
for(int i=0;i<sub.length();i++)
{
char c=sub.charAt(i);
c=Character.toLowerCase(c);
y=c+y;
}
y=y+ch;
return y;
}
String editorig(String s)
{
String w="",word="";
s=s+" ";
for(int i=0;i<s.length();i++)
{
char ch=s.charAt(i);
if(ch!=' ')
{
w=w+ch;
}
else
{
String y=editnreverse(w);
word=y+" "+word;
w="";
}
}
return word;
}
void main()throws IOException
{
BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter string");
String str=in.readLine();
String y=editorig(str);
y=y.trim();
int m=str.length();
int n=str.length();
Character arr[][]=new Character[m][n];
int i=0,j=0;
for(int k=0;k<y.length();k++)
{
char ch=y.charAt(k);
if(ch!=' ')
{
arr[i][j]=ch;
i++;
}
else
{
i=0;
j++;
}
}
System.out.println("Input:"+str);
System.out.println("Output:");
for(int p=0;p<m;p++)
{
for(int q=0;q<n;q++)
{
if(arr[p][q]==null)
{
System.out.print(' '+"\t");
}
else
{
System.out.print(arr[p][q]+"\t");
}
}
System.out.println();
}
}
}

