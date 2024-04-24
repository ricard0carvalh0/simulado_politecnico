package model;

public class Pessoa {
    
    private String nome;
    private String apelido;
    private String numeroFiscal;

    public Pessoa() {
        
    }
    public Pessoa(String nome, String apelido, String numeroFiscal) {
        this.nome = nome;
        this.apelido = apelido;
        this.numeroFiscal = numeroFiscal;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getApelido() {
        return apelido;
    }
    public void setApelido(String apelido) {
        this.apelido = apelido;
    }
    public String getNumeroFiscal() {
        return numeroFiscal;
    }
    public void setNumeroFiscal(String numeroFiscal) {
        this.numeroFiscal = numeroFiscal;
    }

    public void imprimirPessoa() {
        System.out.println("Nome: " + getNome());
        System.out.println("Apelido: " + getApelido());
        System.out.println("Número Fiscal: " + getNumeroFiscal());
    }
}
