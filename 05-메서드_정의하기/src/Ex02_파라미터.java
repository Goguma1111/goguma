public class Ex02_파라미터 {
    public static void main(String[] args) {
        f(5);           // f에 정의된 파라미터 x에 5 할당
        f(10);          // f에 정의된 파라미터 x에 10 할당

        
        //변수를 초기화 한 후 파라미터로 전달


        int a = 100;
        f(a);


    }

        public static void f(int x){

            int y  = x + 1;
            System.out.printf("f(%d) =  %d\n", x, y);
        }
    
}
