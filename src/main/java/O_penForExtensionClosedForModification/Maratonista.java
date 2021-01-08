package O_penForExtensionClosedForModification;

public class Maratonista extends Pessoa {

    private static final int KILOMETROS = 42;
    private double horas;

    public double corre(){
        return getHoras();
    }

    public static int getKILOMETROS() {
        return KILOMETROS;
    }

    public double getHoras() {
        return horas;
    }

    public void setHoras(double horas) {
        this.horas = horas;
    }


}
