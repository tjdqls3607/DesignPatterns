package factory;

// A a = new A(); A implements I
// I a = new B(); B implements I
// X a = Factory.create("..");
// I a 를 사용하는 role 과 I a 객체를 생성하고 전달하는 role 간의 coupling 을 줄여 준다.
public class Test {

    public static void main(String[] args) {
//        Transportation t1 = new Car();
//        Transportation t2 = new Airplane();
//        Transportation t3 = new Helicopter();

        Transportation t1 = TransportationFactory.getTransportation("C");
        Transportation t2 = TransportationFactory.getTransportation("A");
        Transportation t3 = TransportationFactory.getTransportation("H");

        t1.move();
        t2.move();
        t3.move();

        // 만약 Car 객체 대신 새로운 SportsCar 객체가 필요한다.
        // Test.java 는 변화의 내용을 모른다.
    }
}
