///////////////////////////////////////////////////////////////////////////////////////////
//
//  Method name   : void DisplayGrade from (class Logic)
//  Description   : program to grade based on marks
//  Input         : Integer
//  Output        : Integer
//  Author        : Saurabh Ravindra Bhonsle
//  Date          : 29 /10/2025
//
///////////////////////////////////////////////////////////////////////////////////////////

class Logic 
{
 void DisplayGrade(int iMarks)
 {
    if(iMarks >= 80 && iMarks <= 100)
    {
      System.out.println("Grade A = "+iMarks);
    }
    else if(iMarks >= 60 && iMarks <=70)
    {
       System.out.println("Grade B = "+iMarks);
    }
    else if(iMarks >= 50 && iMarks <=59)
    {
       System.out.println("Grade C = "+iMarks);  
    }
    else if(iMarks >= 30 && iMarks <=49)
    {
       System.out.println("Grade D = "+iMarks);  
    }
    else if(iMarks >= 0 && iMarks <=35)
    {
       System.out.println("You are failed = "+iMarks);  
    }
    else
    {
      System.out.println("Invalid marks :"+iMarks);
    }
    
 }  
} 

///////////////////////////////////////////////////////////////////////////////////////////
//
//  Entry point of main method
//
///////////////////////////////////////////////////////////////////////////////////////////

class Program19_2
{
   public static void main(String A [])
   {
    Logic lobj = new Logic();
    lobj.DisplayGrade(82); 
    
   }
}

///////////////////////////////////////////////////////////////////////////////////////////
//
//  Testcase successfully handled by the application
//
//  Input  : 82
//  output : Grade A = 82
//                                 
///////////////////////////////////////////////////////////////////////////////////////////
