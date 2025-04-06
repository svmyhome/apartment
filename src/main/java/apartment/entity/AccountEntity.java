package apartment.entity;

public class AccountEntity {
    private int id;
    private String account;
    private Double balance;

    public int getId() {
        return id;
    }

    public AccountEntity setId(int id) {
        this.id = id;
        return this;
    }

    public String getAccount() {
        return account;
    }

    public AccountEntity setAccount(String account) {
        this.account = account;
        return this;
    }

    public Double getBalance() {
        return balance;
    }

    public AccountEntity setBalance(Double balance) {
        this.balance = balance;
        return this;
    }
}
