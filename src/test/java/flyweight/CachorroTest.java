package flyweight;


import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CachorroTest {
    @Test
    void deveRetornarRefeicoes() {
        Cachorro cachorro = new Cachorro();
        cachorro.registrar("07:30", "ração", 200);
        cachorro.registrar("16:50", "ração", 200);
        cachorro.registrar("05:20", "ração", 200);
        cachorro.registrar("00:00", "pelanca", 200);


        List<String> saida = Arrays.asList(
                "Cachorro{hora='07:30', alimento (gramas) ='ração', quantidade='200'}",
                "Cachorro{hora='16:50', alimento (gramas) ='ração', quantidade='200'}",
                "Cachorro{hora='05:20', alimento (gramas) ='ração', quantidade='200'}",
                "Cachorro{hora='00:00', alimento (gramas) ='pelanca', quantidade='200'}");


        assertEquals(saida, cachorro.obterRefeicoes());
    }

    @Test
    void deveRetornarTotalRefeicoes() {
        Cachorro cachorro = new Cachorro();
        cachorro.registrar("07:30", "ração", 200);
        cachorro.registrar("15:00", "ração", 200);
        cachorro.registrar("05:45", "ração", 200);
        cachorro.registrar("16:20", "pelanca", 200);

        assertEquals(2, AlimentoFactory.getTotalAlimentos());
    }
}