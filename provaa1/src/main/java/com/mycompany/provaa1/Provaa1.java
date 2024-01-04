/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.provaa1;
import java.util.Scanner;
/**
 *
 * @author luis
 */
public class Provaa1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;

        // Contadores para as três categorias
        int pares = 0;
        int impares = 0;
        int multiplosDe5 = 0;

        // Loop para ler os números
        while (true) {
            System.out.println("Insira um número inteiro positivo (ou um número negativo para sair): ");
            numero = scanner.nextInt();

            // Se o número for negativo, termine o loop
            if (numero < 0) {
                break;
            }

            // Classifique o número
            if (numero % 2 == 0) {
                pares++;
            } else {
                impares++;
            }

            if (numero % 5 == 0) {
                multiplosDe5++;
            }
        }

        // Exiba os resultados
        System.out.println("Números pares: " + pares);
        System.out.println("Números ímpares: " + impares);
        System.out.println("Múltiplos de 5: " + multiplosDe5);
    }
}
