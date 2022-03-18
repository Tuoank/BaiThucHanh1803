
public class App1803 {
    public static void main(String[] args) {        
        Person b = new Person();
        System.out.println("Nhap thong tin cua Person: ");
        b.input();
        b.output();
        SinhVien a = new SinhVien();
        System.out.println("Nhap thong tin sinh vien: ");       
        a.inputStudent();
        a.outputStudent();
    }

}