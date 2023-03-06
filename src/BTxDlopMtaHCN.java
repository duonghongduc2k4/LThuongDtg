public class BTxDlopMtaHCN {
    double height, width;
    public BTxDlopMtaHCN(double height, double width){
        this.height=height;
        this.width=width;
    }
    public double area(){
        return this.height*this.width;
    }
    public double perimeter(){
        return (this.width+this.height)/2;
    }

}
