package D_ependencyInversion.inversao.usecase;

import D_ependencyInversion.inversao.Aluno;
import D_ependencyInversion.inversao.InterfaceNotas;
import D_ependencyInversion.inversao.Materia;

public class AlunoUsecase {

    private InterfaceNotas gatewayAlunoMaterias;

    public AlunoUsecase(InterfaceNotas gatewayAlunoMaterias) {
        this.gatewayAlunoMaterias = gatewayAlunoMaterias;
    }

    public void registarNota(Materia materias, Aluno aluno){


//        gatewayAlunoMaterias.registarMateriasAluno(aluno.setMaterias(materias));
//        System.out.printf("[Materia] Registrando materia %s\n",
//                materia.getNomeMateria());

    }


}
