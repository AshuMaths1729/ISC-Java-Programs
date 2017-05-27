import java.io.*;
class RECT
{
    int l,b;
    void input()throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter dimensions : ");
        l=Integer.parseInt(in.readLine());         
        b=Integer.parseInt(in.readLine());
    }
    double Area()
    {
        return(l*b);
    }
    double Perimeter()
    {
        return(2*(l+b));
    }
    double Diagonal()
    {
        return(Math.sqrt(l*l+b*b));
    }
    void main()throws IOException
    {
        BufferedReader i=new BufferedReader(new InputStreamReader(System.in));
        RECT ob=new RECT();
        ob.input();
        System.out.println("Enter choice: 1(Area), 2(Perimeter) ,3(Diagonal) ");
        int c=Integer.parseInt(i.readLine());
        if(c==1)
         System.out.println("AREA : "+Area());
         if(c==2)
         System.out.println("PERIMETER : "+Perimeter());
         if(c==3)
         System.out.println("DIAGONAL : "+Diagonal());
        }
    }
    
           
        
                            
        
        