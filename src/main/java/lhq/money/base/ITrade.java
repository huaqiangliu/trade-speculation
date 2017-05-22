package lhq.money.base;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

/**
 * Created by huaqiang.liu on 2017/5/22.
 */
public interface ITrade {

    /**
     * 查询市场深度
     * 公开接口
     * @param pair
     * @return
     */
//    public AskBid queryAskBid(PairEnum pair);

    /**
     * 查询资产接口
     * 密钥
     * @param pair
     * @return
     */
//    public List<BigDecimal> queryBalance(PairEnum pair);

    /**
     * 查询所有货币资产接口
     * 密钥
     * @param pair
     * @return
     */
//    public Map<CurrencyEnum, BigDecimal> getAllBalance();

    /**
     * 提交订单
     * 密钥
     * @param pair
     * @param side
     * @param price
     * @param vol
     * @return
     */
//    public Long placeOrder(PairEnum pair, OrderSideEnum side, BigDecimal price, BigDecimal vol);

    /**
     * 取消订单
     * 秘钥
     * @param pair
     * @param orderId
     * @return
     */
//    public boolean cancelOrder(PairEnum pair, Long orderId);

    /**
     * 获取订单
     * 密钥
     * @param pair
     * @param orderNo
     * @return
     */
//    public Order getOrder(PairEnum pair, Long orderNo);
}
