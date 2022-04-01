package inatel.cdg.Banda;

import inatel.cdg.Empresario.Empresario;
import inatel.cdg.Membro.Membro;
import inatel.cdg.Musica.Musica;

public class Banda {

    private String nome;
    private String genero;

    private Musica musicas[];
    private Membro membros[];
    private Empresario empresario;

    public void setMusicas(Musica[] musicas) {
        this.musicas = musicas;
    }

    public void setMembros(Membro[] membros) {
        this.membros = membros;
    }

    public void setEmpresario(Empresario empresario){
        this.empresario = empresario;
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public void mostraInfo(){
        System.out.println("Nome da banda: " + getNome());
        System.out.println("Genero da banda: " + getGenero());

        System.out.println("Musicas da banda: ");
        for (int i=0; i<musicas.length; i++){
            System.out.println(musicas[i].getNome() + " duracao: " + musicas[i].getDuracao());
        }

        System.out.println("Membros da banda: ");
        for (int i=0; i<membros.length; i++){
            System.out.println(membros[i].getNome() + " funcao: " + membros[i].getFuncao());
        }

        System.out.println("Empresario da banda: " + empresario.getNome() + " cnpj: " + empresario.getCnpj());
    }

    public void addMusicaNova(Musica musica){
        for (int i=0; i<musicas.length;i++){
            if(musicas[i] == null){
                musicas[i] = musica;
                break;
            }
        }
    }

    public void addMembroNovo(Membro membro){
        for (int i=0; i<membros.length;i++){
            if(membros[i] == null){
                membros[i] = membro;
                break;
            }
        }
    }

    public Banda (String nome, String genero){
        this.nome = nome;
        this.genero = genero;
    }
}
