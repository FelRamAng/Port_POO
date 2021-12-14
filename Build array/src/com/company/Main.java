package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        class Array {
            int Tam;
            int Arreglo[];
            int Cont;
            int Dato;
            Scanner read = new Scanner(System.in);

            void InicializarArreglo() {
                int i = 0;
                System.out.println("    Introduzca el tamaño de su arreglo: ");
                Tam = read.nextInt();
                int Aux[] = new int[Tam];
                for (i = 0; i < Tam; i++) {
                    Aux[i] = 0;
                }
                Arreglo = Aux;
                Cont = -1;

                Cont++;
                Arreglo[Cont] = 27;

                Cont++;
                Arreglo[Cont] = 13;

                Cont++;
                Arreglo[Cont] = 75;

                Cont++;
                Arreglo[Cont] = 63;

                Cont++;
                Arreglo[Cont] = 18;

                Cont++;
                Arreglo[Cont] = 7;

                Cont++;
                Arreglo[Cont] = 23;

                Cont++;
                Arreglo[Cont] = 15;

                Cont++;
                Arreglo[Cont] = 12;

                Cont++;
                Arreglo[Cont] = 5;

                Cont++;
                Arreglo[Cont] = 123;

            }

            boolean Arreglo_Lleno() {
                if (Cont == Tam - 1) {
                    return true;
                } else {
                    return false;
                }
            }

            void Insertar_Arreglo() {
                if (!Arreglo_Lleno()) {
                    Cont++;
                    Arreglo[Cont] = Dato;
                }
            }

        }
    }
}