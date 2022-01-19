import java.util.Scanner;
public class App2 {
  public static void main(String[] args) throws Exception {
    double hesoX1,hesoY1,hesoZ1,hesoX2,hesoY2,hesoZ2,dd,dx,dy;
    System.out.println("Nhap X1");
    Scanner sc = new Scanner(System.in);
    hesoX1 = sc.nextDouble();
    System.out.println("Nhap Y1");
    hesoY1 = sc.nextDouble();
    System.out.println("Nhap Z1");
    hesoZ1 = sc.nextDouble();
    System.out.println("Nhap X2");
    hesoX2 = sc.nextDouble();
    System.out.println("Nhap Y2");
    hesoY2 = sc.nextDouble();
    System.out.println("Nhap Z2");
    hesoZ2 = sc.nextDouble();
    dd=hesoX1*hesoY2-hesoY1*hesoX2; dx=hesoZ1*hesoY2-hesoY1*hesoZ2; dy=hesoX1*hesoZ2-hesoX2*hesoZ1;
    if(dd==0)
      if(dx==0 && dy==0){
        System.out.println("He vo so nghiem");
      }
      else System.out.println("He vo nghiem");
    else
      System.out.println("He co 1 nghiem " + " x=" + (dx/dd) + " va y= " +(dy/dd));
  }
}