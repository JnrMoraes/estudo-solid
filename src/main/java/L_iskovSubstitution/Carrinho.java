package L_iskovSubstitution;

import lombok.Data;

@Data
public class Carrinho implements Veiculo{

    private Motor motor;

    @Override
    public String ligar() {
        return motor.ligado();
    }

    @Override
    public String acelerar() {
        return motor.desligado();
    }
}
