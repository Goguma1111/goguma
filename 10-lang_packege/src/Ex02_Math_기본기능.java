public class Ex02_Math_기본기능 {
    public static void main(String[] args) {
        // 주어진 두수에 대한 최대값 구하기
        int max =Math.max(100, 99999);
        System.out.println("최대값 =" + max);
    
        // 주어진 두수에 최소값 구하기
        int min = Math.min(100,9999);
        System.out.println("최소값" + min);

        // 주어진 수에 대힌 절대값 구하기
        int abs = Math.abs(-234);
        System.out.println("절대값" + abs);

        // 소수점 반올림
        long num = Math.round(3.12345);
        System.out.println("소수점 반올림" + num);

        // 0~1 사이의 랜덤값 생성 
        double rnd = Math.random();
        System.out.println("랜덤값: " + rnd);
    
    
    }
}
