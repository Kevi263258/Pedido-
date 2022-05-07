package com.mycompany.trabalhoavaliativo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author cedup
 */
public class Empresa {

    ArrayList<Colaborador> listaDeColaboradores;
    ArrayList<Vaga> vagas;

    void contratar(String regimeDeTrabalho, String nome, String cpf, int numeroDeCadastro, float salario, String funcao) {
        Colaborador colaborador = new Colaborador(regimeDeTrabalho, nome, cpf, numeroDeCadastro, salario, funcao);
        this.listaDeColaboradores.add(colaborador);
    }

    void demitir(int numeroDeCadastro) {
        for (int i = 0; i < this.listaDeColaboradores.size(); i++) {
            if (this.listaDeColaboradores.get(i).numeroDeCadastro == numeroDeCadastro) {
                listaDeColaboradores.remove(i);
            }
        }
    }

    float gastos(String solicitante) {
        float gastoTotal = 0;
        for (int i = 0; i < this.listaDeColaboradores.size(); i++) {
            if (this.listaDeColaboradores.get(i).nome.equals(solicitante)) {
                if (this.listaDeColaboradores.get(i).funcao.equals("RH")) {
                    for (int i2 = 0; i2 < this.listaDeColaboradores.size(); i2++) {
                        gastoTotal = gastoTotal + this.listaDeColaboradores.get(i2).salario;
                    }
                } else {
                    System.out.println("Usuario nao tem permissao");
                }
            }
        }
        return gastoTotal;
    }

    void cadastrarVaga(String nome, String funcao, String descricao, float salario) {
        Vaga vaga = new Vaga(nome, funcao, descricao, salario);
        this.vagas.add(vaga);
    }

    void inscreverVaga(Colaborador colaborador, Vaga vaga) {
        vaga.candidatar(colaborador);
    }

    void candidatosEmVagas() {
        for (int i = 0; i < this.vagas.size(); i++) {
            vagas.get(i).candidatosver();
        }
    }
}
