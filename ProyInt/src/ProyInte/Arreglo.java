package ProyInte;

import java.util.Scanner;

public class Arreglo {

    int Tam;
    int NumCuent[];
    String NombCuent[];
    String DirCuent[];
    String TelCuent[];
    float DepCuent[];
    float RetCuent[];
    float SaldCuent[];
    int Cont;
    int Dato;
    Scanner scanner = new Scanner(System.in);
    Scanner scanner1 = new Scanner(System.in);
    Scanner scanner2 = new Scanner(System.in);
    Scanner scanner3 = new Scanner(System.in);

    boolean Arreglo_Vacio() {
        if (Cont == -1) {
            System.out.println("No Hay Cuentas Creadas Actualmente.");
            return true;
        } else {
            return false;
        }
    }

    boolean Arreglo_Lleno() {
        if (Cont == Tam - 1) {
            System.out.println("Se excedió el Número de Cuentas Creadas.");
            return true;
        } else {
            return false;
        }
    }

    int Busqueda_Secuencial() {
        if (Arreglo_Vacio()) {
            return -1;
        } else {
            for (int i = 0; i <= Cont; i ++) {
                if (Dato == NumCuent[i]) {
                    return i;
                }
            }
        }
        System.out.println("La Cuenta: " + Dato + " No se Encuentra.");
        return -2;
    }

    void Crear_Arreglo() {
        int i = 0;
        System.out.println("Escriba el Total de Cuenta Habientes: ");
        Tam = scanner.nextInt();
        int Aux[] = new int[Tam];
        String Aux1[] = new String[Tam];
        String Aux2[] = new String[Tam];
        String Aux3[] = new String[Tam];
        float Aux4[] = new float[Tam];
        float Aux5[] = new float[Tam];
        float Aux6[] = new float[Tam];

        for (i = 0; i < Tam; i++) {
            Aux[i] = 0;
            Aux1[i] = "";
            Aux2[i] = "";
            Aux3[i] = "";
            Aux4[i] = 0;
            Aux5[i] = 0;
            Aux6[i] = 0;
        }
        NumCuent = Aux;
        NombCuent = Aux1;
        DirCuent = Aux2;
        TelCuent = Aux3;
        DepCuent = Aux4;
        RetCuent = Aux5;
        SaldCuent = Aux6;
        Cont = -1;
    }

    void Insertar_Dato() {
        if (!Arreglo_Lleno()) {
            if (Repetido()){
                System.out.println("La Cuenta que Desea Agregar ya Existe");
            }
            else {
                Cont++;
                NumCuent[Cont] = Dato;
                System.out.println("Nombre del Cuenta Habiente:");
                NombCuent[Cont] = scanner1.nextLine();
                System.out.println("Dirección del Cuenta Habiente:");
                DirCuent[Cont] = scanner2.nextLine();
                System.out.println("Telefono del Cuenta Habiente:");
                TelCuent[Cont] = scanner3.nextLine();
            }
        }
    }

    void Eliminar_Dato() {
        int Buscar = Busqueda_Secuencial();
        int i = 0;

        if (SaldCuent[Buscar] == 0)
        {
            if (Buscar > -1) {
                for (i = Buscar; i < Cont; i++) {
                    NumCuent[i] = NumCuent[i + 1];
                    NombCuent[i] = NombCuent[i + 1];
                    DirCuent[i] = DirCuent[i + 1];
                    TelCuent[i] = TelCuent[i + 1];
                    DepCuent[i] = DepCuent[i + 1];
                    RetCuent[i] = RetCuent[i + 1];
                    SaldCuent[i] = SaldCuent[i + 1];
                }
                Cont--;
            }
        }
        else {
            System.out.println("No es Posible Eliminar Cuentas Con Saldo.");
        }
    }

