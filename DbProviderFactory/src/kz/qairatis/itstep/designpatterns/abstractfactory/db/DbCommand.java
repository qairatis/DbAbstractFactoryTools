package kz.qairatis.itstep.designpatterns.abstractfactory.db;

public abstract class DbCommand {
	DbTransaction transaction;
	public abstract DbCommand setQuery(String commandText);
	public abstract int execute(); 
	public final void useTransaction(DbTransaction transaction) {
		this.transaction = transaction;
		this.transaction.start();
	}
	public final DbTransaction getTransaction() {
		return transaction;
	};
}
