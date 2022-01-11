package flyweight;
import java.util.HashMap;
import java.util.Map;

public class AlimentoFactory {

    private static Map<String, Alimento> alimentos = new HashMap<>();

    public static Alimento getAlimento(String nome, Integer quantidade) {
        Alimento alimento = alimentos.get(nome);
        if (alimento == null) {
            alimento = new Alimento(nome, quantidade);
            alimentos.put(nome, alimento);
        }
        return alimento;
    }

    public static int getTotalAlimentos() {
        return alimentos.size();
    }
}
