package factory;

// Transportation 을 구현한 객체를 대신 생성
public class TransportationFactory {
    public static Transportation getTransportation(String clsf) {
        Transportation t = null;

        switch (clsf) {
            case "A" : t = new Airplane(); break;
//            case "C" : t = new Car(); break;
            case "C" : t = new SportsCar(); break;
            case "H" : t = new Helicopter(); break;
        }
        return t;
    }
}
