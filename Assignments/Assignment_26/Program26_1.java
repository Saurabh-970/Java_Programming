import java.util.*;

class Pattern
{
    public void Display(int iNo)
    {
        int iCnt = 0;
        char ch = 'A';

        for(iCnt = 1; iCnt <= iNo; iCnt++, ch++)
        {
            System.out.printf("%c\t",ch);
        }
    }
}

///////////////////////////////////////////////////////////////////////////////////////////
//
//  Entry point function of the application
//
///////////////////////////////////////////////////////////////////////////////////////////

class Program26_1
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        Pattern pobj = new Pattern();

        int iValue = 0;
        System.out.println("Enter number of elements :");
        iValue = sobj.nextInt();

        pobj.Display(iValue);
    }
}