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

        return  new String(Arr);                
    }
}
class Program254
{
    public static void main(String A[])
    {   

        Scanner scanobj = new Scanner(System.in);

        System.out.println("Enter string:");
        String sobj = scanobj.nextLine();

        StringX strobj = new StringX();

         sobj = strobj.Update(sobj);        //change (Not preferable)
         System.out.println("Updated string :"+sobj);
        
        
    }
}



