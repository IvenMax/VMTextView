package com.iven.vmtextview.entity;

/**
 * 实体类的构建，设置前缀、内容以及跳转的链接URL
 * @author Iven
 * @version 1.0
 * @Date 2016/8/14 18:27
 * Email: yanfengqiu06@163.com
 */
public class VMEntity {
    private String mFont;//前缀文字
    private String mBack;//内容(标题)
    private String mURL;

    public VMEntity(String font, String back, String URL) {
        mFont = font;
        mBack = back;
        mURL = URL;
    }

    public String getFont() {
        return mFont;
    }

    public void setFont(String font) {
        mFont = font;
    }

    public String getBack() {
        return mBack;
    }

    public void setBack(String back) {
        mBack = back;
    }

    public String getURL() {
        return mURL;
    }

    public void setURL(String URL) {
        mURL = URL;
    }
}
