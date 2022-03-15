package by.yahimovich.task07.parser;

public enum TagEnum {

    SUB_SALE("subscription_sale"),
    CARD_NAME("card_name"),
    USER_ID("user_id"),
    START_DATE("start_date"),
    END_DATE("end_date"),
    SERVICE_ID("service_id"),
    CLIENT("client"),
    ID("id"),
    F_NAME("f_name"),
    S_NAME("s_name"),
    L_NAME("l_name"),
    ADDRESS("address"),
    PHONE("phone"),
    SUB("subscription"),
    SPEC("specialization"),
    NOTE("note"),
    NAME("name"),
    EMPLOYEE("employee");

    private final String tagName;

    TagEnum(String tagName) {
        this.tagName = tagName;
    }

    public String getTagName() {
        return tagName;
    }
}
