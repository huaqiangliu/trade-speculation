package lhq.money.chbtc.buss;

import com.alibaba.fastjson.JSON;
import lhq.money.base.IMarket;
import lhq.money.chbtc.ChbtcBaseBuss;
import lhq.money.chbtc.ChbtcConstant;
import lhq.money.chbtc.vo.Ticker;
import lhq.money.enu.CurrencyEnum;

/**
 * Created by huaqiang.liu on 2017/5/23.
 */
public class ChbtcMarketBuss extends ChbtcBaseBuss implements IMarket {

    @Override
    public Ticker getTicker(CurrencyEnum currency) {
        String params = "currency=" + currency.name();
        String result = super.doGet(ChbtcConstant.GET_TICKER, params);
        if (result == null) {
            return null;
        }
        return JSON.parseObject(result, Ticker.class);
    }

    @Override
    public void getDepth(CurrencyEnum currency, int size, Float merge) {

    }

    @Override
    public void getTrades(CurrencyEnum currency) {

    }

    @Override
    public void getKline(CurrencyEnum currency) {

    }
}
