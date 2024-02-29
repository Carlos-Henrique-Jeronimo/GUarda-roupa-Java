public class Camisa {
    private int quantidade;
    private String cor;
    private String tamanho;
    private String tipo;

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCor() {
        return cor;
    }

    public String getTamanho() {
        return tamanho;
    }

    public String getTipo() {
        return tipo;
    }
  public boolean camisaa(int qtd){
    if(qtd>0){
    JOptionPane.showMessageDialog(null, "A camisa da cor "+this.cor+" do tipo "+this.tipo+" do tamanho "+this.tamanho+" está no guarda-roupa.");
    return true;
} else{
        JOptionPane.showMessageDialog(null, "Camisa não encontrada");
        return false;
    }
  }
}
