package com.mycompany.plantillaarreglo;
import java.util.Scanner;

public class Array
{
    int Tam;
    int Arreglo[];
    int Cont;
    int Dato;
    Scanner scanner = new Scanner(System.in);

    void InicializarArreglo()
    {
        int i = 0;
        System.out.println("    Introduzca el tamaño de su arreglo: ");
        Tam = scanner.nextInt();
        int Aux[] = new int[Tam];
        for (i = 0; i < Tam; i++)
        {
            Aux[i] = 0;
        }
        Arreglo = Aux;
        Cont = -1;

    }

    boolean Arreglo_Lleno()
    {
        if (Cont == Tam - 1)
        {
            System.out.println("");
            System.out.println("El Arreglo está Lleno.");
            return true;
        }
            else
                {
                    return false;
                }
    }

    boolean Arreglo_Vacio()
    {
        if(Cont == -1)
        {
            System.out.println("El arreglo está vacío.");
            return true;
        }
        else
        {
            return false;
        }
    }

    void Insertar_Arreglo()
    {
        if (!Arreglo_Lleno())
        {
            Cont++;
            Arreglo[Cont] = Dato;
        }
    }

    void Listar_Arreglo()
    {
        int i = 0;
        for (i = 0; i <= Cont; i ++)
        {
            System.out.println("Dato " + (i + 1) + ": " + Arreglo[i]);
        }
    }

    int Busqueda_Secuencial()
    {
        if (!Arreglo_Vacio())
        {
            return -1;
        }
        else
            {
            for (int i = 0; i <= Cont; i++)
            {
                if (Dato == Arreglo[i])
                {
                    return i;
                }
            }
        }
        System.out.println("El dato: " + Dato + " no se Encuentra en el Arreglo.");
        return -2;
    }

    void Eliminar_Dato()
    {
        int Buscar = Busqueda_Secuencial();

        if (Buscar >= 0)
        {
            for (int i = Buscar; i < Cont; i ++)
            {
                Arreglo[i] = Arreglo[i + 1];
            }
        }
        Cont --;
    }

    void Modificar_Dato()
    {
        int Buscar = Busqueda_Secuencial();

        if (Buscar >= - 1)
        {
            System.out.println("Escriba el Nuevo Dato: ");
            Arreglo[Buscar] = scanner.nextInt();
        }
    }

    void Menu_Opciones()
    {
        int op = 0;
        do
        {
            System.out.println("    Menu de Opciones    ");
            System.out.println("1) Inicializar Arreglo  ");
            System.out.println("2) Insertar Datos       ");
            System.out.println("3) Eliminar Datos       ");
            System.out.println("4) Modificar Dato       ");
            System.out.println("5) Consultar Datos      ");
            System.out.println("6) Listar el Arreglo    ");
            System.out.println("7) Ordenar el Arreglo   ");
            System.out.println("8) Salir                ");
            System.out.println("");
            System.out.println("Seleccione una Opción:  ");
            op = scanner.nextInt();

            switch (op)
            {
                case 1:
                {
                    InicializarArreglo();
                    break;
                }
                case 2:
                {
                    System.out.println("Dato a Insertar:");
                    Dato = scanner.nextInt();
                    Insertar_Arreglo();
                    break;
                }
                case 3:
                {
                    System.out.println("Daro a Eliminar: ");
                    Dato = scanner.nextInt();
                    Eliminar_Dato();
                    break;
                }
                case 4:
                {
                    System.out.println("Dato a Modificar: ");
                    Dato = scanner.nextInt();
                    Modificar_Dato();
                    break;
                }
                case 6:
                {
                    Listar_Arreglo();
                    break;
                }
            }

        } while (op > 0);

    }
}