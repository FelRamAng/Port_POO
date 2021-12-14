package plantillaarreglo;

import java.util.Scanner;

public class Arrays_main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Array GrupoPOO = new Array();
        Array GrupoISW = new Array();
        int op = 0, op1 = 0;
        do
        {
            System.out.println("Seleccione el Grupo:");
            System.out.println("1) Grupo POO");
            System.out.println("2) Grupo ISW");

            op = scanner.nextInt();

            do
            {
                System.out.println("Seleccione la opción que desea realizar: ");
                System.out.println("0) Regresar");
                System.out.println("1) Gestionar Grupo");
                op1 = scanner.nextInt();

                switch(op)
                {
                    case 1:
                    {
                        if(op1 == 1)
                        {
                            GrupoPOO.Menu_Gestion();
                        }
                        break;
                    }
                    case 2:
                    {
                        if(op1 == 1)
                        {
                            GrupoISW.Menu_Gestion();
                        }
                        break;
                    }
                }
            }while(op1 > 0);

        }while(op > 0);
    }
}
