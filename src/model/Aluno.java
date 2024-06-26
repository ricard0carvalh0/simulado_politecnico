package model;

import java.util.ArrayList;

public class Aluno extends Pessoa{
    
    private int matricula;
    private ArrayList<Apontamento> historico;
    private Grade grade;

    public Aluno() {
        this.historico = new ArrayList<Apontamento>();
    }
    public Aluno(String nome, String apelido, String numeroFiscal, int matricula, ArrayList<Apontamento> historico,
            Grade grade) {
        super(nome, apelido, numeroFiscal);
        this.matricula = matricula;
        this.historico = historico;
        this.grade = grade;
    }

    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public ArrayList<Apontamento> getHistorico() {
        return historico;
    }
    public void setHistorico(ArrayList<Apontamento> historico) {
        this.historico = historico;
    }
    public Grade getGrade() {
        return grade;
    }
    public void setGrade(Grade grade) {
        this.grade = grade;
    }
    
    public void imprimirPessoa() {
        System.out.println("Nome: " + getNome());
        System.out.println("Apelido: " + getApelido());
        System.out.println("Número Fiscal: " + getNumeroFiscal());
        System.out.println("Matrícula: " + getMatricula());
    }

    public void imprimirHistorico() {
        if(historico == null) {
            System.out.println(getNome() + " não possui historico.");
        } else {
            System.out.println("HISTÓRICO");
            System.out.println("___________________________________________");
            for(int i=0; i<historico.size(); i++) {
                System.out.println(historico.get(i).getDisciplina().getNome());
                System.out.println("Status: " + historico.get(i).getStatus());
                System.out.println("Nota: " + historico.get(i).getNota());
                System.out.println();
            }
            System.out.println("___________________________________________");
        }
    }

    public boolean estaIntegralizado() {
        if(this.grade.getDisciplinas().size() > this.historico.size()) {
            return false;
        }
        int contador = 0;
        for(int i=0; i<this.historico.size(); i++) {
            Apontamento apontamento = this.historico.get(i);
            for(int j=0; j<this.grade.getDisciplinas().size(); j++) {
                Disciplina disciplina = this.grade.getDisciplinas().get(j);
                if(disciplina.getNome().equalsIgnoreCase(apontamento.getDisciplina().getNome())) {
                    contador++;
                }
            }
        }
        if(contador >= this.grade.getDisciplinas().size()) {
            return true;
        }
        return false;
    }

    public ArrayList<Disciplina> getDisciplinasFaltantes() {
        ArrayList<Disciplina> disciplinasFaltantes = new ArrayList<Disciplina>();
        for(int i=0; i<this.grade.getDisciplinas().size(); i++) {
            Disciplina disciplina = this.grade.getDisciplinas().get(i);
            boolean cursou = false;
            for(int j=0; j<this.historico.size(); j++) {
                Apontamento apontamento = this.historico.get(j);
                if(apontamento.getDisciplina().getNome().equalsIgnoreCase(disciplina.getNome())) {
                    cursou = true;
                    break;
                }
            }
            if(!cursou) {
                disciplinasFaltantes.add(disciplina);
            }
        }
        return disciplinasFaltantes;
    }
}
