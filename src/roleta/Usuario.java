public class Usuario {

    private String nome;
    private int dataNascimento;
    private double dinheitoConta;
    private int vitorias;
    private int derrotas;
    private int diferenca;

    public Usuario(int dataNascimento, double dinheitoConta, String nome) {
        this.dataNascimento = dataNascimento;
        this.dinheitoConta = dinheitoConta;
        this.nome = nome;
    }

    public void diferenciar(){
        this.diferenca = vitorias-derrotas;
    }

    public void addSaldo(double saldo){
        this.dinheitoConta += saldo;
    }

    public void diminuirSaldo(double saldo){
        this.dinheitoConta -= saldo;
    }

    public int getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(int dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public double getDinheitoConta() {
        return dinheitoConta;
    }

    public void setDinheitoConta(double dinheitoConta) {
        this.dinheitoConta = dinheitoConta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDiferenca() {
        return diferenca;
    }

    public void setDiferenca(int diferenca) {
        this.diferenca = diferenca;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "dataNascimento=" + dataNascimento +
                ", nome='" + nome + '\'' +
                ", dinheitoConta=" + dinheitoConta +
                '}';
    }
}
