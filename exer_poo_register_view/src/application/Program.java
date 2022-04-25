package application;
import entities.Product;

import java.util.Scanner;
import java.util.Locale;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        Product product1 = new Product();

        System.out.println("Insira o nome do produto:");
        product1.name = sc.nextLine();
        System.out.println("Insira o preço do produto:");
        product1.price = sc.nextDouble();
        System.out.println("Insira a quantidade do produto:");
        product1.quantity = sc.nextInt();
        System.out.println(product1);
        System.out.println("\nQuantos produtos deseja adicionar:");
        int quantity = sc.nextInt();
        product1.addProducts(quantity);
        System.out.println(product1);
        System.out.println("\nQuantos produtos deseja remover:");
        quantity = sc.nextInt();
        product1.removeProducts(quantity);
        System.out.println(product1);


        sc.close();
    }
}