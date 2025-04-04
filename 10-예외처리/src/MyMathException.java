/**
 * java에서 제공하는 에러 클래스를 상속받은 클래스
 * - 개발자가 직접 정의한 비정상적인 상황을 의미하는 클래스
 */

public class MyMathException extends Exception {
    public MyMathException() {
        super("수학 범위를 벗어났습니다.");
    }

    public MyMathException(String message) {
        super(message);
    }
}
