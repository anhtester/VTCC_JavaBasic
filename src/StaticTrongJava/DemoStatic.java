package StaticTrongJava;

public class DemoStatic {

    //Khối static
    //Chạy trước hàm main
    static {
        System.out.println("Khối static: hello !");
    }

    static String name = "Ánh";
    static int age = 30;
    String address = "Hồ Chí Minh";

    public static void getInfo(){
        System.out.println(name);
        System.out.println(age);

        DemoStatic demoStatic = new DemoStatic();
        System.out.println(demoStatic.address);
    }

    public String getAddress(){
        System.out.println(name);
        return address;
    }

    public static void main(String[] args) {

        DemoStatic demoStatic = new DemoStatic();
        System.out.println(demoStatic.address);
        demoStatic.getAddress();

        DemoStatic.getInfo();

    }

}
