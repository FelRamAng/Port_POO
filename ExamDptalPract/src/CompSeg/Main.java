package CompSeg;

public class Main {

    public static void main(String[] args) {

        Arreglo GrupoSeguros = new Arreglo();
        int op = 1;
        do {
            if (op == 1) {
                GrupoSeguros.Menu_Gestion();
            }
        } while (op > 0);
    }
}
