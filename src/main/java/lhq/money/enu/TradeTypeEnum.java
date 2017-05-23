package lhq.money.enu;

/**
 * Created by huaqiang.liu on 2017/5/23.
 */
public enum TradeTypeEnum {

    buy(1),sell(0);

    private int value;

    TradeTypeEnum(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
