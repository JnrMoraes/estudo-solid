package D_ependencyInversion.dependencia;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Nota {

    private double nota;
    private double quantidadeNota = 0;
    private List<Double> mediaBimestre = new ArrayList<Double>();
    private double notaFinal;

    public Nota(){}

    public Nota(double nota) {
        this.nota = nota;
    }

    void adicionaMediaBimestre(Double nota){
        ++quantidadeNota;
        this.mediaBimestre.add(nota);
    }

    public double notaFinal(){

        double total = 0;

        for(Double nota: mediaBimestre){
            total += nota;
        }

        return total / 8;
    }
}
