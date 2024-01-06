package ToanTu;

public class DemoToanTuLogic {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        int c = 30;

        a = b = c = 50;

        System.out.println((a < b) && (b > c));
        System.out.println((a > b) || (b > c));
    }
}
