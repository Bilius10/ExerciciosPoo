package generic;

public abstract class imoveis {

    private String localizacao;
    private String cidade;
    private int num_quartos;
    private int num_banheiros;
    private int num_garagem;


    public imoveis(String cidade, String localizacao, int num_banheiros, int num_garagem, int num_quartos) {
        this.cidade = cidade;
        this.localizacao = localizacao;
        this.num_banheiros = num_banheiros;
        this.num_garagem = num_garagem;
        this.num_quartos = num_quartos;
    }

    @Override
    public String toString() {
        return "generic.imoveis{" +
                "cidade='" + cidade + '\'' +
                ", localizacao='" + localizacao + '\'' +
                ", num_quartos=" + num_quartos +
                ", num_banheiros=" + num_banheiros +
                ", num_garagem=" + num_garagem +
                '}';
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public int getNum_banheiros() {
        return num_banheiros;
    }

    public void setNum_banheiros(int num_banheiros) {
        this.num_banheiros = num_banheiros;
    }

    public int getNum_garagem() {
        return num_garagem;
    }

    public void setNum_garagem(int num_garagem) {
        this.num_garagem = num_garagem;
    }

    public int getNum_quartos() {
        return num_quartos;
    }

    public void setNum_quartos(int num_quartos) {
        this.num_quartos = num_quartos;
    }
}
