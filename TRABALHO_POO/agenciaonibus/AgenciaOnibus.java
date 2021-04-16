package agenciaonibus;

import java.util.ArrayList;
import java.util.List;

public class AgenciaOnibus extends InforPassagem{
	
	private String nomeAgencia;
	private int codAgencia;
	private InforPassagem passagem;
	private List<InforPassagem> passagens = new ArrayList<InforPassagem>();

	public void setNomeAgencia(String nomeAgencia) {
		this.nomeAgencia = nomeAgencia;
	}

	public String getNomeAgencia() {
		return nomeAgencia;
	}

	public void setCodAgencia(int codAgencia) {
		this.codAgencia = codAgencia;
	}

	public int getcodAgencia() {
		return codAgencia;
	}

	public InforPassagem getPassagem() {
		return passagem;
	}

	public void setPassagem(InforPassagem passagem) {
		this.passagem = passagem;
	}

	public void adicionarPassagem(InforPassagem passagem) {
		passagens.add(passagem);
	}
	
	public void ExibirDadosPassagem() {
		for(InforPassagem passagem : passagens) {
			passagem.ExibirInfoPassagem();
		}
	}

}
