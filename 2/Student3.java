
class Student3{  
    int id;  
    String name;  

    Student3(){
        id=111;
        name="karan";
    }
    //method to display the value of id and name  
    void display(){System.out.println(id+" "+name);}  
      
    public static void main(String args[]){  
    //creating objects  
    Student3 s1=new Student3();  
    
    //displaying values of the object  
    s1.display();  
     
    }  
    }  