package com.mycompany.trabalhoavaliativo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author cedup
 */
public class Vaga {

    ArrayList<Colaborador> candidatoslistas;
    String nome;
    String descricao;
    float salario;
    String funcao;

    public Vaga(String nome, String funcao, String descricao, float salario) {
        this.descricao = descricao;
        this.nome = nome;
        this.salario = salario;
        this.funcao = funcao;
    }

    void candidatar(Colaborador colaborador) {
        this.candidatoslistas.add(colaborador);
    }

    void candidatosver() {
        for (int i = 0; i < this.candidatoslistas.size(); i++) {
            System.out.println(this.candidatoslistas.get(i).nome);
        }
    }

}
