// Write a program which accept matrix from user and return addition of diagonal elements

import java.util.*;

class MyArray
{
    int Arr[][];
    public MyArray(int i,int j)
    {
      Arr=new int[i][j];
    }

    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);
        for(int i=0; i<Arr.length; i++)
        {
            for(int j=0; j<Arr[i].length; j++)
            {
                Arr[i][j]=sobj.nextInt();
            }
        }
    }

    public void Display()
    {

        for(int i=0; i<Arr.length; i++)
        {
            for(int j=0; j<Arr[i].length; j++)
            {
                System.out.println(Arr[i][j]+"\t");
            }
        }
    }
}

class LB47_1
{
    public static void main(String arg[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number of rows");
        int iRow = sobj.nextInt();

        System.out.println("Enter number of columns");
        int iCol = sobj.nextInt();

        MyArray mobj = new MyArray(iRow,iCol);
        mobj.Accept();
        mobj.Display();


    }
}