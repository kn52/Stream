package com.stream.Demo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import com.opencsv.bean.*;
import java.util.ArrayList;
import java.util.Iterator;

import static java.lang.System.out;

public class StreamDemo {

		public static void main(String[] args) throws IOException, SalesException {
		
		StreamDemo streamDemo=new StreamDemo();
		String filePath="C:\\Users\\Kajal\\Desktop\\Sales_Record.csv";
//		List<Sales> list=readFile(filePath);
//		printData(list,32);
//		streamDemo.readFile1(filePath);
//		streamDemo.readFile2(filePath);
//		streamDemo.readFile3(filePath);
//		streamDemo.readFile4(filePath);
//		streamDemo.readFile5(filePath);
		streamDemo.readFile6(filePath);
		
		
	}

	private void readFile6(String filePath) {
		try (Reader reader=Files.newBufferedReader(Paths.get(filePath));){
			CsvToBean<Sale> csvReader=new CsvToBeanBuilder(reader).withType(Sale.class).withIgnoreLeadingWhiteSpace(true).build();
			Iterator<Sale> it=csvReader.iterator();
			while(it.hasNext()) {
				ArrayList<Sale> list=new ArrayList();
				Sale s=it.next();
				list.add(s);
				out.println(s.country+" "+s.order_ID);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}

	private void readFile5(String filePath) { 
		try {
			Reader reader=Files.newBufferedReader(Paths.get(filePath));
			CSVParser csvParser=new CSVParserBuilder().withSeparator(',').build();
			CSVReader csvReader=new CSVReaderBuilder(new FileReader(filePath))
					.withCSVParser(csvParser)
					.withSkipLines(1).build();
			String[] line;
			while((line=csvReader.readNext())!=null) {
				for(String str : line)
					out.print(str +  " ");
				out.println();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void readFile4(String filePath) {
		try {
			Reader reader=Files.newBufferedReader(Paths.get(filePath));
			CSVReader csvReader=new CSVReaderBuilder(new FileReader(filePath))
					.withSkipLines(1).build();
			String[] line;
			while((line=csvReader.readNext())!=null) {
				for(String str : line)
					out.print(str +  " ");
				out.println();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void readFile3(String filePath) {
		try {
			Reader reader=Files.newBufferedReader(Paths.get(filePath));
			CSVReader csvReader=new CSVReader(new FileReader(filePath));
			List<String[]> list=csvReader.readAll();
			for(String[] str : list) {
				out.print(str +  " ");
			out.println();}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void readFile2(String filePath) {
		try {
			Reader reader=Files.newBufferedReader(Paths.get(filePath));
			CSVReader csvReader=new CSVReader(new FileReader(filePath));
			String[] line;
			while((line=csvReader.readNext())!=null) {
				for(String str : line)
					out.print(str +  " ");
				out.println();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}

	private void readFile1(String filePath) {
		try {
			CSVReader csvReader=new CSVReader(new FileReader(filePath));
			String[] line;
			while((line=csvReader.readNext())!=null) {
				for(String str : line)
					out.print(str +  " ");
				out.println();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	private static void printData(List<Sales> list, int k) throws SalesException {
		if(k<0 || k>list.size())
			throw new SalesException("NO_DATA_FOUND",SalesException.SalesExceptionType.NO_DATA_FOUND);
		else 
			out.println(list.get(k).toString());
	}

	private static void printData(List<Sales> list) {
		for(int i=0;i<list.size();i++) {
			out.print("Region:"+list.get(i).getRegion()+" ");
			out.print("Country:"+list.get(i).getCountry()+" ");
			out.print("Item Type:"+list.get(i).getItem_Type()+" ");
			out.print("Sales Channel:"+list.get(i).getSales_Channel()+" ");
			out.print("Order Priority:"+list.get(i).getOrder_Priority()+" ");
			out.print("Order Date:"+list.get(i).getOrder_Date()+" ");
			out.print("Order ID:"+list.get(i).getOrder_ID()+" ");
			out.print("Ship Date:"+list.get(i).getShip_Date()+" ");
			out.print("Unit Sold:"+list.get(i).getUnits_Sold()+" ");
			out.print("Unit Price:"+list.get(i).getUnit_Price()+" ");
			out.print("Unit Cost:"+list.get(i).getUnit_Cost()+" ");
			out.print("Total Revenue:"+list.get(i).getTotal_Revenue()+" ");
			out.print("Total Cost:"+list.get(i).getTotal_Cost()+" ");
			out.print("Total Profit:"+list.get(i).getTotal_Profit()+" ");
			out.println();
		}	
		
	}

	private static List<Sales> readFile(String filePath) throws SalesException {
		BufferedReader bufferedReader;
		List<Sales> list=new ArrayList<Sales>();
		String line;
		try {
			FileReader file=new FileReader(filePath);
			bufferedReader=new BufferedReader(file);
			while((line=bufferedReader.readLine())!=null) {
				String [] data=line.split(",");
				Sales sale=new Sales();
				sale.setRegion(data[0]);
				sale.setCountry(data[1]);
				sale.setItem_Type(data[2]);
				sale.setSales_Channel(data[3]);
				sale.setOrder_Priority(data[4]);
				sale.setOrder_Date(data[5]);
				sale.setOrder_ID(data[6]);
				sale.setShip_Date(data[7]);
				sale.setUnits_Sold(data[8]);
				sale.setUnit_Price(data[9]);
				sale.setUnit_Cost(data[10]);
				sale.setTotal_Revenue(data[11]);
				sale.setTotal_Cost(data[12]);
				sale.setTotal_Profit(data[13]);
				list.add(sale);
			}
		} catch (FileNotFoundException e) {
			throw new SalesException("FILE_NOT_FOUND",SalesException.SalesExceptionType.FILE_NOT_FOUND);
		} catch (IOException e) {
			throw new SalesException("INPUT_OUTPUT_ERROR",SalesException.SalesExceptionType.INPUT_OUTPUT_ERROR);
		}
		return list;
	}
}
