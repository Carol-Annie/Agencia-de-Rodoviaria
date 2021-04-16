package entidade.tipodepessoa;

import java.util.Scanner;

public class CartaoCredito {
    
    Scanner dados = new Scanner(System.in);

    private double precoPassagem;
    private String numeroCartao;
    private String CV;

    public void setPrecoPassagem(double precoPassagem) {
        this.precoPassagem = precoPassagem;
    }

    public double getPrecoPassagem() {
        return precoPassagem;
    }

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public String getCV() {
        return CV;
    }

    public CartaoCredito(String numeroCartao, String CV) {
        System.out.println("Informe o número do cartão: ");
        this.numeroCartao = numeroCartao;
        System.out.println("Informe o CV do cartão: ");
        this.CV = CV;
    }
    
    public void InfoCartao() {
    	 System.out.println("Pagamento realizado com sucesso ");
    }
}
