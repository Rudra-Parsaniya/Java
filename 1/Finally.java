public class Finally{    
    public static void main(String args[]){   

    try {    

      System.out.println("Inside the try block");  
        
      //below code throws divide by zero exception  
     int data=25/0;    
     System.out.println(data);    
    }    
    //handle by Arithmetic type exception  
    //Null Pointer type exception is used it will not catch exception
    catch(NullPointerException e){  
      System.out.println(e);  
    }   

    /*exception is not catch but then also finally block will  exicute if exception are handle i.e instead of 
    NullPointerException ,ArithmeticException is wriiten then also finally block will exicute */
    finally {  
      System.out.println("finally block is always executed");  
    }    

    System.out.println("rest of the code...");    
    }    
  }    