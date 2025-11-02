///////////////////////////////////////////////////////////////////////////////////////////
//
//  Method name   : void FindSmallest from (class Logic)
//  Description   : program to print Find Smallest number 
//  Input         : Integer
//  Output        : Integer
//  Author        : Saurabh Ravindra Bhonsle
//  Date          : 29 /10/2025
//
///////////////////////////////////////////////////////////////////////////////////////////

class Logic 
{
 void FindSmallest(int iNo)
{
   int iDigit = 0;
   int iMin = 9;

   while (iNo != 0)
   {
      iDigit = iNo % 10; 

      if (iDigit < iMin)       
      {
            iMin = iDigit;
      }

      iNo = iNo / 10;          
   }

    System.out.println("smallest digit is : " + iMin);
}
 
} 

///////////////////////////////////////////////////////////////////////////////////////////
//
//  Entry point of main method
//
///////////////////////////////////////////////////////////////////////////////////////////

class Program20_5
{
   public static void main(String A [])
   {
    Logic lobj = new Logic();
    lobj.FindSmallest(458272); 
    
   }
}

///////////////////////////////////////////////////////////////////////////////////////////
//
//  Testcase successfully handled by the application
//
//  Input  : 458272
//  output : Smallest number is 2
//                                 
///////////////////////////////////////////////////////////////////////////////////////////