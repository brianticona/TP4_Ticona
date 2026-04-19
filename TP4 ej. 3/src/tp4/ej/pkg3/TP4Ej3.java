package tp4.ej.pkg3;
import java.util.Scanner;
public class TP4Ej3 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int [] num = new int [10];
        int i = 0;
        double mp = 0;
        double mn = 0;
        System.out.println("Ingrese 10 numeros enteros:");
        while (i < 10){
            num[i] = n.nextInt();
            i++;
        }
        for (int c = 0; c < 10; c++){
            if (c % 2 == 0){
                mn = mn + num[c];

            }else{
                mp = mp + num[c];
            }
        }
        mn = mn / 5;
        mp = mp / 5;
            System.out.println("La media de numeros de las posiciones positivas del vector es de " + mp + ".");
            System.out.println("La media de numeros de las posiciones negativas del vector es de " + mn + ".");
    }
}