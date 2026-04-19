package tp4.ej.pkg4;
import java.util.Scanner;
public class TP4Ej4 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        int i = 0;
        int v = 0;
        double sn = 0;
        System.out.println("Ingrese la cantidad de alumnos de la clase.");
        do{
            v = n.nextInt();
            if (v < 1){
                System.out.println("Ingrese una cantidad validad de alumnos.");
            }else{
                System.out.println("La cantidad de alumnos ingresados es de " + v + ".");
            }
        }while (v < 1);
        double [] al = new double [v];
        while(i < v){
            do{
                System.out.println("Ingrese la nota del alumno "+(i+1)+":");
                al [i] = n.nextInt();
                if((al[i]<0)||(al[i]>10)){
                    System.out.println("Nota no valida");
                }
            }while((al[i]<0)||(al[i]>10));
            i++;
        }
        for(int c = 0; c < v; c++){
            sn = sn + al[c];
        }
        sn = sn / v;
        System.out.println("La nota promedio fue "+sn+".");
        System.out.println("Alumnos con la nota superior al promedio.");
        for(int cc = 0;cc < v;cc++){
            if (al[cc]>sn){
                System.out.println("Alumno numero "+cc+" con una nota de "+al[cc]+".");
            }
        }
    }
}