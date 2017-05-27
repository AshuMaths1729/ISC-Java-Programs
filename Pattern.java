import java.io.*;
class Pattern
{
    void main()throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a string : ");
        String s=in.readLine();
        for(int i=0;i<s.length();i++)
        {
            for(int j=0;j<=i;j++)
            {
                 System.out.print(s.charAt(j));
                }
                 System.out.println(" ");
                }
            }
        }
   