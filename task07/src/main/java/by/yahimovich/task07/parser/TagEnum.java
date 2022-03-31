package by.yahimovich.task07.parser;

public enum TagEnum {
    SALES("sales"),
    SUBSCRIPTION_SALE("subscription_sale"),
    CARD_NUMBER("card_number"),
    USER_ID("user_id"),
    START_DATE("start_date"),
    END_DATE("end_date"),
    SERVICE_ID("service_id"),
    CLIENT("client"),
    ID_CLIENT("id_client"),
    F_NAME_CLIENT("f_name_client"),
    S_NAME_CLIENT("s_name_client"),
    L_NAME_CLIENT("l_name_client"),
    ADDRESS_CLIENT("address_client"),
    PHONE_CLIENT("phone_client"),
    SUBSCRIPTION("subscription"),
    ID_SUB("id_sub"),
    NAME_SUB("name_sub"),
    PRICE("price"),
    VISITS("visits"),
    DAYS("days"),
    SPECIALIZATION("specialization"),
    ID_SPEC("id_spec"),
    NOTE("note"),
    SERVICE("service"),
    ID_SERV("is_serv"),
    NAME_SERV("name_serv"),
    EMPLOYEE("employee"),
    ID_EMPLOYEE("id_employee"),
    F_NAME_EMPLOYEE("f_name_employee"),
    S_NAME_EMPLOYEE("s_name_employee"),
    L_NAME_EMPLOYEE("l_name_employee"),
    ADDRESS_EMPLOYEE("address_employee"),
    PHONE_EMPLOYEE("phone_employee");

    private final String tagName;

    TagEnum(String tagName) {
        this.tagName = tagName;
    }

    public String getTagName() {
        return tagName;
    }
}
