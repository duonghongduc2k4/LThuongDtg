public class BTXDlopMtaTem {
    double C;
    double F;
    double K;
    public  BTXDlopMtaTem(double C, double F, double K){
        this.C=C;
        this.F=F;
        this.K=K;
    }
    public double sangF(){
        return (this.C*1.8)+32 ;
    }
    public double sangK(){
        return this.C+273.15;
    }
}
