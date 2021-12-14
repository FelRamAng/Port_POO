import java.util.Scanner;

public class Prog_002_ArreglosAByC {
    public static double getPromedio(int[] Array)
    {
        double mean = 0.0f;
        int sum = 0;
        for (int i = 0; i < Array.length; i = i + 1)
        {
            sum += Array[i];
        }
        mean = sum / Array.length;
        return mean;
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] ArregloA = new int[10];
        int[] ArregloB = new int[10];
        int[] ArregloC = new int[10];
        double DesvA = 0.0, DesvB = 0.0, DesvC = 0.0;
        int Opcion = 0;


        for (int i = 0; i < 10; i = i + 1)
        {
            System.out.println("Escriba el Valor " + (i + 1) + " del Arreglo A");
            ArregloA[i] = scanner.nextInt();
        }
        for (int i = 0; i < 10; i = i + 1)
        {
            System.out.println("Escriba el Valor" + (i + 1) + " del Arreglo B");
            ArregloB[i] = scanner.nextInt();
        }

        while (Opcion != 10)
        {
            System.out.println("Escriba una Opcion:");
            Opcion = scanner.nextInt();

            if (Opcion == 1)
            {
                for (int i = 0; i < 10; i = i + 1)
                {
                    ArregloC[i] = ArregloA[i] + ArregloB[i];
                }
                for (int i = 0; i < 10; i = i + 1)
                {
                    System.out.println(ArregloC[i]);
                }
            }
            else if (Opcion == 2)
            {
                double Prom1 = 0.0, Prom2 = 0.0;
                int Suma1 = 0, Suma2 = 0;

                for (int i = 0; i < 10; i = i + 1)
                {
                    Suma1 += ArregloA[i];
                    Suma2 += ArregloB[i];
                }
                Prom1 = Suma1 / 10;
                Prom2 = Suma2 / 10;
                System.out.println("Promedio del Arreglo 1: " + Prom1);
                System.out.println("Promedio del Arreglo 2: " + Prom2);
            }
            else if (Opcion == 3)
            {
                int Mayor1 = 0, Mayor2 = 0, Mayor = 0;

                for (int i = 0; i < 10; i = i + 1)
                {
                    if (ArregloA[i] > Mayor1)
                    {
                        Mayor1 = ArregloA[i];
                    }
                    if (ArregloB[i] > Mayor2)
                    {
                        Mayor2 = ArregloB[i];
                    }
                    if (Mayor1 > Mayor2)
                    {
                        Mayor = Mayor2;
                    }
                    else
                    {
                        Mayor = Mayor2;
                    }
                }
                System.out.println("Mayor del Arreglo A: " + Mayor1);
                System.out.println("Mayor del Arreglo B: " + Mayor2);
                System.out.println("Mayor de Ambos: " + Mayor);
            }
            else if(Opcion == 4)
            {
                int Menor1=1000, Menor2=1000, Menor=1000;

                for(int i = 0; i < 10; i = i + 1)
                {
                    if(ArregloA[i] < Menor1)
                    {
                        Menor1 = ArregloA[i];
                    }
                    if(ArregloB[i] < Menor2)
                    {
                        Menor2 = ArregloB[i];
                    }
                    if(Menor1 < Menor2)
                    {
                        Menor = Menor1;
                    }
                    else
                    {
                        Menor = Menor2;
                    }
                }
                System.out.println("Menor del Arreglo A: " + Menor1);
                System.out.println("Menor del Arreglo B: " + Menor2);
                System.out.println("Menor de Ambos: " + Menor);
            }
            else if(Opcion == 5)
            {
                System.out.println("Lista del Arreglo A");
                for (int i = 0; i < 10; i = i + 1)
                {
                    System.out.println(ArregloA[i]);
                }
                System.out.println("Lista del Arreglo B");
                for (int i = 0; i < 10; i = i + 1)
                {
                    System.out.println(ArregloB[i]);
                }
                System.out.println("Lista del Arreglo C");
                for (int i = 0; i < 10; i = i + 1)
                {
                    System.out.println(ArregloC[i]);
                }
            }
            else if(Opcion == 6)
            {
                System.out.println("Mayores al Promedio del Arreglo A");
                for (int i = 0; i < 10; i = i + 1)
                {
                    if(ArregloA[i] > getPromedio(ArregloA))
                    {
                        System.out.println(ArregloA[i]);
                    }
                }
                System.out.println("Mayores al Promedio del Arreglo B");
                for (int i = 0; i < 10; i = i + 1)
                {
                    if(ArregloB[i] > getPromedio(ArregloB))
                    {
                        System.out.println(ArregloB[i]);
                    }
                }
            }
            else if(Opcion == 7)
            {
                System.out.println("Menores al Promedio del arreglo A");
                for (int i = 0; i < 10; i = i + 1)
                {
                    if(ArregloA[i] <  getPromedio(ArregloA))
                    {
                        System.out.println(ArregloA[i]);
                    }
                }
                System.out.println("Menores al Promedio del Arreglo B");
                for (int i = 0; i < 10; i = i + 1)
                {
                    if(ArregloB[i] < getPromedio(ArregloB))
                    {
                        System.out.println(ArregloB[i]);
                    }
                }
            }
            else if(Opcion == 8)
            {
                double varianza = 0.0f;
                System.out.println("Varianza del Arreglo A");
                for (int i = 0; i < 10; i = i + 1)
                {
                    double rango = Math.pow(ArregloA[i] - getPromedio(ArregloA), 2f);
                    varianza = varianza + rango;
                }
                varianza = varianza / 10f;
                System.out.println("Varianza: " + varianza);
                DesvA = Math.sqrt(varianza);
                System.out.println("Varianza del Arreglo B");
                for (int i = 0; i < 10; i++)
                {
                    double rango = Math.pow(ArregloB[i] - getPromedio(ArregloB), 2f);
                    varianza = varianza + rango;
                }
                varianza = varianza / 10f;
                System.out.println("Varianza: " + varianza);
                DesvB = Math.sqrt(varianza);
                System.out.println("Varianza del arreglo C");
                for (int i = 0; i < 10; i = i + 1)
                {
                    double rango = Math.pow(ArregloC[i] - getPromedio(ArregloC), 2f);
                    varianza = varianza + rango;
                }
                varianza = varianza / 10f;
                System.out.println("Varianza: " + varianza);
                DesvC = Math.sqrt(varianza);
            }
            else if(Opcion == 9)
            {
                System.out.println("Desviación Estándar del Arreglo A");
                System.out.println("Desviación Estándar: " + DesvA);
                System.out.println("Desviación Estándar del Arreglo B");
                System.out.println("Desviación Estándar: " + DesvB);
                System.out.println("Desviación Estándar del Arreglo C");
                System.out.println("Desviación Estándar: " + DesvC);
            }
            else
            {
                System.exit(0);
            }
        }
    }
}