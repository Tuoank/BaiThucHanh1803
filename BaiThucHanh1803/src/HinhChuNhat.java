package Main;
import java.util.Scanner;

public class HinhChuNhat {
   float cd, cr, cv, dt;
   public void nhapChieuDai() {
      System.out.println("Nhap chieu dai: ");
      Scanner sc = new Scanner(System.in);
      cd = sc.nextFloat();
      sc.close();
  }
  public void nhapChieuRong() {
   System.out.print("Nhap chieu rong: ");
   Scanner sc = new Scanner(System.in);
   cr = sc.nextFloat();
   sc.close();
  }
  public void tinhChuVi() {
     cv = (cd + cr) * 2;
  }
  public void tinhDienTich() {
     dt = cd * cr ;
  }
  public void inChuVi() {
     System.out.println("Chu vi hinh chu nhat :" + cv);
  }
  public void inDienTich() {
     System.out.println("Dien tich hinh chu nhat:" + dt);
  }
}