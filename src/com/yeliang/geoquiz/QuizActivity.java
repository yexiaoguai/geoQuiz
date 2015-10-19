package com.yeliang.geoquiz;

import com.yeliang.geoquiz.model.TrueFalse;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class QuizActivity extends Activity 
{
	private Button mTrueButton;
	private Button mFalseButton;
	private Button mNextButton;
	
	private TextView mQuestionTextView;
	
	private int mCurrentIndex = 0;
	
	private TrueFalse[] mQuestionBank = new TrueFalse[]{
		new TrueFalse(R.string.question_1, true),
		new TrueFalse(R.string.question_2, false),
		new TrueFalse(R.string.question_3, true),
	};

    @Override
    protected void onCreate(Bundle savedInstanceState) 
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        mTrueButton = (Button)findViewById(R.id.true_button);
        mFalseButton = (Button)findViewById(R.id.false_button);
        mNextButton = (Button)findViewById(R.id.next_button);
        
        mQuestionTextView = (TextView)findViewById(R.id.question_text_view);
        
        mNextButton.setOnClickListener(new OnClickListener()
		{
			
			@Override
			public void onClick(View v)
			{
				//将数字加1，显示下一题
				mCurrentIndex = (mCurrentIndex + 1) % mQuestionBank.length;
				updateQuestion();
			}
		});
        
        mTrueButton.setOnClickListener(new OnClickListener()
		{
			
			@Override
			public void onClick(View v)
			{
				checkAnswer(true);			
			}
		});
        
        mFalseButton.setOnClickListener(new OnClickListener()
		{
			
			@Override
			public void onClick(View v)
			{
				checkAnswer(false);	
			}
		});
        
        updateQuestion();
    }
    
    /**
     * 将显示题目的TextView按照mCurrentIndex来显示题目
     */
    private void updateQuestion()
    {
    	int question = mQuestionBank[mCurrentIndex].getQuestion();
		mQuestionTextView.setText(question);
    }
    
    /**
     * 将用户的答案同当前TrueFalse对象中的答案作比较，根据正确与否，生产Toast消息反馈给用户
     */
    private void checkAnswer(boolean userPressedTrue)
    {
    	boolean answerIsTrue = mQuestionBank[mCurrentIndex].isTrueQuestion();
    	
    	int messageResId = 0;
    	if(userPressedTrue == answerIsTrue)
    	{
    		messageResId = R.string.correct_toast;
    	}else 
    	{
			messageResId = R.string.incorrect_toast;
		}
    	Toast.makeText(this, messageResId, Toast.LENGTH_SHORT).show();
    }
}
