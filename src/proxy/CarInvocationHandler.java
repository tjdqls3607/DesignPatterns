package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class CarInvocationHandler implements InvocationHandler {
    private final Car car;
    public CarInvocationHandler(Car car) {
        this.car = car;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Proxy Handler invoke()");
        // 실제 객체의 메소드를 호출
        Object result = method.invoke(car, args);
        return result;
    }
}
