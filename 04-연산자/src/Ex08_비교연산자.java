public class Ex08_비교연산자 {
    public static void main(String[] args) {
        int x = 1;
        int y = 2;



        // 결과값을 다른 변수에 저장 후 출력하는 경우
        boolean a = x == y;
        boolean b = x != y;
        System.out.printf("x == y -> %s\n", a);
        System.out.printf("x != y -> %s\n", b);
    
        
        // 직접 출력하는 경우
        System.out.println(x < y);
        System.out.println(x <= y);
        System.out.println(x > y);
        System.out.println(x >= y);
    
    
    }
}
