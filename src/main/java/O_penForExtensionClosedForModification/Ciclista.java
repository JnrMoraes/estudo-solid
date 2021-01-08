package O_penForExtensionClosedForModification;

public class Ciclista extends Pessoa{

    private static final int KILOMETROS = 40;
    private int horas;

    public int pedala(){
        return getHoras();
    }

    public static int getKILOMETROS() {
        return KILOMETROS;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

}
