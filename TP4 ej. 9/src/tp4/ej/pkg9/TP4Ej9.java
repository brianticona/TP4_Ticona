package tp4.ej.pkg9;
import java.util.Scanner;
public class TP4Ej9 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        boolean[] p = new boolean[10];
        int cp = 0;
        int r = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("El alumno " + (i + 1) + " pago la cuota?:");
            r = n.nextInt();
            if (r == 1) {
                p[i] = true;
                cp++;
            } else {
                p[i] = false;
            }
        }
        int cd = 10 - cp;
        double pr = (cp * 100.0) / 10;
        System.out.println("Cantidad de pagos: " + cp);
        System.out.println("Cantidad de deudas: " + cd);
        System.out.println("Porcentaje de cobranza: " + pr + "%");
    }
}