package kz.qairatis.itstep.designpatterns.abstractfactory.mssqldriver;

import kz.qairatis.itstep.designpatterns.abstractfactory.db.DbCommand;
import kz.qairatis.itstep.designpatterns.abstractfactory.db.DbConnection;
import kz.qairatis.itstep.designpatterns.abstractfactory.db.DbProviderFactory;
import kz.qairatis.itstep.designpatterns.abstractfactory.db.DbTransaction;

public class MsSqlProvider implements DbProviderFactory {
	public MsSqlProvider(String connStr) {
		this.connStr = connStr;
	}

	String connStr;
	@Override
	public DbConnection createConnection() {
		// TODO Auto-generated method stub
		return new MsSqlConnection(this.connStr);
	}

	@Override
	public DbCommand createCommand() {
		// TODO Auto-generated method stub
		return new MsSqlCommand();
	}

	@Override
	public DbTransaction createTransaction() {
		// TODO Auto-generated method stub
		return new MsSqlTransaction();
	}

}
