package Builder;

public class Test {
    public static void main(String[] args) {

        //패턴 적용 전
        // 필요한 생성자를 모두 제공하기 어렵다.
//        Board board1 = new Board();
//        Board board2 = new Board("제목", "내용");
//        Board board3 = new Board("제목", "내용", "작성자");

        //패턴 적용 후
        Board board1 = new Board.Builder().title("제목1").build();
        Board board2 = new Board.Builder().title("제목1").content("내용").build();
        Board board3 = new Board.Builder().title("제목1").content("내용").writer("작성자"
        ).build();

        System.out.println(board1);
        System.out.println(board2);
        System.out.println(board3);
    }
}
