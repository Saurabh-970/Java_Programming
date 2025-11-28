import java.util.Scanner;

/*
    input  : 10
    output :    z    Y       X       W       V       U       T       S       R       Q
    index  : 
*/

class Pattern
{
    public void Display(int iNo)
    {
        int iCnt = 0;
        char ch = 'Z';

        for( iCnt = 1; iCnt  <= iNo;  iCnt++,ch--) 
        {          
            System.out.printf("%c\t",ch);  
                     
        }
        System.out.println();
    }
}
class Program178
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