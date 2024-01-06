package KienTrucCollections;

import java.util.HashMap;
import java.util.Map;

public class DemoMap {
    public static void main(String[] args) {

        Map<String, String> hashMap = new HashMap<String, String>();
        hashMap.put("Windows", "2000");
        hashMap.put("Windows", "XP");
        hashMap.put("Language2", "Java");
        hashMap.put("Language1", ".Net");
        hashMap.put("Windows", "Window 11");

        System.out.println("Các phần tử của Map");
        System.out.print("\t" + hashMap);

        Map<String, String> dataUser = new HashMap<String, String>();
        dataUser.put("name", "Ngọc Ánh");
        dataUser.put("age", "25");
        dataUser.put("phone", "0123456789");
        dataUser.put("address", "HN");

        System.out.println("");

        //Truy xuất giá trị theo từng key
        System.out.println(dataUser.get("name"));

        //Get hết giá trị của key và value
        for (Map.Entry<String, String> entry : dataUser.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

    }
}
