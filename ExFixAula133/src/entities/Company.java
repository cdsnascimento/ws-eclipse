package entities;

public class Company extends TaxPayer {
	
	private Integer numberOfEmployees;

	public Company() {
		super();
	}

	public Company(String name, Double anuallncome, Integer numberOfEmployees) {
		super(name, anuallncome);
		this.numberOfEmployees = numberOfEmployees;
	}
	
	public Integer getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(Integer numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}

	@Override
	public double tax() {
		
		Double value = 0.0;
		
		if(this.getNumberOfEmployees() <= 10) {
			
			value = this.getAnuallncome() * 0.16;
			
		} else {
			
			value = this.getAnuallncome() * 0.14;
			
		}
		
		return value;
		
	}
	
}
