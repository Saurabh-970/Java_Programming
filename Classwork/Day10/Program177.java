import java.util.Scanner;

/*
    input  : 8
    output : 1 A 3 B 5 D 
    index  : 
*/

class Pattern
{
    public void Display(int iNo)
    {
        int iCnt = 0;
        char ch = 'A';

        for( iCnt = 1; iCnt  <= iNo;  iCnt++) 
        { 
            
            if(iCnt % 2 == 0)
            {
                System.out.printf("%c\t",ch);
                ch++;
            }
            else
            {
                System.out.printf("%d\t",iCnt);
            }


            

       
        }
        System.out.println();
    }
}
class Program177
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