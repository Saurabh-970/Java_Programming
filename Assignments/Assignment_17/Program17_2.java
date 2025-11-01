///////////////////////////////////////////////////////////////////////////////////////////
//
//  Method name   : void CheckPalindrome from (class Logic)
//  Description   : Used to check palindrome 
//  Input         : Integer
//  Output        : Integer
//  Author        : Saurabh Ravindra Bhonsle
//  Date          : 25 /10/2025
//
///////////////////////////////////////////////////////////////////////////////////////////

class Logic 
{
   void CheckPalindrome(int iNo)
   {
      int iTemp = iNo;   
      int iDigit = 0;
      int iRev = 0;

       
        while(iNo > 0)
        {
            iDigit = iNo % 10;          
            iRev = (iRev * 10) + iDigit; 
            iNo = iNo / 10;              
        }

        
        if(iTemp == iRev)
        {
            System.out.println(iTemp + " is a Palindrome number.");
        }
        else
        {
            System.out.println(iTemp + " is not a Palindrome number.");
        }
    }
} 

///////////////////////////////////////////////////////////////////////////////////////////
//
//  Entry point of main method
//
///////////////////////////////////////////////////////////////////////////////////////////

class Program17_2
{
   public static void main(String A [])
   {
    Logic lobj = new Logic();
    lobj.CheckPalindrome(121); 
   }
}

///////////////////////////////////////////////////////////////////////////////////////////
//
//  Testcase successfully handled by the application
//
//  Input  : 121
//  output : Is a palindrome number
//             
///////////////////////////////////////////////////////////////////////////////////////////
