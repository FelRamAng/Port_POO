package CompSeg;

import javax.swing.*;
import java.util.Scanner;

public class Arreglo {

    int NumAgent[];
    String NombAgent[];
    String DirAgent[];
    String TelAgent[];
    float Ventas[][];
    float Salario[];
    int Dato;

    int Cont;

    Scanner scanner = new Scanner(System.in);
    Scanner scanner1 = new Scanner(System.in);
    Scanner scanner2 = new Scanner(System.in);
    Scanner scanner3 = new Scanner(System.in);
    Scanner scanner4 = new Scanner(System.in);

    void Crear_Arreglo()
    {
        int[] Aux1 = new int[10];
        String[] Aux2 = new String[10];
        String[] Aux3 = new String[10];
        String[] Aux4 = new String[10];
        float[][] Aux5 = new float[10][12];
        float[] Aux6 = new float[10];

        for(int i = 0; i < 10; i++)
        {
            Aux1[i] = 0;
            Aux2[i] = "";
            Aux3[i] = "";
            Aux4[i] = "";
            Aux6[i] = 0.0f;
            for(int j = 0; j < 12; j++)
            {
                Aux5[i][j] = 0.0f;
            }
        }
        NumAgent = Aux1;
        NombAgent = Aux2;
        DirAgent = Aux3;
        TelAgent = Aux4;
        Ventas = Aux5;
        Salario = Aux6;
        Cont = -1;

        Menu_Gestion();
    }

    boolean Arreglo_Vacio() {
        if (Cont == -1) {
            return true;
        } else {
            return false;
        }
    }

    void Insertar_Dato()
    {
        if (!Arreglo_Vacio()) {

        }
        else {
            Cont++;
            System.out.println("");
            System.out.println("Numero del Agente de Ventas:");
            NumAgent[Cont] = scanner.nextInt();
            System.out.println("Nombre del Agente de Ventas:");
            NombAgent[Cont] = scanner1.nextLine();
            System.out.println("Salario del Agente de Ventas:");
            Salario[Cont] = scanner.nextFloat();
            System.out.println("Dirección del Agente de Ventas:");
            DirAgent[Cont] = scanner1.nextLine();
            System.out.println("Telefono del Agente de Ventas:");
            TelAgent[Cont] = scanner2.nextLine();
            System.out.println("");

            for(int i = 0; i < 12; i++)
            {
                System.out.println("Venta del Agente del Mes " + (i+1) + ": ");
                Ventas[Cont][i] += scanner.nextFloat();
            }
        }
    }

    float TotVent()
    {
        float ventas = 0.0f;

        for(int i = 0; i <= Cont; i++)
        {
            for(int j = 0; j < 12; j++)
            {
                ventas += Ventas[i][j];
            }
        }

        return ventas;
    }

    float PromVent()
    {
        float prom = 0.0f;
        prom = TotVent() / 12;
        return prom;
    }

    void VentMes()
    {
        System.out.println(" Ingrese el número de Mes que desee: ");
        int Mes = scanner.nextInt();

        System.out.println("El total de Ventas del Mes " + Mes + "  es: $" + TotVentMes(Mes));
    }

    float TotVentMes(int mes)
    {
        float VentasMes = 0.0f;

        for(int i = 0; i <= Cont; i++)
        {
            VentasMes += Ventas[i][mes-1];
        }
        return VentasMes;
    }

    int Busqueda_Secuencial(int Agente)
    {
        if(Cont == -1)
        {
            return -1;
        }
        else
        {
            for(int i = 0; i <= Cont; i++)
            {
                if(Agente == NumAgent[i])
                {
                    return i;
                }
            }
        }
        return -2;
    }

    boolean Repetido() {
        boolean DatoRepetido = false;
        int i = 0;
        for (i = 0; i <= Cont; i++) {
            if (Dato == NumAgent[i]) {
                DatoRepetido = true;
            }
        }
        return DatoRepetido;
    }

