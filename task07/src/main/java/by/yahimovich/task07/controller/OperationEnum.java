package by.yahimovich.task07.controller;

public enum OperationEnum {
    DOM("dom"),
    SAX("sax"),
    StAX("stax");

    private final String operationName;

    OperationEnum(String operationName) {
        this.operationName = operationName;
    }

    public String getOperationName() {
        return operationName;
    }
}
