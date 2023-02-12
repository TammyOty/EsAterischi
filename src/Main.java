import java.util.ArrayList;

import java.util.Scanner;

public class Main {
    private static int numAsterischi;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int divisore = 100;
         ArrayList<Float> incasso = new ArrayList<Float>();
        boolean flag =true;


        do {
            System.out.println("Inserisci un incasso:");
            incasso.add(sc.nextFloat());

            for (int indice = 0; indice < incasso.size(); indice++) {
                Float numAsterischi = incasso.get(indice) / divisore;
                System.out.println("Negozio " + (indice + 1) + ": ");
                for (int i = 0; i < numAsterischi; i++) {
                    System.out.print("*");
                    if (incasso.size()<=0){
                        System.out.println("Sbagliato inserimento, chiusura programma");

                    }
                }
                System.out.println();
            }



        }while (true);


        }


    }


