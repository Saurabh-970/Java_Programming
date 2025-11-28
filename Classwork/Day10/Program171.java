import java.util.Scanner;

/*
    iRow : 4
    iCol : 4



*/

class Pattern
{
    public void Display(int iNo)
    {
        int iCnt = 0;
        int  i = 96;

        for( iCnt = 1; iCnt  <= iNo;  iCnt++) 
        { 
            System.out.printf("%d\t", i + iCnt);
               
        }
        
        System.out.println();
    }
}
class Program171
{
    public static void main(String A[])
    {
        int iValue1 = 0;

        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the frequency : ");
        iValue1 = sobj.nextInt();
        
        Pattern pobj = new Pattern();
        pobj.Display(iValue1);
    }
}