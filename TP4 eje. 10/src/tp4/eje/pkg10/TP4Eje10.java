package tp4.eje.pkg10;
import java.util.Random;
public class TP4Eje10 {
    public static void main(String[] args) {
        int[] array = rellenarArray(1, 50, 10);
        System.out.println("Array generado:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
    public static int[] rellenarArray(int desde, int hasta, int tamaño) {
        int[] array = new int[tamaño];
        Random random = new Random();
        for (int i = 0; i < tamaño; i++) {
            int numero;
            do {
                numero = random.nextInt(desde, hasta);
            } while (comprobarSiContiene(array, i, numero));
            array[i] = numero;
        }
        return array;
    }
    public static boolean comprobarSiContiene(int[] array, int posicionActual, int numero) {
        for (int i = 0; i < posicionActual; i++) {
            if (array[i] == numero) {
                return true;
            }
        }
        return false;
    }
}