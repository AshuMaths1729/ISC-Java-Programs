import java.io.*; 
class Prime
{
    void calc()throws IOException
    {
        BufferedReader in= new BufferedReader(new InputStreamReader(System.in));
        int c=0;
        System.out.println("Enter low :");
        int a=Integer.parseInt(in.readLine());
        System.out.println("Enter high :");
        int b=Integer.parseInt(in.readLine());
        for(int i=a;i<=b;i++)
        {
            for(int j=1;j<=i;j++)
            {
                if(i%j==0)
                {
                    c++;
                }}
                if(c==2)
                {
                    System.out.println(i);
                }
            }
        }
    }