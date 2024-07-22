/*class pen{
    String color;
    String type;

    public void write(){
      System.out.println("writing something");
    }
    public void printColor(){
        System.out.println(this.color);
    }
} 
class Student{
        String name;
        int age;
        public void printInfo(){
            System.out.println(this.name);
            System.out.println(this.age);
        }
}

public class OOPS {
    public static void main(String args[]){
     pen pen1 = new pen();
     pen1.color = "blue";
     pen1.type = "ball";
     
     pen1.write();
     
     pen pen2 = new pen();
     pen2.color = "black";
     pen2.type = "gel";

     pen1.printColor();
     pen2.printColor();

     Student s1 = new Student();
     s1.name = "anish";
     s1.age = 21;

     Student s2 = new Student();
     s2.name = "xyz";
     s2.age = 25;

     s1.printInfo();
     s2.printInfo();
    }  
}*/
class Student{
    String name;
    int age;
    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    Student (Student s2){
        this.name = s2.name;
        this.age = s2.age;
    }
    Student() {
    }

}

public class OOPS{
    public static void main(String args[]){
        Student s1 = new Student();
        s1.name = "Anish";
        s1.age = 21;
    
        Student s2 = new Student(s1);
        s1.printInfo();
        
    }

}

