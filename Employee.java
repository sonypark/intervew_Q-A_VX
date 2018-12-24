public class Employee {

    String name;
    int age;
    int salary;

    public void print(){

        System.out.println("이름: "+ this.name + "나이: "+ this.age);
    }

    public void adjust_salary(){

        this.salary *= 1.2;
    }
}
