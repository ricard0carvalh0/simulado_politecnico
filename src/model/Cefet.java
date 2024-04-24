package model;

import java.util.ArrayList;

public class Cefet {
    
    private String nome;
    private String url;
    private ArrayList<Curso> cursos;

    public Cefet() {
        this.cursos = new ArrayList<Curso>();
    }
    public Cefet(String nome, String url, ArrayList<Curso> cursos) {
        this.nome = nome;
        this.url = url;
        this.cursos = cursos;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
    public ArrayList<Curso> getCursos() {
        return cursos;
    }
    public void setCursos(ArrayList<Curso> cursos) {
        this.cursos = cursos;
    }

    public void imprimirCursos() {
        if(cursos == null) {
            System.out.println("Não há cursos a serem imprimidos.");
        } else {
            for(int i=0; i<cursos.size(); i++) {
                System.out.println(getCursos().get(i).getNome());
                System.out.println("Portaria: " + getCursos().get(i).getPortaria());
            }
        }
    }
}
