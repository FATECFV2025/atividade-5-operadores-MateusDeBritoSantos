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

        teste op = new teste();

        // Demonstrando uso do atributo público
        System.out.println("\n--- Manipulação do atributo1 ---");
        op.mostrarAtributo(); 
        op.alterarAtributo(25);
        op.mostrarAtributo();

        // --- Demonstração dos operadores
        System.out.println("\n=== CALCULADORA DE OPERADORES ===");

        // Operações aritméticas
        System.out.println("O Resultado (adição) é: " + op.adicao(10f, 5f));
        System.out.println("O Resultado (subtração) é: " + op.subtracao(10f, 5f));
        System.out.println("O Resultado (multiplicação) é: " + op.multiplicacao(10f, 5f));
        System.out.println("O Resultado (divisão) é: " + op.divisao(10f, 5f));

        // Operadores de atribuição (simulados)
        System.out.println("\n--- Operadores de Atribuição (simulados) ---");
        System.out.println("Atribuição (simulada): " + op.atribuicao(2f, 5f));
        System.out.println("Mais igual (v1 += v2): " + op.maisIgual(10f, 3f));
        System.out.println("Menos igual (v1 -= v2): " + op.menosIgual(10f, 3f));
        System.out.println("Vezes igual (v1 *= v2): " + op.vezesIgual(10f, 3f));
        System.out.println("Divisão igual (v1 /= v2): " + op.divisaoIgual(10f, 2f));

        // Operadores lógicos
        System.out.println("\n--- Operadores Lógicos ---");
        System.out.println("true && false = " + op.eLogico(true, false));
        System.out.println("true || false = " + op.ouLogico(true, false));
        System.out.println("!true = " + op.naoLogico(true));

        // Operadores de comparação
        System.out.println("\n--- Operadores de Comparação ---");
        System.out.println("5 > 2 ? " + op.maiorQue(5f, 2f));
        System.out.println("5 < 2 ? " + op.menorQue(5f, 2f));
        System.out.println("5 == 5 ? " + op.igualA(5f, 5f));
        System.out.println("5 != 2 ? " + op.diferenteDe(5f, 2f));
        System.out.println("5 >= 2 ? " + op.maiorOuIgual(5f, 2f));
        System.out.println("5 <= 2 ? " + op.menorOuIgual(5f, 2f));
    }
}