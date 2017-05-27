import java.io.*;
class ValidDate
{
    int dd,mm,yyyy;
    ValidDate()
    {
        dd=0;mm=0;yyyy=0;
    }

    void input()throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter date");
        dd=Integer.parseInt(in.readLine());
        mm=Integer.parseInt(in.readLine());
        yyyy=Integer.parseInt(in.readLine());
    }

    int count(int m)
    {
        int c=0;
        while(m!=0)
        {
            int d=m%10;
            c++;
            m=m/10;
        }
        return c;
    }

    int check1()
    {
        int y=count(yyyy);
        if(yyyy>=1950 && y==4 && dd<=31 && mm<=12)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }

    int check2()
    {
        int y=count(yyyy);
        if(yyyy<1950 || y<4 || dd>31 || mm>12)
        {
            return 0;
        }
        else
        {
            return 1;
        }
    }

    int check3()
    {
        int y=yyyy%4;
        int c1=0,c2=0,c3=0,c4=0;
        if(dd==31 && (mm==2 || mm==4 || mm==6 || mm==9 || mm==11))
        {
            c1++;
        } 
        if(dd==30 && (mm==1 || mm==3 || mm==5 || mm==7 || mm==8 || mm==10 || mm==12))
        {
            c2++;
        }
        if((dd==28 || dd==29) && (mm!=2))
        {
            c3++;
        }
        if(dd==29 && y!=0) 
        {
            c4++;
        }
        if(c1==0 && c2==0 && c3==0 && c4==0)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }

    void calc()
    {
        int dt=0;
        int arr[]={31,28,31,30,31,30,31,31,30,31,30,31};
        if(yyyy%4==0)
        {
            arr[1]=29;
        }
        if(mm==1)
        {
            System.out.println("VALID DATE");
            System.out.println("Day Number="+dd);
        }
        else
        {
            for(int i=0;i<mm-1;i++)
            {
                dt=dt+arr[i];
            }
            dd=dd+dt;
            System.out.println("VALID DATE");
            System.out.println("Day Number="+dd);
        }
    }

    void main()throws IOException
    {
        ValidDate ob=new ValidDate();
        ob.input();
        int a=ob.check1();
        int b=ob.check2();
        int c=ob.check3();
        if(a==0 || b==0 || c==0)
        {
            System.out.println("INVALID DATE");
        }
        if(a==1 && b==1 && c==1)
        {
            ob.calc();
}
}
}
