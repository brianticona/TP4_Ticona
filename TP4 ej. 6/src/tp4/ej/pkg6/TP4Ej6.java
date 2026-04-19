package tp4.ej.pkg6;
import java.util.Scanner;
public class TP4Ej6 {
    public static void main(String[] args) {
        Scanner nu = new Scanner(System.in);
        int [] num = new int [10];
        int p = 0;
        int ce = 0;
        int n = 0;
        int i = 0;
        System.out.println("Ingrese 10 numeros.");
        for(int c = 0; c < 10; c++){
            System.out.println("Numero "+(c+1)+":");
            num[c] = nu.nextInt();
        }
        while(i < 10){
            if (num[i]<0){
                n++;
            }else if(num[i]>0){
                p++;
            }else{
                ce++;
            }
            i++;
        }
        System.out.println("Numeros positivos ingresados: "+p);
        System.out.println("Numeros negativos ingresados: "+n);
        System.out.println("Ceros ingresados: "+ce);
    }
}