package org.collections;

public class Car {

	private int vin;
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getVin() {
		return vin;
	}

	public void setVin(int vin) {
		this.vin = vin;
	}

	public String toString() {
		return ("Car's VIN is" + this.vin);
	}

	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (obj instanceof Car) {
			if (((Car) obj).getName().equals(this.getName())) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}
	}

	
	public int hashCode() {
		return this.getName().length();

	}
}
