public class Calca {
    private String corr;
    private String ttipo;
    private String ttamanho;
    private int quanti;

    public String getCorr() {
        return corr;
    }

    public String getTtipo() {
        return ttipo;
    }

    public String getTtamanho() {
        return ttamanho;
    }

    public int getQuanti() {
        return quanti;
    }

    public void setCorr(String corr) {
        this.corr = corr;
    }

    public void setTtipo(String ttipo) {
        this.ttipo = ttipo;
    }

    public void setTtamanho(String ttamanho) {
        this.ttamanho = ttamanho;
    }

    public void setQuanti(int quanti) {
        this.quanti = quanti;
    }

    public boolean calca (int cal){
        if(cal>0){
            JOptionPane.showMessageDialog(null, "A calça de cor "+this.corr+", do tipo "+this.ttipo+", do tamanho "+this.ttamanho+" está no seu guarda-roupa.");
            return true;
        } else{
            JOptionPane.showInputDialog("A calça não está no armário.");
            return false;
        }
    }
    
}
