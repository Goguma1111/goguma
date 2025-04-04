package kr.hossam.helper;
public class Ex03_랜덤값 {
    public static void main(String[] args) {
        // 싱글톤 객체 생성
        UtilHelper utilhelper = UtilHelper.getInstance();


        // 랜덤 숫자만들기 테스트
        int randomNumber = utilhelper.random(0, 9);
        System.out.printf("randomNumber=%d\n", randomNumber);

        // 랜덤 숫자 활용
        // 6자리의 비밀번호 활용하기
        String authNum = "";

        for(int i = 0; i< 6; i++){

            // 문자열과 숫자의 덧셈은 글자 결합
            // 글자결합을 6번 수행 하므로 6개의 숫자가 하나의 문자열로 결합된다.
            authNum += utilhelper.random(0,9);

        }

        System.out.printf("인증번호=%s\n", authNum);
    }
}
