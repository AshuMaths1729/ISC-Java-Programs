import java.io.*;
class alphabet
{
    void input()throws IOException
    {
        BufferedReader in =new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter any string : ");
        String s=in.readLine();
        String a[]=s.split(" ");
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length-1;j++)
            {
                if(a[j].compareTo(a[j+1])>0)
                {
                    String t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                }
            }
        }
        for(int i=0;i<a.length;i++)
        System.out.print(a[i]+" ");
    }
}