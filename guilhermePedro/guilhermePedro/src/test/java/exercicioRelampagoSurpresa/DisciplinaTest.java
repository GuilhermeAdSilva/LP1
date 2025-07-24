package exercicioRelampagoSurpresa;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DisciplinaTest {

    @Test
    void deveVerificarNomeInvalido(){
        try{
            Disciplina disciplina = new Disciplina("");
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Nome invalido", e.getMessage());
        }
    }

    @Test
    void deveVerificarNomeValido(){
        Disciplina disciplina = new Disciplina("Pedro");
        assertEquals("Pedro", disciplina.getNome());
    }

}