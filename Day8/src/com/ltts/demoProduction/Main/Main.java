package com.ltts.demoProduction.Main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

import com.ltts.demoProduction.Model.Production;
import com.ltts.demoProduction.dao.ProductionDao;

public class Main {

	public static void main(String[] args) throws SQLException, NumberFormatException, IOException, ParseException{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		ProductionDao pd=new ProductionDao();
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int m=5;
		do {
			System.out.println("Enter choice number: \n1.Insert. \n2.Update. \n3.View. \n4.Delete");
			int n=sc.nextInt();
			
			switch(n) {
			case 1:
				
				System.out.println("Enter production id :");
				int id=Integer.parseInt(br.readLine());
				
				System.out.println("Enter production name  :");
				String productionname=br.readLine();
				
				System.out.println("Enter adress:");
				String adress=br.readLine();
				
				
				
				System.out.println("Enter ownername");
				String ownername=br.readLine();
				
			
				System.out.println("Enter release date:");
				String releaseDate=br.readLine();

			    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
			  //  DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
			 LocalDate validDate= LocalDate.parse(releaseDate, formatter);
				
				
				Production pp=new Production(id,productionname,adress,ownername,validDate);
				pd.insertProduction(pp); // 1 crud :insertion
				break;
			case 2:
			
				System.out.println("Enter production id which you want to update");
			
				int uid=Integer.parseInt(br.readLine());
				System.out.println("Enter the new production name");
				String newName=br.readLine();
				pd.updateProduction(uid,newName);//crud upate
				break;
			case 3:
				List<Production> li=pd.getAllProductions(); // 2 :view
				for(Production p:li)
				{
					System.out.println(p);
				}
				break;
			case 4:
				System.out.println("Enter id of production which u want to delete");
				id=Integer.parseInt(br.readLine());
				pd.deleteProduction(id);//crud delete
				break;
			}
		
			
		}
		
		while(m>0);
		
		
		
		
		
		
		
		
		
		

		
		
	
		

	}

}
