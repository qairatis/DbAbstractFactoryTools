package kz.qairatis.itstep.designpatterns.abstractfactory.mssqldriver;

import kz.qairatis.itstep.designpatterns.abstractfactory.db.DbTransaction;

public class MsSqlTransaction extends DbTransaction {
	@Override
	public void start() {
		// TODO Auto-generated method stub @done
		System.out.println("Ms Sql Transaction started.");		
	}

	@Override
	public void end() {
		// TODO Auto-generated method stub @done
		System.out.println("Ms Sql Transaction ended.");
		this.getConnection().close();
	}
}
