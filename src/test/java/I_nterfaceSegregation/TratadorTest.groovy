package I_nterfaceSegregation

import spock.lang.Specification

class TratadorTest extends Specification {


    def "Get Name of zookeeper"() {
        given:"A zookeeper and a name"

        final String NOME = "Corajoso"
        Pessoa pessoa = new Pessoa();
        pessoa.setNome(NOME)

        Tratador tratador = new Tratador();
        tratador.setNome(pessoa.getNome())

        when:"Asking for the name of zookeeper"
        String response = tratador.getNome()

        then:"Having a name of zookeeper"
        response == NOME

    }

    def "Feeding the animals"() {
        given:"A person feed the animals"
         AlimentarAnimais tratador = new Tratador();

        when:"Feed some animals"
        String response = tratador.alimentoOsAnimais();

        then:"Finished to feed animals"
        response == " tenho que alimentar os animais"
    }

    def "Clean the cage"() {

        final String NOME = "Corajoso"
        given:"A zookeeper clean the cage"
         LimparJaula tratador = new Tratador();
        tratador.setNome("Corajoso")

        when:"The Zookeper clean the cage"
        String response = tratador.limpaJaula()

        then:"He finished the Job"
        response == "Olá eu sou " + NOME + " e tenho que limpar a jaula "
    }

    def "Clean the cage with number name"() {

        final String NOME = null
        given:"A zookeeper clean the cage"
        Tratador tratador = new Tratador();
        tratador.setNome(NOME)

        when:"The Zookeper clean the cage"
        String response = tratador.limpaJaula()

        then:"He finished the Job"
        response == "Olá eu sou " + NOME + " e tenho que limpar a jaula "

    }

}
