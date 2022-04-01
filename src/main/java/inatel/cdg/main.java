package inatel.cdg;

import inatel.cdg.Banda.Banda;
import inatel.cdg.Empresario.Empresario;
import inatel.cdg.Membro.Membro;
import inatel.cdg.Musica.Musica;

public class main {
    public static void main(String[] args) {
        Banda banda = new Banda("Banda!", "Genero1" );
        Membro[] membro = new Membro[2];
        Musica[] musica = new Musica[2];
        Empresario empresario = new Empresario("Adalberto", 12345);

        banda.setMembros(membro);
        banda.setMusicas(musica);
        banda.setEmpresario(empresario);

        banda.addMembroNovo(membro[0] = new Membro("Membro1", "cantor"));
        banda.addMusicaNova(musica[0] = new Musica("Musica1", 4.5));

        banda.addMembroNovo(membro[1] = new Membro("Membro2", "baterista"));
        banda.addMusicaNova(musica[1] = new Musica("Musica2", 3.5));

        banda.mostraInfo();

    }
}
