import Main.HinhChuNhat;
import Main.HinhTron;

public class App {
    public static void main(String[] args) {
   HinhTron hinhTron = new HinhTron();
   HinhChuNhat hinhChuNhat = new HinhChuNhat();
   hinhTron.nhapBanKinh();
   hinhTron.tinhChuVi();
   hinhTron.tinhDienTich();
   hinhTron.inChuVi();
   hinhTron.inDienTich();
   System.out.println("\n\n");
   hinhChuNhat.nhapchieudai();
   hinhChuNhat.nhapchieurong();
   hinhChuNhat.tinhchuvi();
   hinhChuNhat.tinhDienTich();
   hinhChuNhat.inChuVi();
   hinhChuNhat.inDienTich();
   }
}