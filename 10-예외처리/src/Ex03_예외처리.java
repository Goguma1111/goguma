/**
 * 프로그래머가 대응할수 없는 경우의 발생하는 에러 예시
 * 
 * 
 * 1) 파일복사를 수행하는 기능에서 하드디스크이 용량이 가득찬 경우
 * 2) 다운로드를 수행하는 기능에서 인터넷 접속이 끊긴경우
 * 3) USB 파일을 저장하는 과정에서 USB 연결이 강제로 해제된 경우
 * 
 * 
 * 위와 같은 상황은 if문으로 해결이 어렵기 때문에
 * 자바에서는 예외 상황에 대처하기 위한  Try ~ Catch ~ finally 문법을 제공함
 */


public class Ex03_예외처리 {
    public static void main(String[] args) {
        int[] k = {10,20,30};

        try {


            for (int i = 0; i <5; i++) {
                System.out.println(k[i]);
            }


        } catch (Exception e) {
            /** try 블록 안에서 에러가 발생할 경우 실행되는 블록 */
            // try 와 catch는 꼭 명시되어야 함
            // try 블록을 수행하는 과정에서 에러가 발생하면 프로그램이 다운되지 않고 
            // 그 즉시 catch 블록으로 제어가 이동한다


            System.out.println("에러가 발생했습니다");
            System.out.println("에러의 원인: " + e.getMessage());

            System.out.println("====================");
            e.printStackTrace();
            System.out.println("====================");
        } finally {
            /** 에러의 발생여부에 상관없이 무조건 실행되는 블록 */
            // 필요하지 않다면 생략가능
            System.out.println(" 배열의 탐색 종료");
        }

        System.out.println("fin :)");
    }
}


