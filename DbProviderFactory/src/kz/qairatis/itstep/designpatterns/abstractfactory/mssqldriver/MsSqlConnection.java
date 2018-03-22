package kz.qairatis.itstep.designpatterns.abstractfactory.mssqldriver;

import kz.qairatis.itstep.designpatterns.abstractfactory.db.DbConnection;

public class MsSqlConnection implements DbConnection {
	public MsSqlConnection(String connectionString) {
		this.connectionString = connectionString;
	}

	String connectionString;
	@Override
	public void open() {
		// TODO Auto-generated method stub @done
		System.out.println("Open connection:" + connectionString);		
	}

	@Override
	public void close() {
		// TODO Auto-generated method stub
		System.out.println("Close connection:" + connectionString);			
	}

	@Override
	public String toString() {
		return "MsSqlConnection [connectionString=" + connectionString + "]";
	}

}
