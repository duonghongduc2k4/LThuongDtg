public class THhinhTron {
    double banKinh;

    public THhinhTron(double banKinh) {
        this.banKinh = banKinh;
    }

    public double dienTich() {
        return banKinh * banKinh * Math.PI;
    }
}
