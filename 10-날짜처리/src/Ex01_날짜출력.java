/** 1) 날짜처리기능을 제공하는 클래스 참조 */


import java.util.Calendar;

public class Ex01_날짜출력 {
    public static void main(String[] args) {
        /** 2) Calender 클래스의 객체 생성 -> 싱글톤 객체 */
        // 이코드가 실행되는 시점의 컴퓨터 시작을 멤버변수로 복사한다.
        Calendar cal = Calendar.getInstance();

        /**  3) 날짜 성분 추출 (년, 월,일,시,분,초 >> 24시간제) */
        int yy = cal.get(Calendar.YEAR);

        // 자바에서의 월은 0부터 시작된다.
        int mm = cal.get(Calendar.MONTH);
        int dd = cal.get(Calendar.DAY_OF_MONTH);

        // 24시간제 시간
        int hh = cal.get(Calendar.HOUR_OF_DAY);
        int mi = cal.get(Calendar.MINUTE);
        int ss = cal.get(Calendar.SECOND);


        System.out.printf("%04d년 %02d월 %02d일 %02d시 %02d분 %02d초\n", yy,mm,dd,hh,mi,ss);

        /** 3) 날짜 성분 추출 (년,월,일,시,분,초) >> 12시간제 */
        yy = cal.get(Calendar.YEAR);
        mm = cal.get(Calendar.MONTH) + 1;
        dd = cal.get(Calendar.DAY_OF_MONTH);
        // 12시간제 시간
        hh = cal.get(Calendar.HOUR);
        mi = cal.get(Calendar.MINUTE);
        ss = cal.get(Calendar.SECOND);

        // 오전(=0) , 오후(=1)
        int ampm = cal.get(Calendar.AM_PM);
        String[] apname = {"오전","오후"};

        System.out.printf("%04d년 %02d월 %02d일 %s %02d시 %02d분 %02d초\n", yy,mm,dd,apname[ampm],hh,mi,ss);
    }
}
