package ordenaarrays;

public class MetodosOrdenar {

    public static void burbulla(int[] num) {
        int aux, cambio = 0, i;
        do {
            cambio = 0;
            for (i = 0; i < num.length - 1; i++) {
                if (num[i] > num[i + 1]) {
                    aux = num[i];
                    num[i] = num[i + 1];
                    num[i + 1] = aux;
                    cambio = 1;
                }
            }
        } while (cambio != 0);
    }

    public static void visualizar(int[] n) {

        for (int i = 0; i < n.length; i++) {
            System.out.println(n[i]);
        }

    }
    public void ordenaDireto(int []a){
        int i,j,aux;
        for(i=0;i<a.length-1;i++)
            for(j=i;j<a.length;j++)
                if(a[i]>a[j]){
                    aux=a[i];
                    a[i]=a[j];
                    a[j]=aux;
                }
    }
}
