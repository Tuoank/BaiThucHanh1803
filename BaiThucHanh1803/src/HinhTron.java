package Main;
import java.util.Scanner;
public class HinhTron {
    final float PI = 3.14f;
    float cv, dt, r;
    public static void nhapBanKinh() {
        System.out.print("Nhap ban kinh: ");
        Scanner sc = new Scanner(System.in);
        r = sc.nextFloat();
    }
    public void tinhChuVi() {
        cv = 2 * PI * r;
    }
    public void tinhDienTich() {
        dt = PI * r * r;
    }
    public void inChuVi() {
        System.out.println("Chu vi hinh tron = " + cv);
    }
    public void inDienTich() {
        System.out.println("Dien tich hinh tron = " + dt);
    }
    
}