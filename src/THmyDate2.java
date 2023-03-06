import java.util.Scanner;

public class THmyDate2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ngay: ");
        int day = sc.nextInt();
        System.out.print("Nhap thang: ");
        int month = sc.nextInt();
        System.out.print("Nhap nam: ");
        int year = sc.nextInt();
        THmyDate date = new THmyDate(day, month, year);
        System.out.println("Ngay: "+date.getDay());
        System.out.println("Thang: "+date.getMonth());
        System.out.println("Nam: "+date.getYear());
        System.out.println("Date: "+date.myDate());
    }
}
