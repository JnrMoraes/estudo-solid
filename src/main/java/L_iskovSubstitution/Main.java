package L_iskovSubstitution;

public class Main {

    public static void main(String[] args) {
        Motor motor = new Motor();
        motor.setCavalos("123");
        motor.setRpm(15000);

        Carro carro = new Carro();
        carro.setMotor(motor);

        System.out.println("Meu carro com " + motor.getCavalos() + " cavalos e com " +
                motor.getRpm() + " faz esse barulho quando ligado " + carro.ligar() +
                " e quando ele acelera faz " + carro.acelerar() +
                " e quando desligo ele aparece no painel " + carro.desligar());
    }
}
