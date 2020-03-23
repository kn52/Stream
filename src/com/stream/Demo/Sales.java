package com.stream.Demo;

import com.opencsv.bean.CsvBindByName;

public class Sales {
	
	@CsvBindByName(column = "Region" , required = true)
	public String region;	
	@CsvBindByName(column = "Country" , required = true)
	public String country;	
	@CsvBindByName(column = "Item Type" , required = true)
	public String item_Type;	
	@CsvBindByName(column = "Sales Channel" , required = true)
	public String sales_Channel;	
	@CsvBindByName(column = "Order Priority" , required = true)
	public String order_Priority;	
	@CsvBindByName(column = "Order Date" , required = true)
	public String order_Date;	
	@CsvBindByName(column = "Order ID" , required = true)
	public String order_ID;	
	@CsvBindByName(column = "Ship Date" , required = true)
	public String ship_Date;	
	@CsvBindByName(column = "Unit Sold" , required = true)
	public String units_Sold;	
	@CsvBindByName(column = "Unit Price" , required = true)
	public String unit_Price;	
	@CsvBindByName(column = "Unit Cost" , required = true)
	public String unit_Cost;
	@CsvBindByName(column = "Total Revenue" , required = true)
	public String total_Revenue;	
	@CsvBindByName(column = "Total Cost" , required = true)
	public String total_Cost;	
	@CsvBindByName(column = "Total Profit" , required = true)
	public String total_Profit;
	
	
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getItem_Type() {
		return item_Type;
	}
	public void setItem_Type(String item_Type) {
		this.item_Type = item_Type;
	}
	public String getSales_Channel() {
		return sales_Channel;
	}
	public void setSales_Channel(String sales_Channel) {
		this.sales_Channel = sales_Channel;
	}
	public String getOrder_Priority() {
		return order_Priority;
	}
	public void setOrder_Priority(String order_Priority) {
		this.order_Priority = order_Priority;
	}
	public String getOrder_Date() {
		return order_Date;
	}
	public void setOrder_Date(String order_Date) {
		this.order_Date = order_Date;
	}
	public String getOrder_ID() {
		return order_ID;
	}
	public void setOrder_ID(String order_ID) {
		this.order_ID = order_ID;
	}
	public String getShip_Date() {
		return ship_Date;
	}
	public void setShip_Date(String ship_Date) {
		this.ship_Date = ship_Date;
	}
	public String getUnits_Sold() {
		return units_Sold;
	}
	public void setUnits_Sold(String units_Sold) {
		this.units_Sold = units_Sold;
	}
	public String getUnit_Price() {
		return unit_Price;
	}
	public void setUnit_Price(String unit_Price) {
		this.unit_Price = unit_Price;
	}
	public String getUnit_Cost() {
		return unit_Cost;
	}
	public void setUnit_Cost(String unit_Cost) {
		this.unit_Cost = unit_Cost;
	}
	public String getTotal_Revenue() {
		return total_Revenue;
	}
	public void setTotal_Revenue(String total_Revenue) {
		this.total_Revenue = total_Revenue;
	}
	public String getTotal_Cost() {
		return total_Cost;
	}
	public void setTotal_Cost(String total_Cost) {
		this.total_Cost = total_Cost;
	}
	public String getTotal_Profit() {
		return total_Profit;
	}
	public void setTotal_Profit(String total_Profit) {
		this.total_Profit = total_Profit;
	}
}
