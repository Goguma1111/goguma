public class App {
    public static void main(String[] args) {
        // 추상클래스는 직접적으로 객체 할당 불가 --> 'new' 예약어 사용불가
        // Protoss p = new Protoss("프로브1", 50,30,10);

        Zilot z = new Zilot("질럿1호", 150, 130, 100);
        z.move("저그 멀티");
        z.attack("저그 멀티");
        System.out.println("---------------------------");

        Dragun d = new Dragun("드라군1호", 200, 150, 100);
        d.move("저그 멀티");
        d.attack("저그 멀티");
        System.out.println("--------------------------");



        /** 추상클래스는 선언은 가능하지만 할당은 불가능 */
        // 드라군과 질럿을 프로토스 타입으로 할당
        /** 
        Protoss p1 = new Dragun("드라군 2호", 200, 150, 100);
        Protoss p2 = new Zilot("질럿1호", 150, 130, 100);
        
        
        /*/
         Protoss p1 = new Zilot("질럿1호", 150, 130, 100);
        Protoss p2 = new Dragun("드라군 2호", 200, 150, 100);
        /**/
       
        // 추상클래스를 상속받은 자식 클래스들은 부모의 추상 메서드를 반드시 재정의
        // --> 부모가 정의 하고 있는 메서드를 포함하고 있다는 것이 보장된다.
        
        // p1과 p2는 할당되는 구현채 클래스에 종류에 따라 같은 메서드를 호출하더라도 다른 결과를 만들어 낸다.
        // --> 다형성
        p1.move("저그멀티");
        p1.attack("저그멀티");
        p2.move("저그멀티");
        p2.attack("저그멀티");
    }
}
