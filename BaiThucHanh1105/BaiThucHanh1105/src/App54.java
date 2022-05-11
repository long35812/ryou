import java.util.HashSet;
import java.util.Scanner;
public class App54 {
    public static void main(String[] args) throws Exception {
        String name;
        HashSet<String> hashSetstring = new HashSet<>();
        try (Scanner sc = new Scanner(System.in)) {
            //Thêm các phần tử vào HashSetString
            hashSetstring.add("Wilson");
            hashSetstring.add("Nike");
            hashSetstring.add("Volvo");
            hashSetstring.add("Kia");
            hashSetstring.add("Lenovo");
            hashSetstring.add("Lenovo");

            //Hiện thị các phần tử trong HashSetString
            System.out.println("Các phần tử trong HashSetString: ");
            System.out.println(hashSetstring);
            System.out.println("Nhập phần tử cần xóa:");
            name = sc.nextLine();
        }

        //Nếu phần tử cần xóa có tồn tại HashSetString thì thông báo xóa thành công 
        //và hiện thị các phần tử còn lại ngược lại thông báo xóa không thành công
        if(hashSetstring.contains(name))
        {
            hashSetstring.remove(name);
            System.out.println("Xóa thành công !!!");
            System.out.println("Các phần tử còn lại trong HashSetString : ");
            System.out.println(hashSetstring);
        }
        else
        {
            System.out.println("Xóa không thành công !");
        }
    }
}