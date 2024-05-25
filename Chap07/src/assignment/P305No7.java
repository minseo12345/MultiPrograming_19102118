package assignment;

interface Flyable {
    void speed();
    void height();
}

public class P305No7 {

    public static void main(String[] args) {
       
        class LocalFlyable implements Flyable {
            @Override
            public void speed() {
                System.out.println("속도");
            }

            @Override
            public void height() {
                System.out.println("높이");
            }
        }

        // 지역 클래스의 인스턴스 생성 및 인터페이스 변수에 할당
        Flyable f = new LocalFlyable();

        // Flyable 인터페이스의 메서드 호출
        f.speed();
        f.height();
    }
}
