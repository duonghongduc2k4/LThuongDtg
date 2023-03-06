import java.util.Scanner;

public class THlopHCN2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Nhap chieu dai: ");
        double chieuDai= sc.nextDouble();
        System.out.print("Nhap chieu rong: ");
        double chieuRong= sc.nextDouble();
        THlopHCN hcn =new THlopHCN(chieuDai,chieuRong);
        System.out.println(hcn.display());
        System.out.println("dien tich: "+hcn.dienTich());
        System.out.println("chu vi: "+hcn.chuVi());
    }
}
