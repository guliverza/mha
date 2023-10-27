-- liquibase formatted sql

-- changeset homework:1
CREATE TABLE clients (id INT, name VARCHAR(64), address VARCHAR(256), PRIMARY KEY (client_id))
CREATE TABLE accounts (id INT, client_id INT, account_name VARCHAR(16), balance NUMERIC(12, 2), currency VARCHAR(3), PRIMARY KEY (account_id))
CREATE TABLE TRANSFER (id INT, from_account_id INT, to_account_id INT, amount NUMERIC(12, 2), currency VARCHAR(3))
CREATE TABLE currency_history (id INT, t timestamp, from_currency VARCHAR(3), to_currency VARCHAR(3), rate NUMERIC(12, 6))
