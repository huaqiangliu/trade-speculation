package lhq.money.chbtc;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import lhq.money.utils.HttpResponse;
import lhq.money.utils.HttpUtils;
import lhq.money.utils.LogUtils;

import java.math.BigDecimal;

import static lhq.money.bter.BterConstant.BASE_PATH;

/**
 * Created by huaqiang.liu on 2017/5/22.
 */
public class Chbtc {

    public Long placeOrder(PairEnum pair, OrderSideEnum side, BigDecimal price, BigDecimal vol) {
        String path = "/api/order";
        String param = String.format("price=%s&amount=%s&tradeType=%s&currency=%s", price, vol, toSide(side), toLabel(pair));
        String res = doGet(path, param);
        JSONObject ele = JSON.parseObject(res);
        return ele.getLong("id");
    }

    public Order getOrder(PairEnum pair, Long orderId) {
//        GET https://trade.chbtc.com/api/order?method=order
//	&accesskey=accesskey&price=1024&amount=1.5&tradeType=1&currency=btc_cny
//                &sign=请求加密签名串&reqTime=当前时间毫秒数
    String param = String.format("id=%s&currency=%s", orderId, toLabel(pair));
    String res = doGet(ChbtcConstant.ORDER_PATH, param);
    JSONObject ele = JSON.parseObject(res);
    Order order = new Order();
		order.setId(ele.getLong("id"));
		order.setOrderSide("1".equals(ele.getString("type")) ? OrderSideEnum.BUY : OrderSideEnum.SELL);
		order.setPair(this.fromLabel(ele.getString("currency")));
		order.setPrice(new BigDecimal(ele.getString("price")));
		order.setPlaceVol(new BigDecimal(ele.getString("total_amount")));
		order.setDoneVol(new BigDecimal(ele.getString("trade_amount")));
		order.setDone("2".equals(ele.getString("status")));
		order.setCancel("1".equals(ele.getString("status")));
		return order;
}

    private String doGet(String path, String paramBusi) {
        String method = path.substring(path.lastIndexOf("/") + 1);
        String params = String.format("method=%s&accesskey=%s", method, ChbtcConstant.ACCESS_KEY);
        if (paramBusi != null && !"".equals(paramBusi)) {
            params += "&" + paramBusi;
        }
        String secret = CnbtcSign.digest(ChbtcConstant.SECRET_KEY);
        String sign = CnbtcSign.hmacSign(params, secret);
        String url = String.format("%s?%s&sign=%s&reqTime=%s", ChbtcConstant.BASE_PATH + path, params, sign,
                System.currentTimeMillis());
        HttpResponse resp = HttpUtils.get(url);
        LogUtils.debug(String.format("%s, %s, %s", resp.getCode(), url, resp.getContent()));
        return resp.getContent();
    }

}
