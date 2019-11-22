package com.secapp.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.*;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button trueButton ;
    private Button falseButton ;
    private TextView questionview;
    private Button next_bt;
    private ImageView img;
    int cnt=0;
    private Question[] questionbank = new Question[]{
            new Question(R.string.Question2,true,R.drawable.ic_launcher_background),
            new Question(R.string.Question3,false,R.drawable.aarshee),
            new Question(R.string.Question4,true,R.drawable.ic_launcher_foreground),
            new Question(R.string.Question5,true,R.drawable.ic_launcher_foreground)
    };

//cnt
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        trueButton = findViewById(R.id.truebt);
        falseButton = findViewById(R.id.falsebt);
        questionview = findViewById(R.id.question);
        img = findViewById(R.id.imageView);
        next_bt = findViewById(R.id.nextbt);
        trueButton.setOnClickListener(this);
        falseButton.setOnClickListener(this);
        next_bt.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.truebt :
                if (questionbank[cnt].getAns())
                    Toast.makeText(MainActivity.this,"Correct Answer",Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(MainActivity.this,"Wrong Answer",Toast.LENGTH_SHORT).show();
                break;

            case R.id.falsebt :
                if (questionbank[cnt].getAns())
                    Toast.makeText(MainActivity.this,"Wrong Answer",Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(MainActivity.this,"Correct Answer",Toast.LENGTH_SHORT).show();
                break;
            /*case R.id.truebt:
                Toast.makeText(MainActivity.this,"TRUE",Toast.LENGTH_SHORT).show();
                break;

            case R.id.falsebt:
                Toast.makeText(MainActivity.this,"FALSE",Toast.LENGTH_SHORT).show();
                break;*/

            case R.id.nextbt:

                cnt = (cnt+1) % questionbank.length;
                questionview.setText(questionbank[cnt].getRsid());
                //img.setImageResource(questionbank[cnt].getImgid());
                break;

        }


    }
}
