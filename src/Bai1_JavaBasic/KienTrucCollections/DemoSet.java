package Bai1_JavaBasic.KienTrucCollections;

import java.util.HashSet;
import java.util.Set;

public class DemoSet {
    public static void main(String[] args) {

        //Khai báo đối tượng thuộc kiểu HashSet trong bộ Set
        Set<String> hashSet = new HashSet<String>();

        //Thêm giá trị vào HashSet
        hashSet.add("PHP");
        hashSet.add("Python");
        hashSet.add("Java");
        hashSet.add("Java");
        hashSet.add("C++");

        System.out.println("Các phần tử của Set");
        System.out.print("\t" + hashSet + "\n");

        System.out.println(hashSet.size());

        //Duyệt giá trị trong Collection
        for (String programmingName : hashSet){
            System.out.println(programmingName);
        }
    }
}
