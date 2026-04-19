package tp4.ej.pkg7;
public class TP4Ej7 {
    public static void main(String[] args) {
        int [] nr = new int [10];
        int i = 0;
        while (i<10){
            nr [i] = (int)(Math.random() * (100 - 0 + 1) + 0);
            i++;
        }
        System.out.println("Numeros aleatorios entre 0 y 100.");
        for (int c = 0; c < 10;c++){
            System.out.println(nr[c]);
        }
    }
}