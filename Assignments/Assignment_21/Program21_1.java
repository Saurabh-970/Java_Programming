///////////////////////////////////////////////////////////////////////////////////////////
//
//  Method name   : void productOfDigits from (class Logic)
//  Description   : program to calculate product Of Digits of a number 
//  Input         : Integer
//  Output        : Integer
//  Author        : Saurabh Ravindra Bhonsle
//  Date          : 29 /10/2025
//
///////////////////////////////////////////////////////////////////////////////////////////

class Logic 
{
 void productOfDigits(int iNo)
{
      int iDigit = 0;
      int iProd = 1;   

      while (iNo != 0)
      {
         iDigit = iNo % 10;     
         iProd = iProd * iDigit; 
         iNo = iNo / 10;       
      }

      System.out.println("Product of digits is : " + iProd);

}
 
} 

///////////////////////////////////////////////////////////////////////////////////////////
//
//  Entry point of main method
//
///////////////////////////////////////////////////////////////////////////////////////////

class Program21_1
{
   public static void main(String A [])
   {
    Logic lobj = new Logic();
    lobj.productOfDigits(234); 
    
   }
}

///////////////////////////////////////////////////////////////////////////////////////////
//
//  Testcase successfully handled by the application
//
//  Input  : 2 3 4
//  output : Product of digits is : 24
//                                 
///////////////////////////////////////////////////////////////////////////////////////////