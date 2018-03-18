package kz.qairatis.itstep.designpatterns.abstractfactory.oracleprovider;

import kz.qairatis.itstep.designpatterns.abstractfactory.db.DbConnection;
import kz.qairatis.itstep.designpatterns.abstractfactory.db.DbTransaction;

public class OracleTransaction implements DbTransaction {
	private DbConnection connection;
	
	public OracleTransaction(DbConnection connection) {
		this.connection = connection;
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("Start " + this.toString());
	}

	@Override
	public void commit() {
		// TODO Auto-generated method stub @done
		System.out.println("Commit " + this.toString());
		
	}

	@Override
	public void rollback() {
		// TODO Auto-generated method stub @done
		System.out.println("Rollback " + this.toString());
	}

	@Override
	public String toString() {
		return "OracleTransaction [connection=" + connection + "]";
	}

}
