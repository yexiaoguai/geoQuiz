package com.yeliang.geoquiz.model;

public class TrueFalse
{
	//地理知识问题字符串的资源ID
	private int mQuestion;
	
	//确定答案正确还是错误
	private boolean mTrueQuestion;

	public TrueFalse(int mQuestion, boolean mTrueQuestion)
	{
		this.mQuestion = mQuestion;
		this.mTrueQuestion = mTrueQuestion;
	}

	public int getQuestion()
	{
		return mQuestion;
	}

	public void setQuestion(int Question)
	{
		this.mQuestion = Question;
	}

	public boolean isTrueQuestion()
	{
		return mTrueQuestion;
	}

	public void setTrueQuestion(boolean TrueQuestion)
	{
		this.mTrueQuestion = TrueQuestion;
	}

}
