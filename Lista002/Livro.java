/*Atributos: titulo, autor, ano_publicacao, numero_paginas, genero
Métodos: abrir, fechar, marcar_pagina, avancar_pagina, retroceder_pagina
• abrir(): Exibe uma mensagem indicando que o livro foi aberto.
• fechar(): Exibe uma mensagem indicando que o livro foi fechado.
• marcar_pagina(pagina): Marca a página atual do livro.
• avancar_pagina(): Avança uma página, se não estiver na última página.
• retroceder_pagina(): Retrocede uma página, se não estiver na primeira página.*/

package lista002;

public class Livro {
    private String titulo;
    private String autor;
    private int ano_publicacao;
    private int numero_paginas;
    private String genero;

    private int paginaAtual;

    public Livro() {
        this.paginaAtual = 0;
        this.numero_paginas = 49;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAno_publicacao() {
        return this.ano_publicacao;
    }

    public void setAno_publicacao(int ano_publicacao) {
        this.ano_publicacao = ano_publicacao;
    }

    public int getNumero_paginas() {
        return this.numero_paginas;
    }

    public void setNumero_paginas(int numero_paginas) {
        if (numero_paginas <= 0) {
            throw new IllegalArgumentException("Numero invalido de paginas");
        }
        this.numero_paginas = numero_paginas;
    }

    public String getGenero() {
        return this.genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getPaginaAtual() {
        return paginaAtual;
    }

    public void setPaginaAtual(int paginaAtual) {
        this.paginaAtual = paginaAtual;
    }

    public void abrir() {
        if (this.paginaAtual > 0) {
            throw new IllegalArgumentException("Livro ja aberto");
        }
        System.out.println("Livro aberto");
        this.paginaAtual = 1;
    }

    public void fechar() {
        if (this.paginaAtual == 0) {
            throw new IllegalArgumentException("Livro ja fechado");
        }
        System.out.println("Livro fechado");
        this.paginaAtual = 0;
    }

    public void marcar_pagina(int pagina) {
        if (pagina > this.numero_paginas || pagina <= 0) {
            throw new IllegalArgumentException("Pagina invalida");
        }
        this.paginaAtual = pagina;
    }

    public void avancar_pagina() {
        if (this.paginaAtual == this.numero_paginas) {
            throw new IllegalArgumentException("Nao ha mais paginas!");
        }
        this.paginaAtual += 1;
    }

    public void retroceder_pagina() {
        if (this.paginaAtual == 1) {
            throw new IllegalArgumentException("Nao ha mais paginas!");
        }
        this.paginaAtual -= 1;
    }

}
