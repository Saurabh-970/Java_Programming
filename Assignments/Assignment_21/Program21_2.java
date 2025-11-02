///////////////////////////////////////////////////////////////////////////////////////////
//
//  Method name   : void countEvenOddRange( from (class Logic)
//  Description   : program to count how many even & odd number present between 1 & N 
//  Input         : Integer
//  Output        : Integer
//  Author        : Saurabh Ravindra Bhonsle
//  Date          : 29 /10/2025
//
///////////////////////////////////////////////////////////////////////////////////////////

class Logic 
{
 void countEvenOddRange(int iNo)
{
   int iCnt = 0;
   int iEven = 0;
   int iOdd = 0;

   for (iCnt = 1; iCnt <= iNo; iCnt++)
   {
      if (iCnt % 2 == 0)
      {
            iEven++;
      }
      else
      {
            iOdd++;
      }
   }
   System.out.println("Even number is : "+iEven);
   System.out.println("Odd number is : "+iOdd);
 
} 
}
///////////////////////////////////////////////////////////////////////////////////////////
//
//  Entry point of main method
//
///////////////////////////////////////////////////////////////////////////////////////////

class Program21_2
{
   public static void main(String A [])
   {
    Logic lobj = new Logic();
    lobj.countEvenOddRange(50); 
    
   }
}

///////////////////////////////////////////////////////////////////////////////////////////
//
//  Testcase successfully handled by the application
//
//  Input  : 50
//  output : Even number is : 25
//           Odd number is : 25
//                                 
///////////////////////////////////////////////////////////////////////////////////////////