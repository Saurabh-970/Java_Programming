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
    public int CountSmall(String str)
    {
        int iCnt =  0;
        int iCount = 0;
        
        char Arr[] = str.toCharArray();
        
        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
          
            if(Arr[iCnt] >= 'a' && Arr[iCnt] <= 'z')
            {
                 iCount++;
            }    
           
        }
        return iCount;
    }
}
class Program250
{
    public static void main(String A[])
    {
        int iRet = 0;
        
        Scanner scanobj = new Scanner(System.in);

        System.out.println("Enter string:");
        String sobj = scanobj.nextLine();

        StringX strobj = new StringX();

         iRet = strobj.CountSmall(sobj);
         System.out.println(" frequency of small characters :"+iRet);
        
      
        
    }
}



