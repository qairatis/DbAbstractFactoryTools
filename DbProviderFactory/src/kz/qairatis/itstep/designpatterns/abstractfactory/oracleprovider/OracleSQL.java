package kz.qairatis.itstep.designpatterns.abstractfactory.oracleprovider;

import kz.qairatis.itstep.designpatterns.abstractfactory.db.DbCommand;
import kz.qairatis.itstep.designpatterns.abstractfactory.db.DbTransaction;

public class OracleSQL implements DbCommand {
	private DbTransaction transaction;
	String sqlQuery;

	@Override
	public DbCommand setQuery(String commandText) {
		// TODO Auto-generated method stub
		this.sqlQuery = commandText;
		System.out.println("Set: " + this.sqlQuery);
		return this;
	}

	@Override
	public int execute() {
		// TODO Auto-generated method stub
		System.out.println("Execute: " + this.sqlQuery);
		this.transaction.end();
		return 0;
	}

	@Override
	public void useTransaction(DbTransaction transaction) {
		// TODO Auto-generated method stub
		this.transaction = transaction;
		this.transaction.start();
	}

}
