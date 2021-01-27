package D_ependencyInversion.dependencia;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Estudante {

    private String nome;
    private ArrayList<Materia> materias = new ArrayList<>();
    private boolean presenca = false;

    public boolean alunoPresente() {
        return true;
    }


    public void adicionaMateria(Materia materia) {
        this.materias.add(materia);
    }

}
