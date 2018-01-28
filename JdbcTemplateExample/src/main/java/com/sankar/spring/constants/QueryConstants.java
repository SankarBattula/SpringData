package com.sankar.spring.constants;

public interface QueryConstants {
	
	public static String CREATE_QUERY = "CREATE TABLE ACCOUNT (ACCNO NUMBER(5)"
			+ ", NAME VARCHAR(10),BAL NUMBER(8,2))";
	
	public static String DML_QUERY = "UPDATE ACCOUNT SET NAME='Sankar'";

}
