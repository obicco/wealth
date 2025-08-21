package io.github.obicco.wealth.enums;

public enum Currency {
    USD("US Dollar", "$"),
    EUR("Euro", "€"),
    GBP("British Pound", "£"),
    JPY("Japanese Yen", "¥"),
    CHF("Swiss Franc", "CHF"),
    CNY("Chinese Yuan", "¥");

    private final String displayName;
    private final String symbol;

    Currency(String displayName, String symbol) {
        this.displayName = displayName;
        this.symbol = symbol;
    }

    public String getDisplayName() {
        return displayName;
    }

    public String getSymbol() {
        return symbol;
    }

    @Override
    public String toString() {
        return displayName;
    }
}
