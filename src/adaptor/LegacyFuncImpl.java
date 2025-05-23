package adaptor;

public class LegacyFuncImpl implements LegacyFunc {
    @Override
    public int calc(int num) {
        return num * 10;
    }
}
