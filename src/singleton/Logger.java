package singleton;

import java.time.LocalDateTime;

// singleton
public class Logger {

    // #3 필드로 Logger 변수 필요
    // private static Logger = logger new logger(); eager loading
    private static Logger Logger;

    // #1 생성자를 private 으로
    private Logger() {}

    // #2 자신 객체를 생성, 전달하는 메소드를 제공
    // 외부에서 Logger 객체 생성 없이 호출 가능
    public static Logger getInstance() {
        /// return Logger; //eager loading
        if (Logger == null) {
            Logger = new Logger();
        }
        return Logger;
    }
    public void log(String message) {
        LocalDateTime ldt = LocalDateTime.now();
        String date = ldt.getYear() + "/" + ldt.getMonthValue() + "/" + ldt.getDayOfMonth();
        String time = ldt.getHour() + ":" + ldt.getMinute() + ":" + ldt.getSecond();

        System.out.println("[" + date + " " + time + "] " + message);
    }
}
