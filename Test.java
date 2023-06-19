package de.zeroco.jdbc;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import org.apache.commons.*;

public class Test {
	public static String url = "jdbc:mysql://127.0.0.1:3306/";
	public static String username = "admin";
	public static String password = "Pr@veen12";

	public static void main(String[] args) {
		String csvFilePath = "C:\\Users\\91834\\Downloads\\Master_Pincode_data.csv";
//		String[] columnOperator = {">", "<"};
//		String[] conditionOperator = {"OR"};
//		Map<String, Object> map = new LinkedHashMap<String, Object>();
//		map.put("brand_name", "Dell");
//		map.put("model", "G18");
//		map.put("price", 70000);
//		map.put("ram_capacity", "4GB");
//		map.put("storage_capacity", "1000GB");
//		String[] columns = {"brand_name", "model"};
//		String[] conditionColumns = {"price", "price"};
//		Object[] values = {70000, 60000};
//		System.out.println(get("zerocode", "laptops", Arrays.asList(columns), Arrays.asList(conditionColumns), Arrays.asList(columnOperator), Arrays.asList(conditionOperator), Arrays.asList(values)));


//	public static Map<String, List<Object>> get(String schema, String tableName, List<String> columns, List<String> conditionColumns, List<String> columnOperator, List<String> conditionOperator, List<Object> conditionValue) {
//	    Map<String, List<Object>> result = new LinkedHashMap<>();
//	    Connection connect = Utility.getConnection(url, username, password, schema);
//	    PreparedStatement statement = JavaDataBaseConnection.getPreparedStatement(connect, QueryBuilder.getQuery(schema, tableName, columns, conditionColumns, columnOperator, conditionOperator));
//	    ResultSet resultSet = null;
//	    try {
//	    	int count = 0;
//	        for (Object value : conditionValue) {
//	            statement.setObject(++count, value);
//	        }
//	        resultSet = statement.executeQuery();
//	        int columnCount = resultSet.getMetaData().getColumnCount();
//	        while (resultSet.next()) {
//	            for (int i = 1; i <= columnCount; i++) {
//	                String columnName = resultSet.getMetaData().getColumnName(i);
//	                Object columnValue = resultSet.getObject(i);
//	                List<Object> columnValues = result.get(columnName);
//	                if (columnValues == null) {
//	                    columnValues = new ArrayList<>();
//	                    result.put(columnName, columnValues);
//	                }
//	                columnValues.add(columnValue);
//	            }
//	        }
//	    } catch (SQLException e) {
//	        e.printStackTrace();
//	    } finally {
//	        Utility.closeConnection(connect);
//	        JavaDataBaseConnection.closeStatement(statement);
//	        JavaDataBaseConnection.closeResultSet(resultSet);
//	    }
//	    return result;
	}

}
