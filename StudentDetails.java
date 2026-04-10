/*
Problem Statement: Display Student Details using Method Overloading
Write a Java program to demonstrate method overloading by displaying student details.
Create methods named display() to show: Student name only Student name and age, Student name,
age,and grade In the main() method
create an object and call each overloaded method with different arguments. */
class StudentDetails {

    void display(String name) {
        System.out.println("Student Name: " + name);
    }

    void display(String name, int age) {
        System.out.println("Student Name: " + name + ", Age: " + age);
    }

    void display(String name, int age, String grade) {
        System.out.println("Student Name: " + name + ", Age: " + age + ", Grade: " + grade);
    }

    public static void main(String[] args) {
        StudentDetails obj = new StudentDetails();

        obj.display("Alice");
        obj.display("Bob", 20);
        obj.display("Charlie", 22, "O");
    }
}