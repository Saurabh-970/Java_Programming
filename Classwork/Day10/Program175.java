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
        //int  i = 97;
        char ch = 'a';

        for( iCnt = 1; iCnt  <= iNo;  iCnt++, ch++) 
        { 
            System.out.print(ch+"\t");
       
        }
        System.out.println();
    }
}
class Program175
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