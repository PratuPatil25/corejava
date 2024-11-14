package lab5;
	
	class CountryNotValidException extends Exception {
	    public CountryNotValidException(String message) {
	        super(message);
	    }
	}
	class EmployeeNameInvalidException extends Exception {
	    public EmployeeNameInvalidException(String message) {
	        super(message);
	    }
	}
	class TaxNotEligibleException extends Exception {
	    public TaxNotEligibleException(String message) {
	        super(message);
	    }
	}
	
	class TaxCalculator{
		 public double calculateTax(String empName, boolean isIndian, double empSal)
		            throws CountryNotValidException, EmployeeNameInvalidException, TaxNotEligibleException {
		        
		        if (empName == null || empName.isEmpty()) {
		            throw new EmployeeNameInvalidException("The employee name cannot be empty");
		        }
		        
		        if (!isIndian) {
		            throw new CountryNotValidException("The employee should be an Indian for calculating tax");
		        }
	
		        double taxAmount = 0;
	
		        if (empSal > 100000) {
		            taxAmount = empSal * 0.08;
		        } else if (empSal >= 50000 && empSal <= 100000) {
		            taxAmount = empSal * 0.06;
		        } else if (empSal >= 30000 && empSal < 50000) {
		            taxAmount = empSal * 0.05;
		        } else if (empSal >= 10000 && empSal < 30000) {
		            taxAmount = empSal * 0.04;
		        } else {
		            throw new TaxNotEligibleException("The employee does not need to pay tax");
		        }
		        
		        return taxAmount;
		    }
		}
	
	public class Salary {
	
		public static void main(String[] args) {
			  TaxCalculator taxCalculator = new TaxCalculator();
	
		       
		        try {
		            System.out.println("Tax amount : " + taxCalculator.calculateTax("Pratiksha", false, 35000));
		        } catch (Exception e) {
		            System.out.println(e.getMessage());
		            e.printStackTrace();
		        }
	
		       
		        try {
		            System.out.println("Tax amount : " + taxCalculator.calculateTax("Sakshi", true, 1500));
		        } catch (Exception e) {
		            System.out.println(e.getMessage());
		            e.printStackTrace();
		        }
	
		       
		        try {
		            System.out.println("Tax amount : " + taxCalculator.calculateTax("Harsh", true, 45000));
		        } catch (Exception e) {
		            System.out.println(e.getMessage());
		            e.printStackTrace();
		        }
	
		        
		        try {
		            System.out.println("Tax amount : " + taxCalculator.calculateTax("", true, 30000));
		        } catch (Exception e) {
		            System.out.println(e.getMessage());
		            e.printStackTrace();
		        }
		    }
	}
	
			
	
		
	
