package kz.qairatis.itstep.designpatterns.abstractfactory.clientapp;

import kz.qairatis.itstep.designpatterns.abstractfactory.db.DbProviderFactory;
import kz.qairatis.itstep.designpatterns.abstractfactory.oracleprovider.OracleProvider;

public class TestAF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    DatabaseVendor databaseType = DatabaseVendor.ORACLE;
	    DbProviderFactory providerFactory = 
	    		getProviderFactory(databaseType);

	    Application application = new Application(providerFactory);
	    application.start("select dummy from dual");
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
