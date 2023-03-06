public class THlopHCN {
    double chieuDai, chieuRong;

    public THlopHCN(double chieuDai, double chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public double dienTich() {
        return this.chieuDai * this.chieuRong;
    }
    public  double chuVi(){
        return (this.chieuRong+this.chieuDai)/2;
    }
    public String display(){
        return "THlopHCN{"+"chieu dai="+chieuDai+",chieu rong="+chieuRong+"}";
    }
}
