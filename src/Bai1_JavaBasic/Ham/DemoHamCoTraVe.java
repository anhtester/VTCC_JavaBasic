package Bai1_JavaBasic.Ham;

public class DemoHamCoTraVe {

    int a = 10;
    int b = 20;

    public int cong2So() {
        return (a + b);
    }

    public static void main(String[] args) {
        DemoHamCoTraVe demoHamCoTraVe = new DemoHamCoTraVe();

        System.out.println(demoHamCoTraVe.cong2So());
        System.out.println(demoHamCoTraVe.cong2So() + 20);
    }
}
