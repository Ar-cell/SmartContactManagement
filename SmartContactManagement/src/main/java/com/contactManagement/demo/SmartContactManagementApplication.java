package com.contactManagement.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import com.contactManagement.demo.entity.Report;

import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

@SpringBootApplication
@EnableEurekaClient
public class SmartContactManagementApplication {

	public static void main(String[] args) {
		
		try {
			String filePath = "C:\\Users\\arun9\\OneDrive\\Desktop\\"
					+ "Projects\\SmartContactManagement\\SmartContactManagement\\FirstReport.jrxml";
			Map<String, Object> parameters = new HashMap<String, Object>();
			parameters.put("StudentName", "Arun Mudgal");
			Report student1 = new Report(1,"Arun", "Mudgal", "Patwari gali", "Rajakhera");
			Report student2 = new Report(2,"Aman", "Mudgal", "Patwari gali", "Rajakhera");
			
			List<Report> list = new ArrayList<Report>();
			list.add(student1);
			list.add(student2);
			
			JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(list);
			
			
			JasperReport report =  JasperCompileManager.compileReport(filePath);
		 JasperPrint print = JasperFillManager.fillReport(report, parameters, dataSource);
		 
		 JasperExportManager.exportReportToPdfFile(print, filePath="C:\\Users\\arun9\\OneDrive\\Desktop\\New folder\\firstReport.pdf");
		 System.out.print("Report Created....");
		 
		}
		catch(Exception e) {
			
		}
		SpringApplication.run(SmartContactManagementApplication.class, args);
	}

}