package plantillaarreglo;

import java.util.Scanner;

public class Array {

    int Tam;
    int Matricula[];
    String NomAlum[];
    float Parcial1[];
    float Parcial2[];
    int Cont;
    int Dato;
    Scanner scanner = new Scanner(System.in);

    boolean Arreglo_Vacio() {
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
            for (int i = 0; i <= Cont; i ++) {
                if (Dato == Matricula[i]) {
                    return i;
                }
            }
        }
        System.out.println("La Matricula: " + Dato + " No se Encuentra en el Grupo.");
        return -2;
    }

    void Crear_Arreglo() {
        int i = 0;
        System.out.println("Escriba el Total de Alumnos del Grupo: ");
        Tam = scanner.nextInt();
        int Aux[] = new int[Tam];
        String Aux1[] = new String[Tam];
        float Aux2[] = new float[Tam];
        float Aux3[] = new float[Tam];

        for (i = 0; i < Tam; i++) {
            Aux[i] = 0;
            Aux1[i] = "";
            Aux2[i] = 0;
            Aux3[i] = 0;
        }
        Matricula = Aux;
        NomAlum = Aux1;
        Parcial1 = Aux2;
        Parcial2 = Aux3;
        Cont = -1;
    }

    void Insertar_Dato() {
        if (!Arreglo_Lleno()) {
            if (Repetido()){
                System.out.println("La Matricula que Desea Agregar ya Existe");
            }
            else {
                Cont++;
                Matricula[Cont] = Dato;
                System.out.println("Nombre del Alumno:");
                NomAlum[Cont] = scanner.next();
                System.out.println("Calificación Parcial 1:");
                Parcial1[Cont] = scanner.nextFloat();
                System.out.println("Calificacion Parcial 2:");
                Parcial2[Cont] = scanner.nextFloat();
            }
        }
    }

    void Eliminar_Dato() {
        int Buscar = Busqueda_Secuencial();
        int i = 0;
        if (Buscar > -1) {
            for (i = Buscar; i < Cont; i++) {
                Matricula[i] = Matricula[i + 1];
                NomAlum[i] = NomAlum[i + 1];
                Parcial1[i] = Parcial1[i + 1];
                Parcial2[i] = Parcial2[i + 1];
            }
            Cont--;
        }
    }

    void Modificar_Dato() {
        int Buscar = Busqueda_Secuencial();

        if(Buscar > -1)
        {
            int op = 0;

            do
            {
                DespAlumn(Buscar);
                System.out.println("Dato a Modificar: ");
                System.out.println("1.- Matricula.");
                System.out.println("2.- Nombre del Aumno.");
                System.out.println("3.- Calificación Parcial.");
                System.out.println("4.- Calificación Parcial.");
                System.out.println(" ¿Qué dato desea modificar?");
                System.out.println(" 1 // 2 // 3 // 4");
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
                            Matricula[Buscar] = Dato;
                        }
                    }
                    case 2:
                    {
                        System.out.println("Nombre del Alumno: ");
                        NomAlum[Buscar] = scanner.next();
                        break;
                    }
                    case 3:
                    {
                        System.out.println("Calificación Parcial 1: ");
                        Parcial1[Buscar] = scanner.nextFloat();
                        break;
                    }
                    case 4:
                    {
                        System.out.println("Calificación Parcial 2: ");
                        Parcial2[Buscar] = scanner.nextFloat();
                        break;
                    }
                }
            }while(op <= 3);
        }
    }

    void ListarGrupo() {
        for (int i = 0; i <= Cont; i++) {
            System.out.println("======================================================================");
            System.out.println("Matricula del Alumno    " + (i + 1) + ": " + Matricula[i]);
            System.out.println("Nombre del Alumno       " + (i + 1) + ": " + NomAlum[i]);
            System.out.println("Calificación Parcial 1  " + (i + 1) + ": " + Parcial1[i]);
            System.out.println("Calificación Parcial 2  " + (i + 1) + ": " + Parcial2[i]);
            System.out.println("Promedio del Alumno     " + (i + 1) + ": " + ((Parcial1[i] + Parcial2[i])/ 2));
        }
    }

    void DespAlumn (int i){
        System.out.println("======================================================================");
        System.out.println("Matricula del Alumno    " + (i + 1) + ": " + Matricula[i]);
        System.out.println("Nombre del Alumno       " + (i + 1) + ": " + NomAlum[i]);
        System.out.println("Calificación Parcial 1  " + (i + 1) + ": " + Parcial1[i]);
        System.out.println("Calificación Parcial 2  " + (i + 1) + ": " + Parcial2[i]);
        System.out.println("Promedio del Alumno     " + (i + 1) + ": " + ((Parcial1[i] + Parcial2[i])/ 2));
    }

    boolean Repetido() {
        boolean DatoRepetido = false;
        int i = 0;
        for (i = 0; i <= Cont; i++) {
            if (Dato == Matricula[i]) {
                DatoRepetido = true;
            }
        }
        return DatoRepetido;
    }

    float PromParcial1() {
        float PromPa1 = 0;
        int i = 0;
        for (i = 0; i <= Cont; i++) {
            PromPa1 = PromPa1 + Parcial1[i];
        }
        PromPa1 = PromPa1 / Cont;
        return PromPa1;
    }

    float PromParcial2() {
        float PromPa2 = 0;
        int i = 0;
        for (i = 0; i <= Cont; i++) {
            PromPa2 = PromPa2 + Parcial1[i];
        }
        PromPa2 = PromPa2 / Cont;
        return PromPa2;
    }

    float NumMayor1() {
        float Mayor = 0;
        int i = 0;
        for (i = 0; i <= Cont; i++) {
            if (Parcial1[i] > Mayor) {
                Mayor = Parcial1[i];
            }
        }
        return Mayor;
    }

    String NomAluMay1() {
        float Mayor = 0;
        String NomMay = "";
        int i = 0;
        for (i = 0; i <= Cont; i++) {
            if (Parcial1[i] > Mayor) {
                Mayor = Parcial1[i];
                NomMay = NomAlum[i];
            }
        }
        return NomMay;
    }

    float NumMenor1() {
        float Menor = Parcial1[0];
        int i = 0;
        for (i = 0; i <= Cont; i++) {
            if (Parcial1[i] < Menor) {
                Menor = Parcial1[i];
            }
        }
        return Menor;
    }

    String NomAluMen1(){
        float Menor = Parcial1[0];
        String NomMen = "";
        int i = 0;
        for (i = 0; i <= Cont; i++) {
            if (Parcial1[i] < Menor) {
                Menor = Parcial1[i];
                NomMen = NomAlum[i];
            }
        }
        return NomMen;
    }

    float NumMayor2() {
        float Mayor = 0;
        int i = 0;
        for (i = 0; i <= Cont; i++) {
            if (Parcial2[i] > Mayor) {
                Mayor = Parcial2[i];
            }
        }
        return Mayor;
    }

    String NomAluMay2() {
        float Mayor = 0;
        String NomMay = "";
        int i = 0;
        for (i = 0; i <= Cont; i++) {
            if (Parcial2[i] > Mayor) {
                Mayor = Parcial2[i];
                NomMay = NomAlum[i];
            }
        }
        return NomMay;
    }

    float NumMenor2() {
        float Menor = Parcial2[0];
        int i = 0;
        for (i = 0; i <= Cont; i++) {
            if (Parcial2[i] < Menor) {
                Menor = Parcial2[i];
            }
        }
        return Menor;
    }

    String NomAluMen2(){
        float Menor = Parcial2[0];
        String NomMen = "";
        int i = 0;
        for (i = 0; i <= Cont; i++) {
            if (Parcial2[i] < Menor) {
                Menor = Parcial2[i];
                NomMen = NomAlum[i];
            }
        }
        return NomMen;
    }

    float PromMay() {
        float Prom = 0;
        float ProMay = 0;
        int i = 0;
        for (i = 0; i <= Cont; i++) {
            Prom = (Parcial1[i] + Parcial2[i])/ 2;
            if (Prom > ProMay) {
                ProMay = Prom;
            }
        }
        return ProMay;
    }

    float PromMen() {
        float Prom = 0;
        float ProMen = 0;
        int i = 0;
        for (i = 0; i <= Cont; i++) {
            Prom = (Parcial1[i] + Parcial2[i])/ 2;
            if (Prom < ProMen) {
                ProMen = Prom;
            }
        }
        return ProMen;
    }

    String AlumProMayor() {
        String AlMayor = "";
        float Prom = 0;
        float ProMay = 0;
        int i = 0;
        for (i = 0; i <= Cont; i++) {
            Prom = (Parcial1[i] + Parcial2[i])/ 2;
            if (Prom > ProMay) {
                ProMay = Prom;
                AlMayor = NomAlum[i];
            }
        }
        return AlMayor;
    }

    String AlumProMenor() {
        String AlMenor = "";
        float Prom = 0;
        float ProMay = 0;
        int i = 0;
        for (i = 0; i <= Cont; i++) {
            Prom = (Parcial1[i] + Parcial2[i])/ 2;
            if (Prom < ProMay) {
                ProMay = Prom;
                AlMenor = NomAlum[i];
            }
        }
        return AlMenor;
    }

    void Menu_Gestion() {
        int op = 0;
        do {
            System.out.println("");
            System.out.println("1) Crear Grupo");
            System.out.println("2) Ingresar Datos");
            System.out.println("3) Eliminar Datos");
            System.out.println("4) Modificar Datos");
            System.out.println("5) Consultar Datos");
            System.out.println("6) Listar Datos");
            System.out.println("7) Ordenar Datos");
            System.out.println("8) Promedio de Cada Parcial y Grupo");
            System.out.println("9) Calificacion Mayor y Menor");
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
                        System.out.println("Matricula que Desea Insertar: ");
                        Dato = scanner.nextInt();
                        Insertar_Dato();

                    }
                    break;
                }
                case 3: {
                    System.out.println("Datos que Desea Eliminar: ");
                    Dato = scanner.nextInt();
                    Eliminar_Dato();
                    break;
                }
                case 4: {
                    System.out.println("Matricula que Desea Modificar: ");
                    Dato = scanner.nextInt();
                    Modificar_Dato();
                    break;
                }
                case 6: {
                    if (Cont == -1) {
                        Arreglo_Vacio();
                    }
                    ListarGrupo();
                    break;
                }
                case 8: {
                    System.out.println("Promedio Parcial 1: " + PromParcial1());
                    System.out.println("");
                    System.out.println("Promedio Parcial 2: " + PromParcial2());
                    System.out.println("");
                    System.out.println("Promedio Grupal: " + ((PromParcial1() + PromParcial2()) / 2));
                }
                case 9: {
                    if (Cont == -1) {
                        Arreglo_Vacio();
                    }
                    else {
                        System.out.println("Calificación Mayor Parcial 1: " + NumMayor1() + "Corresponde a: " + NomAluMay1());
                        System.out.println("");
                        System.out.println("Calificación Menor Parcial 1: " + NumMenor1() + "Corresponde a: " + NomAluMen1());
                        System.out.println("");
                        System.out.println("Calificación Mayor Parcial 2: " + NumMayor2() + "Corresponde a: " + NomAluMay2());
                        System.out.println("");
                        System.out.println("Calificación Menor Parcial 2: " + NumMenor2() + "Corresponde a: " + NomAluMen2());
                        System.out.println("");
                        System.out.println("Promedio Mayor: " + PromMay() + "Corresponde a: " + AlumProMayor());
                        System.out.println("");
                        System.out.println("Promedio Menor: " + PromMen() + "Corresponde a: " + AlumProMenor());
                    }
                }
            }
        } while (op > 0);
    }
}
