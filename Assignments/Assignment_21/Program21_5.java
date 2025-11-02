///////////////////////////////////////////////////////////////////////////////////////////
//
//  Method name   : void printDivisibleBy2and3(( from (class Logic)
//  Description   : program to print all numbers from 1 to N are divisible 2 & 3
//  Input         : Integer
//  Output        : Integer
//  Author        : Saurabh Ravindra Bhonsle
//  Date          : 29 /10/2025
//
///////////////////////////////////////////////////////////////////////////////////////////

class Logic 
{
   void printDivisibleBy2and3(int iNo)
   {
      System.out.print("Numbers divisible by are: ");

      for (int iCnt = 1; iCnt <= iNo; iCnt++)
      {
         if (iCnt % 2 == 0 && iCnt % 3 == 0)
         {
            System.out.print(iCnt + " ");
         }
      }         
   }  

}
///////////////////////////////////////////////////////////////////////////////////////////
//
//  Entry point of main method
//
///////////////////////////////////////////////////////////////////////////////////////////

class Program21_5
{
   public static void main(String A [])
   {
    Logic lobj = new Logic();
    lobj.printDivisibleBy2and3(30); 
    
   }
}

///////////////////////////////////////////////////////////////////////////////////////////
//
//  Testcase successfully handled by the application
//
//  Input  : 30
//  output : Numbers divisible by are: 6 12 18 24 30
//                                 
///////////////////////////////////////////////////////////////////////////////////////////