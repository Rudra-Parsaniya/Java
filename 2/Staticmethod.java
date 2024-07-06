class Student{
    int rollno;
    String name;
    static String college = "abc"; //static keyword because college is common 

    /*static method , method name = change(){}
    here college name will change to DIET but roll no will not change it will remain 111 and 122 resp.
    because we cannot use non-static variable in static method */    
    static void change(){
        college = "DIET";
        rollno = 10;
    }

    Student(int r,String n){
        rollno = r;
        name = n;
    }

    void display(){
        System.out.println(rollno +" "+name+" "+college );
    }
}



public class Staticmethod {
    public static void main(String[] args) {
        Student.change();
        Student s1 = new Student(111,"arjun");
        Student s2 = new Student(122,"varun");
        s1.display();
        s2.display();
    }
        

    }

