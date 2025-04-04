public class Ex04_상수 {
    public static void main(String[] args) {
        int age = 20;
        System.out.println(age);



        age = 21;
        System.out.println(age);



        /** 상수는 초기화 이후 변경할 수 없는 형태 */
        // 데이터 타입옆에 final 키워드를 적용하여 생성
        // 상수의 이름은 모두 대문자로 지정하고 스네이크 표기법을 사용하는 것이 관례
        
        final double PI = 3.14;
        System.out.println(PI);

        // 상수의 값을 변경하려고 시도 --> 에러발생

        // PI = 3.14159;
       //  System.err.println(PI);

       

    }


}
