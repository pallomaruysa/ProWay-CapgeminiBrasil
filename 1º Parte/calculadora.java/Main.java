/******************************************************************************

        1ª Parte – Uma calculadora de alcance de anúncio online.
        
Receba o valor investido em reais e retorne uma projeção aproximada da quantidade
máxima de pessoas que visualizarão o mesmo anúncio (considerando o anúncio original
+ os compartilhamentos)
*******************************************************************************/
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    
	    Scanner sc = new Scanner(System.in);
	    
	    //Apresentação - Boas-vindas
		System.out.println("\n           --->  Seja bem-vindo ao Calculator Pro!");
	    System.out.println("-> Aqui sua empresa pode projetar, aproximadamente, o quanto precisa investir para atigir uma quantidade de pessoas.\n");

        //Cadastro - Informações
        System.out.println("Informe o nome da Empresa/Entidade:");
        String nome = sc.nextLine();        
        System.out.println("Informe o CNPJ da Empresa/Entidade:");
        String cnpj = sc.nextLine();
        System.out.println("Informe o email da Empresa/Entidade:");
        String email = sc.nextLine();
        
        //Coleta de dados - Valor investido
        System.out.println("Digite aqui o valor a ser investido, em reais. Por favor!");
        double val_Invest = Double.parseDouble(sc.nextLine());
        
        //Associação de Classes
        DadosEmpresa em = new DadosEmpresa(nome, cnpj, email, val_Invest);
        CalculatorPro cp = new CalculatorPro(em);
        
        System.out.println("\n----------------------------------------------------");
        System.out.println(" DADOS DA EMPRESA");
        
        System.out.println("\n -> Nome: "+em.getNomeEmpresa()+"\n -> CNPJ: "+em.getCNPJ()+"\n -> Email: "+em.getEmail());
        System.out.println("----------------------------------------------------");
        
        System.out.println(" CALCULATOR PRO - Projetando o seu investimento\n");
        
        System.out.println("-> Visualizaram o anúncio original: "+cp.getQntVisuOrigin()+" pessoas");
        System.out.println("-> Visualizaram o anúncio compartilhado: "+cp.getQntVisuCompart()+" pessoas");
        System.out.println("-> Total de Visualizações: "+cp.getQntVisuTotal()+" pessoas");
        System.out.println("-> VALOR INVESTIDO R$"+cp.getEmpresa().getValorInvestido());
        System.out.println("-> Visualizarão Aproximadamente: "+cp.CalcularInvestimento()+" pessoas");
	}
}
