import java.util.Scanner;
public class App74 {
    public static void main(String[] args) throws Exception {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap kich thuoc mang: ");
        n= sc.nextInt();
        int a[] = new int[n];
        System.out.println("Nhap phan tu mang: ");
        for(int i=0;i<n;i++){
            System.out.println("a["+i+"]= ");
            a[i] = sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<n;i++){
            if(a[i]%2==0)
                sum=sum+a[i];
        }
        System.out.print("Tong cac so chan trong mang: "+sum);
    }
}