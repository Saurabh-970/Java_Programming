///////////////////////////////////////////////////////////////////////////////////////////
//
//  Method name   : void CheckLeapYear from (class Logic)
//  Description   : program to check whether a given year is leap year or not
//  Input         : Integer
//  Output        : Integer
//  Author        : Saurabh Ravindra Bhonsle
//  Date          : 29 /10/2025
//
///////////////////////////////////////////////////////////////////////////////////////////

class Logic 
{
 void CheckLeapYear(int iYear)
 {
  if((iYear % 4 == 0 && iYear % 100 != 0) || (iYear % 400 == 0))
  {
    System.out.println(iYear+ " Is a leap year");
  }
  else
  {
    System.out.println(iYear+ " Is not a leap year");
  }
 }  
} 

///////////////////////////////////////////////////////////////////////////////////////////
//
//  Entry point of main method
//
///////////////////////////////////////////////////////////////////////////////////////////

class Program19_1
{
   public static void main(String A [])
   {
    Logic lobj = new Logic();
    lobj.CheckLeapYear(2024); 
    
   }
}

///////////////////////////////////////////////////////////////////////////////////////////
//
//  Testcase successfully handled by the application
//
//  Input  : 2024
//  output : 2024 Is a leap year
//                                 
///////////////////////////////////////////////////////////////////////////////////////////
