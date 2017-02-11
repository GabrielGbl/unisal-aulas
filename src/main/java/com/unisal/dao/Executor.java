package com.unisal.dao;
import java.io.IOException;
import java.sql.SQLException;

import com.unisal.model.City;

public class Executor {
	
	private static final CityDAO cityDAO = CityDAO.getInstance();

	public static void main(String[] args) {
			
		/* UPDATE
		 City city = new City();	
		
		try {
			city.setId(new Long("1"));
			city.setNome("Guará");
			city.setGeocodigo(1.0);
			city.setLatitude(1.0);
			city.setLongitude(1.0);
			
			cityDAO.update(city);			
			
		} catch (Exception e) {
			System.out.println(e.toString());
		}		
		
		/* DELETE	
		
		City city = new City();
		city.setId(new Long("1"));
		
		try {
			cityDAO.delete(city);
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		 CIDADE BY CODIGO
		
		try {
			City city = cityDAO.getCityByGeocodigo(0);
			System.out.println(city.toString());
		} catch (Exception e) {
			System.out.println(e.toString());
		}	
				
		 INSERT	
		
		City city = new City();
		city.setNome("Itajubá");
		city.setGeocodigo(0.0);
		city.setLatitude(0.0);
		city.setLongitude(0.0);
		
		CityDAO cityDAO = CityDAO.getInstance();
		try {
			cityDAO.insert(city);
		} catch (ClassNotFoundException | SQLException | IOException e) {
			System.out.println(e.toString());
		}*/
				
	} 

}
