///////////////////////////////////////////////////////////////////////////////////////////
//
//  Method name   : void sumEvenOddDigits from (class Logic)
//  Description   : program to print all Even and Odd digits separately 
//  Input         : Integer
//  Output        : Integer
//  Author        : Saurabh Ravindra Bhonsle
//  Date          : 29 /10/2025
//
///////////////////////////////////////////////////////////////////////////////////////////

class Logic 
{
 void sumEvenOddDigitis(int inum)
 {
   int iCount = inum;
   int iCnt = 0;

   System.out.println("Even num are :"+inum);

   while(iCount != 0)
   {
      iCnt = iCount % 10;
      if(iCnt % 2 == 0)
      {
        System.out.println(iCnt);
      }
      iCount = iCount / 10;
   }
   iCount = inum;
   System.out.println("Odd num are "+inum);

   while(iCount != 0)
   {
    iCnt = iCount % 10;
    if(iCnt % 2 != 0)
    {
      System.out.println(iCnt);
    }
    iCount = iCount / 10;
   }
 }  
} 

///////////////////////////////////////////////////////////////////////////////////////////
//
//  Entry point of main method
//
///////////////////////////////////////////////////////////////////////////////////////////

class Program18_4
{
   public static void main(String A [])
   {
    Logic lobj = new Logic();
    lobj.sumEvenOddDigitis(123456); 
    
   }
}

///////////////////////////////////////////////////////////////////////////////////////////
//
//  Testcase successfully handled by the application
//
//  Input  : 123456
//  output : Even num are :123456
//                          6
//                          4
//                          2
//          Odd num are 123456
//                          5
//                          3
//                          1             
///////////////////////////////////////////////////////////////////////////////////////////
