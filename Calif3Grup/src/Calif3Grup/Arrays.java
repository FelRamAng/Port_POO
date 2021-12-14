package Calif3Grup;

import java.util.Scanner;

public class Arrays
{
    int Tam;
    float Prom[];
    int Cont;
    float Dato;
    Scanner scanner = new Scanner(System.in);

    boolean Arreglo_Vacio()
    {
        if (Cont == -1) {
            System.out.println("El Grupo Está Vacío.");
            return true;
        } else {
            return false;
        }
    }

    boolean Arreglo_Lleno() {
        if (Cont == Tam - 1) {
            System.out.println("El Grupo Está Lleno.");
            return true;
        } else {
            return false;
        }
    }

    int Busqueda_Secuencial() {
        if (Arreglo_Vacio()) {
            return -1;
        } else {
            for (int i = 0; i <= Cont; i++) {
                if (Dato == Prom[i]) {
                    return i;
                }
            }
        }
        System.out.println("El Promedio: " + Dato + " No se Encuentra en el Grupo.");
        return -2;
    }

    void Crear_Arreglo() {
        int i = 0;
        System.out.println("Escriba el Total de Alumnos del Grupo: ");
        Tam = scanner.nextInt();
        float Aux[] = new float[Tam];
        for (i = 0; i < Tam; i++) {
            Aux[i] = 0;
        }
        Prom = Aux;
        Cont = -1;
    }

    void Insertar_Dato() {
        if (!Arreglo_Lleno()) {
            Cont++;
            Prom[Cont] = Dato;
        }
    }

    void Eliminar_Dato() {
        int Buscar = Busqueda_Secuencial();
        int i = 0;
        if (Buscar > -1) {
            for (i = Buscar; i <= Cont; i++) {
                Prom[i] = Prom[i + 1];
            }
            Cont--;
        }
    }

    void Modificar_Dato() {
        int Buscar = Busqueda_Secuencial();

        if (Buscar > -1) {
            System.out.println("Escriba el Nuevo Promedio a Insertar: ");
            Dato = scanner.nextFloat();
            Prom[Buscar] = Dato;
        }
    }

    void ListarGrupo() {
        for (int i = 0; i <= Cont; i++) {
            System.out.println("Alumno " + (i + 1) + ": " + Prom[i]);
        }
    }
    float SumaPromedios()
    {
        float suma=0.0f;
        int i = 0;
        for(i = 0; i <= Cont; i ++) {
            suma = suma + Prom[i];
        }
        return suma;
    }

    void Rango_Promedios()
    {
        System.out.println("");
        System.out.println("El Rango es: " + (Promedio_Mayor() - Promedio_Menor()));
        System.out.println("");
    }

    float Promedio_Mayor()
    {
        float mayor = 0.0f;
        for(int i = 0; i <= Cont; i++) {
            if(Prom[i] > mayor) {
                mayor = Prom[i];
            }
        }
        return mayor;
    }

    float Promedio_Menor()
    {
        float menor = 10000.0f;
        for(int i = 0; i <= Cont; i++) {
            if(Prom[i] < menor) {
                menor = Prom[i];
            }
        }
        return menor;
    }

    double ObtenerPromedio()
    {
        double prom = 0.0;
        prom = SumaPromedios() / Cont;
        return prom;
    }

    void Mostrar_Moda()
    {
        int i, j, frec;
        int FrecTemp, FrecModa = 0;
        float Moda1 = -1;

        for ( i = 0; i <= Cont; i++ ) {
            FrecTemp = 1;
            for( j = i + 1; j <= Cont; j++ ) {
                if(Prom[i] == Prom[j]) {
                    FrecTemp++;
                }
            }
            if(FrecTemp > FrecModa) {
                FrecModa = FrecTemp;
                Moda1 = Prom[i];
            }
        }
        System.out.println("Moda: "+ Moda1);
    }

