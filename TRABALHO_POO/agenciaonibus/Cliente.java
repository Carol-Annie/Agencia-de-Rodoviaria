package agenciaonibus;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidade.tipodepessoa.CartaoCredito;
import entidade.tipodepessoa.CartaoDebito;
import entidade.tipodepessoa.Dinheiro;
import entidade.tipodepessoa.FormasdePagamento;
import entidade.tipodepessoa.PessoaFisica;
import entidade.tipodepessoa.PessoaJuridica;

public class Cliente extends AgenciaOnibus{
	
	Scanner paga = new Scanner(System.in);

    private PessoaFisica pessoa_fisica;
    private List<PessoaFisica> pessoas_fisicas = new ArrayList<PessoaFisica>();
    private PessoaJuridica pessoa_juridica;
    private List<PessoaJuridica> pessoas_juridicas = new ArrayList<PessoaJuridica>();
    AgenciaOnibus ag;
    FormasdePagamento pagamento = new FormasdePagamento();

    public void setPessoaFisica(PessoaFisica pessoa_fisica) {
        this.pessoa_fisica = pessoa_fisica;
    }

    public void setPessoa_fisica(PessoaFisica pessoa_fisica) {
        this.pessoa_fisica = pessoa_fisica;
    }

    public PessoaFisica getPessoa_fisica() {
        return pessoa_fisica;
    }

    public void setPessoa_juridica(PessoaJuridica pessoa_juridica) {
        this.pessoa_juridica = pessoa_juridica;
    }

    public PessoaJuridica getPessoa_juridica() {
        return pessoa_juridica;
    }

    public void adicionarPessoaFisica(PessoaFisica pessoa_fisica) {
    	pessoas_fisicas.add(pessoa_fisica);
    }

    public void ExibirPessoaFisica() {
    	for(PessoaFisica pessoa_fisica : pessoas_fisicas) {
    		pessoa_fisica.ExibirInfoFi();
    	}
    }

    public void adicionarPessoaJuridica(PessoaJuridica pessoa_juridica) {
        pessoas_juridicas.add(pessoa_juridica);
    }
    
    public void ExibirPessoaJuridica() {
    	for(PessoaJuridica pessoa_juridica : pessoas_juridicas) {
    		pessoa_juridica.ExibirInfoJu();
    	}
    }

    public void EscolherPagamento() {
    	pagamento.escolha();
    	int escolha = paga.nextInt();
    	if( escolha == 1) {
    		Dinheiro dinheiro = new Dinheiro();
    		//double entrada = ag.getPreco();
    		//dinheiro.setPrecoPassagem(entrada);
    		dinheiro.NecessitaPagamento();
    	} else if(escolha==2) {
    		System.out.println("Informe o número do cartão: ");
    		String numeroCartao = paga.next();
    		System.out.println("Informe o CV do cartão: ");
    		String CV =  paga.next();
    		CartaoCredito cartao = new CartaoCredito(numeroCartao,CV);
    		cartao.InfoCartao();
    	} else {
    		System.out.println("Informe o número do cartão: ");
    		String numeroCartao = paga.next();
    		System.out.println("Informe o CV do cartão: ");
    		String CV =  paga.next();
    		CartaoDebito db = new CartaoDebito(numeroCartao,CV);
    		db.InfoCartaoD();
    	}
    }
}
