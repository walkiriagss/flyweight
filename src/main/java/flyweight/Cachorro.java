package flyweight;
import java.util.ArrayList;
import java.util.List;

public class Cachorro {

    private List<Refeicao> refeicoes = new ArrayList<>();

    public void registrar(String horaRefeicao, String nomeAlimento, Integer quantidade) {
        Alimento alimento = AlimentoFactory.getAlimento(nomeAlimento, quantidade);
        Refeicao refeicao = new Refeicao(horaRefeicao, alimento);
        refeicoes.add(refeicao);
    }

    public List<String> obterRefeicoes() {
        List<String> saida = new ArrayList<String>();
        for (Refeicao refeicao : this.refeicoes) {
            saida.add(refeicao.obterRefeicao());
        }
        return saida;
    }
}
