package I_nterfaceSegregation;

public class Pessoa implements ConversarComOsAnimais {

    private String nome;

    public String ConversarComOsAnimais() {
        return "Venho conversar com os animais";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
