package entidade.tipodepessoa;

public class PessoaFisica {
    private String nomePessoa;
    private String CPF;
    private String contato;
    private String endereco;
    private String local;
    
    public String getNomePessoa() {
        return nomePessoa;
    }

    public String getContato() {
        return contato;
    }

    public String getCpf() {
        return CPF;
    }

    public String getEnderco() {
        return endereco;
    }
    
    public String getLocal() {
        return local;
    }
    

    public PessoaFisica(String nomePessoa, String contato, String Cpf, String endereco,String local) {
        this.nomePessoa = nomePessoa;
        this.contato = contato;
        this.CPF = Cpf;
        this.endereco = endereco;
        this.local = local;
    }

    public void ExibirInfoFi() {
        System.out.println("+++ Informações dos passageiros +++");
        System.out.println("Cliente do embarque: " + getNomePessoa());
        System.out.println("CPF: " + getCpf());
        System.out.println("Contato do passageiro: " + getContato());
        System.out.println("Endereço: " + getEnderco());
        System.out.println("Destino: " + getLocal());
    }    
}
