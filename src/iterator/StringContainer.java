package iterator;

// StringContainer 는 Container 역할을 수행하기 위해 implements Container gkduTrh
// Container 인터페이스에 있는 getIterator() 구현해야함
public class StringContainer implements Container{
    String[] strArr = {"Hello", "Iterator", "Pattern"};

    @Override
    public Iterator getIterator() {
        return new StringIterator();
    }

    // 클래스 내부에 private Iterator 구현 클래스 정의\
    private class StringIterator implements Iterator{

        int index = 0; //default 0 // intArray 에서 현재 들여다 보는 객체
        @Override
        public boolean hasNext() {
            if (index < strArr.length) return true;
            return false;
        }

        @Override
        public Object next() {
            // hasNext() 를 호출하지 않은 경우 대비 if() 추가
            if (this.hasNext()) return strArr[index++];
            return null;
        }
    }
}
