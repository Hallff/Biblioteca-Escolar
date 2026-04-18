package View;

import Model.Emprestimo;
import java.util.List;

public class BibliotecaView {

    public void mostrarEmprestados(List<Emprestimo> lista) {
        for (Emprestimo e : lista) {
            System.out.println(
                    e.getAluno().getNome() + " -> " +
                            e.getLivro().getTitulo()
            );
        }
    }
}