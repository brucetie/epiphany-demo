package com.letv.mms.transmission.model;

public class ConVideoLangInfoModel extends MultiLangBaseModel {
	
	private static final long serialVersionUID = 1L;
	
	private String subTitle;//   副标题
	private String watchingFocus;// 看点
	public static final String WATCHINGFOCUS = "WATCHINGFOCUS";
	
	
		return alias;
	}
	public void setAlias(String alias) {
		this.alias = alias;
	}
    public String getWatchingFocus() {
        return watchingFocus;
    }
    public void setWatchingFocus(String watchingFocus) {
        this.watchingFocus = watchingFocus;
    }
	
}