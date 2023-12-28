package Bai1_JavaBasic.KieuDuLieu;

public class DemoKieuDuLieu {
    public static void main(String[] args) {
        String name = null;
        name = "Selenium";

        byte number1 = 123; //-128 đến 127
        char kitu = 'e';
        char kituSo = '1';

        boolean checkGioiTinh = true; //Chỉ lưu 2 giá trị true/false

        short number2 = 32767;
        int number3 = 2100000000;
        long number4 = 210000000210000000L;

        float number5 = 15.2F; //Kiểu số thực, thập phân
        double number6 = 11111111111.222222222;

        System.out.println(name);
        System.out.println(number1);
        System.out.println(kitu);
        System.out.println(checkGioiTinh);
        System.out.println(number2);
    }
}
