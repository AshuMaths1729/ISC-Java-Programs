import java.io.*;
class loginout
{
    void input()throws IOException
    {
        int a=0,b=0;int diff=0;int a1=0,b1=0;double amt=0.0;int m=0,n=0;
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter login time and logout time");
        String str1=in.readLine();
        String str2=in.readLine();
        for(int i=0;i<str1.length();i++)
        {
            char ch1=str1.charAt(i);
            if(ch1==':')
            {
                a=str1.indexOf(ch1);
                break;
            }
        }
        for(int j=0;j<str2.length();j++)
        {
            char ch2=str2.charAt(j);
            if(ch2==':')
            {
                b=str2.indexOf(ch2);
                break;
            }
        }
        for(int i=0;i<str1.length();i++)
        {
            char ch1=str1.charAt(i);
            if(ch1==' ')
            {
                a1=str1.indexOf(ch1);
                break;
            }
        }
        for(int j=0;j<str2.length();j++)
        {
            char ch2=str2.charAt(j);
            if(ch2==' ')
            {
                b1=str2.indexOf(ch2);
                break;
            }
        }
        String s1=str1.substring(0,a);
        String s2=str1.substring(a+1,a1);
        String s3=str2.substring(0,b);
        String s4=str2.substring(b+1,b1);
        String s5=str1.substring(a1+1,str1.length());
        String s6=str2.substring(b1+1,str2.length());
        int x=Integer.parseInt(s1);
        int y=Integer.parseInt(s2);
        int x1=Integer.parseInt(s3);
        int y1=Integer.parseInt(s4);
        if(x==12)
        {
            x=0;
        }
        if(x1==12)
        {
            x1=0;
        }
        int p=x*60+y;
        int q=x1*60+y1;
        if(s5.equals(s6))
        {
            if(q>p)
            {
                diff=q-p;
                amt=diff*0.16;
                m=diff%60;
                n=diff/60;
                if(m>=60)
                {
                    n++;
                    m=m-60;
                }
            }
            if(p>q)
            {
                diff=p-q;
                diff=(24*60)-diff;
                amt=diff*0.16;
                m=diff%60;
                n=diff/60;
                if(m>=60)
                {
                    n++;
                    m=m-60;
                }
            }
            if(str1.equals(str2))
            {
                diff=24*60;
                amt=diff*0.16;
                m=diff%60;
                n=diff/60;
            }
        }
        if((s5.equals("PM")&&s6.equals("AM"))||(s5.equals("AM")&&s6.equals("PM")))
        {
            if(q>p)
            {
                diff=q-p;
                diff=(12*60)+diff;
                amt=diff*0.16;
                m=diff%60;
                n=diff/60;
                if(m>=60)
                {
                    n++;
                    m=m-60;
                }
            }
            if(p>q)
            {
                diff=p-q;
                diff=(12*60)-diff;
                amt=diff*0.16;
                m=diff%60;
                n=diff/60;
                if(m>=60)
                {
                    n++;
                    m=m-60;
                }
            }
            if((str1.substring(0,a1)).equals(str2.substring(0,b1)))
            {
                diff=12*60;
                amt=diff*0.16;
                m=diff%60;
                n=diff/60;
            }
        }
        System.out.println("LOGIN TIME:"+str1);
        System.out.println("LOGOUT TIME:"+str2);
        System.out.println("TOTAL TIME:"+n+" "+"HRS"+" "+m+" "+"MIN");  
        System.out.println("Your AMT:"+"Rs"+" "+amt);
    }
}

