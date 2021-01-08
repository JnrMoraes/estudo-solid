package L_iskovSubstitution;

public class Motor implements BarulhoDoMotor{

    private String cavalos;
    private int rpm;

    public String getCavalos() {
        return cavalos;
    }

    public void setCavalos(String cavalos) {
        this.cavalos = cavalos;
    }

    public int getRpm() {
        return rpm;
    }

    public void setRpm(int rpm) {
        this.rpm = rpm;
    }

    public String roncoDoMotor() {
        return "Vron Vronnn";
    }

    public String ligado(){
       return roncoDoMotor();
    }

    public String desligado(){
        return "Não faz barulho";
    }
}
