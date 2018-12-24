
// Overloading vs Override
// 오버로딩(Overloading) : 같은 이름의 메소드를 여러 개 가지면서 매개변수의 유형과 개수가 다르다.
// 오버라이딩(Overriding) : 상위 클래스가 가지고 있는 메소드를 하위 클래스가 재정의 해서 사용한다.


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
