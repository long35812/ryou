import java.util.Scanner;
public class App90 {
    public static void main(String[] args) throws Exception {
      String chuoi;

      char kyTu;
    
      Scanner scanner = new Scanner(System.in);
    
      System.out.println("Nhap vao chuoi bat ki: ");
    
      chuoi = scanner.nextLine();
    
      System.out.println("Cac ky tu co chuoi la: ");
    
        for (int i = 0; i < chuoi.length(); i++){
            kyTu = chuoi.charAt(i);
            System.out.println(kyTu);
    
        }
    }
  }