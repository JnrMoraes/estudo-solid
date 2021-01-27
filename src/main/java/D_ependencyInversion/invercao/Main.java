package D_ependencyInversion.invercao;

import D_ependencyInversion.invercao.materias.Ciencias;
import D_ependencyInversion.invercao.materias.Geografia;
import D_ependencyInversion.invercao.materias.Matematica;
import D_ependencyInversion.invercao.materias.Portugues;

public class Main {

    public static void main(String[] args) {

        Aluno aluno1 = new Aluno();
        aluno1.setNome("Carlos Roberto");

        MateriaService materiaService = new MateriaService(new Materia());

        materiaService.registarMateria(Portugues.MATERIA_PORTUGUES, new Portugues());
        materiaService.registarMateria(Matematica.MATERIA_MATEMATICA, new Matematica());
        materiaService.registarMateria(Ciencias.MATERIA_CIENCIAS, new Ciencias());
        materiaService.registarMateria(Geografia.MATERIA_GEOGRAFIA, new Geografia());

    }
}
