public class Main {

    public static void main(String[] args) {
        int resultado = 0;
        int i;
        for(i= 0; i <= 10; i = i + 1) {
            resultado = i + resultado;
        }
        System.out.println(resultado);


        int j = 0;
        while(j <= 10) {
            System.out.println("Valor do J: " + j);

            j++;
        }

        int k = 0;
        do {
            System.out.println("Valor do K: " + k);
            k++;
        } while(k <= 10);




    }

}