import java.util.Scanner;

public class Conta {
	
	private String numero;
	private double saldo;
	private Cliente cliente;
	
	Scanner ler = new Scanner(System.in);
	
	public Conta() { //constructor
		this.setSaldo(0.0);
	}
	
	public void Transferir(double v) {
		System.out.print("Digite quando quer tranferir: ");
		v = ler.nextDouble();
		if(v <= this.getSaldo()) {
			setSaldo(getSaldo() - v);
			System.out.println("Tranferencia realizada com sucesso!");
		}else {
			System.out.println("Saldo insuficiente!");
		}
		System.out.println("Seu saldo é: "+ getSaldo());
	}
	
	public void Depositar(double v) {
		System.out.print("Digite quando quer depositar: ");
		v = ler.nextDouble();
		setSaldo(getSaldo() + v);
		System.out.println("Sucesso seu saldo é de: "+ getSaldo());
	}
	
	public void ConsultarSaldo(Cliente cliente) {
		
		System.out.println("Nome: "+ cliente.getNome());
		System.out.println("Cpf: "+ cliente.getCpf());
		System.out.println("Saldo: "+ this.getSaldo());
		
		if(this.getSaldo() >= 15000.00) {
			cliente.setTipo(TipoCliente.PREMIUM);
		}else if(this.getSaldo() >= 5000.00 && this.getSaldo() <= 14999.00) {
			cliente.setTipo(TipoCliente.SUPER);
		}else {
			cliente.setTipo(TipoCliente.COMUM);
		}
		
		System.out.println("O tipo é: "+ cliente.getTipo());
	}
	
	
	public String getNumero() {
		return this.numero;
	}
	public void setNumero(String n) {
		this.numero = n;
	}
	public double getSaldo() {
		return this.saldo;
	}
	public void setSaldo(double s) {
		this.saldo = s;
	}
	public Cliente getCliente() {
		return this.cliente;
	}
	
	
	
}
