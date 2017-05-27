import java.io.*;
class Modify
{
    void main()throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter 1st String : ");
        String s1=in.readLine();
        System.out.println("Enter 2nd String : ");
        String s2=in.readLine();
        String a1[]=s1.split(" ");
        String a2[]=s2.split(" ");
        int m=0;
        String a[]=new String[a1.length+a2.length];
        for(int i=0;i<a1.length;i++)
        {
            for(int j=0;j<a2.length;j++)
            {
                if(a1[i]==a2[j])
                {
                    a[m]=a1[i];
                    m++;
                }
            }
        }
        for(int k=0;k<a1.length;k++)
        {int g=0;
            for(int c=0;c<a.length;c++)
            {
                if(a1[k]==a[c])
                {g=1;
                    break;
                    
                }
                
            }if(g==0)
            {System.out.print(a1[k]+" ");}
            }
        
        for(int k=0;k<a2.length;k++)
        {int r=0;
            for(int c=0;c<a.length;c++)
            {
                if(a2[k]==a[c])
                {
                    r=1;
                    break;
                } }  if(r==0){     System.out.print(a2[k]+" ");}
            }
        }
    }
