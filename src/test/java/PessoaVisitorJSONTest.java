import org.junit.jupiter.api.Test;
import visitor.*;

import static org.junit.jupiter.api.Assertions.*;

class PessoaVisitorJSONTest {

    @Test
    void deveExibirAlunoJSON(){
        Aluno aluno = new Aluno(2, "Maria", new Curso("Psicologia"));

        PessoaVisitorJSON visitorJson = new PessoaVisitorJSON();
        assertEquals("{\"matricula\": 2, \"nome\": \"Maria\", \"curso\": \"Psicologia\"}", visitorJson.exibir(aluno));
    }

    @Test
    void deveExibirProfessor() {
        Professor professor = new Professor(2, "Leandro", "Doutorado");

        PessoaVisitorJSON visitorJson = new PessoaVisitorJSON();
        assertEquals("{\"matricula\": 2, \"nome\": \"Leandro\", \"titulacao\": \"Doutorado\"}", visitorJson.exibir(professor));
    }

    @Test
    void deveExibirFuncionario() {
        Funcionario funcionario = new Funcionario(2, "Sergio", 5000.0f);

        PessoaVisitorJSON visitorJson = new PessoaVisitorJSON();
        assertEquals("{\"codigo\": 2, \"nome\": \"Sergio\", \"salario\": \"5000.0\"}", visitorJson.exibir(funcionario));
    }
}
