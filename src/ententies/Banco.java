package ententies;

public class Banco {
	private int number;
	private String holder;
	private double value;
	
	//construtor padrão
	 public Banco(){
	 }
	 
	
	//construtor com todos argumentos
	public Banco(int number, String holder, double value) {
		this.number = number;
		this.holder = holder;
		deposit(value);
	}
	
	//construtor com 2 argumentos
	public Banco(int number, String holder) {
		this.number = number;
		this.holder = holder;
	}

	public int getNumber() {
		return number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getValue() {
		return value;
	}
	
	
	public void deposit(double deposit) {
		value+=deposit;
	}
	
	public void withdraw(double withdraw) {
		value-=withdraw+ 5.0;
	}
	
	public String toString() {
		return "Account "
				+number
				+", Holder: "
				+holder
				+", Balance: $"
				+String.format("%.2f", value);
	}
	
	
}
