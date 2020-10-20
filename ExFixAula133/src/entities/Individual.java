package entities;


public class Individual extends TaxPayer {
	
	private Double healthExpenditures;
	
	public Individual() {
		super();
	}

	public Individual(String name, Double anuallncome, Double healthExpenditures) {
		super(name, anuallncome);
		this.healthExpenditures = healthExpenditures;
	}
		
	public Double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}

	@Override
	public double tax() {
		
		Double value = 0.0;
		
		if(this.getAnuallncome() < 20000.00) {
			
			if(this.getHealthExpenditures() == 0) {
				
				value = this.getAnuallncome() * 0.15;
				
			} else {
				
				value = (this.getAnuallncome() * 0.15) - (this.getHealthExpenditures() * 0.5);
				
			}
			
			
		}else {
			
			if(this.getHealthExpenditures() == 0) {
				
				value = this.getAnuallncome() * 0.25;
				
			} else {
			
				value = (this.getAnuallncome() * 0.25) - (this.getHealthExpenditures() * 0.5);
				
			}
			
		}
		
		return value;
		
	}
	
	


}
