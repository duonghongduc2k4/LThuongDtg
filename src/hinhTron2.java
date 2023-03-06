import java.util.Scanner;

public class hinhTron2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Nhap ban kinh: ");
        double banKinh= sc.nextDouble();
        THhinhTron circle= new THhinhTron(banKinh);
        System.out.println("Dien tich hinh tron: "+circle.dienTich());
    }
}
