class vehicle { 
    public void vehiclewheels() {
      System.out.println("The no. of wheels  vehicle have");
    }
  }
  
  class Car extends vehicle { 
    public void vehiclewheels() {
      super.vehiclewheels();
      System.out.println("The no. of wheels car have: 4");
    }
  }
  
  public class Lab6_6super {
     public static void main(String[] args) {
        vehicle myCar = new Car(); 
        myCar.vehiclewheels(); 
    }
  }
  