//EQUIPE: ANNE CAROLINE - 470124, BRUNO HOLANDA - 427774 , DHIOLENO RODRIGUES - 472734 
//ví0eo https://youtu.be/pxOeERxvuvg

package principal;

import java.util.InputMismatchException;
import java.util.Scanner;

import agenciaonibus.AgenciaOnibus;
import agenciaonibus.Cliente;
import agenciaonibus.InforPassagem;
import agenciaonibus.StatusPassagem;
import entidade.tipodepessoa.PessoaFisica;
import entidade.tipodepessoa.PessoaJuridica;

public class Princi {
	public static void main(String[] args) {

		Scanner dados = new Scanner(System.in);

		InforPassagem info = new InforPassagem();
		AgenciaOnibus agencia = new AgenciaOnibus();
		Cliente clienteF = new Cliente();
		Cliente clienteJ = new Cliente();

		InforPassagem info2 = new InforPassagem();
		//AgenciaOnibus agencia2 = new AgenciaOnibus();
		Cliente clienteF2 = new Cliente();
		Cliente clienteJ2 = new Cliente();


		int opcao = 0;
		int pessoa = 0;
		int continuar = 0;

		System.out.println("*** Bem-vindo ao sistema ***");

		do {


			try {
				System.out.println(">>>Selecione uma opção >>>");
				System.out.println("       MENU    ");
				System.out.println("1 - Cadastro de destinos");
				System.out.println("2 - Efetuar compra dos clientes");
				System.out.println("3 - Atualizar disponibilidade das passagens");
				opcao = dados.nextInt();

			} catch(InputMismatchException e) {
				System.out.println("Opção inválida"+e.toString());
			}

			if(opcao == 1) {

				//InforPassagem info = new InforPassagem();

				System.out.println("Destino: ");
				String local = dados.next();
				System.out.println("Valor da passagem: ");
				double preco = dados.nextDouble();
				System.out.println("Disponibilidade: ");
				String estados = dados.next();
				info.InfoPassagem(local, preco,StatusPassagem.valueOf(estados));


				agencia.adicionarPassagem(info);
				agencia.ExibirDadosPassagem();

				System.out.println("Destino: ");
				String local2 = dados.next();
				System.out.println("Valor da passagem: ");
				double preco2 = dados.nextDouble();
				System.out.println("Disponibilidade: ");
				String estados2 = dados.next();
				info2.InfoPassagem(local2, preco2,StatusPassagem.valueOf(estados2));


				agencia.adicionarPassagem(info2);
				agencia.ExibirDadosPassagem();

			} else if(opcao == 2) {
				System.out.println(">>>Selecione uma opção >>>");

				try {
					System.out.println("1 - Pessoa física");
					System.out.println("2 - Pessoa juridica/empresa");
					pessoa = dados.nextInt();

				} catch(InputMismatchException e) {
					System.out.println("Opção inválida"+e.toString());
				}

				if(pessoa == 1) {

					agencia.ExibirDadosPassagem();
					//exibir locais e disponibilide, aí cliente escolhe
					System.out.println("Informe o nome do cliente: ");
					String nome = dados.next();
					System.out.println("Número para contato: ");
					String contato = dados.next();
					System.out.println("CPF do cliente: ");
					String cpf = dados.next();
					System.out.println("Endereço do cliente: ");
					String end = dados.next();
					System.out.println("Destino desejado: ");
					String desDesejado = dados.next();

					PessoaFisica pessoaF = new PessoaFisica(nome,contato,cpf,end,desDesejado);
					clienteF.adicionarPessoaFisica(pessoaF);
					clienteF.ExibirPessoaFisica();
					clienteF.EscolherPagamento();


					agencia.ExibirDadosPassagem();
					//exibir locais e disponibilide, aí cliente escolhe
					System.out.println("Informe o nome do cliente: ");
					String nome2 = dados.next();
					System.out.println("Número para contato: ");
					String contato2 = dados.next();
					System.out.println("CPF do cliente: ");
					String cpf2 = dados.next();
					System.out.println("Endereço do cliente: ");
					String end2 = dados.next();
					System.out.println("Destino desejado: ");
					String desDesejado2 = dados.next();

					PessoaFisica pessoaF2 = new PessoaFisica(nome2,contato2,cpf2,end2,desDesejado2);
					clienteF2.adicionarPessoaFisica(pessoaF2);
					clienteF2.ExibirPessoaFisica();
					clienteF2.EscolherPagamento();

				} else {

					agencia.ExibirDadosPassagem();

					System.out.println("Informe o nome da empresa: ");
					String nomeEmpresa = dados.next();
					System.out.println("Informe o CNPJ: ");
					String CNPJ = dados.next();
					System.out.println("Informe a razão social: ");
					String razaoSocial = dados.next();
					System.out.println("Informe o número para contato: ");
					String contato = dados.next();
					System.out.println("Informe o endereço da empresa: ");
					String endereco = dados.next();
					System.out.println("Destino deseja: ");
					String destino = dados.next();
					System.out.println("Número de passageiros: ");
					int numero = dados.nextInt();

					PessoaJuridica pessoaJ = new PessoaJuridica(nomeEmpresa, CNPJ,razaoSocial,contato,endereco,destino,numero);

					clienteJ.adicionarPessoaJuridica(pessoaJ);
					clienteJ.ExibirPessoaJuridica();
					clienteJ.EscolherPagamento();

					agencia.ExibirInfoPassagemPessoaJuridica();

					System.out.println("Informe o nome da empresa: ");
					String nomeEmpresa2 = dados.next();
					System.out.println("Informe o CNPJ: ");
					String CNPJ2 = dados.next();
					System.out.println("Informe a razão social: ");
					String razaoSocial2 = dados.next();
					System.out.println("Informe o número para contato: ");
					String contato2 = dados.next();
					System.out.println("Informe o endereço da empresa: ");
					String endereco2 = dados.next();
					System.out.println("Destino deseja: ");
					String destino2 = dados.next();
					System.out.println("Número de passageiros: ");
					int numero2 = dados.nextInt();

					PessoaJuridica pessoaJ2 = new PessoaJuridica(nomeEmpresa2, CNPJ2,razaoSocial2,contato2,endereco2,destino2,numero2);

					clienteJ2.adicionarPessoaJuridica(pessoaJ2);
					clienteJ2.ExibirPessoaJuridica();
					clienteJ2.EscolherPagamento();

					agencia.ExibirInfoPassagemPessoaJuridica();

				}

			} else if(opcao == 3) {
				agencia.ExibirDadosPassagem();
				System.out.println(" Nova disponibilidade: ");
				String estados = dados.next();
				info.MudarStatus(StatusPassagem.valueOf(estados));
				System.out.println(" Status da passagem atualizada");

				agencia.ExibirDadosPassagem();

			}

			System.out.println("0 - voltar ao Menu ");
			System.out.println("1 - encerrar ");
			continuar = dados.nextInt();

		}while(continuar != 1);
		
		System.out.println("Até a próxima!");

		dados.close();
	}
}
