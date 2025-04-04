public class Ex01_String {
    public static void main(String[] args) {
        // 기능을 확인하기 위한 문자열의 선언
        String msg = "Life is too short. you need Java";
        System.out.println("문자열 : " + msg);

        // 문자열의 글자 수를 가져온다 --> 공백과 특수문자 포함
        int len = msg.length();
        System.out.println("문자열의 길이: " + len);


        // 파라미터로 설정된 위치의 글자를 리턴한다.
        // --> 위치는 0부터 카운트
        char str2nd = msg.charAt(2);
        System.out.println("두번째 글자 :" + str2nd);

        // 파라미터로 전달된 내용이 처음 나타나는 위치를 리턴한다.
        int p1 = msg.indexOf("f");
        System.out.println("f가 처음 나타내는 위치 :" + p1);


        // 찾지 못할경우 -1을 반환
        System.out.println("'z' 가 처음 나타내는 위치 : " + msg.indexOf("z"));



        // 단어나 문장으로 검색할 경우 일치하는 내용이 시작되는 첫글자의 위치를 반환
        System.out.println("short가 처음 나타내는 위치 : " + msg.indexOf("short"));



        // indexof에 파라미터가 두 개인 경우
        // 두 번째 숫자 값은 첫 번째 파라미터의 글자를 찾기 시작하는 위치를 의미
        int p2 = msg.indexOf("i");
        int p3 = msg.indexOf("i", p2+ 1);
        System.out.println("i가 첫번째로 나타내는 위치 : " + p2);
        System.out.println("'i'가 두 번째로 나타내는 위치 : " + p3);



        // 파라미터로 전달된 글자가 마지막으로 나타나는 위치를 리턴한다.
        // 단 이 위치를 문자열의 끝에서 부터 세는 것이 아니라 문자열의 처음부터 센다.
        // 찾지 못할 경우 -1을 반환.

        int p4 = msg.lastIndexOf("a");
        System.out.println("'a'의 마지막 위치: " + p4);




        // 응용

        if(msg.indexOf("hello") < -1) {
            System.out.println("헬로가 포함됨");
        } else {
            System.out.println("Hello가 포함되지않음");
        }



        // 잘라내기 위한 시작위치와 끝 위치를 파라미터로 설정한다.
        // 지정끝 위치의 직전 글짜까지만 잘라낸다
        String subString1 = msg.substring(0, 18);
        System.out.println(" 문자열 자르기 :" + subString1);

        // 두번째 파라미터가 없을 경우 지정된 위치 부터 끝까지 자른다.
        String subString2 = msg.substring(19);
        System.out.println("문자열 자르기: " + subString2);

        // 모든글자를 대문자로 변환
        String up = msg.toUpperCase();
        System.out.println("모든 글자의 대문자 변환: " + up);

        // 모든 글자 소문자로 변환
        String low = msg.toLowerCase();
        System.out.println("모든 글자의 소문자 변환 : " + low);



        // 문자열의 앞/뒤 공백 지우기
        String src1 = "  Hello World    ";
        String src2 = src1.trim();

        System.out.printf("src1 = [%s]\n", src1);
        System.out.printf("src1 = [%s]\n", src2);


        // 문자열의 포함된 구분자를 기준으로 문자열을 잘라 배열로 반환한다.
        String txt = "HTML,CSS, Javascript";
        String[] arr = txt.split(",");

        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }

        // 첫번쨰 파라미터의 내용을 두 번째 파라미터로 변경환 결과를 반환한다.
        String txt2 = txt.replace(",", "$");
        System.out.println(txt2);

        // 문자열의 내용이 같은지 비교
        String txt3 = "Hello";
        System.out.println(txt.equals("Hello"));

        if(txt3.equals("Hello")){
            System.out.println("txt3 = Hello입니다.");
        } else {
            System.out.println("txt3 = Hello가 아닙니다.");
        }
    }
}
