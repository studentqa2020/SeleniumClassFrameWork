package com.testng.advance.annotation;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

import com.excelFactory.ReturnExcel;

public class DataProvideExcel {
	

	@DataProvider(name = "Excel")
	public static Iterator<String[]> lf() throws IOException {

		ReturnExcel rn = ReturnExcel.getInstance();

		List<String[]> finalList = new ArrayList<>();
		
		finalList.addAll(Objects.requireNonNull(rn.returnExcel("./TestData/DataProviderData.xlsx", "Sheet1")));
		
		return finalList.iterator();
	}
	@Test(dataProvider = "Excel" )
	public void testMethod(String tc, String user,String pass) {
		
		System.out.println("Data is: " + tc + ": == :" + user + ": == :" + pass);

	}
}
