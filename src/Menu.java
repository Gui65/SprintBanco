import java.util.Scanner;

public class Menu {
	
	int opcao;
	private Cliente cliente = new Cliente();
	private Conta conta = new Conta();

	Scanner ler = new Scanner(System.in);
	
	public void menu() {
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
		this.cliente.CadastroDados();
		break;
	}
	case 2: {
		this.cliente.conta.Depositar(0); // Menu > Cliente > Conta > Depositar
		break;
	}
	case 3: {
		this.cliente.conta.Transferir(0);
		break;
	}
	case 4: {
		this.cliente.conta.ConsultarSaldo(cliente);
		break;
	}
	case 5: {
		System.out.println("O programa foi encerrado");
		break;
	}
}
}while(opcao != 5);
	}
}
