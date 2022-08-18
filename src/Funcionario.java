
public class Funcionario {
	private String nome;
	private String cpf;
	private String dt_nascimento;
	private double salario;
	
	public double getBonificacao() {
		if(this.salario>=1000) {
			return this.salario*0.1;
		}else if(salario <1000) {
			return this.salario *0.05;
		}
		return getBonificacao();
		
			}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getDt_nascimento() {
		return dt_nascimento;
	}
	public void setDt_nascimento(String dt_nascimento) {
		this.dt_nascimento = dt_nascimento;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	

}
