import java.io.*;
class vowel_arrange
{
    void main()throws IOException
    {
          BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
          System.out.println("enter string : ");
          
          String s=in.readLine();
          
          String a[]=s.split(" ");
          for(int i=0;i<a.length;i++)
          { String w="";
             String str=a[i];
             String v="aeiouAEIOU";
             for(int j=0;j<str.length();j++)
             {
                 char ch=str.charAt(j);
                 if(v.indexOf(ch)>=0)
                 {
                    w=ch+w;
                }
                else w=w+ch;
            }
                    
        System.out.print(w+" ");
    }}
}
          