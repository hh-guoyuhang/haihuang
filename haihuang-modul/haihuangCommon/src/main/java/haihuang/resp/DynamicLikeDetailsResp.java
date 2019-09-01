package haihuang.resp;

import haihuang.vo.DynamicLikeDiscussVo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class DynamicLikeDetailsResp<T> implements Serializable {
    private List<T> respList;

    private long count;

    public List<T> getRespList() {
        return respList;
    }

    public void setRespList(List<T> respList) {
        this.respList = respList;
    }

    public long getCount() {
        return count;
    }

    public void setCount(long count) {
        this.count = count;
    }
}
