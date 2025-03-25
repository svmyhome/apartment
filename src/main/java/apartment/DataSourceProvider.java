package apartment;

import org.postgresql.ds.PGSimpleDataSource;

import javax.sql.DataSource;

public enum DataSourceProvider {
    INSTANCE;

    private DataSource dataSource;

    public DataSource getDataSource() {
        if (dataSource == null) {
            PGSimpleDataSource pgDataSource = new PGSimpleDataSource();
            pgDataSource.setURL("jdbc:postgresql://localhost:5433/apartment");
            pgDataSource.setUser("postgres");
            pgDataSource.setPassword("postgres");
            dataSource = pgDataSource;
        }
        return dataSource;
    }
}
