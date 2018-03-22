package kz.qairatis.itstep.designpatterns.abstractfactory.clientapp;

import kz.qairatis.itstep.designpatterns.abstractfactory.db.DbProviderFactory;
import kz.qairatis.itstep.designpatterns.abstractfactory.oracleprovider.OracleProvider;

public class TestAF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub @done
	    DatabaseVendor databaseType = DatabaseVendor.ORACLE;
	    DbProviderFactory providerFactory = 
	    		getProviderFactory(databaseType);

	    Application application = new Application(providerFactory);
	    application.performSQL("select * from users");
	}

	  private static DbProviderFactory getProviderFactory(
		      DatabaseVendor databaseType) {
		    switch (databaseType) {
		    case ORACLE:
		      return new OracleProvider("//oracle.db");
		    default:
		    // TODO: add MSSQL Provider 
		      return null;
		    }
		  }
}
