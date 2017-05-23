package lhq.money.chbtc.vo;

/**
 * Created by huaqiang.liu on 2017/5/23.
 */
public class Ticker {

    private String high; // 最高价
    private String low; // 最低价
    private String buy; // 买一价
    private String sell; // 卖一价
    private String last; // 最新成交价
    private String vol; // 成交量(最近的24小时)

    public String getHigh() {
        return high;
    }

    public void setHigh(String high) {
        this.high = high;
    }

    public String getLow() {
        return low;
    }

    public void setLow(String low) {
        this.low = low;
    }

    public String getBuy() {
        return buy;
    }

    public void setBuy(String buy) {
        this.buy = buy;
    }

    public String getSell() {
        return sell;
    }

    public void setSell(String sell) {
        this.sell = sell;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public String getVol() {
        return vol;
    }

    public void setVol(String vol) {
        this.vol = vol;
    }
}
