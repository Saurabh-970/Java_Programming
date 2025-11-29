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
    public String Update(String str)
    {   
        char Arr[] = str.toCharArray();
        
        Arr[0] = '_';

        String temp = new String(Arr);

        return temp;
    }
}
class Program252
{
    public static void main(String A[])
    {   
        String sRet = null;

        Scanner scanobj = new Scanner(System.in);

        System.out.println("Enter string:");
        String sobj = scanobj.nextLine();

        StringX strobj = new StringX();

         sRet = strobj.Update(sobj);
         System.out.println("Updated string :"+sRet);
        
        
    }
}



