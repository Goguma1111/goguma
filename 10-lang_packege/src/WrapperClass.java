public class WrapperClass {
    public static void main(String[] args) {
        
    
    /** Wrapper 클래스의 기본 특성 */
    // Wrapper Class는 기본 데이터 타입과 완벽히 호환됨
    int number = 100;
    Integer a = number;
    System.out.printf("a=%d\n", a);


    // 기존 방식 --> 다음버전 부터 이기능이 사라질것을 예고됨(deprecated)

    Integer b = new Integer(number);
    System.out.printf("b=%d\n", b);



    // 기본 데이터 형과 객체화된 데이터는 호한되므로 서로 연산이 가능하다.
    // --> 기본 데이터 타입 변수와 구분할 필요가 없어짐

    int c = 100;
    System.out.println(a + c);

    


    /** Wrapper class의 의의 */
    String s1 = "20";
    String s2 = "3.14";



    // wrapper 클래스의 가장 중요한 기능은 특정 데이터형의 모양을 하고 있는 문자열을
    // 각데이터 타입에 맞는 Wrapper 클래스안에 static 메서드를 정의 되어 있다.

    int num_a = Integer.parseInt(s1);
    float num_b = Float.parseFloat(s2);



    // 반환된 값은 일반 변수와 동일하게 사용가능
    int v1 = num_a + 500;
    float v2 = num_b + 500;

    System.out.println("v1= " + v1);
    System.out.println("v2= " + v2);
}
}