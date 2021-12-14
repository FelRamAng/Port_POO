import java.util.Scanner;

public class Prog_001_ValNum {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int[] Numeros = new int[10];
        int Opcion = 0, Resp = 0;
        for(int i = 0; i < 10; i = i + 1)
        {
            System.out.println("Escriba el Número " + (i + 1) + ": ");
            Numeros[i] = scanner.nextInt();
        }

        do
        {
            System.out.println("\n" +
                    "Menú de Opciones: \n" +
                    "1.- Lista de los Números Introducidos \n" +
                    "2.- Promedio de los Números Introducidos \n" +
                    "3.- Valor Mayor \n" +
                    "4.- Valor Menor \n" +
                    "5.- Lista de Valores Mayores al Promedio \n" +
                    "6.- Lista de Valores Menores al Promedio \n" +
                    "7.- Lista de Valores Mayores a un Número Dado \n" +
                    "8.- Lista de Valores Menores a un Número Dado \n" +
                    "9.- Salir \n" +
                    "\n" +
                    "Escriba una Opción:");

            Opcion = scanner.nextInt();
            switch(Opcion)
            {
                case 1:
                {
                    System.out.println("");
                    System.out.println("Lista de Números Introducidos:");
                    System.out.println("");
                    for(int i = 0; i < 10; i = i + 1)
                    {
                        System.out.println(Numeros[i]);
                    }
                }break;
                case 2:
                {
                    System.out.println("");
                    System.out.println("Promedio de Números");
                    System.out.println("");
                    int suma = 0;
                    double prom = 0.0f;

                    for(int i = 0; i < 10; i = i + 1)
                    {
                        suma = suma + Numeros[i];
                    }
                    prom = suma / 10;
                    System.out.println("Promedio: " + prom);
                }break;
                case 3:
                {
                    System.out.println("");
                    System.out.println("Número Mayor");
                    System.out.println("");
                    int Mayor = 0;
                    for(int i = 0; i < 10; i = i + 1)
                    {
                        if(Numeros[i] >= Mayor)
                        {
                            Mayor = Numeros[i];
                        }
                    }
                    System.out.println("Número Mayor: " + Mayor);
                }break;
                case 4:
                {
                    System.out.println("");
                    System.out.println("Número Menor");
                    System.out.println("");
                    int Menor = 10000000;
                    for(int i = 0; i < 10; i = i + 1)
                    {
                        if(Numeros[i] < Menor)
                        {
                            Menor = Numeros[i];
                        }
                    }
                    System.out.println("Número Menor: " + Menor);
                }break;
                case 5:
                {
                    System.out.println("");
                    System.out.println("Números Mayores al Promedio");
                    System.out.println("");
                    int suma = 0;
                    double prom = 0.0f;

                    for(int i = 0; i < 10; i = i + 1)
                    {
                        suma = suma + Numeros[i];
                    }
                    prom = suma / 10;

                    for(int i = 0; i < 10; i = i + 1)
                    {
                        if(Numeros[i] >= prom)
                        {
                            System.out.println(Numeros[i]);
                        }
                    }
                }break;
                case 6:
                {
                    System.out.println("");
                    System.out.println("Números Menores al Promedio");
                    System.out.println("");
                    int suma = 0;
                    double prom = 0.0f;

                    for(int i = 0; i < 10; i = i + 1)
                    {
                        suma = suma + Numeros[i];
                    }
                    prom = suma / 10;

                    for(int i = 0; i < 10; i = i + 1)
                    {
                        if(Numeros[i] < prom)
                        {
                            System.out.println(Numeros[i]);
                        }
                    }
                }break;
                case 7:
                {
                    int nNumero=0;
                    System.out.println("Escriba el Nuevo Número: ");
                    nNumero = scanner.nextInt();
                    System.out.println("");
                    System.out.println("Números Mayores al Escrito");
                    System.out.println("");

                    for(int i = 0; i < 10; i = i + 1)
                    {
                        if(Numeros[i] > nNumero)
                        {
                            System.out.println(Numeros[i]);
                        }
                    }
                }break;
                case 8:
                {
                    int nNumero=0;
                    System.out.println("Escriba el Nuevo Número: ");
                    nNumero = scanner.nextInt();
                    System.out.println("");
                    System.out.println("Números Menores al Escrito");
                    System.out.println("");
                    for(int i = 0; i < 10; i = i + 1)
                    {
                        if(Numeros[i] < nNumero)
                        {
                            System.out.println(Numeros[i]);
                        }
                    }
                }break;
                default:
                {
                    System.exit(0);
                }
            }
        }while(Resp < 9);
    }
}
