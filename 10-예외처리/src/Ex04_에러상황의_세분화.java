public class Ex04_에러상황의_세분화 {
    public static void main(String[] args) {
        int [] data = {100, 20, 300};


        try {
            // 여기서발생할 수 있는 에러상황
            // 1) 배열의 index를 초과한 경우
            // 2) 0으로 나눈 경우 i=0 일때

            for (int i =2; i >= -1; i--){
                int k = data[i];
                System.out.println(k);
            }

        } catch (ArrayIndexOutOfBoundsException e1) {
            // catch 블록을 발생할 수 있는 에러에 경우에 수에 따라 여러개를 정의 하면
            // 상항별로 에러를 구분하여 대응할 수 있다.
            System.out.println("배열의 인덱스를 초과했습니다.");

        } catch (ArithmeticException e2) {
            System.out.println("잘못된 연산 입니다.");
        } catch (Exception e){
            System.out.println("알수없는 에러가 발생했습니다.");
        }
    }
}
