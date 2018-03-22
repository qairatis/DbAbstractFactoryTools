package kz.qairatis.itstep.designpatterns.abstractfactory.db;

public interface DbConnection {
	public void open();
	public void close();
}
