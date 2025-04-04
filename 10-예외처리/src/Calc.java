public class Calc {
    private static Calc current;

    public static Calc getInstance() {
        if (current == null) {
            current = new Calc();
        }

        return current;
    }


    private Calc() {
        super();
    }




    // 런타임 에러가 발생할 경우 메서드 안에 직접 try ~ catch 사용
    public int divied (int x, int y){
        int z =0;

        try {
            z = x / y;

        } catch (Exception e) {
            System.out.println("[divied 에러] 0으로 나눌수 없습니다. ");
        }

        return z;
    } 

    // throws 구문 사용

    public int diviedEx (int x , int y){
        return x / y;
    }
}
