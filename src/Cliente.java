import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Random;


public class Cliente {
	
	private String cpf;
	private String nome;
	private TipoCliente tipo;
	public Conta conta;
	
	Random gerador = new Random();
	
	public void Status() {
		System.out.println("O nome é: "+ this.getNome());
		System.out.println("O CPF é: "+ this.tipo);
		
	}
	
	public Cliente() { //Constructor
		this.tipo = TipoCliente.COMUM;
		
	}
	
	public void CadastroDados(String n, String c) {
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite seu nome: ");
		n = ler.nextLine();
		this.conta.setNumero(gerador.nextInt());
		
		while(this.conta.getNumero() < 99999 || this.conta.getNumero() >= 999999) { //Gerando um número aleatorio de 6 digitos para a conta
			this.conta.setNumero(gerador.nextInt());
		}
		
		do{
			System.out.print("Digite seu CPF: ");
			c = ler.next();
			this.setCpf(c);
			
			if(ValidarCpf.isCPF(this.getCpf()) == true) { //Verifica se o CPF está correto
			this.setCpf(c);
			this.setNome(n);
			System.out.println("Cadastro com Sucesso");
		}else {
			System.out.println("CPF INVALIDO");
		}
			
	}while(ValidarCpf.isCPF(this.getCpf()) == false);
}
	
	public String getCpf() {
		return this.cpf;
	}

	public void setCpf(String c) {
		this.cpf = c;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String n) {
		this.nome = n;
	}

	public TipoCliente getTipo() {
		return this.tipo;
	}

	public void setTipo(TipoCliente t) {
		this.tipo = t;
	}
	public Conta getConta() {
		return this.conta;
	}
	public void setConta(Conta c) {
		this.conta = c;
	}
}