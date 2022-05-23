package kr.co.kcd.openbank.domain;

public enum AccountType {
    TRANSFER_ACCOUNT("1", "수시입출금통장"),
    DEPOSIT_ACCOUNT("2", "예적금"),
    PROFIT_MAKING_SECURITIES("3", "수익증권"),
    TOTAL_ACCOUNT("4", "종합계좌");

    private String value;
    private String description;
    AccountType(String value, String description) {
        this.value = value;
        this.description = description;
    }



}
