public class Interns extends Employee{

    String division;

    @Override
    public void print() {
        System.out.println("이름:"+ this.name + " 나이:"+this.age+ " 부서:"+this.division + " 월급:"+ this.salary);
    }

    //Overloading void print()
    public void print(int age){
        System.out.println("제 나이는 "+ age + "살 입니다.");
    }

    //Overloading void print()
    public void print(String name, String division){
        System.out.println(name + "가 속한 부서는 " + division + "입니다.");
    }

    @Override
    public void adjust_salary() {
        this.salary *= 0.9;
    }
}
