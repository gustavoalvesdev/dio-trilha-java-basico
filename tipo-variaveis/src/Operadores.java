public class Operadores {
    public static void main(String[] args) {

        // Para aparecer corretamente na tela
        System.out.println("");

        boolean fatoUm = false;
        boolean fatoDois = true;

        if (fatoUm && fatoDois) {
            System.out.println("E Verdadeiro");
        } else {
            System.out.println("E Falso");
        }

        if (fatoUm || fatoDois) {
            System.out.println("Ou Verdadeiro");
        } else {
            System.out.println("Ou Falso");
        }

        if (!fatoUm) {
            System.out.println("Não Verdadeiro");
        } else {
            System.out.println("Não Falso");
        }
    }
}
