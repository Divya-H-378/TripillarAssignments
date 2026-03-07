package assignments.module3.BasicMethodsandoop;
class Student{
    String name;
    int marks;
    Student(String n,int m){
        name= n;
        marks=m;
    }
    void display(){
        System.out.println("Name:"+name+",Marks:"+marks);
    }
}
public class StudentClass {
    public static void main(String[] args) {
        Student s1 = new Student("Divya",96);
        s1.display();
    }
}