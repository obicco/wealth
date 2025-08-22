package io.github.obicco.wealth.controller;

import io.github.obicco.wealth.api.TransactionsApi;
import io.github.obicco.wealth.model.Transaction;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TransactionsController implements TransactionsApi {

    @Override
    public ResponseEntity<List<Transaction>> getTransactions(String assetType) {
        return ResponseEntity.ok().body(List.of());
    }
}
