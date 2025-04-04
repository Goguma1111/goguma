public class Ex05_단항연산자 {
    public static void main(String[] args) {
        int x = 1;
        x = x + 2; // x 스스로 2 증가
        System.out.printf("x=%d\n", x);

        // 위의 연산식을 축약해서 표현한 형태가 단항 연산자
        int y = 1;
        System.out.printf("y=%d\n", y);


        // 덧셈
        int a = 1;
        a += 10;
        System.out.println(a);


        //빼기
        int b = 10;
        b -= 5;
        System.out.println(b);


        // 곱셈
        int c = 5;
        c *= 2;
        System.out.println(c);

        // 나눗셈(몫)
        int d = 5;
        d /= 2;
        System.out.println(d);


        // 나눗셈(나머지)
        int e =5;
        e %= 2;
        System.out.println(e);

    }
}
