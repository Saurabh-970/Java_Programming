///////////////////////////////////////////////////////////////////////////////////////////
//
//  Method name   : void countFactors ( from (class Logic)
//  Description   : program to count total number of factors of a given number
//  Input         : Integer
//  Output        : Integer
//  Author        : Saurabh Ravindra Bhonsle
//  Date          : 29 /10/2025
//
///////////////////////////////////////////////////////////////////////////////////////////

class Logic 
{
   void countFactors (int iNo)
   {
      int iCnt = 0;
      int count = 0;

      for (iCnt = 1; iCnt <= iNo; iCnt++)
      {
         if (iNo % iCnt == 0)
         {
               count++;
         }
      }

    System.out.println("Total number factors is :" + count);
 
   } 
}
///////////////////////////////////////////////////////////////////////////////////////////
//
//  Entry point of main method
//
///////////////////////////////////////////////////////////////////////////////////////////

class Program21_4
{
   public static void main(String A [])
   {
    Logic lobj = new Logic();
    lobj.countFactors(20); 
    
   }
}

///////////////////////////////////////////////////////////////////////////////////////////
//
//  Testcase successfully handled by the application
//
//  Input  : 20
//  output : Total number factors is :6
//                                 
///////////////////////////////////////////////////////////////////////////////////////////