import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int opcao;
		
		Cliente c1 = new Cliente();
		c1.conta = new Conta();
		
		
		do{ 
			System.out.println("-----------------------");
			System.out.println("Bem vindo ao menu!");
			System.out.println("O que deseja fazer: ");
			System.out.println("1 - Cadastrar ");
			System.out.println("2 - Depositar");
			System.out.println("3 - Transferir");
			System.out.println("4 - Consultar saldo");
			System.out.println("5 - Sair");
			opcao = ler.nextInt();
			switch (opcao) {
		
		case 1: {
			c1.CadastroDados(null, null);
			break;
		}
		case 2: {
			c1.conta.Depositar(0);
			break;
		}
		case 3: {
			c1.conta.Transferir(0);
			break;
		}
		case 4: {
			c1.conta.ConsultarSaldo(c1);
			break;
		}
		case 5: {
			System.out.println("O programa foi encerrado");
			break;
		}
	}
	}while(opcao != 5);
		
//		c1.CadastroDados(null, null);
//		c1.conta.Depositar(0);
//		c1.conta.Transferir(0);
//		c1.conta.ConsultarSaldo();
		//c1.Status();

	}

}
