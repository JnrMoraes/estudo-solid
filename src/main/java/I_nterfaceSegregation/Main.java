package I_nterfaceSegregation;

public class Main {

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome(" João da Luz");

        Tratador tratador = new Tratador();
        tratador.setNome("Dionisio Vergueira");

        System.out.println("Todos os dias essa rotina acontece");
        System.out.println(tratador.limpaJaula() + tratador.alimentoOsAnimais());


        System.out.println("E" + pessoa.getNome());
        System.out.println(pessoa.ConversarComOsAnimais());


    }
}
