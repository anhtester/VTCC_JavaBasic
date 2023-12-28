package Bai1_JavaBasic.DieuKienIF_ELSE;

public class DemoIF_ELSE_IF {

    public static void main(String[] args) {

        float DTB = 3.5F;

        if (DTB >= 8) {
            System.out.println("Giỏi");
        } else if (DTB < 8 && DTB >= 7) {
            System.out.println("Khá");
        } else if (DTB < 7 && DTB >= 6) {
            System.out.println("Trung bình");
        } else if (DTB < 6 && DTB >= 5) {
            System.out.println("Yếu");
        } else {
            System.out.println("Ở lại lớp");
        }

    }

}
