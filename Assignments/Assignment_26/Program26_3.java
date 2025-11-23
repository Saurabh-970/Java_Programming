import java.util.*;

///////////////////////////////////////////////////////////////////////////////////////////
//
//  Function name : Display
//  Description   : Accept number from user and display pattern
//  Input         : Integer
//  Output        : Integer with special character (*)
//  Author        : Saurabh Ravindra Bhonsle
//  Date          : 20 /11/2025
//
///////////////////////////////////////////////////////////////////////////////////////////

class Pattern
{
    public void Display(int iNo)
    {
        int iCnt = 0;

        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            System.out.printf("%d \t*\t ",iCnt);
        }
    }
}


///////////////////////////////////////////////////////////////////////////////////////////
//
//  Entry point function of the application
//
///////////////////////////////////////////////////////////////////////////////////////////

class Program26_3
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