    void Modificar_Dato() {
        int Buscar = Busqueda_Secuencial(Dato);

        if(Buscar > -1)
        {
            int op = 0;

            do
            {
                DespCuent(Buscar);
                System.out.println("Dato a Modificar: ");
                System.out.println("1.- Numero del Agente de Ventas.");
                System.out.println("2.- Nombre del Agente de Ventas.");
                System.out.println("3.- Dirección del Agente de Ventas.");
                System.out.println("4.- Telefono del Agente de Ventas.");
                System.out.println("5.- Valor de Venta");
                System.out.println("6.- Salir");
                System.out.println(" ¿Qué dato desea modificar?");
                System.out.println(" 1 // 2 // 3 // 4 // 5");
                op = scanner.nextInt();

                switch(op)
                {
                    case 1:
                    {
                        System.out.println("Escriba la Nueva Matricula:");
                        Dato = scanner.nextInt();
                        if (Repetido()){
                            System.out.println("La Matricula que Desea Modificar ya Existe");
                        }
                        else {
                            NumAgent[Buscar] = Dato;
                        }
                    }
                    case 2:
                    {
                        System.out.println("Nombre del Agente de Ventas:");
                        NombAgent[Buscar] = scanner3.nextLine();
                        break;
                    }
                    case 3:
                    {
                        System.out.println("Dirección del Agente de Ventas: ");
                        DirAgent[Buscar] = scanner1.nextLine();
                        break;
                    }
                    case 4:
                    {
                        System.out.println("Telefono del Agente de Ventas: ");
                        TelAgent[Buscar] = scanner2.nextLine();
                        break;
                    }
                    case 5:
                    {
                        float DatoMod = 0;

                        System.out.println("Valor que Desea Modificar: ");
                        DatoMod = scanner4.nextFloat();

                        for (int i = 0; i < 12; i ++)
                        {
                            if (Ventas[Buscar][i] == DatoMod)
                            {
                                System.out.println("Nuevo Valor de Venta:");
                                Ventas[Buscar][i] = scanner4.nextFloat();
                            }
                            else
                            {
                                System.out.println("No se Encontró el Valor de Venta.");
                            }
                        }
                        break;
                    }
                }
            }while(op <= 5);
        }
    }

    float VentAgente(int Agente)
    {
        float Suma = 0.0f;
        for(int i = 0; i < 12; i++)
        {
            Suma += Ventas[Busqueda_Secuencial(Agente)][i];
        }
        return Suma;
    }

    float PromVentMes(int Mes)
    {
        float ventas = 0.0f;
        for(int i = 0; i <= Cont; i++)
        {
            ventas += Ventas[i][Mes-1];
        }

        ventas = ventas / (Cont+1);

        return ventas;
    }

    int ObtMayor()
    {
        int Mayor = 0;
        float mayor = 0.0f;

        for(int i = 0; i < Cont; i++)
        {
            if(VentAgente(i) > mayor)
            {
                Mayor = i;
            }
        }

        return Mayor;
    }

    int ObtMenor()
    {
        int Menor = 0;
        float menor = 0.0f;
        menor = VentAgente(0);
        for(int i = 0; i < Cont; i++)
        {
            if(menor < VentAgente(i))
            {
                Menor = i;
            }
        }
        return Menor;
    }

    void ListarAgent() {
        for (int i = 0; i <= Cont; i++) {
            System.out.println("==============================================================================");
            System.out.println("Número del Agente de Ventas     " + (i + 1) + ": " + NumAgent[i]);
            System.out.println("Nombre del Agente de Ventas     " + (i + 1) + ": " + NombAgent[i]);
            System.out.println("Direccion del Agente de Ventas  " + (i + 1) + ": " + DirAgent[i]);
            System.out.println("Telefono del Agente de Ventas   " + (i + 1) + ": " + TelAgent[i]);
            System.out.println("Total de Ventas Agente          " + (i + 1) + ": " + VentAgente(i));
        }
    }

    void DespCuent(int i){
        System.out.println("");
        System.out.println("Número del Agente de Ventas     " + (i + 1) + ": " + NumAgent[i]);
        System.out.println("Nombre del Agente de Ventas     " + (i + 1) + ": " + NombAgent[i]);
        System.out.println("Direccion del Agente de Ventas  " + (i + 1) + ": " + DirAgent[i]);
        System.out.println("Telefono del Agente de Ventas   " + (i + 1) + ": " + TelAgent[i]);
        System.out.println("Total de Ventas Del Agente      " + (i + 1) + ": " + VentAgente(i));
    }

