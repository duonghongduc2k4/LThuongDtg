import java.util.Scanner;

public class BTxDlopHCN2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chiều dài: ");
        double height= sc.nextDouble();
        System.out.print("Nhập chiều rộng: ");
        double width= sc.nextDouble();

        BTxDlopMtaHCN hcn = new BTxDlopMtaHCN(height,width);
        System.out.println("Chu vi HCN: "+hcn.perimeter());
        System.out.println("Diện tích HCN: "+hcn.area());

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print("* ");
            }
            System.out.print("* ");
            System.out.println();

        }
    }
}
