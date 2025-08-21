package io.github.obicco.wealth.entity;

import io.github.obicco.wealth.enums.Asset;
import io.github.obicco.wealth.enums.Currency;
import jakarta.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Entity
@Table(name = "transaction")
public class TransactionEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate date;

    private String ticker;

    private String name;

    private String isin;

    private double quantity;

    private double price;

    private double fees;

    @Enumerated(EnumType.STRING)
    private Currency currency;

    private boolean closed;

    @Enumerated(EnumType.STRING)
    private Asset asset;

    private String notes;

    private double eurPurchasePrice;

    private double usdPurchasePrice;

    private TransactionEntity(Builder builder) {
        this.id = builder.id;
        this.date = builder.date;
        this.ticker = builder.ticker;
        this.name = builder.name;
        this.isin = builder.isin;
        this.quantity = builder.quantity;
        this.price = builder.price;
        this.fees = builder.fees;
        this.currency = builder.currency;
        this.closed = builder.closed;
        this.asset = builder.asset;
        this.notes = builder.notes;
        this.eurPurchasePrice = builder.eurPurchasePrice;
        this.usdPurchasePrice = builder.usdPurchasePrice;
    }

    public TransactionEntity() {}

    public Integer getId() {
        return id;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getTicker() {
        return ticker;
    }

    public String getName() {
        return name;
    }

    public String getIsin() {
        return isin;
    }

    public double getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public double getFees() {
        return fees;
    }

    public Currency getCurrency() {
        return currency;
    }

    public boolean isClosed() {
        return closed;
    }

    public Asset getAsset() {
        return asset;
    }

    public String getNotes() {
        return notes;
    }

    public double getEurPurchasePrice() {
        return eurPurchasePrice;
    }

    public double getUsdPurchasePrice() {
        return usdPurchasePrice;
    }

    public static final class Builder {
        private Integer id;
        private LocalDate date;
        private String ticker;
        private String name;
        private String isin;
        private double quantity;
        private double price;
        private double fees;
        private Currency currency;
        private boolean closed;
        private Asset asset;
        private String notes;
        private double eurPurchasePrice;
        private double usdPurchasePrice;

        public Builder id(Integer id) {
            this.id = id;
            return this;
        }

        public Builder date(LocalDate date) {
            this.date = date;
            return this;
        }

        public Builder ticker(String ticker) {
            this.ticker = ticker;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder isin(String isin) {
            this.isin = isin;
            return this;
        }

        public Builder quantity(double quantity) {
            this.quantity = quantity;
            return this;
        }

        public Builder price(double price) {
            this.price = price;
            return this;
        }

        public Builder fees(double fees) {
            this.fees = fees;
            return this;
        }

        public Builder currency(Currency currency) {
            this.currency = currency;
            return this;
        }

        public Builder closed(boolean closed) {
            this.closed = closed;
            return this;
        }

        public Builder asset(Asset asset) {
            this.asset = asset;
            return this;
        }

        public Builder notes(String notes) {
            this.notes = notes;
            return this;
        }

        public Builder eurPurchasePrice(double eurPurchasePrice) {
            this.eurPurchasePrice = eurPurchasePrice;
            return this;
        }
    }
}


