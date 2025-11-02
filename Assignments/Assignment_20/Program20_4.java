///////////////////////////////////////////////////////////////////////////////////////////
//
//  Method name   : void Findlargest from (class Logic)
//  Description   : program to print largest number 
//  Input         : Integer
//  Output        : Integer
//  Author        : Saurabh Ravindra Bhonsle
//  Date          : 29 /10/2025
//
///////////////////////////////////////////////////////////////////////////////////////////

class Logic 
{
 void Findlargest(int iNo)
{
   int iDigit = 0;
   int iMax = 0;

   while (iNo != 0)
   {
      iDigit = iNo % 10;       
      if (iDigit > iMax)       
      {
            iMax = iDigit;
      }
      iNo = iNo / 10;          
   }

System.out.println("Largest digit is : " + iMax);
}
 
} 

///////////////////////////////////////////////////////////////////////////////////////////
//
//  Entry point of main method
//
///////////////////////////////////////////////////////////////////////////////////////////

class Program20_4
{
   public static void main(String A [])
   {
    Logic lobj = new Logic();
    lobj.Findlargest(83429); 
    
   }
}

///////////////////////////////////////////////////////////////////////////////////////////
//
//  Testcase successfully handled by the application
//
//  Input  : 83429
//  output : Largest number is 9
//                                 
///////////////////////////////////////////////////////////////////////////////////////////