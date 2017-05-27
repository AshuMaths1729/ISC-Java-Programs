import java.io.*;
class date
{
    void main()throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        int c=0;
        System.out.println("Enter date and no. of days ");
        String d=in.readLine();
        int n=Integer.parseInt(in.readLine());
        int dd=Integer.parseInt(d.substring(0,2));
        int mn=Integer.parseInt(d.substring(3,5));
        int yy=Integer.parseInt(d.substring(6,10));
        int mth[]={0,31,28,31,30,31,30,31,31,30,31,30,31};
        if((yy%400==0)||(yy%100!=0)&&(yy%4==0))
        {
            mth[2]=29;
        }
        while(c<n)
        {
            dd++;c++;
            if(dd>mth[mn])
            {
                dd=1;mn++;
                if(mn>12)

                {
                    mn=1;yy++;
                    if((yy%400==0)||(yy%100!=0)&&(yy%4==0))
                    {
                        mth[2]=29;
                    }
                    else mth[2]=28;
                }
            }
        }
        System.out.println(dd+" "+mn+"  "+yy);
    }
}

        