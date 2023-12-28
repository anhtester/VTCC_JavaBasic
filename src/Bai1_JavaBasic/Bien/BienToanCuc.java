package Bai1_JavaBasic.Bien;

public class BienToanCuc {

    //Khai báo biến toàn cục
    String name = "Thảo";
    int age = 25;

    public void getName(){
        System.out.println(name);
    }

    public void getAge(){
        System.out.println(age);
    }

    public static void main(String[] args) {
        BienToanCuc bienToanCuc = new BienToanCuc();

        bienToanCuc.getName();
        bienToanCuc.getAge();
        System.out.println(bienToanCuc.name);
    }
}
