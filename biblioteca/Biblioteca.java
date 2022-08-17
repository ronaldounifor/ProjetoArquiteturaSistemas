package biblioteca;

import util.DBConnector;

import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Livro> livros;

    public Biblioteca(){
        livros = new ArrayList<Livro>();
    }

    private void ordenar(Livro livro) {
        if(livro.getTipo() == Tipo.Romance)
            System.out.println("Este livro é de romance");
        else if(livro.getTipo() == Tipo.Drama)
            System.out.println("Este livro é de drama");
    }

    public void alugar(Livro livro) {
        DBConnector bancoDados = new DBConnector();
        bancoDados.conectar();

        bancoDados.buscar();
//        if(livro.disponivel())
//            bancoDados.atualizar();
//        else
//            return;
//
//        livro.setDataRetorno();

        bancoDados.encerrarConexao();
    }
}
