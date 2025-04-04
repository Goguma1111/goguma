public class App {
    public static void main(String[] args) {
        // 문자열의 숫자 변환 --> 수업에서 다룸
        String mynum = "123";
        int realNum = Integer.parseInt(mynum);
        System.out.println(realNum + 1000);

        // 기본 데이터 타입의 문자열 변환
        int mynum2 = 123;
        String strNum = String.valueOf(mynum2);
        System.out.println(strNum + 1000);


        // 문자열을 한글자씩 분해해서 배열로 변환
        //String msg = "Hello  world";

        //char[] unit = msg.toCharArray();

        // 반복문에서 배열의 인덱스를 기반으로 탐색
        // i ==> 배열의 인덱스
        // for (int i = 0; i < unit.length; i++) {
        //    System.out.println(unit[i]);
        //    }

        // 인덱스 없이 배열의 원소를 변수 'u'에 직접 할당
        /*for (char u : unit) {
            System.out.println(u);
        } */


        String msg = "Hello 123 world";

        char[] unit = msg.toCharArray();
        for (char u : unit) {
            // 파라미터로 전달된 숫자가 숫지형이면 true , 아니면 false
            if (Character.isDigit(u)) {
                System.out.println(u);
            }

            // 파라미터로 전달된 글자를 대문자로 변환해서 리턴
            char k = Character.toUpperCase(u);

            // 파라미터로 전달된 글자를 소문자로 변환해서 리턴
            char m = Character.toLowerCase(u);
        }
    }
}
