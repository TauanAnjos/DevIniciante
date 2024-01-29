class Site {
    String nome;
    String link;
    Site proximo;

    public Site(String nome, String link) {
        this.nome = nome;
        this.link = link;
        this.proximo = null;
    }
}

class ListaSites {
    private Site inicio;

    public void inserir(String nome, String link) {
        Site novoSite = new Site(nome, link);
        novoSite.proximo = inicio;
        inicio = novoSite;
    }

    public String buscarEAtualizar(String nome) {
        if (inicio == null) {
            return null; // A lista está vazia, o site não existe.
        }

        if (inicio.nome.equals(nome)) {
            return inicio.link; // O site está no início da lista, retorna o link.
        }

        Site atual = inicio;
        Site anterior = null;

        while (atual != null && !atual.nome.equals(nome)) {
            anterior = atual;
            atual = atual.proximo;
        }

        if (atual != null) {
            // O site foi encontrado na lista, movemos para o início.
            anterior.proximo = atual.proximo;
            atual.proximo = inicio;
            inicio = atual;
            return atual.link;
        }

        return null; // O site não foi encontrado na lista.
    }
}
