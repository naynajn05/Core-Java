//to demonstrate multilevel inheritance-grand child class

package com.tnsif.multilevelinheritancedemo;

public class City extends State {
//data members
	private String cityName;
	private String places;
	private float area;
	
	//getters and setters
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public String getPlaces() {
		return places;
	}
	public void setPlaces(String places) {
		this.places = places;
	}
	public float getArea() {
		return area;
	}
	public void setArea(float area) {
		this.area = area;
	}
	@Override
	public String toString() {
		return "City [cityName=" + cityName + ", places=" + places + ", area=" + area + ", toString()="
				+ super.toString() + "]";
	}
	
	
	
	
}
