package L_iskovSubstitution;

public class Carro implements Veiculo{

    private Motor motor;

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public String ligar() {
       return motor.ligado();
    }

    public String acelerar() {
       return "Vron Vronm Vrooonmm";
    }

    public String desligar(){
       return motor.desligado();
    }
}
