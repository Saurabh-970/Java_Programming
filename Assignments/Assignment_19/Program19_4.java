///////////////////////////////////////////////////////////////////////////////////////////
//
//  Method name   : void PrintDigits from (class Logic)
//  Description   : program to print each digit of each number seperately
//  Input         : Integer
//  Output        : Integer
//  Author        : Saurabh Ravindra Bhonsle
//  Date          : 29 /10/2025
//
///////////////////////////////////////////////////////////////////////////////////////////

class Logic 
{
 void PrintDigits(int iNum)
 {
    int iCount = iNum;
    int iDigit = 0;

    System.out.println(+iNum);

    while(iCount != 0)
    {
      iDigit = iCount % 10;
      System.out.println(iDigit);
      iCount = iCount / 10;
    } 
 }  
} 

///////////////////////////////////////////////////////////////////////////////////////////
//
//  Entry point of main method
//
///////////////////////////////////////////////////////////////////////////////////////////

class Program19_4
{
   public static void main(String A [])
   {
    Logic lobj = new Logic();
    lobj.PrintDigits(9876); 
    
   }
}

///////////////////////////////////////////////////////////////////////////////////////////
//
//  Testcase successfully handled by the application
//
//  Input  : 9876
//  output : 9 8 7 6
//                                 
///////////////////////////////////////////////////////////////////////////////////////////
