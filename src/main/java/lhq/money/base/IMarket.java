package lhq.money.base;

import lhq.money.chbtc.vo.Ticker;
import lhq.money.enu.CurrencyEnum;

/**
 * Created by huaqiang.liu on 2017/5/23.
 */
public interface IMarket {

    Ticker getTicker(CurrencyEnum currency);

    void getDepth(CurrencyEnum currency, int size, Float merge);

    void getTrades(CurrencyEnum currency);

    void getKline(CurrencyEnum currency);
}
