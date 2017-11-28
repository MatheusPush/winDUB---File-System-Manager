/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.ArrayList;
import java.util.List;
import javax.swing.event.TreeModelListener;
import javax.swing.tree.TreeModel;
import javax.swing.tree.TreePath;

/**
 *
 * @author Push
 */
public class ArquivoTreeModel implements TreeModel {
    
    Arquivo root = new Arquivo();
    
    private List<TreeModelListener> listeners = new ArrayList<TreeModelListener>();
    
    private List<Arquivo> arquivos;

    public ArquivoTreeModel(List<Arquivo> arquivos) {
        
        this.arquivos = arquivos;
        root.setId("0");
        root.setIdInterno("0");
        
    }

    @Override
    public Object getRoot() {
        return root;
    }

    @Override
    public Object getChild(Object parent, int index) {
        
        if (((Arquivo)parent).getId().equals("0")) return arquivos.get(index);
        
        return ((Arquivo) parent).getArquivos().get(index);
        
    }

    @Override
    public int getChildCount(Object parent) {
        
        if (((Arquivo)parent).getId().equals("0")) return arquivos.size();
        
        return ((Arquivo)parent).getArquivos().size();
        
    }

    @Override
    public boolean isLeaf(Object node) {        
        if (((Arquivo)node).getId().equals("0")) return false;
        
        return ((Arquivo)node).getTipo() == 1;
    }

    @Override
    public void valueForPathChanged(TreePath path, Object newValue) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getIndexOfChild(Object parent, Object child) {
        
        if (((Arquivo)parent).getId().equals("0")) return arquivos.indexOf(child);
        
        return ((Arquivo) parent).getArquivos().indexOf(child);
        
    }

    @Override
    public void addTreeModelListener(TreeModelListener l) {
        listeners.add(l);
    }

    @Override
    public void removeTreeModelListener(TreeModelListener l) {
        listeners.remove(l);
    }

    public List<Arquivo> getArquivos() {
        return arquivos;
    }

    public void setArquivos(List<Arquivo> arquivos) {
        this.arquivos = arquivos;
    }
    
}
