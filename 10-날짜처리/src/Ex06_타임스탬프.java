import java.util.Calendar;

/**
 * 
 * 타임스탬프 : 1970년 1월 1일 자정부터 현재까지 흐른 시간을 초단위로 환산한 값
 * 
 * java에서는 타임스탬프를 밀리세컨드 단위로 취급함
 */


public class Ex06_타임스탬프 {
    public static void main(String[] args) {
        /** 타임스템프 값 얻기 */
        Calendar cal = Calendar.getInstance();
        long ms1 = cal.getTimeInMillis();
        System.out.println(ms1);

        /** 프로그램을 지정된 시간동안 강제로 대기 */
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        /** 타임 스탬프값 얻기 (2)  --> 다른 클래스의 import 필요없음*/
        long ms2 = System.currentTimeMillis();
        System.out.println(ms2);

        // 두 시간의 차이 얻기
        long x = ms2 - ms1;
        System.out.println(x);

        // 1/1000초 이므로 100으로 나누면 소요시간을 얻을 수 있음
        long y = x /  1000;
        System.out.println(y + "초 지났음");
    }
}
