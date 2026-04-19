package tp4.ej.pkg5;
public class TP4Ej5 {
    public static void main(String[] args) {
        int [] pares = new int [20];
        int i = 0;
        while (i<20){
            pares[i] = (i+1)*2;
            i++;
        }
        System.out.println("Primeros 20 numeros pares:");
        for(int c = 0;c < 20;c++){
            System.out.println(pares[c]);
        }
    }
}