package lhq.money.chbtc;

/**
 * Created by huaqiang.liu on 2017/5/22.
 */
public class ChbtcConstant {

    public static final String ACCESS_KEY = "3a6c7f92-d03c-4cd3-8cb9-1c58a9e6104b";
    public static final String SECRET_KEY = "84a92219-7899-4424-91c0-aabea57d017f";

    public static final String BASE_PATH = "https://trade.chbtc.com";

    public static final String GET_TICKER = "/data/v1/ticker";

    public static final String ADD_ORDER = "/api/order";
    public static final String CANCLE_ORDER = "/api/cancelOrder";
    public static final String GET_ORDER = "/api/getOrder";
    public static final String GET_ORDERS = "/api/getOrdersNew";
    public static final String GET_ORDERS_IGNORE_TRADE_TYPE = "/api/getOrdersIgnoreTradeType";
}
