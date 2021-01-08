package O_penForExtensionClosedForModification;

public class Futebolista extends Pessoa {

    private static final int PARTIDA_FUTEBOL = 90;
    private int minutos;

    public int jogo(){
        return getMinutos();
    }

    public static int getPartidaFutebol() {
        return PARTIDA_FUTEBOL;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int horas) {
        this.minutos = horas;
    }

    public void corro(){
        System.out.println("Eu corro 42 km");
    }
}
