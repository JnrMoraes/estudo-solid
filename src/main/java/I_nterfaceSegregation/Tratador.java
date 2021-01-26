package I_nterfaceSegregation;

public class Tratador extends Pessoa implements AlimentarAnimais, LimparJaula{

    public String alimentoOsAnimais() {
        return " tenho que alimentar os animais";
    }

    public String limpaJaula() {
        return "Olá eu sou " + getNome() + " e tenho que limpar a jaula ";

    }
}
