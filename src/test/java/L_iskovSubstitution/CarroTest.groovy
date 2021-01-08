package L_iskovSubstitution

import spock.lang.Specification

class CarroTest extends Specification {

    def"Turning on a car"(){
        given:"A car"
        Carro carro = new Carro();
        Motor motor = new Motor();
        carro.setMotor(motor)

        when:"Turning on the car"
        String response = carro.ligar();

        then:"Have a turning on noise"
        response == "Vron Vronnn"
    }

    def"Turning on a car to make some noise" (){
        given:"A car"
        Carro carro = new Carro();

        when:"Turning on the car"
        String response = carro.acelerar();

        then:"Have some noise"
        response == "Vron Vronm Vrooonmm"
    }

    def"Turning off the carr"(){
        given:"A car being turned off"
        Carro carro = new Carro();
        Motor motor = new Motor();
        carro.setMotor(motor)

        when:"A car being turned off"
        String response = carro.desligar()

        then:"A noise of turned off a car"
        response == "Não faz barulho"

    }

}
