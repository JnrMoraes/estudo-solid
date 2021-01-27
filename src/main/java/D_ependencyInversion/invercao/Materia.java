package D_ependencyInversion.invercao;

import D_ependencyInversion.invercao.enuns.Materias;
import lombok.Data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

@Data
public class Materia implements GatewayMateria {

    private String nomeMateria;
    private List<Object> materias = new ArrayList<>();


    @Override
    public void registarMateria(String materia) {
        materias.add(materia);

//        for(Object materiaUnica : materias){
            System.out.printf("[Lista de materia ] A matéria é :%s ", materias);

//        }
    }

    public String setNomeMateria(String nomeMateria) {
        this.nomeMateria = nomeMateria;
        return nomeMateria;
    }

    @Override
    public String toString() {
        return "Materia{" +
                "materias=" + materias +
                '}';
    }
}
