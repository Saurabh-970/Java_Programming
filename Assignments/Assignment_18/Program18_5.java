///////////////////////////////////////////////////////////////////////////////////////////
//
//  Method name   : void CheckSign from (class Logic)
//  Description   : program to check whether a number is positive,negative,zero
//  Input         : Integer
//  Output        : Integer
//  Author        : Saurabh Ravindra Bhonsle
//  Date          : 29 /10/2025
//
///////////////////////////////////////////////////////////////////////////////////////////

class Logic 
{
 void CheckSign(int inum)
 {
  if(inum == 0)
  {
    System.out.println("Its zero :"+inum);
  }
  else if (inum > 0)
  {
    System.out.println("Its a positive number :"+inum);
  }
  else
  {
    System.out.println("its a negative :"+inum);
  }
 }  
} 

///////////////////////////////////////////////////////////////////////////////////////////
//
//  Entry point of main method
//
///////////////////////////////////////////////////////////////////////////////////////////

class Program18_5
{
   public static void main(String A [])
   {
    Logic lobj = new Logic();
    lobj.CheckSign(-8); 
    
   }
}

///////////////////////////////////////////////////////////////////////////////////////////
//
//  Testcase successfully handled by the application
//
//  Input  : -8
//  output : its a negative :-8
//                                 
///////////////////////////////////////////////////////////////////////////////////////////
