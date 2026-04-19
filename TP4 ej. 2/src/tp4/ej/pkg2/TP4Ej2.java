package tp4.ej.pkg2;
import java.util.Scanner;
public class TP4Ej2 {
    public static void main(String[] args) {
        Scanner nu = new Scanner(System.in);
        int [] num = new int [10];
        int i = 0;
        int p = 0;
        int n = 0;
        double mp = 0;
        double mn = 0;
        System.out.println("Ingrese 10 numeros enteros:");
        while (i < 10){
            System.out.println("Ingrese el numero "+ (i + 1) +":");
            num[i] = nu.nextInt();
            i++;
        }
        for (int c = 0; c < 10; c++){
            if (num[c] < 0){
                mn = mn + num[c];
                n++;
            }else if (num[c] > 0){
                mp = mp + num[c];
                p++;
            }
        }
        mn = mn / n;
        mp = mp / p;
        if (p != 0){
            System.out.println("La media de numeros positivos ingresados es de " + mp + ".");
        }else{
            System.out.println("No se ingresaron numeros positivos.");
        }
        if (n != 0){
            System.out.println("La media de numeros negativos ingresados es de " + mn + ".");
        }else{
            System.out.println("No se ingresaron numeros negativos.");
        }
    }
}