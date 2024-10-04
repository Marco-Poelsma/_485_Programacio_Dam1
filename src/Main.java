/*Exercici 1*/
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Bon dia!");
        double valor;
        Scanner scan = new Scanner(System.in);
        do{
            System.out.println("Introdueix un valor entre 0 i 10.");
            valor = scan.nextDouble();

        } while (valor < 0 || valor > 10);
        System.out.println("Moltes gràcies");

    }
}