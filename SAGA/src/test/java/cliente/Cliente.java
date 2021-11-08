package cliente;

public class Cliente{
    private String nome;
    private String email;
    private String localizacao;

    public Cliente(String nome, String email, String localizacao) {
        this.nome = nome;
        this.email = email;
        this.localizacao = localizacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    @Override
    public String toString() {
        return nome + " - "+ email + " - " + localizacao ;
    }
}
