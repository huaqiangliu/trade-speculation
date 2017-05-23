package lhq.money.chbtc.vo;

import java.math.BigDecimal;

/**
 * Created by huaqiang.liu on 2017/5/23.
 */
public class ChbtcOrder {

    private String id; // 委托挂单号
    private String currency; // 交易类型（目前仅支持btc_cny/ltc_cny/eth_cny/eth_btc/etc_cny）
    private BigDecimal fees; // 交易手续费,卖单的话,显示的是收入货币(如人民币);买单的话,显示的是买入货币(如etc)
    private BigDecimal price; // 单价
    private BigDecimal total_amount; // 挂单总数量
    private BigDecimal trade_amount; // 已成交数量
    private BigDecimal trade_money; // 已成交总金额（RMB）
    private BigDecimal trade_price; // 成交均价（RMB）
    private long trade_date; // 交易时间（毫秒）
    private int type; // 挂单类型 1/0[buy/sell]
    private int status; // 挂单状态(0：待成交,1：取消,2：交易完成,3：待成交未交易部份)

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public BigDecimal getFees() {
        return fees;
    }

    public void setFees(BigDecimal fees) {
        this.fees = fees;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getTotal_amount() {
        return total_amount;
    }

    public void setTotal_amount(BigDecimal total_amount) {
        this.total_amount = total_amount;
    }

    public BigDecimal getTrade_amount() {
        return trade_amount;
    }

    public void setTrade_amount(BigDecimal trade_amount) {
        this.trade_amount = trade_amount;
    }

    public BigDecimal getTrade_money() {
        return trade_money;
    }

    public void setTrade_money(BigDecimal trade_money) {
        this.trade_money = trade_money;
    }

    public BigDecimal getTrade_price() {
        return trade_price;
    }

    public void setTrade_price(BigDecimal trade_price) {
        this.trade_price = trade_price;
    }

    public long getTrade_date() {
        return trade_date;
    }

    public void setTrade_date(long trade_date) {
        this.trade_date = trade_date;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
