package com.wheretoeat.dto;

public class RestaurantDTO {

	private String name;
	private String description;
	private String address;
	private String hours;
	private boolean isOpen;
	private String website;
	private double rating;
	private String priceScale;
	private String bysyness;
	private double latitude;
	private double longitude;
	private FoodType foodType;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getHours() {
		return hours;
	}
	public void setHours(String hours) {
		this.hours = hours;
	}
	public boolean isOpen() {
		return isOpen;
	}
	public void setOpen(boolean isOpen) {
		this.isOpen = isOpen;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	public String getPriceScale() {
		return priceScale;
	}
	public void setPriceScale(String priceScale) {
		this.priceScale = priceScale;
	}
	public String getBysyness() {
		return bysyness;
	}
	public void setBysyness(String bysyness) {
		this.bysyness = bysyness;
	}
	public double getLatitude() {
		return latitude;
	}
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	public double getLongitude() {
		return longitude;
	}
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	public FoodType getFoodType() {
		return foodType;
	}
	public void setFoodType(FoodType foodType) {
		this.foodType = foodType;
	}
}