    void Modificar_Dato() {
        int Buscar = Busqueda_Secuencial();

        if(Buscar > -1)
        {
            int op = 0;

            do
            {
                DespCuent(Buscar);
                System.out.println("Dato a Modificar: ");
                System.out.println("1.- Numero de Cuenta.");
                System.out.println("2.- Nombre del Cuenta Habiente.");
                System.out.println("3.- Direccion del Cuenta Habiente.");
                System.out.println("4.- Telefono del Cuenta Habiente.");
                System.out.println("5.- Salir.");
                System.out.println(" ¿Qué dato desea modificar?");
                System.out.println(" 1 // 2 // 3 // 4");
                op = scanner.nextInt();

                switch(op)
                {
                    case 1:
                    {
                        System.out.println("Escriba el Nuevo Numero de Cuenta:");
                        Dato = scanner.nextInt();
                        if (Repetido()){

                            System.out.println("La Cuenta que Desea Modificar ya Existe");
                        }
                        else {
                            NumCuent[Buscar] = Dato;
                        }
                        break;
                    }
                    case 2:
                    {
                        System.out.println("Nombre Nuevo del Cuenta Habiente:");
                        NombCuent[Buscar] = scanner1.nextLine();
                        break;
                    }
                    case 3:
                    {
                        System.out.println("Dirección Nueva del Cuenta Habiente:");
                        DirCuent[Buscar] = scanner2.nextLine();
                        break;
                    }
                    case 4:
                    {
                        System.out.println("Telefono Nuevo del Cuenta Habiente");
                        TelCuent[Buscar] = scanner3.nextLine();
                        break;
                    }
                }
            }while(op <= 4);
        }
    }

    void ListarCuent() {
        for (int i = 0; i <= Cont; i++) {
            System.out.println("=======================================================================================");
            System.out.println("Matricula del Cuenta Habiente    " + (i + 1) + ": " + NumCuent[i]);
            System.out.println("Nombre del Cuenta Habiente       " + (i + 1) + ": " + NombCuent[i]);
            System.out.println("Direccion del Cuenta Habiente    " + (i + 1) + ": " + DirCuent[i]);
            System.out.println("Telefono del Cuenta Habiente     " + (i + 1) + ": " + TelCuent[i]);
            System.out.println("Depositos del Cuenta Habiente    " + (i + 1) + ": " + DepCuent[i]);
            System.out.println("Retiros del Cuenta Habiente      " + (i + 1) + ": " + RetCuent[i]);
            System.out.println("Saldo del Cuenta Habiente        " + (i + 1) + ": " + SaldCuent[i]);
        }
    }

    void DespCuent(int i){
        System.out.println("=======================================================================================");
        System.out.println("Matricula del Cuenta Habiente    " + (i + 1) + ": " + NumCuent[i]);
        System.out.println("Nombre del Cuenta Habiente       " + (i + 1) + ": " + NombCuent[i]);
        System.out.println("Direccion del Cuenta Habiente    " + (i + 1) + ": " + DirCuent[i]);
        System.out.println("Telefono del Cuenta Habiente     " + (i + 1) + ": " + TelCuent[i]);
        System.out.println("Depositos del Cuenta Habiente    " + (i + 1) + ": " + DepCuent[i]);
        System.out.println("Retiros del Cuenta Habiente      " + (i + 1) + ": " + RetCuent[i]);
        System.out.println("Saldo del Cuenta Habiente        " + (i + 1) + ": " + SaldCuent[i]);
    }

    boolean Repetido() {
        boolean DatoRepetido = false;
        int i = 0;
        for (i = 0; i <= Cont; i++) {
            if (Dato == NumCuent[i]) {
                DatoRepetido = true;
            }
        }
        return DatoRepetido;
    }

