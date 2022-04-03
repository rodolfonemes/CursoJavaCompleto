package entities;

public class Company extends TaxPayer{

	private int numberOfEmployees;
	
	
	public Company() {
	}
	
	public Company(String name, Double anualIncome, int numberOfEmployees) {
		super(name, anualIncome);
		this.numberOfEmployees = numberOfEmployees;
	}

	public int getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(int numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}

	@Override
	public Double tax() {
		Double TAX;
		if(numberOfEmployees > 10) {
			TAX = super.getAnualIncome() * 0.14;
		}else {
			TAX = super.getAnualIncome() * 0.16;
		}
		return TAX;
	}

}
