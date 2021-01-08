package O_penForExtensionClosedForModification

import spock.lang.Specification

class MaratonistaTest extends Specification {


    def "How many hours a marathonisty run a Marathon "(){
        given: "A marathonisty"

        final double HOURS = 3.5;
        Maratonista maratonista = new Maratonista();
        maratonista.setHoras(HOURS);

        when:"Having how many hours"
        double response = maratonista.corre();

        then:"Have how many hours the marathonisty run"
        response == HOURS
    }

}
