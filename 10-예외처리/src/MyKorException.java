/**
 * java에서 제공하는 에러 클래스를 상속받은 클래스
 * - 개발자가 직접 정의한 비정상적인 상황을 의미하는 클래스
 */

public class MyKorException extends Exception {
    public MyKorException() {
        super("국어점수가 벗어났습니다.");
    }

    public MyKorException (String message) {
        super(message);
    }
}
