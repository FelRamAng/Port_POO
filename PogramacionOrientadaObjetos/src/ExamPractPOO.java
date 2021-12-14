import java.util.Scanner;

public class ExamPractPOO {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] NombreAlumn = new String[128];
        int[] NumAlumn;
        int[] NumGrupos;
        int Opcion = 0;

        System.out.println("Escriba Cuantos Grupos Evaluará:");
        NumGrupos = new int[scanner.nextInt()];

        System.out.println("Escriba Cuantos Alumnos Evaluará del Grupo " + NumGrupos + ":");
        NumAlumn = new int[scanner.nextInt()];

        while (Opcion != 10)
        {
            System.out.println("Escriba una Opción:");
            Opcion = scanner.nextInt();

            if (Opcion == 1)
            {
                for (int i = 0; i < NumAlumn; i = i + 1 );
                System.out.println();
            }
        }


    }
}
