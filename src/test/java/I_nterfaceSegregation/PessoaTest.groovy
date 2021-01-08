package I_nterfaceSegregation

import spock.lang.Specification

class PessoaTest extends Specification {

    def"Person goes chat with animals"(){
        given:"A person"
        Pessoa pessoa = new Pessoa();

        when:"This person try to talk"
        String response = pessoa.ConversarComOsAnimais()

        then:"Finally have a chat with some animals"
        response == "Venho conversar com os animais"
    }

}
