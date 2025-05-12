package apartment.entity;

public class SpendEntity {
    private int id;
    private int account_id;
    private String spendCategory;
    private double balance;

    public int getId() {
        return id;
    }

    public SpendEntity setId(int id) {
        this.id = id;
        return this;
    }

    public int getAccount_id() {
        return account_id;
    }

    public SpendEntity setAccount_id(int account_id) {
        this.account_id = account_id;
        return this;
    }

    public String getSpendCategory() {
        return spendCategory;
    }

    public SpendEntity setSpendCategory(String spendCategory) {
        this.spendCategory = spendCategory;
        return this;
    }

    public double getBalance() {
        return balance;
    }

    public SpendEntity setBalance(double balance) {
        this.balance = balance;
        return this;
    }
}
