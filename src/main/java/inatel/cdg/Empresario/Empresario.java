package inatel.cdg.Empresario;

public class Empresario {

    private String nome;
    private long cnpj;

    public String getNome() {
        return nome;
    }

    public long getCnpj() {
        return cnpj;
    }

    public Empresario (String nome, long cnpj){
        nome = this.nome;
        cnpj = this.cnpj;
    }
}
