public class Ex06_호출스택 {
    
    public static void main(String[] args) {
        System.out.println("------메인시작-------");
        int a = 10;
        int b = f2(a);
        System.out.printf("f2(%d) = %d\n", a,b);        // 3
        System.out.println("-------메인 종료 ------");
}

    public static int f1(int x) {
        System.out.println("---f1 시작---");
        System.out.printf("f1(%d) = %d + 1\n", x, x);     // 2
        System.out.println("---f1종료---");
        return x + 1;
       
}



    public static int f2(int y) {
        System.out.println("--- f2 시작 ---");
        System.out.printf("f2(%d) = f1(%d) * 2 \n", y,y);    // 1
        int z = f1(y) * 2;
        System.out.println("---f2종료---");
        return z;

}
}
