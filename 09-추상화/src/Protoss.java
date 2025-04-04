public abstract class Protoss {
    private String name;
    private int hp;
    private int speed;
    private int dps;


    /** 프로토스 객체를 만들기 위한 생성자 */
    public Protoss(String name, int hp, int speed, int dps) {
        this.name = name;
        this.hp = hp;
        this.speed = speed;
        this.dps = dps;

        System.out.printf(">> 유닛이 생성되었습니다. --> 이름: %s, 체력: %s 공격력 : %d\n", name, hp, dps);
    }


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return this.hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getSpeed() {
        return this.speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getDps() {
        return this.dps;
    }

    public void setDps(int dps) {
        this.dps = dps;
    }

    

    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", hp='" + getHp() + "'" +
            ", speed='" + getSpeed() + "'" +
            ", dps='" + getDps() + "'" +
            "}";
    }

    /**
     * 지정한 위치로 이동한다.
     * @param position 이동할 위치
     */
    public abstract void move(String position);


    /**
     * 지정된 대상을 공격한다. (추상메서드)
     * @param target    공격할 대상
     */
    public abstract void attack(String target);
}