///////////////////////////////////////////////////////////////////////////////////////////
//
//  Method name   : void Findmini from (class Logic)
//  Description   : Used to find mini number
//  Input         : Integer
//  Output        : Integer
//  Author        : Saurabh Ravindra Bhonsle
//  Date          : 29 /10/2025
//
///////////////////////////////////////////////////////////////////////////////////////////

class Logic 
{
   
   void FindMini(int a, int b, int c)
  {
    if(a < b && a < c)
    {
        System.out.println("Minimum number is : " + a);
    }
    else if(b < a && b < c)
    {
        System.out.println("Minimum number is : " + b);
    }
    else if(c < a && c < b)
    {
        System.out.println("Minimum number is : " + c);
    }
        
  }
   
} 

///////////////////////////////////////////////////////////////////////////////////////////
//
//  Entry point of main method
//
///////////////////////////////////////////////////////////////////////////////////////////

class Program17_4
{
   public static void main(String A [])
   {
    Logic lobj = new Logic();
    lobj.FindMini(3,7,2); 
    
   }
}

///////////////////////////////////////////////////////////////////////////////////////////
//
//  Testcase successfully handled by the application
//
//  Input  : 3 7 2
//  output : 2 is Mini number
//             
///////////////////////////////////////////////////////////////////////////////////////////
