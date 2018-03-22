package kz.qairatis.itstep.designpatterns.abstractfactory.db;

public abstract class DbTransaction {
	private DbConnection connection;
	public abstract void start();
	public abstract void end();
	public final void useConnection(DbConnection connection) {
		this.connection = connection;
		this.connection.open();		
	}
	public final DbConnection getConnection() {
		return connection;
	};
}
