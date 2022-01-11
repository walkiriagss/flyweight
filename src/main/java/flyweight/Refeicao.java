package flyweight;

public class Refeicao {

    private String hora;
    private Alimento alimentoConsumido;

    public Refeicao(String hora, Alimento alimentoConsumido){
        this.hora = hora;
        this.alimentoConsumido = alimentoConsumido;
    }

    public  String obterRefeicao(){
        return  "Cachorro{" +
                "hora='" + this.hora + '\'' +
                ", alimento (gramas) ='" + alimentoConsumido.getNome() + '\'' +
                ", quantidade='" + alimentoConsumido.getQuantidade() + '\'' +
                '}';
    }
}
