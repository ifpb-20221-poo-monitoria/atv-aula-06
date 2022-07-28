package cbb04;

public class RegistraAluno {

        public static void main(String args[]){
            Aluno ana = new Aluno();
            Aluno beto = new Aluno();
            Aluno carlos = new Aluno();

            ana.setNome("Ana Machado");
            beto.setNome("Roberto da Silva");
            carlos.setNome("Carlos Alberto");

            System.out.println(ana.getNome());

            System.out.println("Contador: "+Aluno.getQuantidadeAlunos());
        }
    }