    void Menu_Gestion()
    {
        int op = 0;
        do
        {
            System.out.println("");
            System.out.println("=========================================");
            System.out.println("    0)  Ingresar Agente");
            System.out.println("    1)  Modificar Datos");
            System.out.println("    2)  Total de Ventas Anual");
            System.out.println("    3)  Promedio de Ventas Anual");
            System.out.println("    4)  Total Ventas por Mes");
            System.out.println("    5)  Ventas por Agente.");
            System.out.println("    6)  Promedio Ventas por Mes");
            System.out.println("    7)  Promedio Ventas por Agente.");
            System.out.println("    8)  Mejor Vendedor del Año");
            System.out.println("    9)  Vendedor más bajo");
            System.out.println("    10) Vendedores Arriba del Promedio");
            System.out.println("    11) Mensaje al Docente.");
            System.out.println("    12) Listar Agentes.");
            op = scanner.nextInt();

            switch(op)
            {
                case 0:
                {
                    if (!Arreglo_Vacio())
                    {
                        Crear_Arreglo();
                    }
                    Insertar_Dato();
                    break;
                }
                case 1:
                {
                    System.out.println("Numero de Agente que Desea Modificar:");
                    Dato = scanner3.nextInt();
                    Modificar_Dato();
                    break;
                }
                case 2:
                {
                    System.out.println("Total de Ventas Anual: $" + TotVent());
                    break;
                }
                case 3:
                {
                    System.out.println("Promedio de Ventas Anual: $" + PromVent());
                    break;
                }
                case 4:
                {
                    VentMes();
                    break;
                }
                case 5:
                {
                    System.out.println(" Ingrese el Número del Agente que desea consultar: ");
                    int agent = scanner.nextInt();


                    if(Busqueda_Secuencial(agent - 1) >= 0)
                    {
                        System.out.println("Ventas del Agente de Ventas " + NombAgent[Busqueda_Secuencial(agent-1)]);
                        System.out.println("Numero del Agente de Ventas: " + agent);
                        System.out.println("Direccion del Agente de Ventas:" + DirAgent[Busqueda_Secuencial(agent - 1)]);
                        System.out.println("Salario del Agente de Ventas: $" + Salario[Busqueda_Secuencial(agent-1)]);
                        System.out.println("Ventas: $" + VentAgente(agent-1));
                    }
                    else
                    {
                        System.out.println("El Agente de Ventas no Está Registrado.");
                    }
                    break;
                }
                case 6:
                {
                    System.out.println("Numero del Mes que Quiere Consultar:");
                    int mes = scanner.nextInt();

                    System.out.println("");
                    System.out.println("Promedio de Ventas del Mes " + mes + " " + PromVentMes(mes));
                    System.out.println("");
                    break;
                }
                case 7:
                {
                    System.out.println("Número de Agente de Ventas que Quiere Consultar:");
                    int agent = scanner.nextInt();
                    if(Busqueda_Secuencial(agent - 1) >= 0)
                    {
                        System.out.println("");
                        System.out.println("Promedio de Ventas del Agente de Ventas " + agent + " " + (VentAgente(Busqueda_Secuencial(agent - 1)) / 12));
                        System.out.println("");
                    }
                    else
                    {
                        System.out.println("El Agente de Ventas no Está Registrado.");
                    }
                    break;
                }
                case 8:
                {
                    System.out.println("");
                    System.out.println("========== FELICIDADES ==========");
                    DespCuent(ObtMayor());
                    break;
                }
                case 9:
                {
                    System.out.println("");
                    DespCuent(ObtMenor());
                    System.out.println("    NO TE RINDAS, DEBES SEGUIR ESFORZANDOTE     ");
                    System.out.println("");
                    break;
                }
                case 10:
                {
                    for(int i = 0; i <= Cont; i++)
                    {
                        if(VentAgente(i)/12 > PromVent())
                        {
                            System.out.println("=========================================");
                            System.out.println("Empleado: " + NombAgent[i] + " | Promedio: " + (VentAgente(Busqueda_Secuencial(i)) / 12));
                        }
                    }
                    break;
                }
                case 11:
                {
                    JOptionPane.showInputDialog(null, "Hola profe, muchas gracias por tomarse el tiempo, \n" +
                                                "esfuerzo y dedicacion para enseñarnos y darnos esta \n" +
                                                "educacion de calidad que tanto necesitamos nosotros.");
                    break;
                }
                case 12:
                {
                    ListarAgent();
                }
                break;
            }
        }while(op > 0);
    }
}
