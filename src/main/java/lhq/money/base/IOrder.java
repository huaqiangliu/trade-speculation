package lhq.money.base;

import lhq.money.chbtc.vo.ChbtcOrder;
import lhq.money.enu.CurrencyEnum;
import lhq.money.enu.TradeTypeEnum;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by huaqiang.liu on 2017/5/23.
 */
public interface IOrder {

    boolean addOrder(BigDecimal price, BigDecimal amount, TradeTypeEnum tradeType, CurrencyEnum currency);

    boolean cancelOrder(String id, CurrencyEnum currency);

    ChbtcOrder getOrder(String id, CurrencyEnum currency);

    List<ChbtcOrder> getOrders(TradeTypeEnum tradeType, CurrencyEnum currency);

    List<ChbtcOrder> getOrders(TradeTypeEnum tradeType, CurrencyEnum currency, int pageIndex, int pageSize);

    List<ChbtcOrder> getOrdersIgnoreTradeType(CurrencyEnum currency, int pageIndex, int pageSize);
}
