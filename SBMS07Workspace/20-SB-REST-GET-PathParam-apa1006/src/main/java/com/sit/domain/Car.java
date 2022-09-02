package com.sit.domain;

public class Car {

	private Integer carId;
	private String carBrand;
	private String carColor;
	@Override
	public String toString() {
		return "Car [carId=" + carId + ", carBrand=" + carBrand + ", carColor=" + carColor + ", carPrice=" + carPrice
				+ "]";
	}
	private Double carPrice;
	public Integer getCarId() {
		return carId;
	}
	public void setCarId(Integer carId) {
		this.carId = carId;
	}
	public String getCarBrand() {
		return carBrand;
	}
	public void setCarBrand(String carBrand) {
		this.carBrand = carBrand;
	}
	public String getCarColor() {
		return carColor;
	}
	public void setCarColor(String carColor) {
		this.carColor = carColor;
	}
	public Double getCarPrice() {
		return carPrice;
	}
	public void setCarPrice(Double carPrice) {
		this.carPrice = carPrice;
	}
}
