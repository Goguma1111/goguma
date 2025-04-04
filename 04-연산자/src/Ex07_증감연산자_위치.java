public class Ex07_증감연산자_위치 {
    public static void main(String[] args) {


        
        // 전위 증감 연산자

        int x = 1;
        int y = 100 + ++x; //보기 좋은 문장 : int y = 100; ++x;
        
        
        System.out.printf("x = %d\n", x);
        System.out.printf("y = %d\n", y);



 
        // 후위 증감 연산자
        int a = 1;
        int b = 100;


        System.out.printf("a = %d\n",a);
        System.out.printf("b = %d", b);
 
 
    }
}
