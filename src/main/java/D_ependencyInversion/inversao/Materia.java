package D_ependencyInversion.inversao;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Materia implements InterfaceMateria{

    private List<String> materias;

    public Materia() {
        this.materias = new ArrayList<>();
    }

    @Override
    public String registrarMateria(String materia) {
        this.materias.add(materia);
        return materia;
    }

}
