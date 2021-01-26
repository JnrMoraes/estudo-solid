package D_ependencyInversion.dependencia;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
@Data
public class Materia {

    private String nome;
    private List<Nota> notas = new ArrayList();

    public Materia() {
    }

    public void adicionaNota(double nota){
      this.notas.add(new Nota(nota));
  }

    public double getTotalNotasl(){
        double total = 0;
        for (Nota nota : notas){
            total += nota.getNota();
        }
        return total;
    }

    public double mediaBimestre(){
        double total = getTotalNotasl() / 2;
        return total;
    }

    public double notaFinal(){
        double total = getTotalNotasl() /4;
        return total;
    }

}
