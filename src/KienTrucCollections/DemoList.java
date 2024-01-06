package KienTrucCollections;

import java.util.ArrayList;
import java.util.List;

public class DemoList {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(5);
        arrayList.add(2);
        arrayList.add(2); //Thêm giá trị tay, sau này thêm bằng code Automation

        System.out.println("Các phần tử của ArrayList");
        System.out.print("\t" + arrayList + "\n");

        for (int number : arrayList) {
            System.out.println(number);
        }

        arrayList.remove(2); //Xoá phần tử vị trí thứ 2

        for (int i = 0; i < arrayList.size(); i++) {
            //Dùng code automation để gọi dùng trực tiếp từng thằng theo vị trí
            System.out.println(arrayList.get(i));
        }

//        List<String> listTotalStock = new ArrayList<String>();
//        listTotalStock.add("");
//        List<String> listTotalStock = //code auto để lấy danh sách giá trị gán vào
//                listTotalStock.get(2);
    }
}
