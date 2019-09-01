package haihuang.resp;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class DynamicTopicResp implements Serializable {

    private Long id;

    private Long count;

    private String topic;

    private Date creatime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public Date getCreatime() {
        return creatime;
    }

    public void setCreatime(Date creatime) {
        this.creatime = creatime;
    }
}
