package kz.qairatis.itstep.designpatterns.abstractfactory.oracleprovider;

import kz.qairatis.itstep.designpatterns.abstractfactory.db.DbCommand;
import kz.qairatis.itstep.designpatterns.abstractfactory.db.DbTransaction;

public class OracleSQL implements DbCommand {
	private DbTransaction transaction;
	String sqlQuery;
	
	public OracleSQL(DbTransaction transaction) {
		this.transaction = transaction;
	}

	@Override
	public void setCommandText(String commandText) {
		// TODO Auto-generated method stub
		this.sqlQuery = commandText;
		System.out.println("Set: " + this.sqlQuery);
	}

	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		System.out.println("Prepare: " + this.sqlQuery);
	}

	@Override
	public int execute() {
		// TODO Auto-generated method stub
		System.out.println("Execute: " + this.sqlQuery);
		return 0;
	}

	@Override
	public int cancel() {
		// TODO Auto-generated method stub
		System.out.println("Trying to cancel execution via Oracle engine");
		return 0;
	}

}
