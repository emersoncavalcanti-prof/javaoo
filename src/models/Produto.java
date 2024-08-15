package models;

public class Produto {

    private int id;
    private String nome;
    private double valor;
    private double estoque;
    private String codbarras;
    private String validade;
    private String fabricacao;

    @Override
    public String toString() {
        return "Produto{" + "id=" + id + ", nome=" + nome + ", valor=" + valor + ", estoque=" + estoque + ", codbarras=" + codbarras + ", validade=" + validade + ", fabricacao=" + fabricacao + '}';
    }

    
    
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the valor
     */
    public double getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(double valor) {
        this.valor = valor;
    }

    /**
     * @return the estoque
     */
    public double getEstoque() {
        return estoque;
    }

    /**
     * @param estoque the estoque to set
     */
    public void setEstoque(double estoque) {
        this.estoque = estoque;
    }

    /**
     * @return the codbarras
     */
    public String getCodbarras() {
        return codbarras;
    }

    /**
     * @param codbarras the codbarras to set
     */
    public void setCodbarras(String codbarras) {
        this.codbarras = codbarras;
    }

    /**
     * @return the validade
     */
    public String getValidade() {
        return validade;
    }

    /**
     * @param validade the validade to set
     */
    public void setValidade(String validade) {
        this.validade = validade;
    }

    /**
     * @return the fabricacao
     */
    public String getFabricacao() {
        return fabricacao;
    }

    /**
     * @param fabricacao the fabricacao to set
     */
    public void setFabricacao(String fabricacao) {
        this.fabricacao = fabricacao;
    }
    
    
    
    
}
