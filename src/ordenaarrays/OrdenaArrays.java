package ordenaarrays;

import java.util.Arrays;

public class OrdenaArrays {

    public static void main(String[] args) {
        int[] numeros = {7, 2, 5, 4};
        MetodosOrdenar.visualizar(numeros);
        //MetodosOrdenar.burbulla(numeros);
        MetodosOrdenar obx=new MetodosOrdenar();
        //obx.ordenaDireto(numeros);
        System.out.println("***ordenado***");
        //MetodosOrdenar.visualizar(numeros);
        //utilizo a clase Arrays
        Arrays.sort(numeros);
        MetodosOrdenar.visualizar(numeros);
    }

}
