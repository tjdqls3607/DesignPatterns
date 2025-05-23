package adaptor;

// input -> LegacyFunc ->result
// input -> LegacyFunc -> LegacyFuncAdaptor -> result
public class Test {

    public static void main(String[] args) {
        // LegacyFunc
        LegacyFunc legacyFunc = new LegacyFuncImpl();
        System.out.println(legacyFunc.calc(10));

        // 새로운 Function 을 위 LegacyFunc 을 받아서 변형하는 Adaptor 객체
        LegacyFuncAdaptor legacyFuncAdaptor = new LegacyFuncAdaptorImpl(legacyFunc);
        System.out.println(legacyFuncAdaptor.calc(10));

    }
}
