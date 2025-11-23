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
                System.out.printf("%d\t",+iNo);
                iNo++;
                
                if(iNo == 10)
                {
                    iNo = 1;
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

class Program29_1
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
//    Output : 1       2       3       4
//             5       6       7       8
//             9       1       2       3
//             4       5       6       7
//                                      
///////////////////////////////////////////////////////////////////////////////////////////