package exercicioRelampagoSurpresa;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PessoaTest {

    @Test
    void deveVerificarNomeInvalido(){
        try{
            Pessoa pessoa = new Pessoa("");
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Nome invalido", e.getMessage());
        }
    }

    @Test
    void deveVerificarNomeValido(){
        Pessoa pessoa = new Pessoa("Pedro");
        assertEquals("Pedro", pessoa.getNome());
    }

}