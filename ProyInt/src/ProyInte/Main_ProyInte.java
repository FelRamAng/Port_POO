package ProyInte;

public class Main_ProyInte {

    public static void main(String[] args) {

        Arreglo GrupoBanco = new Arreglo();
        int op = 1;
        do {
            if (op == 1) {
                    GrupoBanco.Menu_Gestion();
            }
        } while (op > 0);
    }
}
