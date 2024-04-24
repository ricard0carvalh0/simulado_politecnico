package model;

public class Professor extends Pessoa{
    
    private int id;
    private double salario;
    private int contraro;

    public Professor() {
        
    }
    public Professor(String nome, String apelido, String numeroFiscal, int id, double salario, int contraro) {
        super(nome, apelido, numeroFiscal);
        this.id = id;
        this.salario = salario;
        this.contraro = contraro;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public int getContraro() {
        return contraro;
    }
    public void setContraro(int contraro) {
        this.contraro = contraro;
    }

    public void imprimirPessoa() {
        System.out.println("Nome: " + getNome());
        System.out.println("Apelido: " + getApelido());
        System.out.println("Número Fiscal: " + getNumeroFiscal());
        System.out.println("Id: " + getId());
        System.out.println("Salário: " + getSalario());
    }
}
