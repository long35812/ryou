import java.util.Scanner;
public class App5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int sum = 0, n;
    System.out.println("\n\nNhap vao so can kiem tra: ");
    n = sc.nextInt();
    for(int i=1;i<=n/2;i++){
      if(n%i==0) 
        sum+=i;
    }
    if(sum==n){
      System.out.println(n + " la so hoan thien");
    }
    else {
      System.out.println(n + " khong  phai la so hoan thien");
    }
  }
}
