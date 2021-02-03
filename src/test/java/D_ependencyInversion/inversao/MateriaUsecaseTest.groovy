package D_ependencyInversion.inversao

import D_ependencyInversion.invercao.materias.Portugues
import D_ependencyInversion.testeinversao.usecase.MateriaUsecase
import spock.lang.Specification

class MateriaUsecaseTest extends Specification {

    def "Registrar materia em uma lista de materia"() {

        given:" Uma lista vazia de materias"
        Materia materia = new Materia()

        def materias = ["Português"]

        and:"Registra uma materia em materia em uma lista de Materia"

        String nomeMateria = Portugues.MATERIA_PORTUGUES

        MateriaUsecase materiaUsecase = new MateriaUsecase(materia)
        materiaUsecase.registrarMateria(nomeMateria)

        when:"Materia tem uma materia dentro de uma lista de materias"
        List<String> response = materia.getMaterias();

        then:"Tenho uma materia registrada no aluno"
        response == materias

    }

}
