package lhq.money.utils;

/**
 * Created by huaqiang.liu on 2017/5/22.
 */
public class HttpResponse {

    private int code;
    private String content;

    public HttpResponse(int code, String content) {
        this.code = code;
        this.content = content;
    }

    public int getCode() {
        return code;
    }

    public String getContent() {
        return content;
    }
}
