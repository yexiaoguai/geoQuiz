package com.yeliang.geoquiz.model;

public class TrueFalse
{
	//����֪ʶ�����ַ�������ԴID
	private int mQuestion;
	
	//ȷ������ȷ���Ǵ���
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
