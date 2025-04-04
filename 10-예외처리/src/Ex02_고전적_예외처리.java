/**
 * 
 * 프로그램이 실행되는 과정에서 에러가 발생할 가능성이 있다면
 * 조건문등을 사용하여 그 상황을 피해가도록 구성해야 한다.
 * 
 * 
 */



public class Ex02_고전적_예외처리 {
    public static void main(String[] args) {
        int[] k = {10,20,30};

        // 반복문의 조건을 수정할 수 없는 상황이라고 가정할 경우
        for (int i = 0; i<5; i++){
            // 반복문안에서 i가 배열의 길이를 초과하지 않을 경우에만 출력하도록 
            // 조건문을 구성해야한다.
            if (i <3){
                System.out.println(k[i]);
            }

        }
        System.out.println("fin : ");
    }
}
