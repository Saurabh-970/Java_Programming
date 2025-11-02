///////////////////////////////////////////////////////////////////////////////////////////
//
//  Method name   : void CheckDivisible from (class Logic)
//  Description   : program to check number is divisible by 5 and 11 or not
//  Input         : Integer
//  Output        : Integer
//  Author        : Saurabh Ravindra Bhonsle
//  Date          : 29 /10/2025
//
///////////////////////////////////////////////////////////////////////////////////////////

class Logic 
{
 void CheckDivisible(int iNum)
 {
    if(iNum % 5 == 0)
    {
      System.out.println(iNum+ " It is divisible by 5 ");
    }
    else if(iNum % 11 == 0)
    {
      System.out.println("It is divisible by 11 :"+iNum);
    }
    else
    {
      System.out.println("It is not divisible by 5 or 11 : " +iNum);
    }  
      
    
 }  
} 

///////////////////////////////////////////////////////////////////////////////////////////
//
//  Entry point of main method
//
///////////////////////////////////////////////////////////////////////////////////////////

class Program19_3
{
   public static void main(String A [])
   {
    Logic lobj = new Logic();
    lobj.CheckDivisible(55); 
    
   }
}

///////////////////////////////////////////////////////////////////////////////////////////
//
//  Testcase successfully handled by the application
//
//  Input  : 55
//  output : 55 It is divisible by 5
//                                 
///////////////////////////////////////////////////////////////////////////////////////////
