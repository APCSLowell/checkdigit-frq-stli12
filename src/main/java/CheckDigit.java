public class CheckDigit 
{   
  
   public static int getCheck(int num) 
   {  
     int sum = 0;
     for(int i = 1;  i <= getNumberOfDigits(num); i++){
  sum += (8- i) * getDigit(num , i);
     }
     return sum % 10;
   }
    
   public static boolean isValid(int numWithCheckDigit)    
   {      
     int last = numWithCheckDigit % 10;
     int withOutLast = numWithCheckDigit / 10;
     int check = getCheck(withOutLast);
     if(last == check)
       return true;
     else
       return false;
   }    
   
   /** Returns the number of digits in num. */    
   public static int getNumberOfDigits(int num)    
   {      
    if(num < 10)
      return 1;
    return 1 + getNumberOfDigits(num/10);    
   }    
   
   /** Returns the nthdigit of num.      
    *  Precondition: n >= 1 and n <= the number of digits in num     
    */    
    public static int getDigit(int num, int n)    
    {      
      int pos = getNumberOfDigits(num)-n+1;
      while(pos > 1){
        num/=10;
        pos--;
      }
      return num%10;
    }     

}
