public class Ex05_자릿수지정 {
    public static void main(String[] args) {
        System.out.printf("%10s\n", "java"); // 문자열이 10보다 짧은 경우
        System.out.printf("%10s\n", "java programming"); // 문자열이 10보다 큰 경우



        System.out.printf("%5d\n", 123); // 5자리 보다 짧을 경우
        System.out.printf("%5d\n",1234567890); // 5자리 보다 긴 경우

        System.out.printf("%010d\n", 1234567); // 정수의 빈자리를 0으로 채우기


        System.out.printf("%10f\n", 123.4567); // 실수의 자릿수 지정 , 0은 값의 뒤에 적용된다.
        System.out.printf("%.2f\n", 123.4567); // 소수점 둘째자리만 출력
        System.out.printf("%10.2f\n", 123.4567); // 소수점 자리수가 지정된 경우에 한해서 빈자를 공백으로 두고 오른쪽 정렬
        System.out.printf("%010.2f\n", 123.4567); // 소수점 자리수가 지정된 경우에 한해서 빈자리를 0으로 채우고 오른쪽 정렬


    }
    
}