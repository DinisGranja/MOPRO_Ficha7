/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package my_company.ficha7;

/**
 *
 * @author dinis
 */
public class Funcionario {

    private String nome;
    private float vencimento;

    private static final String NOME_POR_OMISSAO = "sem nome";
    private static final float VENC_POR_OMISSAO = 500;

    public Funcionario() {
        nome = NOME_POR_OMISSAO;
        vencimento = VENC_POR_OMISSAO;

    }

    public Funcionario(String nome, float vencimento) {
        this.nome = nome;
        this.vencimento = vencimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getVencimento() {
        return vencimento;
    }

    public void setVencimento(float vencimento) {
        this.vencimento = vencimento;
    }

    public String toString() {
        return nome + " tem o vencimento de " + vencimento;
    }
}
