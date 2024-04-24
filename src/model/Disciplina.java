package model;

import java.util.ArrayList;

public class Disciplina {
    
    private String nome;
    private int ch;
    private ArrayList<Disciplina> preRequisitos;

    public Disciplina() {
        this.preRequisitos = new ArrayList<Disciplina>();
    }
    public Disciplina(String nome, int ch, ArrayList<Disciplina> preRequisitos) {
        this.nome = nome;
        this.ch = ch;
        this.preRequisitos = preRequisitos;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getCh() {
        return ch;
    }
    public void setCh(int ch) {
        this.ch = ch;
    }
    public ArrayList<Disciplina> getPreRequisitos() {
        return preRequisitos;
    }
    public void setPreRequisitos(ArrayList<Disciplina> preRequisitos) {
        this.preRequisitos = preRequisitos;
    }

    public void imprimirRequisitos() {
        if(preRequisitos == null) {
            System.out.println(getNome() + " não tem Pré-requisitos.");
        } else {
            for(int i=0; i<preRequisitos.size(); i++) {
                System.out.println("Pré-requisito(s) de " + getNome() + ": " + preRequisitos.get(i).getNome());
            }
        }
    }
}
