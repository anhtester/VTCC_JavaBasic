package Ham;

public class DemoHamKhongTraVe {

    String name = "Liên";
    int age = 30;
    String phone = "0123456789";

    //Khai báo hàm không trả về
    public void showInfo() {
        //Viết khối lệnh (nhiều dòng code)
        System.out.println("Tên: " + name);
        System.out.println("Tuổi: " + age);
        System.out.println("SĐT: " + phone);
    }

    public void getName(){
        System.out.println(name);
    }

    public void getAge(){
        System.out.println(age);
    }

    public static void main(String[] args) {
        DemoHamKhongTraVe demoHamKhongTraVe = new DemoHamKhongTraVe();

        demoHamKhongTraVe.showInfo();

    }
}
