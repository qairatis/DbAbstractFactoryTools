package kz.qairatis.itstep.designpatterns.abstractfactory.db;

public interface DbProviderFactory {
	DbConnection createConnection();
	DbCommand createCommand();
	DbTransaction createTransaction();
}
