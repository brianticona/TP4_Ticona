package tp4.ej.pkg8;
import java.util.Scanner;
public class TP4Ej8 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        String[] nom = new String[20];
        double[] sal = new double[20];
        for (int i = 0; i < 20; i++) {
            System.out.println("Ingrese el nombre del empleado " + (i + 1) + ":");
            nom[i] = n.nextLine();
            do{
                System.out.println("Ingrese el sueldo del empleado " + (i + 1) + ":");
                sal[i] = n.nextDouble();
                if(sal[i]<1){
                    System.out.println("Ingresar salario mayor a cero.");
                }
            }while(sal[i]<1);
            n.nextLine();
        }
        double ms = sal[0];
        String mn = nom[0];
        for (int i = 1; i < 20; i++) {
            if (sal[i] > ms) {
                ms = sal[i];
                mn = nom[i];
            }
        }
        System.out.println("El empleado que más gana es "+mn+" con un sueldo de: "+ms);
    }
}