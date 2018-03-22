package kz.qairatis.itstep.designpatterns.abstractfactory.mssqldriver;

import kz.qairatis.itstep.designpatterns.abstractfactory.db.DbCommand;

public class MsSqlCommand extends DbCommand {
	String sqlQuery;
	@Override
	public DbCommand setQuery(String commandText) {
		// TODO Auto-generated method stub
		this.sqlQuery = commandText;
		System.out.println("Prepare: " + this.sqlQuery);
		return this;
	}

	@Override
	public int execute() {
		// TODO Auto-generated method stub
		System.out.println("Execute: " + this.sqlQuery);
		this.getTransaction().end();
		return 0;
	}
}
