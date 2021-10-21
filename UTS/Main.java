import java.util.Scanner;

public class Main {
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        float weight, tall, bmi, meter;
     
        System.out.println("Menghitung berat badan ideal");
        System.out.println("\t ");
        System.out.print ("Masukan Berat: ");
        weight = input.nextFloat();
        System.out.print ("Masukan Tinggi: ");
        tall = input.nextFloat();
        meter = tall/100;
   
        bmi=(berat/(meter*meter));
  
        System.out.println("\t ");
        
        // membandingkan
        if (bmi < 18.5){
            System.out.println("(Berat badan kurang)");
        } else if (bmi >= 18.5){
            System.out.println("(Berat badan ideal)");
        } else if (bmi> 22.9){
            System.out.println("(Overweight)"); 
        }
   }
}