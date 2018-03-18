package kz.qairatis.itstep.designpatterns.abstractfactory.clientapp;

import kz.qairatis.itstep.designpatterns.abstractfactory.db.DbCommand;
import kz.qairatis.itstep.designpatterns.abstractfactory.db.DbConnection;
import kz.qairatis.itstep.designpatterns.abstractfactory.db.DbProviderFactory;
import kz.qairatis.itstep.designpatterns.abstractfactory.db.DbTransaction;

public class Application {
	private final DbProviderFactory providerFactory;

	public Application(DbProviderFactory providerFactory) {
//		super();
		this.providerFactory = providerFactory;
	}
	
	public void start() {
		DbConnection connection = providerFactory.getConnection();
		connection.connect();
		
		DbTransaction transaction = providerFactory.createTransaction(connection);
		transaction.start();
		
		DbCommand command = providerFactory.createCommand(transaction);
		command.setCommandText("select *");
		command.prepare();
		command.execute();
		
		transaction.commit();
	}
	

}
