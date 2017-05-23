package lhq.money.chbtc.vo;

/**
 * Created by huaqiang.liu on 2017/5/23.
 */
public class ChbtcResponse {

    private String code;
    private String message;
    private String id;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
//        1000	调用成功
//        1001  一般错误提示
//        1002	内部错误
//        1003	验证不通过
//        1004	资金安全密码锁定
//        1005	资金安全密码错误，请确认后重新输入。
//        1006	实名认证等待审核或审核不通过
//        1009	此接口维护中
//        2001	人民币账户余额不足
//        2002	比特币账户余额不足
//        2003	莱特币账户余额不足
//        2005	以太币账户余额不足
//        2006	ETC币账户余额不足
//        3001	挂单没有找到
//        3002	无效的金额
//        3003	无效的数量
//        3004	用户不存在
//        3005	无效的参数
//        3006	无效的IP或与绑定的IP不一致
//        3007	请求时间已失效
//        3008	交易记录没有找到
//        4001	API接口被锁定或未启用
//        4002	请求过于频繁