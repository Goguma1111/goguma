public class Ex10_삼항연산자 {
    public static void main(String[] args) {
        int a =10;
        int b =5;
        int c = a> b ? 1 : 2; // a >b 가 참이므로 1이 대입된다.
        System.out.printf("c = %d\n", c);




        boolean k = true;
        int r = k ? 100 : 0;    // k는 참이므로 100이 대입된다.
        int s = !k ? 100 : 0;   // !k는 거짓이므로 s에는 0이 대입된다.
        System.out.printf("r = %d, s = %d\n", r, s);



        int x = 10;
        int y = 20;

        // x > y가 거짓이므로 z에는 x - y의 결과값이 대입된다. 
        
        int z = x > y ? x + y : x - y;
        System.out.printf("z=%d\n",z);

    }
}
