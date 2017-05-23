package lhq.money.bter.buss;

import lhq.money.base.IOrder;
import lhq.money.bter.BterBase;
import lhq.money.chbtc.vo.ChbtcOrder;
import lhq.money.enu.CurrencyEnum;
import lhq.money.enu.TradeTypeEnum;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by huaqiang.liu on 2017/5/23.
 */
public class BterOrderBuss extends BterBase implements IOrder {
    @Override
    public boolean addOrder(BigDecimal price, BigDecimal amount, TradeTypeEnum tradeType, CurrencyEnum currency) {
        return false;
    }

    @Override
    public boolean cancelOrder(String id, CurrencyEnum currency) {
        return false;
    }

    @Override
    public ChbtcOrder getOrder(String id, CurrencyEnum currency) {
        return null;
    }

    @Override
    public List<ChbtcOrder> getOrders(TradeTypeEnum tradeType, CurrencyEnum currency) {
        return null;
    }

    @Override
    public List<ChbtcOrder> getOrders(TradeTypeEnum tradeType, CurrencyEnum currency, int pageIndex, int pageSize) {
        return null;
    }

    @Override
    public List<ChbtcOrder> getOrdersIgnoreTradeType(CurrencyEnum currency, int pageIndex, int pageSize) {
        return null;
    }
}
