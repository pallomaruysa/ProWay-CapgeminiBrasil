/******************************************************************************

        2ª Parte – Um sistema de cadastro de anúncios.
        
Crie um sistema que permita o cadastro de anúncios, fornecendo os relatórios de cada um.
*******************************************************************************/
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	    //Apresentação - Boas-vindas
		System.out.println("\n           --->  Seja bem-vindo ao Developer Pro!");
	    System.out.println("-> Aqui você pode gerar, aos seus clientes, um relatório, que controla o dinheiro investido e quantas pessoas terão acesso ao anúncio, além de cadastrá-lo.\n");

        //Cadastro - Informações do Cliente
        System.out.println("Informe o nome da Pessoa/Empresa/Entidade:");
        String nome = sc.nextLine();        
        System.out.println("Informe o CPF/CNPJ da Pessoa/Empresa/Entidade (Ex.: CPF:xxx.xxx.xxx-xx):");
        String cpf_cnpj = sc.nextLine();
        System.out.println("Informe o email da Pessoa/Empresa/Entidade:");
        String email = sc.nextLine();
        System.out.println("Informe o telefone da Pessoa/Empresa/Entidade:");
        String fone1 = sc.nextLine();
        System.out.println("Informe outro telefone para contato:");
        String fone2 = sc.nextLine();
        
        DadosCliente cli = new DadosCliente(nome, cpf_cnpj, email, fone1, fone2);
        System.out.println("\n----------------------------------------------------");
        
        //Cadastro - Informações do Anúncio
        System.out.println("Informe o nome do Anúncio:");
        String nomeA = sc.nextLine();        
        System.out.println("Informe a data inicial (Ex.: dd/mm):");
        String dtInicial = sc.nextLine();
        System.out.println("Informe a data final (Ex.: dd/mm):");
        String dtFinal = sc.nextLine();
        System.out.println("Informe a quantidade de dias que o anúncio ficará disponível:");
        int qntDias = Integer.parseInt(sc.nextLine());
        System.out.println("Digite aqui o valor a ser investido diariamente, em reais. Por favor!");
        double val_Invest = Double.parseDouble(sc.nextLine());
        
        DadosAnuncio anu = new DadosAnuncio(cli, nomeA, dtInicial, dtFinal, qntDias, val_Invest);
        DeveloperPro dp = new DeveloperPro(anu);

        System.out.println("\n----------------------------------------------------");
        System.out.println(" DADOS DO CLIENTE");
        
        System.out.println("\n -> Nome: "+cli.getNomeCliente()+"\n -> CPF/CNPJ: "+cli.getCPF_CNPJ()+"\n -> Email: "+cli.getEmail()+"\n -> Telefone 01: "+cli.getTelefone1()+"\n -> Telefone 02: "+cli.getTelefone2());
        System.out.println("----------------------------------------------------\n");
        
        System.out.println(" DADOS DO ANÚNCIO");
        
        System.out.println("\n -> Nome: "+anu.getNomeAnuncio()+"\n -> Data Inicial: "+anu.getDataInicial()+"\n -> Data Final: "+anu.getDataFinal()+"\n -> Quantidade de dias: "+anu.getQntDias()+"\n -> Valor Investido ao Dia: "+anu.getValorInvestido());
        System.out.println("----------------------------------------------------\n");
        
        System.out.println(" DEVELOPER PRO - Relatório do Anúncio\n");
        
        System.out.println("-> Valor Total do Investimento: "+dp.getValorInvestidoTotal());
        System.out.println("-> A quantidade máxima de Visualizações será de "+dp.getVisualizacaoMax());
        System.out.println("-> A quantidade máxima de Cliques será de "+dp.getCliquesMax());
        System.out.println("-> A quantidade máxima de Compartilhamentos será de "+dp.getCompartMax());
	}
}

