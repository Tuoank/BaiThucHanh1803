import java.util.Scanner;

public class SinhVien extends Person {  
    Scanner sc = new Scanner(System.in);
    String NgaySinh;
    public void inputStudent() {
        Scanner sc = new Scanner(System.in);
        input();
        System.out.print("nhap ngay sinh: ");
        NgaySinh = sc.nextLine();
        sc.close();
    }
    public void outputStudent() {
        output();
        System.out.println("Ngay sinh:"+NgaySinh);
    }
    
}