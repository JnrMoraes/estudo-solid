package D_ependencyInversion;

public class Main {

    public static void main(String[] args) {

        Endereco endereco = new Endereco();
        endereco.setLogradouro(" Rua um");
        endereco.setNumero(123);
        endereco.setBairro("Boa Vista");
        endereco.setCep("12012-123");
        endereco.setComplemento("Casa");
        endereco.setCidade("Campinas");

        Estudante estudante = new Estudante();
        estudante.setEndereco(endereco);
        System.out.println("Endereço do estudante é " + estudante.getEndereco().toString());

    }
}
