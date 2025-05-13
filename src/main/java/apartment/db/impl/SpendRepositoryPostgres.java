package apartment.db.impl;

import apartment.db.DataSourceProvider;
import apartment.db.mapper.SpendEntityRowMapper;
import apartment.db.repository.SpendRepository;
import apartment.entity.AccountEntity;
import apartment.entity.SpendEntity;
import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;

public class SpendRepositoryPostgres implements SpendRepository {

    private static final JdbcTemplate jdbcTemplate = new JdbcTemplate(DataSourceProvider.INSTANCE.getDataSource());

    @Override
    public List<SpendEntity> getAllForAccount(AccountEntity account) {
        return jdbcTemplate.query("SELECT * FROM spend WHERE account_id=?",
                new SpendEntityRowMapper(), account.getId());
    }

    @Override
    public void addSpend(SpendEntity spend) {
        jdbcTemplate.update("INSERT INTO spend (account_id, spend_category, spend, description) values(?,?,?,?)",
                spend.getAccount_id(),
                spend.getSpendCategory().toString(),
                spend.getSpend(),
                spend.getDescription());
    }

    @Override
    public SpendEntity getByName() {
        return null;
    }
}
