class Student{
    int rollno;
    String name;
    static String college = "abc"; //static keyword because college is common 

    Student(int r,String n){
        rollno = r;
        name = n;
    }

    void display(){
        System.out.println(rollno +" "+name+" "+college );
    }
}



public class Statickeyword {
    public static void main(String[] args) {
        Student s1 = new Student(111,"arjun");
        Student s2 = new Student(122,"varun");
        s1.display();
        s2.display();
    }
        

    }

