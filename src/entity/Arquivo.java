/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Enumeration;
import java.util.List;
import javax.swing.tree.TreeNode;

/**
 *
 * @author Push
 */
public class Arquivo implements TreeNode{
    
    private String nome;   
    private int tipo; // 0 -> Diretorio // 1 -> Arquivo 
    private String criacao;
    private String id;
    
    // Dados para navegação na árvore
    private String idInterno;
    private Arquivo pai;
    
    // Apenas para arquivos
    private String path;
    private int inicio;
    private int tamanho;
    
    // Apenas para diretorios  
    
    private List<Arquivo> arquivos = new ArrayList<Arquivo>(); 
    
    @Override
    public String toString(){
        return nome;
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

    public String getCriacao() {
        return criacao;
    }

    public void setCriacao(String criacao) {
        this.criacao = criacao;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public TreeNode getChildAt(int childIndex) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getChildCount() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public TreeNode getParent() {
        return pai;
    }

    @Override
    public int getIndex(TreeNode node) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean getAllowsChildren() {
        return tipo == 0;
    }

    @Override
    public boolean isLeaf() {
        return tipo == 1;
    }

    @Override
    public Enumeration children() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<Arquivo> getArquivos() {
        return arquivos;
    }

    public void setArquivos(List<Arquivo> arquivos) {
        this.arquivos = arquivos;
    }

    public String getIdInterno() {
        return idInterno;
    }

    public void setIdInterno(String idInterno) {
        this.idInterno = idInterno;
    }

    public Arquivo getPai() {
        return pai;
    }

    public void setPai(Arquivo pai) {
        this.pai = pai;
    }
    
    public int getQtdArquivos() {
        int count = 0;
        List<Arquivo> arq = getArquivos();
        
        for (int i = 0; i < arq.size(); i++) {
            if(arq.get(i).getTipo() == 1)
                count++;
        }
        return count;
    }
    
    public int getQtdArquivos(List<Arquivo> arq) {
        int count = 0;
        
        for (int i = 0; i < arq.size(); i++) {
            if(arq.get(i).getTipo() == 1)
                count++;
        }
        return count;
    }
    
    public int getQtdPastas() {
        int count = 0;
        List<Arquivo> arq = getArquivos();
        
        for (int i = 0; i < arq.size(); i++) {
            if(arq.get(i).getTipo() == 0)
                count++;
        }
        return count;
    }
    
    public int getQtdPastas(List<Arquivo> arq) {
        int count = 0;
        
        for (int i = 0; i < arq.size(); i++) {
            if(arq.get(i).getTipo() == 0)
                count++;
        }
        return count;
    }
    
    public String getDubPath(Arquivo root) {
        String str = this.nome;
        Arquivo arq = root;
        
        while(true){
            arq = arq.getPai();
            
            if(arq != null) str = arq.getNome() + "\\" + str;
            else break;
        }
        return ":\\" + str;
    }
    
}
