package D_ependencyInversion.inversao;

import D_ependencyInversion.inversao.materias.Geografia;
import D_ependencyInversion.inversao.materias.Portugues;
import D_ependencyInversion.inversao.usecase.MateriaUsecase;

public class Main {

    public static void main(String[] args) {

        Aluno aluno1 = new Aluno();
        aluno1.setNome("Carlos Roberto");

        Materia materia = new Materia();
        MateriaUsecase materiaUsecase = new MateriaUsecase(materia);

        materiaUsecase. registrarMateria(Portugues.MATERIA_PORTUGUES);
        materiaUsecase. registrarMateria(Geografia.MATERIA_GEOGRAFIA);

        aluno1.setMaterias(materia.getMaterias());

        System.out.println("Lista de matérias de Materia: " + materia.getMaterias());

        System.out.println("Lista de matérias dentro de Aluno " + aluno1.getMaterias());
    }
}
