import java.util.Scanner;
public class App10 {
    public static void main(String[] args) throws Exception {
      int n, count = 0;
      Scanner sc = new Scanner(System.in);
      do{
        System.out.println("Nhap vao 1 so nguyen duong : ");
        n = sc.nextInt();
      }while(n<=0);

      while (n > 0) {
          n /= 10;
          count++;
      }
      System.out.println("So cac chu so = " + count);
  }
}
