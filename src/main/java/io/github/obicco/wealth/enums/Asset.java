package io.github.obicco.wealth.enums;

public enum Asset {
    STOCK("Stock"),
    ETF("ETF"),
    CRYPTO("Crypto"),
    BOND("Bond"),
    PRIVATE_EQUITY("Private Equity"),
    PENSION_FUND("Pension Fund"),
    MONETARY_FUND("Monetary Fund");

    private final String type;

    Asset(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return type;
    }
}
