package com.bitbyte24seven.quizzeler;

        import android.os.Bundle;
        import android.support.v7.app.AppCompatActivity;
        import android.view.View;
        import android.widget.Button;
        import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int Index;
    int mQuestion;
    TextView showQution;

    //make the qutionn bank

    private  TrueFalse[] mqutionBank = new TrueFalse[]{
            new TrueFalse(R.string.question_1,true),
            new TrueFalse(R.string.question_2,true),
            new TrueFalse(R.string.question_3,true),
            new TrueFalse(R.string.question_4,true),
            new TrueFalse(R.string.question_5,true),
            new TrueFalse(R.string.question_6,false),
            new TrueFalse(R.string.question_7,true),
            new TrueFalse(R.string.question_8,false),
            new TrueFalse(R.string.question_9,true),
            new TrueFalse(R.string.question_10,true),
            new TrueFalse(R.string.question_11,false),
            new TrueFalse(R.string.question_12,false),
            new TrueFalse(R.string.question_13,true),
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button trueButton =  findViewById(R.id.tureButton);
        Button falseButton = findViewById(R.id.falseButton);
        showQution = findViewById(R.id.showQution);

        mQuestion = mqutionBank[Index].getQution();
        showQution.setText(mQuestion);



//        //type 1 onclick listener
//        View.OnClickListener myLister = new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Log.d("test","hellohello");
//
//                //tpye 1 tost message
//                Toast.makeText(getApplicationContext(),"True button is press",Toast.LENGTH_SHORT).show();
//
//            }
//        };
//        trueButton.setOnClickListener(myLister);
//
//        //type 2 onclick listener
//        falseButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                //typr 2 tost message
//                Toast toast = Toast.makeText(getApplicationContext(),"False press",Toast
//                        .LENGTH_SHORT);
//                toast.show();
//
//            }
//        });


    }


    public void flase(View view) {
        updateQution();
    }

    public void trueb(View view) {
        updateQution();
    }

    private  void updateQution (){
        Index = Index+1;
        //Index++;
        mQuestion = mqutionBank[Index].getQution();
        showQution.setText(mQuestion);
    }

}
