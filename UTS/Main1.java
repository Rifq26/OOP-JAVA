import java.util.Scanner;

class Lingkaran {

    protected double phi = 3.14;
    protected double r, luas, keliling;

    public void setR(double jariJari){
        this.r = jariJari;
    }
    public void setLuas(double l){
        this.luas = l;
    }
    public void setKeliling(double kll){
        this.keliling = kll;
    }
    public void setPi (double Phi){
        this.phi = Phi;
    }

    public double getR(){
        return this.r;
    }
    public double getLuas(){
        return this.luas;
    }
    public double getKeliling(){
        return this.keliling;
    }
    public double getphi(){
        return this.phi;
    }

    Scanner input = new Scanner(System.in);

    public void inputNilaiJari2(){
        System.out.println("Input Nilai Jari-jari = ");
        this.r = input.nextDouble();
    }
}

public class Main1 {
    
    public static void main(String[] args) {



        
    
    }   
}