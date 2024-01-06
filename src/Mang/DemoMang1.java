package Mang;

public class DemoMang1 {

    public static void main(String[] args) {

        // khai báo và khởi tạo mảng số nguyên
        int number[] = new int[5];

        //Mảng bắt đầu là 0
        number[0] = 10; //gán giá trị cho phần tử thứ nhất trong mảng
        number[1] = 20; //gán giá trị cho phần tử thứ hai trong mảng
        number[2] = 40;
        number[3] = 50;

        //Truy vấn giá trị từng phần tử trong mảng thì dùng vòng lặp FOR
        //mảng.length để lấy độ dài của mảng
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] + " ");
        }

        for (int i : number){
            System.out.print(i + " ");
        }

    }

}
