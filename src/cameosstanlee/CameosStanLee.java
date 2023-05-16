package cameosstanlee;

import java.util.Scanner;

public class CameosStanLee {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt();
        sc.nextLine();
        String frase;
        String nombre = "stanlee";
        int longitudFrase;
        int contador;

        for (int i = 0; i < casos; i++) {

            frase = sc.nextLine();
            frase = frase.toLowerCase();

          //  longitudFrase = 0;
          //  contador = 0;
            
            System.out.println(contadorCameos(frase));

        }

    }

    static int contadorCameos(String frase) {
        int contador = 0;
        String nombre = "stanlee";
        int longitudFrase = 0;
        
        for (int j = 0; j < frase.length(); j++) {

            if (frase.charAt(j) == nombre.charAt(longitudFrase)) { // comparamos letra a letra y sumamos
                longitudFrase++;
            }
            if (longitudFrase == nombre.length()) {    //aqui comparamos que la logitud sea la misma  
                longitudFrase = 0;                 // reinicializamos la variable para volver a contar otro supuesto caso  
                contador++;                        // contamos el cameo  
            }

        }
        return contador;

    }

}
