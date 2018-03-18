package dbProviderFactory;

public interface DbProviderFactory {
	DbConnection createConnection();
	DbCommand createCommand();
}
