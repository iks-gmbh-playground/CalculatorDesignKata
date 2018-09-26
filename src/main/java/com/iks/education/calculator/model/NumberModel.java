package com.iks.education.calculator.model;

public class NumberModel {
	private String value = "";
	
	public NumberModel(String value) {
		super();
		this.value = value;
	}

	public String getValue() {
		return value;
	}
	
	public void setValue(String value) {
		this.value = value;
	}
	
	public String appendDigit(String digit) {
		value = ("0".equals(value)) ? digit : (value + digit); 			
		return value;
	}

	public String appendComma() {
		value = (value.contains(",")) ? value : value + ",";
		return value;
	}

	public String cleanInput() {
		value = "0";
		return value;
	}

	public String toggleSign() {
		value = (value.charAt(0)=='-') ? value.substring(1) : "-" + value;
		return value;
	}

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((value == null) ? 0 : value.hashCode());
		return result;
	}

	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NumberModel other = (NumberModel) obj;
		if (value == null) {
			if (other.value != null)
				return false;
		} else if (!value.equals(other.value))
			return false;
		return true;
	}
	

	public String deleteLastElement() {
		if(value.length()>1)
			value = value.substring(0, value.length()-1);
		else
			value = "0";
		return value;
	}


}
