package O_penForExtensionClosedForModification

import spock.lang.Specification

class FutebolistaTest extends Specification {

    def "How many hours a Soccer Player play a game"(){
        given:"A Soccer Player "
        Futebolista futebolista = new Futebolista();
        futebolista.setMinutos(45);

        when:"Player plays for 45 minutes"
        int response = futebolista.jogo();

        then: "Got an answer hour  "
        response == 45
    }
}
