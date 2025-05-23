package proxy;

import javax.imageio.plugins.tiff.TIFFImageReadParam;
import java.lang.reflect.Proxy;

public class Test {
    public static void main(String[] args) {

//        Car car = new SimpleCar();
//        car.engineStart();
//        // 공회전
//        try {
//            Thread.sleep(3000);
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//
//        car.drive();

//        // 하드코딩된 프록시
//        // 레이지로딩 이 되는지 알 수 없다
//        Car car = new ProxyCar();
//        car.engineStart();
//
//        try {
//            Thread.sleep(3000);
//        }catch (Exception e) {
//            e.printStackTrace();
//        }
//        car.drive();

        // 동적으로 생성하는 프록시
        // reflection api
        Car car = getCar();

        car.engineStart();

        // 공회전
        try {
            Thread.sleep(3000);
        }catch (Exception e) {
            e.printStackTrace();
        }
        car.drive();
    }

    static Car getCar() {
        Car car = new SimpleCar();

        // 단순 SimpleCar
//        return car;

        // reflection api
        return(Car) Proxy.newProxyInstance(
                SimpleCar.class.getClassLoader(),
                new Class[] {Car.class},
                new CarInvocationHandler(car)
        );
    }
}
