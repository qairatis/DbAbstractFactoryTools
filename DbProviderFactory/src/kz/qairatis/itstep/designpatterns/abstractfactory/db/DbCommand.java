package kz.qairatis.itstep.designpatterns.abstractfactory.db;

public interface DbCommand {
	public void setCommandText(String commandText);
	public void prepare();
	public int execute(); 
	public int cancel();
}
