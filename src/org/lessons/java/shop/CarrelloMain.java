package org.lessons.java.shop;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class CarrelloMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Prodotto> array = new ArrayList<>();
        boolean stop = false;
        while (!stop) {
            System.out.println("Vuoi inserire un prodotto nel carrello? si/no");
            String userSiNo = scan.nextLine().toLowerCase();
            switch (userSiNo) {
                case "si":
                    System.out.println("Vuoi inserire uno Smartphone, Televisore, Cuffie?");
                    String sceltaProdotto = scan.nextLine();
                    if (sceltaProdotto.equals("Smartphone")) {
                        System.out.print("Inserisci il nome del prodotto: ");
                        String userNomeProdotto = scan.nextLine().toLowerCase();
                        System.out.print("Inserisci una descrizione del prodotto: ");
                        String userDescrizioneProdotto = scan.nextLine().toLowerCase();
                        System.out.print("Inserisci il prezzo: ");
                        BigDecimal userPrezzoProdotto = scan.nextBigDecimal();
                        System.out.print("Inserisci l'Iva: ");
                        BigDecimal userIvaProdotto = scan.nextBigDecimal();
                        System.out.print("Inserisci quanta memoria ha: ");
                        int userMemoriaProdotto = scan.nextInt();

                        Smartphone smartphone = new Smartphone(userNomeProdotto, userDescrizioneProdotto, userPrezzoProdotto, userIvaProdotto, userMemoriaProdotto);
                        array.add(smartphone);
                    }

                    else if (sceltaProdotto.equals("Televisore")) {
                        System.out.print("Inserisci il nome del prodotto: ");
                        String userNomeProdotto = scan.nextLine();
                        System.out.print("Inserisci una descrizione del prodotto: ");
                        String userDescrizioneProdotto = scan.nextLine().toLowerCase();
                        System.out.print("Inserisci il prezzo: ");
                        BigDecimal userPrezzoProdotto = scan.nextBigDecimal();
                        System.out.print("Inserisci l'Iva: ");
                        BigDecimal userIvaProdotto = scan.nextBigDecimal();
                        System.out.print("Inserisci le dimensioni del prodotto: ");
                        int userDimensioniProdotto = scan.nextInt();
                        System.out.println("Il Televisore è smart? (true/false):");
                        boolean userScelta = scan.nextBoolean();
                        if(userScelta==true){
                            System.out.println("La tv è smart");

                        } else{
                            System.out.println("La tv non è smart");
                        }

                        Televisori televisori = new Televisori(userNomeProdotto, userDescrizioneProdotto, userPrezzoProdotto, userIvaProdotto, userDimensioniProdotto, userScelta);
                        array.add(televisori);
                    }
                    else if (sceltaProdotto.equals("Cuffie")) {
                        System.out.print("Inserisci il nome del prodotto: ");
                        String userNomeProdotto = scan.nextLine();
                        System.out.print("Inserisci una descrizione del prodotto: ");
                        String userDescrizioneProdotto = scan.nextLine().toLowerCase();
                        System.out.print("Inserisci il prezzo: ");
                        BigDecimal userPrezzoProdotto = scan.nextBigDecimal();
                        System.out.print("Inserisci l'Iva: ");
                        BigDecimal userIvaProdotto = scan.nextBigDecimal();
                        System.out.print("Inserisci il colore del prodotto: ");
                        String userColoreProdotto = scan.nextLine();
                        System.out.println("Le cuffie sono wirless? true/false");
                        boolean userScelta = scan.nextBoolean();
                        if(userScelta == true){
                            System.out.println("Le cuffie sono wirless");
                        } else {
                            System.out.println("Le cuffie sono cablate");
                        }




                        Cuffie cuffie = new Cuffie(userNomeProdotto, userDescrizioneProdotto, userPrezzoProdotto, userIvaProdotto, userColoreProdotto, userScelta);
                        array.add(cuffie);
                    }

                    break;


                case "no":
                    System.out.println("Perfetto, arrivederci");
                    stop = true;
                    break;

            }

            for (Prodotto p : array){
                System.out.println(p);
            }

        }
        scan.close();
    }
}
