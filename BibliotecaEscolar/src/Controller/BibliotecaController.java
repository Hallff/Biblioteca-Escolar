package Controller;

import Model.Emprestimo;

import java.util.ArrayList;
import java.util.List;

public class BibliotecaController {

    private List<Emprestimo> emprestimos = new ArrayList<>();

    public void emprestar(Emprestimo e) {
        emprestimos.add(e);
    }

    public List<Emprestimo> emAberto() {
        List<Emprestimo> lista = new ArrayList<>();

        for (Emprestimo e : emprestimos) {
            if (!e.isDevolvido()) {
                lista.add(e);
            }
        }

        return lista;
    }
}