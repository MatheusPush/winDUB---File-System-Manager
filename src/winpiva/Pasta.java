package winpiva;

import java.util.List;

/**
 *
 * @author Vi
 */
public class Pasta {
    
    private String nome;
    
    private List<Arquivo> arquivos;
    
    private String data;
    
    public Pasta(String linha) {
        
        String [] partes = linha.split(" / ");
        
        this.nome = partes[1];
        this.data = partes[2];
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Arquivo> getArquivos() {
        return arquivos;
    }

    public void setArquivos(List<Arquivo> arquivos) {
        this.arquivos = arquivos;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
