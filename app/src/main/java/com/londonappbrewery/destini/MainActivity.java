package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    TextView mStoryTextView;
    Button mButtonTop;
    Button mButtonBottom;
    int mStoryId = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mStoryTextView = findViewById(R.id.storyTextView);
        mButtonTop = findViewById(R.id.buttonTop);
        mButtonBottom = findViewById(R.id.buttonBottom);


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        mButtonTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //If on the main story ID 1, the top button proceeds to story ID 3
                if (mStoryId == 1)
                {
                    setStoryID3();
                }

                //If on story ID 2, the top button proceeds to story ID 3
                else if (mStoryId == 2)
                {
                    setStoryID3();
                }

                //If on story ID 3, the top button proceeds to story ID 6, and the game finishes
                else if (mStoryId == 3)
                {
                    setStoryID6();
                }

                //If on story ID 4, 5, or 6, the top button resets the game
                else if ((mStoryId == 4) || (mStoryId == 5) || (mStoryId == 6))
                {
                    setStoryID1();
                }

            }
        });//mTopButton

        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        mButtonBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //If on the main story ID 1, the bottom button proceeds to story ID 2
                if (mStoryId == 1)
                {
                    setStoryID2();
                }

                //If on story ID 2, the bottom button proceeds to story ID 4, and the game finishes
                else if (mStoryId == 2)
                {
                    setStoryID4();
                }

                //If on story ID 3, the top button proceeds to story ID 5, and the game finishes
                else if (mStoryId == 3)
                {
                    setStoryID5();
                }

                //If on story ID 4, 5, or 6, the bottom button exits the app
                else if ((mStoryId == 4) || (mStoryId == 5) || (mStoryId == 6))
                {
                    finish();
                }

            }
        });//mBottomButton




    }//onCreate


    private void setStoryID1() {
        mStoryId = 1;
        mStoryTextView.setText(R.string.T1_Story);
        mButtonTop.setText(R.string.T1_Ans1);
        mButtonBottom.setText(R.string.T1_Ans2);
    };

    private void setStoryID2() {
        mStoryId = 2;
        mStoryTextView.setText(R.string.T2_Story);
        mButtonTop.setText(R.string.T2_Ans1);
        mButtonBottom.setText(R.string.T2_Ans2);
    };

    private void setStoryID3() {
        mStoryId = 3;
        mStoryTextView.setText(R.string.T3_Story);
        mButtonTop.setText(R.string.T3_Ans1);
        mButtonBottom.setText(R.string.T3_Ans2);
    };

    private void setStoryID4() {
        mStoryId = 4;
        mStoryTextView.setText(R.string.T4_End);
        mButtonTop.setText("Start Over");
        mButtonBottom.setText("Exit App");
    }

    private void setStoryID5() {
        mStoryId = 5;
        mStoryTextView.setText(R.string.T5_End);
        mButtonTop.setText("Start Over");
        mButtonBottom.setText("Exit App");
    }

    private void setStoryID6() {
        mStoryId = 6;
        mStoryTextView.setText(R.string.T6_End);
        mButtonTop.setText("Start Over");
        mButtonBottom.setText("Exit App");
    }


}//MainActivity
