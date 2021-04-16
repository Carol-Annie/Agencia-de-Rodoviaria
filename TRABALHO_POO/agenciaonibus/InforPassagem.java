package agenciaonibus;

 public class InforPassagem extends Passagem implements LocaisdeDestino {

     private String local;
     private double preco;
     private int qtd_pessoas;
     private StatusPassagem status;
     double operacao;

    public void setLocal(String local) {
    	this.local = local;
    }
     
     public String getLocal() {
         return local;
     }

     public double getPreco() {
         return preco;
     }
     
     public int getNumpessoas() {
    	 return qtd_pessoas;
     }
     
     public void setStatus(StatusPassagem status) {
    	 this.status = status;
     }
     
     public StatusPassagem getStatus() {
         return status;
     }

     @Override
     public void InfoPassagem(String local, double preco, StatusPassagem status) {
         this.local = local;
         this.preco = preco;
         this.status = status;
     }
     
     public void MudarStatus(StatusPassagem status) {
    	 this.status = status;
    	 System.out.println("Status da passagem atualizada");
     }

     public void informacoes(String local,int qtd_pessoas, StatusPassagem status, double preco) {
    	 this.local = local;
    	 this.qtd_pessoas = qtd_pessoas;
    	 this.preco = preco;
    	 this.status = status;
     }

     public void ExibirInfoPassagem() {
    	 System.out.println("+++ Informações sobre passagem +++");
    	 System.out.println("Local de destino: "+getLocal());
    	 System.out.println("Disponibilidade: "+getStatus());
    	 System.out.println("Valor: R$  "+getPreco());
     }
     
     public void ExibirInfoPassagemPessoaJuridica() {
    	 
    	 operacao = (preco * qtd_pessoas);
    	 
    	 System.out.println("+++ Informações sobre passagem +++");
    	 System.out.println("Local de destino: "+getLocal());
    	 System.out.println("Disponibilidade: "+getStatus());
    	 System.out.println("Número de passageiros: "+getNumpessoas());
    	 System.out.println("Valor individual: R$  "+getPreco());
    	 System.out.println("Valor total: R$  "+operacao);
    	 
     }
 }
