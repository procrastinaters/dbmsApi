package com.stock.api;


import org.springframework.stereotype.Component;

import java.sql.*;
import java.util.ArrayList;


@Component
public class Database {


    ArrayList<String> stockSymbols=new ArrayList<>();
    private Connection myConn = null;
    private Statement myStmt = null;
    private ResultSet myRs = null;

    public void createNameList() throws SQLException {
        stockSymbols.add("RELIANCE");
        stockSymbols.add("HDFC");
        stockSymbols.add("HUL");
        stockSymbols.add("ICICI");
        stockSymbols.add("INFY");
        stockSymbols.add("ITC");
        stockSymbols.add("MARUTI");
        stockSymbols.add("ONGC");
        stockSymbols.add("SBI");
        stockSymbols.add("TCS");

    }


    public Database() throws SQLException {
        try{
            myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/data?useSSL=false", "root", "password");
        }catch (Exception exc) {
            exc.printStackTrace();
        }
        finally {
            if (myRs != null) {
                myRs.close();
            }
        }
    }


    public ArrayList<Stock> read(int no){



        ArrayList<Stock> stocks =new ArrayList<Stock>();
        System.out.println("INIT");
        try{
            myStmt = myConn.createStatement();

            for(int i=0;i<10;i++)
            {
            String sql="SELECT * FROM "+stockSymbols.get(i)+" WHERE StockIndex="+Integer.toString(no);
            ResultSet resultSet=myStmt.executeQuery(sql);
            resultSet.first();
//            while(resultSet.next()) {
                stocks.add(new Stock(resultSet.getString("Symbol"),
                        null,
                        "NSE",
                        null,
                        resultSet.getDouble("Open_Price"),
                        resultSet.getFloat("Close_Price"),
                        resultSet.getFloat("Prev_Close"),
                        resultSet.getFloat("Average_Price"),
                        null));
            }
        }catch (Exception exc){
            exc.printStackTrace();
        }
        return stocks;
    }

    public ArrayList<StockInfo> readstockinfo(String stockName){

        System.out.println("3\n");

        ArrayList<StockInfo> stockinfo =new ArrayList<StockInfo>();
        System.out.println("StockInfo");
        try{
            myStmt = myConn.createStatement();

            for(int i=0;i<10;i++)
            {

                String sql="SELECT * FROM " + stockName ;
                ResultSet rs=myStmt.executeQuery(sql);

                while(rs.next())
                {
                    stockinfo.add(new StockInfo(
                                    rs.getInt("StockIndex"),
                                    rs.getString("Symbol"),
                                    rs.getString("Series"),
                                    rs.getString("Date"),
                                    rs.getDouble("Prev_Close"),
                                    rs.getDouble("Open_Price"),
                                    rs.getDouble("High_Price"),
                                    rs.getDouble("Low_Price"),
                                    rs.getDouble("Last_Price"),
                                    rs.getDouble("Close_Price"),
                                    rs.getDouble("Average_Price"),
                                    rs.getInt("Total_Traded_Quantity"),
                                    rs.getDouble("Turnover"),
                                    rs.getInt("No_of_Trades"),
                                    rs.getInt("Deliverable_Qty"),
                                        rs.getDouble("_Dly_Qt_to_Traded_Qty")
                            )
                    );
                }


            }
        }catch (Exception exc){
            exc.printStackTrace();
        }

        System.out.println("4\n");
        return stockinfo;
    }

    public void close() throws SQLException {
        myConn.close();
    }
}
