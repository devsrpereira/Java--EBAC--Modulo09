
public class VariavelWrapper {
    static int idade;

//Set das variaveis primitivas
    public void setIdade(int idade) {
        this.idade = idade;
    }


    public static void main(String[] args) {
        VariavelWrapper info = new VariavelWrapper();
        info.setIdade(idade=40);
        System.out.println("*** A idade como variavel int é " + idade);

        Byte idade2 = (byte) idade;

        System.out.println("*** Com casting explicito de int para byte a idade é "+idade2);

        System.out.println("### Note que o valor não mudou, justamente porque é um numero simples, mas devemos ficar atentos a estes casting forçados.");
    }
}