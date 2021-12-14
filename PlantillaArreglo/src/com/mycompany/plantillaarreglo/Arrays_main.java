package com.mycompany.plantillaarreglo;

import java.util.Scanner;

public class Arrays_main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Array GrupoPOO = new Array();
        Array GrupoISW = new Array();
        int op = 0;
        do
        {
            System.out.println("Seleccione el Grupo:");
            System.out.println("1) Grupo POO");
            System.out.println("2) Grupo ISW");

            op = scanner.nextInt();
            if (op == 1)
            {
                GrupoPOO.Menu_Opciones();
            }
            else if (op == 2)
            {
                GrupoISW.Menu_Opciones();
            }
        } while (op > 0);
    }
}
