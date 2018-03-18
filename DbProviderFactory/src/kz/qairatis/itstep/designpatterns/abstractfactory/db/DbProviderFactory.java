package kz.qairatis.itstep.designpatterns.abstractfactory.db;

public interface DbProviderFactory {
	DbConnection getConnection();
	DbCommand createCommand(DbTransaction dbTransaction);
	DbTransaction createTransaction(DbConnection dbConnection);
}
