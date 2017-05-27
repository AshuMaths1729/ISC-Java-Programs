import java.io.*;
class Matrix1
{
    int n;
    int arr[][];
    Matrix1(int size)
    {
        n=size;
        arr=new int[n][n];
    }

    void input()throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter array elements");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]=Integer.parseInt(in.readLine());
            }
        }
    }

    Matrix1 add(Matrix1 obj)
    {
        Matrix1 ob=new Matrix1(n);
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                ob.arr[i][j]=arr[i][j]+obj.arr[i][j];
            }
        }
        return ob;
    }

    int sumboundaryele()
    {
        int s=0;
        for(int j=0;j<n-1;j++)
        {
            int i=0;
            s=s+arr[i][j];
        }
        for(int i=0;i<n-1;i++)
        {
            int j=n-1;
            s=s+arr[i][j]; 
        }
        for(int j=n-1;j>0;j--)
        {
            int i=n-1;
            s=s+arr[i][j];
        }
        for(int i=n-1;i>0;i--)
        {
            int j=0;
            s=s+arr[i][j];
        }
        return s;
    }

    void print()
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    void main()throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter size");
        int m=Integer.parseInt(in.readLine());
        Matrix1 ob1=new Matrix1(m);
        Matrix1 ob2=new Matrix1(m);
        ob1.input();
        ob2.input();
        ob2=ob1.add(ob2);
        System.out.println("Added Matrix:");
        ob2.print();
        System.out.println("Sum of boundary elements");
        int y=ob1.sumboundaryele();
        System.out.println(y);
}
}