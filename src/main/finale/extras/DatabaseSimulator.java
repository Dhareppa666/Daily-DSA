package main.finale.extras;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class DatabaseSimulator {
    private final Map<String, String> permanentStorage;
    private final Stack<Map<String, String>> transactionStack;

    public DatabaseSimulator() {
        this.permanentStorage = new HashMap<>();
        this.transactionStack = new Stack<>();
    }

    public void begin() {
        transactionStack.push(new HashMap<>());
    }

    public String get(String key) throws NoActiveTransactionException {
        if (transactionStack.isEmpty()) {
            return permanentStorage.get(key);
        }
        for (int i = transactionStack.size() - 1; i >= 0; i--) {
            Map<String, String> transaction = transactionStack.get(i);
            if (transaction.containsKey(key)) {
                return transaction.get(key);
            }
        }
        return permanentStorage.get(key);
    }

    public void set(String key, String value) throws NoActiveTransactionException {
        if (transactionStack.isEmpty()) {
            throw new NoActiveTransactionException();
        }
        transactionStack.peek().put(key, value);
    }

    public Integer count() {
        return permanentStorage.size();
    }

    public void commit() throws NoActiveTransactionException {
        if (transactionStack.isEmpty()) {
            throw new NoActiveTransactionException();
        }

        Map<String, String> finalChanges = transactionStack.get(0);
        for (int i = 1; i < transactionStack.size(); i++) {
            finalChanges.putAll(transactionStack.get(i));
        }

        permanentStorage.putAll(finalChanges);
        transactionStack.clear();
    }

    public void rollback() throws NoActiveTransactionException {
        if (transactionStack.isEmpty()) {
            throw new NoActiveTransactionException();
        }
        transactionStack.pop();
    }

    private class NoActiveTransactionException extends Exception {
    }
}