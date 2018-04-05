package com.zkt.testtool.logcat;



import com.zkt.testtool.R;

import java.util.regex.Pattern;

public enum Format{
	
	BRIEF("brief", Pattern.compile("^([VDIWEF])/"), R.string.brief_title),
	PROCESS("process", Pattern.compile("^([VDIWEF])\\("), R.string.process_title),
	TAG("tag", Pattern.compile("^([VDIWEF])/"), R.string.tag_title),
	THREAD("thread", Pattern.compile("^([VDIWEF])\\("), R.string.thread_title),
	RAW("raw", null, R.string.raw_title),
	TIME("time", Pattern.compile(" ([VDIWEF])/"), R.string.time_title),
	THREADTIME("threadtime", Pattern.compile(" ([VDIWEF]) "), R.string.threadtime_title),
	LONG("long", Pattern.compile("([VDIWEF])/"), R.string.long_title);

	private String mTitle;
	private Pattern mPattern;
	private int mTitleId;
	
	Format(String title, Pattern pattern, int titleId){
		this.mTitle = title;
		this.mPattern = pattern;
		//== null ? Pattern.compile(pattern) : null;
		this.mTitleId = titleId;
	}
	
	public String getTitle(){
		return mTitle;
	}
	
	public Pattern getPattern(){
		return mPattern;
	}
	
	public int getTitleId(){
		return mTitleId;
	}
}
