package kz.qairatis.itstep.designpatterns.abstractfactory.db;

public interface DbCommand {
	public DbCommand setQuery(String commandText);
	public int execute(); 
	public void useTransaction(DbTransaction transaction);
}
