import Hinh.HinhTron;

public class App71 {
  public static void main(String[] args){
    HinhTron hinhTron = new HinhTron();
    hinhTron.setBanKinh(10);
    float chuvi = hinhTron.tinhChuVi();
    float dientich = hinhTron.tinhDienTich();
    System.out.println("Chu vi hinh tron: " + chuvi + "\nDien tich hinh tron: " + dientich);
  }
}