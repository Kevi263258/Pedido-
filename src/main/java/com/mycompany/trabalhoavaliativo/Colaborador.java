package com.mycompany.trabalhoavaliativo;

/**
 *
* @author cedup
 */
public class Colaborador {

    String regimeDeTrabalho;
    String nome;
    String cpf;
    int numeroDeCadastro;
    float salario;
    String funcao;

    Colaborador(String regimeDeTrabalho, String nome, String cpf, int numeroDeCadastro, float salario, String funcao) {
        this.regimeDeTrabalho = regimeDeTrabalho;
        this.nome = nome;
        this.cpf = cpf;
        this.numeroDeCadastro = numeroDeCadastro;
        this.salario = salario;
        this.funcao = funcao;
    }
}
