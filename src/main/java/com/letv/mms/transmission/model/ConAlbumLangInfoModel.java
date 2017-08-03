package com.letv.mms.transmission.model;

public class ConAlbumLangInfoModel extends MultiLangBaseModel {
	
	
	private String subTitle;//   副标题
	private String playStatus; // 跟播规则
	private String vipWatchingFocus; // 会员看点
	public static final String ALIAS = "alias";
	public static final String TAG = "TAG";
	public String getSubTitle() {
		return alias;
	}
	public void setAlias(String alias) {
		this.alias = alias;
	}
	public String getPlayStatus() {
		return this.playStatus;
	}
	public void setPlayStatus(String playStatus) {
		this.playStatus = playStatus;
	}
	public String getVipWatchingFocus() {
		return this.vipWatchingFocus;
	}
	public void setVipWatchingFocus(String vipWatchingFocus) {
		this.vipWatchingFocus = vipWatchingFocus;
	}
	
}