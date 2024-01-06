package Bien;

public class BienCucBo {

    public void sayHello() {
        int n = 10; // Đây là biến local
        System.out.println("Gia tri cua n la: " + n);
    }

    public void getNumber(){
        //System.out.println(n); //Không gọi lại biến "n" trên hàm sayHello
    }

    public static void main(String[] args) {

    }
}
