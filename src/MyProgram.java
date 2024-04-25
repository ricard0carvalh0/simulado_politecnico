import model.Aluno;
import model.Apontamento;
import model.Cefet;
import model.Curso;
import model.Disciplina;
import model.Grade;
import model.Pessoa;
import model.Professor;

public class MyProgram {
    public static void main(String[] args) {
        
        Cefet cefet = new Cefet();
        cefet.setNome("CEFET-RJ");
        cefet.setUrl("cefet.com.br");
        
        Curso si = new Curso("Sistemas de Informação", "01");
        cefet.getCursos().add(si);

        System.out.println();
        si.imprimirInfo();
        System.out.println();
        cefet.imprimirCursos();

        //primeiro periodo
        Disciplina algoritmoEstrutu = new Disciplina("Algoritmo Estruturado", 90, null);
        Disciplina fundamentosMate = new Disciplina("Fundamentos da Matemática", 90, null);
        Disciplina eletricidadeBasica = new Disciplina("Eletricidade Básica", 74, null);
        Disciplina fisica = new Disciplina("Física", 74, null);
        Disciplina portugues = new Disciplina("Leitura e Produção de Textos Acadêmicos", 74, null);

        //segundo semestre
        Disciplina ltp1 = new Disciplina();
        ltp1.setNome("Linguagem e Técnicas de programação 1");
        ltp1.setCh(90);
        ltp1.getPreRequisitos().add(algoritmoEstrutu);
        Disciplina arquiteturaComp = new Disciplina("Arquitetura de Computadores", 74, null);
        Disciplina logicaComp = new Disciplina();
        logicaComp.setNome("Lógica Computacional");
        logicaComp.setCh(74);
        logicaComp.getPreRequisitos().add(algoritmoEstrutu);
        Disciplina calculo = new Disciplina();
        calculo.setNome("Calculo Diferencial e Integral");
        calculo.setCh(90);
        calculo.getPreRequisitos().add(fundamentosMate);
        Disciplina ingles1 = new Disciplina();
        ingles1.setNome("Inglês 1");
        ingles1.setCh(37);
        ingles1.getPreRequisitos().add(portugues);
        Disciplina labEletricidade1 = new Disciplina("Laboratório de Eletricidade 1", 37, null);

        //terceiro semestre
        Disciplina algEstrururaDados = new Disciplina();
        algEstrururaDados.setNome("Algoritmo e Estrutura de Dados 1");
        algEstrururaDados.setCh(74);
        algEstrururaDados.getPreRequisitos().add(algoritmoEstrutu);
        Disciplina ingles2 = new Disciplina();
        ingles2.setNome("Ingles 2");
        ingles2.setCh(37);
        ingles2.getPreRequisitos().add(ingles1);
        Disciplina labEletricidade2 = new Disciplina();
        labEletricidade2.setNome("Laboratório de Eletricidade 2");
        labEletricidade2.setCh(37);
        labEletricidade2.getPreRequisitos().add(labEletricidade1);
        Disciplina ltp2 = new Disciplina();
        ltp2.setNome("Linguagem e Técnicas de Programação 2");
        ltp2.setCh(74);
        ltp2.getPreRequisitos().add(ltp1);
        Disciplina eletronica = new Disciplina();
        eletronica.setNome("Eletrônica Analógica e Digital");
        eletronica.setCh(74);
        eletronica.getPreRequisitos().add(labEletricidade1);
        Disciplina algebra = new Disciplina("Álgebra Linear", 90, null);

        System.out.println();
        algebra.imprimirRequisitos();
        ltp2.imprimirRequisitos();

        Grade gradeSi = new Grade();
        gradeSi.setAno(2022);
        gradeSi.setChTotal(1190);
        gradeSi.setCurso(si);
        //primeiro Semestre
        gradeSi.getDisciplinas().add(algoritmoEstrutu);
        gradeSi.getDisciplinas().add(fundamentosMate);
        gradeSi.getDisciplinas().add(eletricidadeBasica);
        gradeSi.getDisciplinas().add(portugues);
        gradeSi.getDisciplinas().add(fisica);
        //segundo Semestre
        gradeSi.getDisciplinas().add(ltp1);
        gradeSi.getDisciplinas().add(arquiteturaComp);
        gradeSi.getDisciplinas().add(logicaComp);
        gradeSi.getDisciplinas().add(calculo);
        gradeSi.getDisciplinas().add(ingles1);
        gradeSi.getDisciplinas().add(labEletricidade1);
        //terceiro Semestre
        gradeSi.getDisciplinas().add(algEstrururaDados);
        gradeSi.getDisciplinas().add(ltp2);
        gradeSi.getDisciplinas().add(ingles2);
        gradeSi.getDisciplinas().add(labEletricidade2);
        gradeSi.getDisciplinas().add(eletronica);
        gradeSi.getDisciplinas().add(algebra);

        System.out.println();
        gradeSi.imprimirGrade();

        Professor professor = new Professor("Fulano", null, "123456789", 0, 5000, 0);
        Aluno aluno = new Aluno();
        aluno.setNome("Cicrano");
        aluno.setNumeroFiscal("789456123");
        aluno.setGrade(gradeSi);
        
        System.out.println();
        professor.imprimirPessoa();
        System.out.println();
        aluno.imprimirPessoa();

        Apontamento primeiroSemestre1 = new Apontamento(8.0, "Aprovado", "2022.2", algoritmoEstrutu);
        Apontamento primeiroSemestre2 = new Apontamento(9.8, "Aprovado", "2022.2", eletricidadeBasica);
        Apontamento primeiroSemestre3 = new Apontamento(5.4, "Aprovado", "2022.2", fisica);
        Apontamento primeiroSemestre4 = new Apontamento(6, "Aprovado", "2022.2", fundamentosMate);
        Apontamento primeiroSemestre5 = new Apontamento(8.5, "Aprovado", "2022.2", portugues);
        Apontamento segundoSemestre1 = new Apontamento(7.0, "Aprovado", "2023.1", arquiteturaComp);
        Apontamento segundoSemestre2 = new Apontamento(5.08, "Aprovado", "2023.1", calculo);
        Apontamento segundoSemestre3 = new Apontamento(8.4, "Aprovado", "2023.1", ingles1);
        Apontamento segundoSemestre4 = new Apontamento(10, "Aprovado", "2023.1", logicaComp);
        Apontamento segundoSemestre5 = new Apontamento(9, "Aprovado", "2023.1", labEletricidade1);
        Apontamento segundoSemestre6 = new Apontamento(7.5, "Aprovado", "2023.1", ltp1);
        Apontamento terceiroSemestre1 = new Apontamento(7.5, "Aprovado", "2023.2", algEstrururaDados);
        Apontamento terceiroSemestre2 = new Apontamento(7.5, "Aprovado", "2023.2", algebra);
        Apontamento terceiroSemestre3 = new Apontamento(9.2, "Aprovado", "2023.2", eletronica);
        Apontamento terceiroSemestre4 = new Apontamento(8.4, "Aprovado", "2023.2", ingles2);
        Apontamento terceiroSemestre5 = new Apontamento(8.5, "Aprovado", "2023.2", labEletricidade2);
        Apontamento terceiroSemestre6 = new Apontamento(4.8, "Reprovado", "2023.2", ltp2);

        System.out.println();
        primeiroSemestre3.imprimirRegistro();
        terceiroSemestre1.imprimirRegistro();

        aluno.getHistorico().add(primeiroSemestre1);
        aluno.getHistorico().add(primeiroSemestre2);
        aluno.getHistorico().add(primeiroSemestre3);
        aluno.getHistorico().add(primeiroSemestre4);
        aluno.getHistorico().add(primeiroSemestre5);
        aluno.getHistorico().add(segundoSemestre1);
        aluno.getHistorico().add(segundoSemestre2);
        aluno.getHistorico().add(segundoSemestre3);
        aluno.getHistorico().add(segundoSemestre4);
        aluno.getHistorico().add(segundoSemestre5);
        aluno.getHistorico().add(segundoSemestre6);
        aluno.getHistorico().add(terceiroSemestre1);
        aluno.getHistorico().add(terceiroSemestre2);
        aluno.getHistorico().add(terceiroSemestre3);
        aluno.getHistorico().add(terceiroSemestre4);
        aluno.getHistorico().add(terceiroSemestre5);
        aluno.getHistorico().add(terceiroSemestre6);

        System.out.println();
        aluno.imprimirHistorico();

        aluno.estaIntegralizado();
        aluno.getDisciplinasFaltantes();
    }
}
