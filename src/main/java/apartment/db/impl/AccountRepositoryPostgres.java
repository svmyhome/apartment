package apartment.db.impl;

import apartment.db.DataSourceProvider;
import apartment.db.mapper.AccountEntityRowMapper;
import apartment.db.repository.AccountRepository;
import apartment.entity.AccountEntity;
import java.util.List;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.lang.Nullable;

public class AccountRepositoryPostgres implements AccountRepository {

    private static final JdbcTemplate jdbcTemplate = new JdbcTemplate(DataSourceProvider.INSTANCE.getDataSource());

    @Override
    public List<AccountEntity> getAll() {
        return jdbcTemplate.query("SELECT * FROM account", new AccountEntityRowMapper());
    }

    @Override
    public @Nullable AccountEntity getByName(String account) {
        try {
            return jdbcTemplate.queryForObject("SELECT * FROM account WHERE account = ?",
                    new AccountEntityRowMapper(), account);
        } catch (EmptyResultDataAccessException e) {
            return null;
        }
    }

    @Override
    public void addAccount(AccountEntity account) {
        jdbcTemplate.update("INSERT INTO account (account, balance) values(?,?)",
                account.getAccount(), account.getBalance());
    }

    @Override
    public void updateAccount(AccountEntity account) {
        jdbcTemplate.update("UPDATE account SET balance = ? WHERE account=?",
                account.getBalance(), account.getAccount());
    }
}
