import java.util.*;

///////////////////////////////////////////////////////////////////////////////////////////
//
//  Function name : Display
//  Description   : Accept number of rows and columns and display in star patter
//  Input         : Integer
//  Output        : Integer with special character
//  Author        : Saurabh Ravindra Bhonsle
//  Date          : 20 /11/2025
//
///////////////////////////////////////////////////////////////////////////////////////////

class Pattern
{
    public void  Display(int iRow, int iCol)
    {
        int iCnt = 0;
        int jCnt = 0;
        int iNo = 1;

        for(iCnt = 1; iCnt <= iRow; iCnt++)
        { 
            for(jCnt = 1; jCnt <= iCol ; jCnt++)
            {
                if(iCnt % 2 == 1)
                {
                    System.out.printf("%d\t",jCnt * 2);
                }
                else
                {
                    System.out.printf("%d\t",(jCnt * 2) - 1);
                }
            }
            System.out.println();
            
        }        

    }
}

///////////////////////////////////////////////////////////////////////////////////////////
//
//  Entry point function of the application
//
///////////////////////////////////////////////////////////////////////////////////////////

class Program29_2
{
    public static void main(String A[])
    {
        int iValue1 = 0;
        int iValue2 = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number rows :");
        iValue1 = sobj.nextInt();

        System.out.println("Enter number columns :");
        iValue2 = sobj.nextInt();

        Pattern pobj = new Pattern();
        
        pobj.Display(iValue1,iValue2);
    }
}

/////////////////////////////////////////////////////////////////////////////////////////
//
//  Testcases successfully handled by the application
//
//    Enter number of rows and columns   : rows :4, columns: 5
//                                              
//    Output : 2       4       6       8       10
//             1       3       5       7       9
//             2       4       6       8       10
//             1       3       5       7       9
//                                      
///////////////////////////////////////////////////////////////////////////////////////////