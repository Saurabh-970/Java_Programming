///////////////////////////////////////////////////////////////////////////////////////////
//
//  Method name   : void SumEvenNumber from (class Logic)
//  Description   : program to find sum of even numbers
//  Input         : Integer
//  Output        : Integer
//  Author        : Saurabh Ravindra Bhonsle
//  Date          : 29 /10/2025
//
///////////////////////////////////////////////////////////////////////////////////////////

class Logic 
{
 void SumEvenNumber(int iNo)
 {
    int iCnt = 0;
    int iCalc = 0;

    for(iCnt = 1 ; iCnt <= iNo; iCnt++)
    {
      if(iCnt % 2 == 0)
      {
         iCalc = iCalc + iCnt;
      }
      
    }
    System.out.println("Even numbers are :" +iCalc);
 }  
} 

///////////////////////////////////////////////////////////////////////////////////////////
//
//  Entry point of main method
//
///////////////////////////////////////////////////////////////////////////////////////////

class Program20_1
{
   public static void main(String A [])
   {
    Logic lobj = new Logic();
    lobj.SumEvenNumber(10); 
    
   }
}

///////////////////////////////////////////////////////////////////////////////////////////
//
//  Testcase successfully handled by the application
//
//  Input  : 10
//  output : Even numbers are :30
//                                 
///////////////////////////////////////////////////////////////////////////////////////////