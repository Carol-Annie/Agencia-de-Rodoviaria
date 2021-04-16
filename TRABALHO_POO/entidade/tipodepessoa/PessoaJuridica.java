package entidade.tipodepessoa;

public class PessoaJuridica {
    private String nomeEmpresa;
    private String razaoSocial;
    private String CNPJ;
    private String contato;
    private String endereco;
    private String destino;
    private int qtd_pessoas;

    public String getNomeEmpresa() {
    	return nomeEmpresa;
    }
    
    public String getContato() {
    	return contato;
    }
    
    public String getCnpj() {
    	return CNPJ;
    }
    
    public String getRazao() {
    	return razaoSocial;
    }
    
    public String getEnderco() {
    	return endereco;
    }
    
    public String getDestino() {
    	return destino;
    }
    
    public int getNumeroPessoas() {
    	return qtd_pessoas;
    }

    public PessoaJuridica(String nomeEmpresa, String contato, String CNPJ, String razaoSocial, String endereco, String destino, int qtd_pessoas) {
        this.nomeEmpresa = nomeEmpresa;
        this.contato = contato;
        this.CNPJ = CNPJ;
        this.endereco = endereco;
        this.razaoSocial = razaoSocial;
        this.destino = destino;
        this.qtd_pessoas = qtd_pessoas;
    }

    public void ExibirInfoJu() {
        System.out.println("+++ Informações da Empresa +++");
        System.out.println("Empresa: " + getNomeEmpresa());
        System.out.println("CNPJ: " + getCnpj());
        System.out.println("Razão social: " + getRazao());
        System.out.println("Contato: " + getContato());
        System.out.println("Endereço: " + getEnderco());
        System.out.println("Destino desejado: " + getDestino());
        System.out.println("Número de passageiros: " + getNumeroPessoas());
    }
}
