package Bai1_JavaBasic.Ham;

public class DemoHamCoThamSo {

    int a = 10;
    int b = 20;
    int VAT = 10;

    public int cong2So() {
        return (a + b);
    }

    public int congHaiSo(int number1, int number2) {
        return (number1 + number2);
    }

    public double tinhLaiSuat(double TongTienGui, int SoThangGui) {
        return ((TongTienGui * VAT) / 100) * SoThangGui;
    }

    public static void main(String[] args) {

        DemoHamCoThamSo demoHamCoThamSo = new DemoHamCoThamSo();

        System.out.println(demoHamCoThamSo.cong2So());

        System.out.println(demoHamCoThamSo.congHaiSo(50, 30));

        System.out.println("Lãi suất: " + demoHamCoThamSo.tinhLaiSuat(50000000, 12));
    }
}
