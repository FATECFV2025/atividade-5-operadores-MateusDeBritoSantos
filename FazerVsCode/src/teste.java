public class teste {

    public int atributo1;

    public void mostrarAtributo() {
        System.out.println("O valor do atributo1 é: " + atributo1);
    }

    public void alterarAtributo(int novoValor) {
        atributo1 = novoValor;
    }

    // Operações aritméticas
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
        if (v2 == 0f) {
            System.out.println("Erro: divisão por zero!");
            return Float.NaN;
        }
        return v1 / v2;
    }

    // Operadores de atribuição
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
        if (v2 == 0f) {
            System.out.println("Erro: divisão composta por zero!");
            return Float.NaN;
        }
        v1 /= v2;
        return v1;
    }

    // Operadores lógicos
    public boolean eLogico(boolean a, boolean b) {
        return a && b;
    }

    public boolean ouLogico(boolean a, boolean b) {
        return a || b;
    }

    public boolean naoLogico(boolean a) {
        return !a;
    }

    // Operadores de comparação
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
