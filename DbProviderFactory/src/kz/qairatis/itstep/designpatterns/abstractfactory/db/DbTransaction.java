package kz.qairatis.itstep.designpatterns.abstractfactory.db;

public interface DbTransaction {
	public void start();
	public void commit();
	public void rollback();
}
