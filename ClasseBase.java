public class Roupas {
    public static void main(String[] args) {
        
        Camisa c = new Camisa();
        Calca a = new Calca();
        Tenis t = new Tenis();
        int qtd; //camisa
        int cal; //calça
        int tt, qq; //tênis
        String quantidade, cor, tipo, tamanho; //camisa
        String quanti, corr, ttipo, ttamanho; // calça
        String ccor, tipoo; //tenis 
        
        // Camisa
        
        cor = JOptionPane.showInputDialog("Informe a cor da camisa: ");
        c.setCor(cor);
        
        tipo = JOptionPane.showInputDialog("Informe o tipo de camisa: (Regata - Camiseta)");
        c.setTipo(tipo);
        
        tamanho = JOptionPane.showInputDialog("Informe o tamanho da camisa(PP - P - M - G - GG - XG) ");
        c.setTamanho(tamanho);
        
         qtd = Integer.parseInt(JOptionPane.showInputDialog("Qual a quantidade de camisas?"));
        c.camisaa(qtd);
        
        // Calça
        
      corr = JOptionPane.showInputDialog("Informe a cor da calça: ");
      a.setCorr(corr);
      
      ttipo = JOptionPane.showInputDialog("Informe o tipo de calça: (Jeans - Legging - Jogger)");
      a.setTtipo(ttipo);
      
      ttamanho = JOptionPane.showInputDialog("Informe o tamanho da calça: (P - M - G - GG)");
      a.setTtamanho(ttamanho);
      
      cal = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de calças."));
      a.calca(cal);
        
      // Tênis
      
      ccor = JOptionPane.showInputDialog("Informe a cor do tênis: ");
      t.setCcor(ccor);
      
      tt = Integer.parseInt(JOptionPane.showInputDialog("Informe o tamanho do tênis: "));
      t.setTt(tt);
      
      tipoo = JOptionPane.showInputDialog("Informe o tipo de tênis: (Com cadarços - Sem cadarços)");
      t.setTipoo(tipoo);
      
      qq = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de tênis: "));
      t.teniis(qq);
      
      
      
    }
}
