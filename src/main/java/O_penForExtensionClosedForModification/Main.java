package O_penForExtensionClosedForModification;

public class Main {

    public static void main(String[] args) {

        Ciclista ciclista = new Ciclista();
        ciclista.setNome("Carlos Roberto");
        ciclista.setHoras(1);
        System.out.println("Eu " + ciclista.getNome() + " pedalo em " + ciclista.pedala() +
                " hora " + "essa quantidade de Kilomentros " + ciclista.getKILOMETROS() );

        Maratonista maratonista = new Maratonista();
        maratonista.setNome("Cleiton Henrique");
        maratonista.setHoras(3);
        System.out.println("Eu " + maratonista.getNome() + " corro em " + maratonista.corre() +
                " hora " + "essa quantidade de Kilomentros " + maratonista.getKILOMETROS() );


        Futebolista futebolista = new Futebolista();
        futebolista.setNome("Wellinton Santos");
        futebolista.setMinutos(45);
        System.out.println("Eu " + futebolista.getNome() + " jogo sempre " + futebolista.getMinutos() +
                " minutos " + "de um total de " + futebolista.getPartidaFutebol() );




    }
}
