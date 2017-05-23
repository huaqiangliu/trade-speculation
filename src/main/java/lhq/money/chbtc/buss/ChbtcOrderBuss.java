package lhq.money.chbtc.buss;

import com.alibaba.fastjson.JSON;
import lhq.money.base.IOrder;
import lhq.money.chbtc.ChbtcBaseBuss;
import lhq.money.chbtc.ChbtcConstant;
import lhq.money.chbtc.vo.ChbtcOrder;
import lhq.money.chbtc.vo.ChbtcResponse;
import lhq.money.enu.CurrencyEnum;
import lhq.money.enu.TradeTypeEnum;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by huaqiang.liu on 2017/5/23.
 */
public class ChbtcOrderBuss extends ChbtcBaseBuss implements IOrder {

    @Override
    public boolean addOrder(BigDecimal price, BigDecimal amount, TradeTypeEnum tradeType, CurrencyEnum currency) {
        String params = String.format("price=%s&amount=%s&tradeType=%s&currency=%s", price, amount,
                tradeType.getValue(), currency.name());
        String result = super.doGetSecret(ChbtcConstant.ADD_ORDER, params);
        if (result == null) {
            return false;
        }
        ChbtcResponse response = JSON.parseObject(result, ChbtcResponse.class);
        if ("1000".equals(response.getCode())) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean cancelOrder(String id, CurrencyEnum currency) {
        String params = String.format("id=%s&currency=%s", id, currency.name());
        String result = super.doGetSecret(ChbtcConstant.CANCLE_ORDER, params);
        if (result == null) {
            return false;
        }
        ChbtcResponse response = JSON.parseObject(result, ChbtcResponse.class);
        if ("1000".equals(response.getCode())) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public ChbtcOrder getOrder(String id, CurrencyEnum currency) {
        String params = String.format("id=%s&currency=%s", id, currency.name());
        String result = super.doGetSecret(ChbtcConstant.GET_ORDER, params);
        if (result == null) {
            return null;
        }
        ChbtcOrder order = JSON.parseObject(result, ChbtcOrder.class);
        return order;
    }

    @Override
    public List<ChbtcOrder> getOrders(TradeTypeEnum tradeType, CurrencyEnum currency) {
        return getOrders(tradeType, currency, 1, 10);
    }

    @Override
    public List<ChbtcOrder> getOrders(TradeTypeEnum tradeType, CurrencyEnum currency, int pageIndex, int pageSize) {
        String params = String.format("tradeType=%s&currency=%s&pageIndex=%s&pageSize=%s", tradeType.getValue(),
                currency.name(), pageIndex, pageSize);
        String result = super.doGetSecret(ChbtcConstant.GET_ORDERS, params);
        if (result == null) {
            return null;
        }
        List<ChbtcOrder> orders = JSON.parseArray(result, ChbtcOrder.class);
        return orders;
    }

    @Override
    public List<ChbtcOrder> getOrdersIgnoreTradeType(CurrencyEnum currency, int pageIndex, int pageSize) {
        String params = String.format("currency=%s&pageIndex=%s&pageSize=%s", currency.name(), pageIndex, pageSize);
        String result = super.doGetSecret(ChbtcConstant.GET_ORDERS_IGNORE_TRADE_TYPE, params);
        if (result == null) {
            return null;
        }
        List<ChbtcOrder> orders = JSON.parseArray(result, ChbtcOrder.class);
        return orders;
    }

}
