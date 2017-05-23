package lhq.money.chbtc;

import lhq.money.utils.HttpResponse;
import lhq.money.utils.HttpUtils;
import lhq.money.utils.LogUtils;

/**
 * Created by huaqiang.liu on 2017/5/23.
 */
public class ChbtcBaseBuss {

    protected String doGetSecret(String path, String paramBusi) {
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

    protected String doGet(String path, String paramBusi) {
        if (paramBusi != null && !"".equals(paramBusi)) {
            path += "?" + paramBusi;
        }
        String url = ChbtcConstant.BASE_PATH + path;
        HttpResponse resp = HttpUtils.get(url);
        LogUtils.debug(String.format("%s, %s, %s", resp.getCode(), url, resp.getContent()));
        return resp.getContent();
    }
}
