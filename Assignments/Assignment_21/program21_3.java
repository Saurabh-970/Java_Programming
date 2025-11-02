///////////////////////////////////////////////////////////////////////////////////////////
//
//  Method name   : void displayFactors ( from (class Logic)
//  Description   : program to display all factors of a given number 
//  Input         : Integer
//  Output        : Integer
//  Author        : Saurabh Ravindra Bhonsle
//  Date          : 29 /10/2025
//
///////////////////////////////////////////////////////////////////////////////////////////

class Logic 
{
   void displayFactors (int iNo)
   {
      int iCnt = 0;

      System.out.print("Factors are: ");

      for (iCnt = 1; iCnt <= iNo; iCnt++)
      {
         if (iNo % iCnt == 0)
         {
               System.out.print( " "+ iCnt );
         }
      }
 
   } 
}
///////////////////////////////////////////////////////////////////////////////////////////
//
//  Entry point of main method
//
///////////////////////////////////////////////////////////////////////////////////////////

class Program21_3
{
   public static void main(String A [])
   {
    Logic lobj = new Logic();
    lobj.displayFactors(12); 
    
   }
}

///////////////////////////////////////////////////////////////////////////////////////////
//
//  Testcase successfully handled by the application
//
//  Input  : 12
//  output : Factors are:  1 2 3 4 6 12
//                                 
///////////////////////////////////////////////////////////////////////////////////////////