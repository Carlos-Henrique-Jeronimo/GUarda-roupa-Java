public class Tenis {
    private String ccor;
    private int tt;
    private String tipoo;
    private int qq;

    public void setCcor(String ccor) {
        this.ccor = ccor;
    }

    public void setTt(int tt) {
        this.tt = tt;
    }

    public void setTipoo(String tipoo) {
        this.tipoo = tipoo;
    }

    public void setQq(int qq) {
        this.qq = qq;
    }

    public String getCcor() {
        return ccor;
    }

    public int getTt() {
        return tt;
    }

    public String getTipoo() {
        return tipoo;
    }

    public int getQq() {
        return qq;
    }

    public boolean teniis (int qq){
       if(qq>0){
           JOptionPane.showMessageDialog(null, "O tênis de cor "+this.ccor+", de tamanho "+this.tt+", do tipo "+this.tipoo+" está no seu guarda-roupa.");
      return true;  
       } else{
           JOptionPane.showMessageDialog(null, "O tênis não está no guarda-roupa");
           return false;
       }
    } 
}
