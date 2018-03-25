package kz.qairatis.itstep.designpatterns.abstractfactory.clientapp;

import kz.qairatis.itstep.designpatterns.abstractfactory.db.DbCommand;
import kz.qairatis.itstep.designpatterns.abstractfactory.db.DbConnection;
import kz.qairatis.itstep.designpatterns.abstractfactory.db.DbProviderFactory;
import kz.qairatis.itstep.designpatterns.abstractfactory.db.DbTransaction;
public class Application {
	private DbProviderFactory providerFactory;

	public Application(DbProviderFactory providerFactory) {
		this.providerFactory = providerFactory;
	}
	
	public void performSQL(String query) {
		DbConnection connection = providerFactory.createConnection();
		DbTransaction transaction = providerFactory.createTransaction();
		DbCommand command = providerFactory.createCommand();
		
		transaction.useConnection(connection);
		command.useTransaction(transaction);
		command.setQuery(query).execute();
	}
	

}
