import Controller.BibliotecaController;
import Model.Aluno;
import Model.Emprestimo;
import Model.Livro;
import View.BibliotecaView;

public class Main {
    public static void main(String[] args) {

        BibliotecaController controller = new BibliotecaController();
        BibliotecaView view = new BibliotecaView();

        Livro l = new Livro("POO", "Autor Y", 1);
        Aluno a = new Aluno("Maria");

        Emprestimo e = new Emprestimo(a, l);

        controller.emprestar(e);

        // MOSTRAR RESULTADO
        view.mostrarEmprestados(controller.emAberto());
    }
}