package tp4.ej.pkg1;
import java.util.Scanner;
public class TP4Ej1 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int [] num = new int [7];
        int i = 0;
        System.out.println("Ingrese 7 numeros enteros:");
        while (i < 7){
            System.out.println("Ingrese el numero "+(i+1)+":");
            num[i] = n.nextInt();
            i++;
        }
        System.out.println("Los 7 numeros enteros ingresados fueron:");
        for (int c = 0; c < 7; c++){
            System.out.println("El numero "+(c+1)+" ingresado fue:");
            System.out.println(num[c]);
        }
    }
}