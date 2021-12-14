package Calif3Grup;

import java.util.Scanner;

public class Main_Calif
{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Arrays Grupo_1 = new Arrays();
        Arrays Grupo_2 = new Arrays();
        Arrays Grupo_3 = new Arrays();
        int op = 0, op1 = 0;
        do
        {
            System.out.println("Seleccione el Grupo:");
            System.out.println("1) Grupo 1");
            System.out.println("2) Grupo 2");
            System.out.println("3) Grupo 3");

            op = scanner.nextInt();

            do
            {
                System.out.println("Seleccione la opción que desea realizar: ");
                System.out.println("0) Regresar");
                System.out.println("1) Gestionar Grupo");
                System.out.println("2) Información de Grupo");
                op1 = scanner.nextInt();

                switch(op)
                {
                    case 1:
                    {
                        if(op1 == 1)
                        {
                            Grupo_1.Menu_Gestion();
                        }
                        else if(op1 == 2)
                        {
                            Grupo_1.Menu();
                        }
                        break;
                    }
                    case 2:
                    {
                        if(op1 == 1)
                        {
                            Grupo_2.Menu_Gestion();
                        }
                        else if(op1 == 2)
                        {
                            Grupo_2.Menu();
                        }
                        break;
                    }
                    case 3:
                    {
                        if(op1 == 1)
                        {
                            Grupo_3.Menu_Gestion();
                        }
                        else if(op1 == 2)
                        {
                            Grupo_3.Menu();
                        }
                        break;
                    }
                }
            }while(op1 > 0);

        }while(op > 0);
    }
}