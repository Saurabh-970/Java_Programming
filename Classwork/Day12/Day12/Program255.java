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
    public String toLowerCase(String str)
    {   
        char Arr[] = str.toCharArray();
        
        int iCnt = 0;
        for(iCnt = 0 ; iCnt < Arr.length; iCnt++)
        {
            if(Arr[iCnt] >= 'A' && Arr[iCnt] <='Z')
            {
                Arr[iCnt] = (char)(Arr[iCnt]  +32);
            }
        }

        return  new String(Arr);                
    }
}
class Program255
{
    public static void main(String A[])
    {   
        String sRet = null;

        Scanner scanobj = new Scanner(System.in);

        System.out.println("Enter string:");
        String sobj = scanobj.nextLine();

        StringX strobj = new StringX();

         sRet = strobj.toLowerCase(sobj);        
         System.out.println("Updated string :"+sRet);
        
        
    }
}



