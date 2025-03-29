package apartment.db;

import org.postgresql.ds.PGSimpleDataSource;

import javax.sql.DataSource;

public enum DataSourceProvider {
    INSTANCE;

    private DataSource dataSource;
    private PGSimpleDataSource pgDataSource;

    public DataSource getDataSource() {
        if (dataSource == null) {
            pgDataSource = new PGSimpleDataSource();
//            pgDataSource.setURL("jdbc:postgresql://localhost:5433/apartment");
            pgDataSource.setServerNames(new String[] {"localhost"});
            pgDataSource.setPortNumbers(new int[] {5433});
            pgDataSource.setDatabaseName("apartment");
            pgDataSource.setUser("postgres");
            pgDataSource.setPassword("postgres");
            dataSource = pgDataSource;
        }
        return dataSource;
    }
}