    double ObtenerVarianza()
    {
        double Varianza = 0.0f, Rango = 0.0f;
        for (int i = 0; i < 10; i++) {
            Rango = Math.pow(Prom[i] - ObtenerPromedio(), 2f);
            Varianza = Varianza + Rango;
        }
        Varianza = Varianza / 10f;
        return Varianza;
    }

    double ObtenerDesviacion()
    {
        double desviA = Math.sqrt(ObtenerVarianza());
        return desviA;
    }

    void OrdenarGrupo(float[] A)
    {
        int i, j;
        float aux;
        for (i = 0; i < A.length - 1; i++) {
            for (j = 0; j < A.length - i - 1; j++) {
                if (A[j + 1] < A[j]) {
                    aux = A[j + 1];
                    A[j + 1] = A[j];
                    A[j] = aux;
                }
            }
        }
    }

    float ObtenerMediana()
    {
        OrdenarGrupo(Prom);
        float mediana;
        int mitad = Cont / 2;

        if (Cont % 2 == 0) {
            mediana = (Prom[mitad - 1] + Prom[mitad]) / 2;
        }
        else {
            mediana = Prom[mitad];
        }
        return mediana;
    }

    void Menu()
    {
        int op = 0;
        do
        {
            System.out.println("");
            System.out.println("1) Suma de los Promedios.           ");
            System.out.println("2) Rango de los Promedios.          ");
            System.out.println("3) Promedio Mayor                   ");
            System.out.println("4) Promedio Menor                   ");
            System.out.println("5) Mediana                          ");
            System.out.println("6) Moda                             ");
            System.out.println("7) Desviación Estandar              ");
            System.out.println("8) Varianza                         ");
            System.out.println("0) Regresar al Menú Anterior        ");
            System.out.println("");
            System.out.println("Seleccione una Opción a Realizar:   ");
            op = scanner.nextInt();

            switch(op)
            {
                case 1:
                {
                    System.out.println("La suma de Promedios es: " + SumaPromedios());
                    break;
                }
                case 2:
                {
                    Rango_Promedios();
                    break;
                }
                case 3:
                {
                    Promedio_Mayor();
                    System.out.println("El Promedio Mayor es: " + Promedio_Mayor());
                    break;
                }
                case 4:
                {
                    Promedio_Menor();
                    System.out.println("El Promedio Menor es: " + Promedio_Menor());
                    break;
                }
                case 5:
                {
                    System.out.println("Mediana: " + ObtenerMediana());
                    break;
                }
                case 6:
                {
                    Mostrar_Moda();
                    break;
                }
                case 7:
                {
                    System.out.println("Desviación: " + ObtenerDesviacion());
                    break;
                }
                case 8:
                {
                    System.out.println("Varianza: " + ObtenerVarianza());
                    break;
                }

            }
        }while (op > 0);
    }

    void Menu_Gestion() {
        int op = 0;
        do {
            System.out.println("");
            System.out.println("1) Crear Grupo");
            System.out.println("2) Ingresar Promedio");
            System.out.println("3) Eliminar Promedio");
            System.out.println("4) Modificar Promedio");
            System.out.println("5) Listar Promedios");
            System.out.println("0) Regresar al Menú Anterior");
            op = scanner.nextInt();

            switch (op) {
                case 1: {
                    Crear_Arreglo();
                    break;
                }
                case 2: {
                    if (Cont == Tam - 1) {
                        Arreglo_Lleno();
                    }
                    else {
                        System.out.println("Dato que Desea Insertar: ");
                        Dato = scanner.nextFloat();
                        Insertar_Dato();
                    }
                    break;
                }
                case 3: {
                    System.out.println("Dato que Desea Eliminar: ");
                    Dato = scanner.nextFloat();
                    Eliminar_Dato();
                    break;
                }
                case 4: {
                    System.out.println("Dato que Desea Modificar: ");
                    Dato = scanner.nextFloat();
                    Modificar_Dato();
                    break;
                }
                case 5: {
                    if (Cont == -1){
                        Arreglo_Vacio();
                    }
                    ListarGrupo();
                }
                break;
            }
        } while (op > 0);
    }
}