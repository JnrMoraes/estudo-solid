package D_ependencyInversion.inversao.usecase;

import D_ependencyInversion.inversao.InterfaceMateria;
import lombok.Data;


@Data
public class MateriaUsecase {

    private InterfaceMateria interfaceMateria;

    public MateriaUsecase(InterfaceMateria interfaceMateria) {
        this.interfaceMateria = interfaceMateria;
    }

    public String registrarMateria(String materiaNome){

        return interfaceMateria.registrarMateria(materiaNome);

    }
}

