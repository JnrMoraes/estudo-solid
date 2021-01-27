package D_ependencyInversion.invercao;

import lombok.Data;

@Data
public class MateriaService {

    private GatewayMateria gatewayMateria;

    public MateriaService(GatewayMateria gatewayMateria) {
        this.gatewayMateria = gatewayMateria;
    }

    public void registarMateria(String materiaNome, Materia materia){
        gatewayMateria.registarMateria(materia.setNomeMateria(materiaNome));
        System.out.printf("[Materia] Registrando materia %s\n",
                materia.getNomeMateria());

    }
}
