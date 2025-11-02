///////////////////////////////////////////////////////////////////////////////////////////
//
//  Method name   : void checkperfect from (class Logic)
//  Description   : program to check perfect number 
//  Input         : Integer
//  Output        : Integer
//  Author        : Saurabh Ravindra Bhonsle
//  Date          : 29 /10/2025
//
///////////////////////////////////////////////////////////////////////////////////////////

class Logic 
{
 void CheckPerfect(int iNo)
{
        int iCnt = 0;
        int iSum = 0;

      for (iCnt = 1; iCnt <= iNo / 2; iCnt++)
      {
        if (iNo % iCnt == 0)
        {
            iSum = iSum + iCnt;
        }
      }

      if (iSum == iNo)
      {
        System.out.println(iNo + " is a Perfect Number.");
      }
      else
      {
        System.out.println(iNo + " is NOT a Perfect Number.");
      }

} 
}

///////////////////////////////////////////////////////////////////////////////////////////
//
//  Entry point of main method
//
///////////////////////////////////////////////////////////////////////////////////////////

class Program20_3
{
   public static void main(String A [])
   {
    Logic lobj = new Logic();
    lobj.CheckPerfect(6); 
    
   }
}

///////////////////////////////////////////////////////////////////////////////////////////
//
//  Testcase successfully handled by the application
//
//  Input  : 6
//  output : 6 is a pergfect number.
//                                 
///////////////////////////////////////////////////////////////////////////////////////////