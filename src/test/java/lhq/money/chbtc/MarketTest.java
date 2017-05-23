package lhq.money.chbtc;

import lhq.money.chbtc.buss.ChbtcMarketBuss;
import lhq.money.chbtc.vo.Ticker;
import lhq.money.enu.CurrencyEnum;

/**
 * Created by huaqiang.liu on 2017/5/23.
 */
public class MarketTest {

    public static void main(String[] args) {
        ChbtcMarketBuss market = new ChbtcMarketBuss();
        Ticker ticker = market.getTicker(CurrencyEnum.eth_cny);
    }

    private void getTicker(ChbtcMarketBuss market) {

    }
}
