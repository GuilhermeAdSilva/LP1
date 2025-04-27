package lista002;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LivroTest {
    Livro livro;
    @BeforeEach
    public void setUp() {
        livro = new Livro();
    }

    @Test
    public void deveVerificarNumeroPaginaZerada() {
        try {
            livro.setNumero_paginas(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Numero invalido de paginas", e.getMessage());
        }
    }

    @Test
    public void deveAbrirLivro() {
        livro.abrir();
        assertEquals(1, livro.getPaginaAtual());
    }

    @Test
    public void deveVerificarLivroAberto() {
        try {
            livro.setPaginaAtual(1);
            livro.abrir();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Livro ja aberto", e.getMessage());
        }
    }

    @Test
    public void deveFecharLivro() {
        livro.setPaginaAtual(1);
        livro.fechar();
        assertEquals(0, livro.getPaginaAtual());
    }

    @Test
    public void deveVerificarLivroFechado() {
        try {
            livro.setPaginaAtual(0);
            livro.fechar();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Livro ja fechado", e.getMessage());
        }
    }

    @Test
    public void deveMarcarPagina() {
        livro.marcar_pagina(15);
        assertEquals(15, livro.getPaginaAtual());
    }

    @Test
    public void deveVerificarPaginaMarcadaInvalida() {
        try {
            livro.marcar_pagina(0);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Pagina invalida", e.getMessage());
        }
    }

    @Test
    public void deveAvancarPagina() {
        livro.setPaginaAtual(1);
        livro.avancar_pagina();
        assertEquals(2, livro.getPaginaAtual());
    }

    @Test
    public void deveVerificarFimLivro() {
        try {
            livro.setPaginaAtual(49);
            livro.avancar_pagina();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Nao ha mais paginas!", e.getMessage());
        }
    }

    @Test
    public void deveRetrocederPagina() {
        livro.setPaginaAtual(2);
        livro.retroceder_pagina();
        assertEquals(1, livro.getPaginaAtual());
    }

    @Test
    public void deveVerificarPrimeirapagina() {
        try {
            livro.setPaginaAtual(1);
            livro.retroceder_pagina();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Nao ha mais paginas!", e.getMessage());
        }
    }

}