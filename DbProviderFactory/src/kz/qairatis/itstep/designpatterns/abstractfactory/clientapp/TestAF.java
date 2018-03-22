package kz.qairatis.itstep.designpatterns.abstractfactory.clientapp;

import kz.qairatis.itstep.designpatterns.abstractfactory.db.DbProviderFactory;
import kz.qairatis.itstep.designpatterns.abstractfactory.mssqldriver.MsSqlProvider;
//import kz.qairatis.itstep.designpatterns.abstractfactory.oracleprovider.OracleProvider;

public class TestAF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	    DatabaseVendor databaseType = DatabaseVendor.ORACLE;
	    DatabaseVendor databaseType = DatabaseVendor.MSSQL;
	    DbProviderFactory providerFactory = 
	    		getProviderFactory(databaseType);

	    Application application = new Application(providerFactory);
	    application.performSQL("select * from user");
	}

	  private static DbProviderFactory getProviderFactory(
		      DatabaseVendor databaseType) {
		    switch (databaseType) {
		    case ORACLE:
		      return null;//new OracleProvider("//oracle.db");
		    default:
		    // TODO: add MSSQL Provider 
		      return new MsSqlProvider("//ms.sql");
		    }
		  }
}
