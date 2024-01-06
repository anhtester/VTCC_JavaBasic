package Mang;

public class DemoMangString {

    public static void main(String[] args) {
        String mangName[] = {"Hoài", "Hương", "Linh", "Đạt"};

        //Truy xuất giá trị
        for (int i = 0; i < mangName.length; i+=2) {
            System.out.println(mangName[i] + " ");
        }
        
        for (String name : mangName){
            System.out.println(name);
        }
    }

}
