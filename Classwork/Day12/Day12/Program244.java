/////////////////////////////////////////////////////////////////////////
//
//  Required Header files
//
/////////////////////////////////////////////////////////////////////////

import java.util.*;

////////////////////////////////////////////////////////////////////////////
//
//  Entry Point Function of The Application
//
////////////////////////////////////////////////////////////////////////////

class StringX
{
    public void Display(String str)
    {
        int iCnt = 0;
        
        for(iCnt = 0 ; iCnt < str.length(); iCnt++)
        {
            System.out.println(str.charAt(iCnt));
        }   
    }
}
class Program244
{
    public static void main(String A[])
    {
        
        Scanner scanobj = new Scanner(System.in);

        System.out.println("Enter string:");
        String sobj = scanobj.nextLine();

        StringX strobj = new StringX();

        strobj.Display(sobj);
      
        
    }
}



