package aula1_elcio;
public class Calculadora {

    public static int soma(int n1, int n2) {
        return n1 + n2;
    }

    public static int multiplicacao(int n1, int n2) {
        return n1 * n2;
    }

    public static int divisao(int n1, int n2) {
        return n1 / n2;
    }

    // + - * /

    // casting

    public static int exponenciacao(int n1, int n2) {
        return (int) Math.pow(n1, n2);

        // double 2.5 -> int 2
        // double 4.0 -> int 4
    }

    public static void main(String[] args) {
        System.out.println(soma(1, 2));
    }

}
