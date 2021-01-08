package O_penForExtensionClosedForModification

import spock.lang.Specification

class CiclistaTest extends Specification {

    def "How many hours a cyclist ride"(){
        given:"A cyclist "
        Ciclista ciclista = new Ciclista();
        ciclista.setNome("Carlos Roberto");
        ciclista.setHoras(1)

        when:"cyclist ride for 1 hour"
        int response = ciclista.pedala();

        then: "Got an answer hour  "
        response == 1
    }


}
