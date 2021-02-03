package D_ependencyInversion.inversao;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Aluno {

    private String nome;
    private List<String> materias;
    private List<Double> notas;

    public Aluno() {
        this.materias = new ArrayList<>();
        this.notas = new ArrayList<>();
    }

   public void adicionarMateria(String materias){
            this.materias.add(materias);

   }




}
