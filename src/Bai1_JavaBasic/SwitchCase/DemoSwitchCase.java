package Bai1_JavaBasic.SwitchCase;

public class DemoSwitchCase {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        switch (a + b) {
            case 10:
                System.out.println("10");
                break; //Thoát hẳn luôn, không chạy case dưới
            case 20:
                System.out.println("20");
                break;
            case 30:
                System.out.println("30");
                break;
            default:
                System.out.println("Not in 10, 20 or 30");
        }
    }
}
