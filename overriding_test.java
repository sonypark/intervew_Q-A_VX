public class overriding_test {

    public static void main(String[] args){
        //오버라이딩 테스트
        Interns kongson = new Interns();

        kongson.name = "공손";
        kongson.age = 28;
        kongson.division = "VoyagerX";
        kongson.salary = 300;

        kongson.adjust_salary();
        kongson.print();

        //오버로딩 테스트
        kongson.print(38);
        kongson.print("할리스", "할리스 강남점");
    }
}
