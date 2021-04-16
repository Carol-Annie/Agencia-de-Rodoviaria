package entidade.tipodepessoa;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Dinheiro {
    
    Scanner resposta = new Scanner(System.in);
    private double precoPassagem;
    private double dinheiro_cliente;
    private int op;

    public void setPrecoPassagem(double precoPassagem) {
        this.precoPassagem = precoPassagem;
    }

    public double getPrecoPassagem() {
        return precoPassagem;
    }

    public void setDinheiro_Cliente(double dinheiro_cliente) {
        this.dinheiro_cliente = dinheiro_cliente;
    }

    public double getDinheiro_Cliente() {
        return dinheiro_cliente;
    }

    //ver necessidade de retorno
    public void NecessitaPagamento() {

    	try {
    		System.out.println("Você necessita de troco: 1 - sim 2 - não");
    		op = resposta.nextInt();
    		if (op == 1) {
    			System.out.println("Pagamento realizao!!");
    		} else{
    			//menor ou igual
    			System.out.println("Você não precisa de troco!!");
    		}
    	} catch (InputMismatchException e) {
    		System.out.println("Opção invalida" + e.toString());
    	}
    }

}
