package com.stream.Demo;

import com.opencsv.bean.CsvBindByName;

public class Sale {
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
	@CsvBindByName(column = "Units Sold" , required = true)
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
	public double total_Profit;
}
