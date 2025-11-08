import java.util.Scanner;

public class App {
        //Comentário

    public static void funcao_teste (){
        //Biblioteca para entrada de dados
        Scanner ler = new Scanner(System.in);

        //variável local 
        String v2;
        int v1;

        System.out.println("Comando de Saida de Dados");
        
        System.out.printf("Informe uma palavra: ");
        v2 = ler.next();

        System.out.printf("Informe um número: ");
        v1 = ler.nextInt();

        System.out.printf(v2+" "+v1);
    }
    public static void main(String[] args) throws Exception {
        funcao_teste();

        Operadores op = new Operadores();

        System.out.println("\n=== CALCULADORA DE OPERADORES ===");

        // EXEMPLOS DA ATIVIDADE ORIGINAL
        System.out.println("O Resultado é: " + op.adicao(10, 5));
        System.out.println("O Resultado é: " + op.subtracao(10, 5));
        System.out.println("O Resultado é: " + op.multiplicacao(10, 5));
        System.out.println("O Resultado é: " + op.divisao(10, 5));

        // EXEMPLOS DOS NOVOS MÉTODOS
        System.out.println("\n--- Operadores de Atribuição ---");
        System.out.println("Atribuição: " + op.atribuicao(2, 5));
        System.out.println("Mais igual: " + op.maisIgual(10, 3));
        System.out.println("Menos igual: " + op.menosIgual(10, 3));
        System.out.println("Vezes igual: " + op.vezesIgual(10, 3));
        System.out.println("Divisão igual: " + op.divisaoIgual(10, 2));

        System.out.println("\n--- Operadores Lógicos ---");
        System.out.println("true && false = " + op.eLogico(true, false));
        System.out.println("true || false = " + op.ouLogico(true, false));
        System.out.println("!true = " + op.naoLogico(true));

        System.out.println("\n--- Operadores de Comparação ---");
        System.out.println("5 > 2 ? " + op.maiorQue(5, 2));
        System.out.println("5 < 2 ? " + op.menorQue(5, 2));
        System.out.println("5 == 5 ? " + op.igualA(5, 5));
        System.out.println("5 != 2 ? " + op.diferenteDe(5, 2));
        System.out.println("5 >= 2 ? " + op.maiorOuIgual(5, 2));
        System.out.println("5 <= 2 ? " + op.menorOuIgual(5, 2));
    }
}

class Operadores {

    // Operações aritméticas básicas
    public float adicao(float v1, float v2) {
        return v1 + v2;
    }

    public float subtracao(float v1, float v2) {
        return v1 - v2;
    }

    public float multiplicacao(float v1, float v2) {
        return v1 * v2;
    }

    public float divisao(float v1, float v2) {
        if (v2 == 0) {
            System.out.println("Erro: divisão por zero!");
            return Float.NaN;
        }
        return v1 / v2;
    }

    // Operadores de atribuicao
    public float atribuicao(float v1, float v2) {
        v1 = v2;
        return v1;
    }

    public float maisIgual(float v1, float v2) {
        v1 += v2;
        return v1;
    }

    public float menosIgual(float v1, float v2) {
        v1 -= v2;
        return v1;
    }

    public float vezesIgual(float v1, float v2) {
        v1 *= v2;
        return v1;
    }

    public float divisaoIgual(float v1, float v2) {
        if (v2 == 0) {
            System.out.println("Erro: divisão composta por zero!");
            return Float.NaN;
        }
        v1 /= v2;
        return v1;
    }

    // Operadores logicos
    public boolean eLogico(boolean a, boolean b) {
        return a && b;
    }

    public boolean ouLogico(boolean a, boolean b) {
        return a || b;
    }

    public boolean naoLogico(boolean a) {
        return !a;
    }

    // Operadores de comparacao
    public boolean maiorQue(float v1, float v2) {
        return v1 > v2;
    }

    public boolean menorQue(float v1, float v2) {
        return v1 < v2;
    }

    public boolean igualA(float v1, float v2) {
        return v1 == v2;
    }

    public boolean diferenteDe(float v1, float v2) {
        return v1 != v2;
    }

    public boolean maiorOuIgual(float v1, float v2) {
        return v1 >= v2;
    }

    public boolean menorOuIgual(float v1, float v2) {
        return v1 <= v2;
    }
}
