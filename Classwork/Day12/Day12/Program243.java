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


class Program243
{
    public static void main(String A[])
    {
        int iCnt = 0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter string:");
        String str = sobj.nextLine();

        for(iCnt = 0 ; iCnt < str.length(); iCnt++)
        {
            System.out.println(str.charAt(iCnt));
        }    
        
    }
}



