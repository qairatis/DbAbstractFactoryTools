package kz.qairatis.itstep.designpatterns.abstractfactory.oracleprovider;

import kz.qairatis.itstep.designpatterns.abstractfactory.db.DbConnection;

public class OracleConnection implements DbConnection {
	String connectionString;
	public OracleConnection(String connectionString) {
		this.connectionString = connectionString;
	}

	@Override
	public void connect() {
		// TODO Auto-generated method stub @done
		System.out.println("Connecting to Oracle at " + connectionString);
	}

	@Override
	public void disconnect() {
		// TODO Auto-generated method stub
		System.out.println("Disconnected from " + connectionString);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return connectionString;
	}

}
