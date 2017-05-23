package lhq.money.chbtc;

import com.alibaba.fastjson.JSON;
import lhq.money.chbtc.buss.ChbtcMarketBuss;
import lhq.money.chbtc.vo.Ticker;
import lhq.money.enu.CurrencyEnum;

/**
 * Created by huaqiang.liu on 2017/5/23.
 */
public class MarketTest {

    public static void main(String[] args) {
        ChbtcMarketBuss market = new ChbtcMarketBuss();
        getTicker(market);
    }

    private static void getTicker(ChbtcMarketBuss market) {
        Ticker ticker = market.getTicker(CurrencyEnum.eth_cny);
        System.out.println(JSON.toJSONString(ticker));
    }
}
