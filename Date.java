class Student {
    String name;
    int age;
    String DOB;

    Student(String name, int age, String DOB){
        this.name=name;
        this.age=age;
        this.DOB=DOB;
    }
    void display(){
        System.out.println("Student Name:"+name+" Student age:"+age+" Student DOB:"+DOB);
    }
}
public class Date {
    public static void main(String[] args) {
        Student s1= new Student("yogi",20,"12-12-2004");
        s1.display();
    }
}
