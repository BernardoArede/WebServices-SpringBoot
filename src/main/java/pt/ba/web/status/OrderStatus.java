package pt.ba.web.status;

public enum OrderStatus {
    /*WAITING_PAYMENT("Waiting payment"),
    PAID("Paid"),
    SHIPPED("Shipped"),
    DELIVERED("Delivered"),
    CANCELED("Canceled");


    private final String description;

    OrderStatus(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }*/

    WAITING_PAYMENT(1),
    PAID(2),
    SHIPPED(3),
    DELIVERED(4),
    CANCELED(5);

    private int code;

    private OrderStatus(int code) {
        this.code = code;
    }
    public int getCode(){
        return code;
    }

    public static OrderStatus valueOf(int code){
        for(OrderStatus status : OrderStatus.values()){
            if(status.getCode() == code){
                return status;
            }
        }
        throw new IllegalArgumentException("Invalid OrderStatus Code");
    }
}
