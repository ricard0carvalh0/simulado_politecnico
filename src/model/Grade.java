package model;

import java.util.ArrayList;

public class Grade {
    
    private int ano;
    private int chTotal;
    private ArrayList<Disciplina> disciplinas;
    private Curso curso;

    public Grade() {
        this.disciplinas = new ArrayList<Disciplina>();
    }
    public Grade(int ano, int chTotal, ArrayList<Disciplina> disciplinas, Curso curso) {
        this.ano = ano;
        this.chTotal = chTotal;
        this.disciplinas = disciplinas;
        this.curso = curso;
    }

    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public int getChTotal() {
        return chTotal;
    }
    public void setChTotal(int chTotal) {
        this.chTotal = chTotal;
    }
    public ArrayList<Disciplina> getDisciplinas() {
        return disciplinas;
    }
    public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }
    public Curso getCurso() {
        return curso;
    }
    public void setCurso(Curso curso) {
        this.curso = curso;
    }
    
    public void imprimirGrade() {
        if(disciplinas == null) {
            System.out.println("A grade não existe.");
        } else {
            System.out.println("Curso: " + getCurso().getNome());
            System.out.println("CH Total: " + getChTotal());
            System.out.println("Ano: " + getAno());
            System.out.println("--------------------------------");
            for(int i=0; i<disciplinas.size(); i++) {
                System.out.println(disciplinas.get(i).getNome());
            }
            System.out.println("--------------------------------");
        }
    }
}
