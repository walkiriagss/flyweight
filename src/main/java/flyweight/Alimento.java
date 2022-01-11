package flyweight;

public class Alimento {

    private String nome;
    private Integer quantidade;

    public Alimento(String nome, Integer quantidade){
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public Integer getQuantidade() {
        return quantidade;
    }
}
