package D_ependencyInversion.dependencia;

public class Main {

    public static void main(String[] args) {

        Materia portugues_1 = new Materia();
        portugues_1.adicionaNota(9.8);
        portugues_1.adicionaNota(6.8);

        Materia portugues_2 = new Materia();
        portugues_2.adicionaNota(5.8);
        portugues_2.adicionaNota(4.8);

        Materia portugues_3 = new Materia();
        portugues_3.adicionaNota(7.1);
        portugues_3.adicionaNota(5.0);

        Materia portugues_4 = new Materia();
        portugues_4.adicionaNota(7.0);
        portugues_4.adicionaNota(4.0);

        Materia matematica = new Materia();
        matematica.adicionaNota(8.8);
        matematica.adicionaNota(6.8);

        Materia ciencia = new Materia();
        ciencia.adicionaNota(7.9);
        ciencia.adicionaNota(3.9);

        Estudante estudante1 = new Estudante();
        estudante1.adicionaMateria(portugues_1);
        estudante1.adicionaMateria(matematica);
        estudante1.adicionaMateria(ciencia);

        System.out.println(portugues_1.getTotalNotasl());
        System.out.println(matematica.getTotalNotasl());
        System.out.println(ciencia.getTotalNotasl());

        System.out.println("Media " + portugues_1.mediaBimestre());

        Nota bimetre = new Nota();
        bimetre.adicionaMediaBimestre(portugues_1.getTotalNotasl());
        bimetre.adicionaMediaBimestre(portugues_2.getTotalNotasl());
        bimetre.adicionaMediaBimestre(portugues_3.getTotalNotasl());
        bimetre.adicionaMediaBimestre(portugues_4.getTotalNotasl());

        for(Double nota : bimetre.getMediaBimestre()){
            System.out.println("Nota bimestre for no main " + nota / 2 );
        }

        System.out.println("Nota fial em nota " + bimetre.notaFinal());

    }
}
