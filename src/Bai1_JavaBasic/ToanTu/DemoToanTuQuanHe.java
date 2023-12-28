package Bai1_JavaBasic.ToanTu;

public class DemoToanTuQuanHe {
    public static void main(String[] args) {
        int a = 10; //Gán a = 10
        int b = 20;
        int c = 20;

        boolean checkSoSanh1 = (a == b);
        boolean checkSoSanh2 = (a > b);
        boolean checkSoSanh3 = (c <= b); //Bé hơn hoặc Bằng
        boolean checkSoSanh4 = (c >= b); //Lớn hơn hoặc Bằng
        boolean checkSoSanh5 = (a != b); //So sánh Khác

        System.out.println(checkSoSanh1); //So sánh bằng
        System.out.println(checkSoSanh2);
        System.out.println(checkSoSanh3);
        System.out.println(checkSoSanh4);
        System.out.println(checkSoSanh5);
    }
}
