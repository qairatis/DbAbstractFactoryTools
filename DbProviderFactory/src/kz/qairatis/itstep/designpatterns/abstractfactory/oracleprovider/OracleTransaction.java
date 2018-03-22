package kz.qairatis.itstep.designpatterns.abstractfactory.oracleprovider;

import kz.qairatis.itstep.designpatterns.abstractfactory.db.DbConnection;
import kz.qairatis.itstep.designpatterns.abstractfactory.db.DbTransaction;

public class OracleTransaction implements DbTransaction {
	private DbConnection connection;
	
	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("Start " + this.toString());
	}

	@Override
	public String toString() {
		return "OracleTransaction [connection=" + connection + "]";
	}

	@Override
	public void end() {
		// TODO Auto-generated method stub @done
		System.out.println("End " + this.toString());
		this.connection.close();
	}

	@Override
	public void useConnection(DbConnection connection) {
		// TODO Auto-generated method stub @done
		this.connection = connection;
		this.connection.open();
	}

}
