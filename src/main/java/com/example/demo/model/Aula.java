package com.example.demo.model;

import javax.persistence.*;

@Entity//(name="tb_aula")

public class Aula {
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(length=100)
    private String assunto;

    private String descricao;


}
