package org.ircenter.server.bean.evidence;

/**
 * Created by IntelliJ IDEA.
 * User: 1
 * Date: 16.05.12
 * Time: 21:23
 * To change this template use File | Settings | File Templates.
 */
public class EvidenceHealing {
    private long id;
    private int defaultImage;
    private String text;

    private String firstText;
    private String secondText;

    public String getFirstText() {
        return firstText;
    }

    public void setFirstText(String firstText) {
        this.firstText = firstText;
    }

    public String getSecondText() {
        return secondText;
    }

    public void setSecondText(String secondText) {
        this.secondText = secondText;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getDefaultImage() {
        return defaultImage;
    }

    public void setDefaultImage(int defaultImage) {
        this.defaultImage = defaultImage;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
