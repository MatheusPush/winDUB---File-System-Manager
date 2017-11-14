package winpiva;

/**
 *
 * @author Vi
 */
public class Arquivo {
    
    private String nome;
    
    private String data;
    
    private String pasta;
   
    private int inicio;
    
    private int fim;
    
    public Arquivo(String linhaHeader) {
        
        String [] partesHeader = linhaHeader.split(" / ");
        
        this.nome = partesHeader[1];
        this.inicio = Integer.parseInt(partesHeader[2]);
        this.fim = Integer.parseInt(partesHeader[3]);
        this.data = partesHeader[4];
        this.pasta = partesHeader[5];
    }
    
    public Arquivo() {}
    
    // Getters and Setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getPasta() {
        return pasta;
    }

    public void setPasta(String pasta) {
        this.pasta = pasta;
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
}
