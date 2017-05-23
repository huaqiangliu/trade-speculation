package lhq.money.chbtc;

import com.alibaba.fastjson.JSON;
import lhq.money.chbtc.buss.ChbtcOrderBuss;
import lhq.money.chbtc.vo.ChbtcOrder;
import lhq.money.enu.CurrencyEnum;

import java.util.List;

/**
 * Created by huaqiang.liu on 2017/5/23.
 */
public class OrderTest {

    public static void main(String[] args) {
        ChbtcOrderBuss chbtcOrderBuss = new ChbtcOrderBuss();
//        List<ChbtcOrder> orders = chbtcOrderBuss.getOrders(TradeTypeEnum.sell, CurrencyEnum.eth_cny);
        List<ChbtcOrder> orders = chbtcOrderBuss.getOrdersIgnoreTradeType(CurrencyEnum.eth_cny, 1, 20);
        System.out.println(JSON.toJSONString(orders));
    }
}