    void Transacciones() {
        int Buscar = Busqueda_Secuencial();

        if (Buscar > -1){
            int op = 0;
            do {
                DespCuent(Buscar);
                System.out.println("");
                System.out.println("Transacción que Desea Realizar:");
                System.out.println("1) Deposito.");
                System.out.println("2) Retiro.");
                System.out.println("3) Consulta de Saldo.");
                System.out.println("4) Pago de Servicios.");
                System.out.println("5) Regresar al Menú Anterior");
                System.out.println("1 // 2 // 3 // 4 // 5");
                op = scanner.nextInt();
                switch (op) {
                    case 1: {
                        float Valor = 0;
                        System.out.println("");
                        System.out.println("¿Cuanto Desea Depositar?");
                        Valor = scanner.nextFloat();

                        if (Valor < 0)
                        {
                            System.out.println("No es Posible Depositar Montos Menores a 0.");
                        }
                        else {
                            SaldCuent[Buscar] = SaldCuent[Buscar] + Valor;
                            DepCuent[Buscar] = DepCuent[Buscar] + Valor;
                        }
                        break;
                    }
                    case 2: {
                        float Valor = 0;
                        System.out.println("");
                        System.out.println("¿Cuanto Desea Retirar?");
                        Valor = scanner.nextFloat();

                        if (Valor < 0)
                        {
                            System.out.println("No es Posible Retirar Montos Menores a 0.");
                        }
                        else if (SaldCuent[Buscar] < Valor) {
                            System.out.println("Saldo Insuficiente.");
                        }
                        else {
                            RetCuent[Buscar] = RetCuent[Buscar] + Valor;
                            SaldCuent[Buscar] = SaldCuent[Buscar] - Valor;
                            System.out.println("");
                            System.out.println("Saldo Restante: $" + SaldCuent[Buscar]);
                        }
                        break;
                    }
                    case 3: {
                        System.out.println("Cuenta con saldo de: $ " + SaldCuent[Buscar]);
                        break;
                    }
                    case 4: {
                        float Valor = 0;
                        int op1 = 0;
                        do {
                            System.out.println("");
                            System.out.println("¿Que desea Pagar?");
                            System.out.println("1) Luz");
                            System.out.println("2) Agua");
                            System.out.println("3) Gas");
                            System.out.println("4) Telefonía / Cable / Internet");
                            System.out.println("5) Salir");
                            System.out.println("1 // 2 // 3 // 4 // 5 //");
                            op1 = scanner.nextInt();
                            switch (op1) {
                                case 1:
                                case 2:
                                case 3:
                                case 4: {
                                    System.out.println("¿Cuanto Desea Pagar?");
                                    Valor = scanner.nextFloat();

                                    if (Valor < 0)
                                    {
                                        System.out.println("No es Posible Pagar Montos Menores a 0.");
                                    }
                                    else if (SaldCuent[Buscar] < Valor) {
                                        System.out.println("Saldo Insuficiente.");
                                    }
                                    else {
                                        RetCuent[Buscar] = RetCuent[Buscar] + Valor;
                                        SaldCuent[Buscar] = SaldCuent[Buscar] - Valor;
                                    }
                                    break;
                                }
                            }
                        } while (op1 <= 4);
                        break;
                    }
                }
            } while (op <=4);
        }
    }

    void Menu_Gestion() {
        int op = 0;
        do {
            System.out.println("");
            System.out.println("1) Crear Grupo");
            System.out.println("2) Ingresar Datos");
            System.out.println("3) Eliminar Datos");
            System.out.println("4) Modificar Datos");
            System.out.println("5) Listar Datos");
            System.out.println("6) Realizar una Transacción");
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
                        System.out.println("Número de Cuenta que Desea Insertar: ");
                        Dato = scanner.nextInt();
                        Insertar_Dato();
                    }
                    break;
                }
                case 3: {
                    ListarCuent();
                    System.out.println("Datos que Desea Eliminar: ");
                    Dato = scanner.nextInt();
                    Eliminar_Dato();
                    break;
                }
                case 4: {
                    System.out.println("Número de Cuenta que Desea Modificar: ");
                    Dato = scanner.nextInt();
                    Modificar_Dato();
                    break;
                }
                case 5: {
                    if (Cont == -1) {
                        Arreglo_Vacio();
                    }
                    ListarCuent();
                    break;
                }
                case 6: {
                    System.out.println("Numero de Cuenta del Cuenta Habiente:");
                    Dato = scanner.nextInt();
                    Transacciones();
                    break;
                }
            }
        } while (op > 0);
    }
}