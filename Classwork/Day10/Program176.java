import java.util.Scanner;

/*
input : 5
output : A B C D E
index :  1 2 3 4 5
ASCII :  65 66 67 68 69
*/

class Pattern
{
    public void Display(int iNo)
    {
        int iCnt = 0;
        //int  i = 97;
        char ch = 'A';

        for( iCnt = 1; iCnt  <= iNo;  iCnt++, ch++) 
        { 
            System.out.print("%c\n",ch);
       
        }
        System.out.println();
    }
}
class Program176
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