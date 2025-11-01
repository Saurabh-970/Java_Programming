///////////////////////////////////////////////////////////////////////////////////////////
//
//  Method name   : void ReverseNumber from (class Logic)
//  Description   : Used to reverse a number
//  Input         : Integer
//  Output        : Integer
//  Author        : Saurabh Ravindra Bhonsle
//  Date          : 25 /10/2025
//
///////////////////////////////////////////////////////////////////////////////////////////

class Logic 
{
   void ReverseNumber(int iNo)
   {
        int iDigit = 0;
        int iRev = 0;

        while(iNo > 0)      
        {
            iDigit = iNo % 10;          
            iRev = (iRev * 10) + iDigit; 
            iNo = iNo / 10;             
        }

        System.out.println(+ iRev);
   }
}
 
///////////////////////////////////////////////////////////////////////////////////////////
//
//  Entry point of main method
//
///////////////////////////////////////////////////////////////////////////////////////////

class Program16_4
{
   public static void main(String A [])
   {
    Logic lobj = new Logic();
    lobj.ReverseNumber(12345); 
   }
}

///////////////////////////////////////////////////////////////////////////////////////////
//
//  Testcase successfully handled by the application
//
//  Input  : 12345
//  output : 54321
//             
///////////////////////////////////////////////////////////////////////////////////////////
