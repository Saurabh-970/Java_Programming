///////////////////////////////////////////////////////////////////////////////////////////
//
//  Method name   : void checkprime from (class Logic)
//  Description   : Used to check prime number
//  Input         : Integer
//  Output        : Integer
//  Author        : Saurabh Ravindra Bhonsle
//  Date          : 29 /10/2025
//
///////////////////////////////////////////////////////////////////////////////////////////

class Logic 
{
 void checkprime(int inum)
 {
    int iCnt = 0;
    int iCount = 0;

    for(iCnt =1; iCnt<= inum; iCnt++)
    {
      if(inum % iCnt == 0)
      {
        iCount++;
      }
    }
    if(iCount == 2)
    {
      System.out.println("its a prime number :"+inum);
    }
    else
    {
      System.out.println("its not a prime number"+inum);
    }
 }  
} 

///////////////////////////////////////////////////////////////////////////////////////////
//
//  Entry point of main method
//
///////////////////////////////////////////////////////////////////////////////////////////

class Program18_1
{
   public static void main(String A [])
   {
    Logic lobj = new Logic();
    lobj.checkprime(11); 
    
   }
}

///////////////////////////////////////////////////////////////////////////////////////////
//
//  Testcase successfully handled by the application
//
//  Input  : 11
//  output : it is a prime number  
//             
///////////////////////////////////////////////////////////////////////////////////////////
