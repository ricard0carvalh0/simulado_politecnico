package model;

public class Apontamento {
    
    private double nota;
    private String status;
    private String data;
    private Disciplina disciplina;

    public Apontamento() {

    }
    public Apontamento(double nota, String status, String data, Disciplina disciplina) {
        this.nota = nota;
        this.status = status;
        this.data = data;
        this.disciplina = disciplina;
    }

    public double getNota() {
        return nota;
    }
    public void setNota(double nota) {
        this.nota = nota;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }
    public Disciplina getDisciplina() {
        return disciplina;
    }
    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public void imprimirRegistro() {
        if(disciplina == null) {
            System.out.println("Disciplina não registrada.");
        } else {
            System.out.println("Disciplina: "  + getDisciplina().getNome());
            System.out.println("Nota: " + getNota());
            System.out.println("Status: " + getStatus());
            System.out.println("Data: " + getData());
        }
    }
}
