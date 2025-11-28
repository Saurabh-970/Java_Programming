import java.util.*;

//Input : 6
//Output : # * # *  #*

class Pattern
{
    public void Display(int iNo)
    {
        int iCnt = 0;

        for(iCnt = -iNo; iCnt <=  0; iCnt++)
        { 
             System.out.print(iCnt+"\t");  
          
        }

        System.out.println();
    }
}
class Program158
{
    public static void main(String A[])
    {
        int iValue = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the frequency");
        iValue = sobj.nextInt();
        
        Pattern pobj = new Pattern();
        pobj.Display(iValue);
    }
}