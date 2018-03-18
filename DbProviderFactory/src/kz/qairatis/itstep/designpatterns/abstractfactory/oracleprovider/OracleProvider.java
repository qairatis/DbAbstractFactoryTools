package kz.qairatis.itstep.designpatterns.abstractfactory.oracleprovider;

import kz.qairatis.itstep.designpatterns.abstractfactory.db.DbCommand;
import kz.qairatis.itstep.designpatterns.abstractfactory.db.DbConnection;
import kz.qairatis.itstep.designpatterns.abstractfactory.db.DbProviderFactory;
import kz.qairatis.itstep.designpatterns.abstractfactory.db.DbTransaction;

public class OracleProvider implements DbProviderFactory {
	String connStr;
	public OracleProvider(String connStr) {
		this.connStr = connStr;
	}

	@Override
	public DbConnection getConnection() {
		// TODO Auto-generated method stub
		return new OracleConnection(connStr);
	}

	@Override
	public DbCommand createCommand(DbTransaction dbTransaction) {
		// TODO Auto-generated method stub
		return new OracleSQL(dbTransaction);
	}

	@Override
	public DbTransaction createTransaction(DbConnection dbConnection) {
		// TODO Auto-generated method stub
		return new OracleTransaction(dbConnection);
	}

}
