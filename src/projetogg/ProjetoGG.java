package projetogg;

import java.util.Scanner;

/**
 *
 * @author Daniela
 */
public class ProjetoGG {
    public static void main(String[] args) {
        double quantCamP, quantCamM, quantCamG, totCamP, totCamM, totCamG;
       Scanner ler = new Scanner(System.in);
       
        System.out.println("Quantidade camiseta pequena:");
        quantCamP = ler.nextDouble();
        System.out.println("Quantidade camiseta média:");
        quantCamM = ler.nextDouble();
        System.out.println("Quantidade camiseta grande:");
        quantCamG = ler.nextDouble();
        
        totCamP = quantCamP * 10;
        totCamM = quantCamM * 12;
        totCamG = quantCamG * 15;
        
        System.out.println("O total de camisetas arrecadas foi R$"
                +(totCamP + totCamM + totCamG));
    }
    
}
