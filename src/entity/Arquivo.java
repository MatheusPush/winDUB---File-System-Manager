/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.Date;

/**
 *
 * @author Push
 */
public class Arquivo {
    
    private String nome;
    private int tipo;
    private String path;
    private int inicio;
    private int fim;
    private String criacao;
    private String dir;
    
    public Arquivo (String header) {
        
        String [] h = header.split("|");
        
        tipo = Integer.parseInt(h[0]); // #0 = META, #1 = ARQUIVO, #2 = DIR
        nome = h[1];
        path = h[2];
        inicio = Integer.parseInt(h[3]);
        fim = Integer.parseInt(h[4]);
        criacao = h[5];
        dir = h[6];
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public int getInicio() {
        return inicio;
    }

    public void setInicio(int inicio) {
        this.inicio = inicio;
    }

    public int getFim() {
        return fim;
    }

    public void setFim(int fim) {
        this.fim = fim;
    }

    public String getCriacao() {
        return criacao;
    }

    public void setCriacao(String criacao) {
        this.criacao = criacao;
    }

    public String getDir() {
        return dir;
    }

    public void setDir(String dir) {
        this.dir = dir;
    }
    
}
