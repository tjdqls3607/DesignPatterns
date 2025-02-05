package iterator;

// java.util 에서 제공하는 Iterator 대신 우리만의 Iterator 를 작성
// 컬렉션을 순회하기 위한 메소드를 제공
public interface Iterator {
    boolean hasNext();
    Object next();  //generic 적용전

}
