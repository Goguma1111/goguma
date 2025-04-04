public class Ex01_메서드사용 {
    // (1) 프로그램의 출발점
    public static void main(String[] args) {
        f(); // 1회 호출
        f(); // 2회 호출
        


    }   

    // (2) x + 1을 x 값에 따라 수행하는 메서드
    public static void f() {
        int x = 5;
        System.out.println(x + 1);

        x = 10;
        System.out.println(x + 1);


    }        
}
