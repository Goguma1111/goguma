import java.util.Scanner;

public class Ex05_예외처리 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("x를 입력하세요 ");
        int x = reader.nextInt();

        System.out.print("y를 입력하세요 ");
        int y = reader.nextInt();

        reader.close();

        Calc c = Calc.getInstance();


        int z = c.divied(x, y);

        System.out.printf("[divied] %d 나누기 %d는 %d 입니다.\n",x,y,z);
        System.out.println("----------------------");

        // throws가 적용된 메서드를 호출할때는 Try ~ catch가 강제된다.

        int a =0;
        try {
            a = c.divied(x, y);

        } catch (Exception e) {
            System.out.println("[divied] 0으로 나눌수 없습니다.");
        }

        System.out.printf("[diviedEx] %d 나누기 %d는 %d 입니다\n", x,y,a);
        
        // java에는 개발자가 예측하기 어려운 예외상황이 발생할 가능성이 있는 기능들에 대해
        // 이미 모두 throws가 적용된 형태로 제공된다.
        // 그러므로 개발자는 컴파일러가 강제하는 try ~ catch문을 사용함으로
        // 예외상황에 자연스럽게 대비할 수 있게 된다.
    }
}
