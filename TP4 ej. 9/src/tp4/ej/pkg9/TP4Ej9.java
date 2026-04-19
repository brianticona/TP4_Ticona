package tp4.ej.pkg9;
import java.util.Scanner;
public class TP4Ej9 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int[] p = new int[10];
        int cp = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("El alumno " + (i + 1) + " pago?:");
            p[i] = n.nextInt();
            if (p[i] == 1) {
                cp++;
            }
        }
        int cd = 10 - cp;
        double pr = (cp * 100.0) / 10;
        System.out.println("Cantidad de alumnos que pagaron: " + cp);
        System.out.println("Cantidad de alumnos que adeudan: " + cd);
        System.out.println("Porcentaje de alumnos que pagaron: " + pr + "%");
    }
}