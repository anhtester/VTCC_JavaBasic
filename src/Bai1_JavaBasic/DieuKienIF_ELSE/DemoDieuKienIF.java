package Bai1_JavaBasic.DieuKienIF_ELSE;

public class DemoDieuKienIF {

    public static void main(String[] args) {

        String name = "My";
        int age = 30;
        String gender = "Nữ";

        if (gender.equals("Nam") && age > 18) {
            System.out.println("Bạn này đáp ứng điều kiện");
        } else {
            System.out.println("Bạn này không đáp ứng");
        }

    }

}
