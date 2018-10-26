package com.stock.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;
import java.util.ArrayList;


@RestController
@SpringBootApplication
public class ApiApplication {

	@Autowired
	Database database;

static int i;
	public static void main(String[] args) throws SQLException	 {
		SpringApplication.run(ApiApplication.class, args);
//		api();
		i=1	;
	}

	@GetMapping("/api")
	public ArrayList<Stock> api() throws SQLException{

		database.createNameList();
		if(i==11)
			i=1;
		return database.read(i++);
	}

    @RequestMapping(value = "/chart/{symbol}")
    public ArrayList<StockInfo> chart(@PathVariable("symbol") String StockName) throws SQLException{
        System.out.println("2\n");
        return database.readstockinfo(StockName);
    }
}
