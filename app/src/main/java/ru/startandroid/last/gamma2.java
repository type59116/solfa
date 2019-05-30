package ru.startandroid.last;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class gamma2 extends AppCompatActivity {

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gamma2);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        chore = (Button) findViewById(R.id.accord);
        interval = (Button) findViewById(R.id.interval);
        klav = (Button) findViewById(R.id.klav);
        chat = (Button) findViewById(R.id.chat);
        chore.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick (View v){
                        Intent intent = new Intent(".chord");
                        startActivity(intent);

                    }
                }
        );

        interval.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick (View v){
                        Intent intent = new Intent(".interval");
                        startActivity(intent);

                    }
                }
        );
        klav.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick (View v){
                        Intent intent = new Intent(".klav");
                        startActivity(intent);

                    }
                }
        );
        chat.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick (View v){
                        Intent intent = new Intent(".mychat");
                        startActivity(intent);

                    }
                }
        );
        RadioButton bdur = (RadioButton)findViewById(R.id.bdur);
        bdur.setOnClickListener(radioButtonClickListener);

        RadioButton redurg = (RadioButton)findViewById(R.id.redurg);
        redurg.setOnClickListener(radioButtonClickListener);

        RadioButton midurg = (RadioButton)findViewById(R.id.midurg);
        midurg.setOnClickListener(radioButtonClickListener);

        RadioButton fadurg = (RadioButton)findViewById(R.id.fadurg);
        fadurg.setOnClickListener(radioButtonClickListener);

        RadioButton soldurg = (RadioButton)findViewById(R.id.soldurg);
        soldurg.setOnClickListener(radioButtonClickListener);

        RadioButton ladurg = (RadioButton)findViewById(R.id.ladurg);
        ladurg.setOnClickListener(radioButtonClickListener);

        RadioButton sidurg = (RadioButton)findViewById(R.id.sidurg);
        sidurg.setOnClickListener(radioButtonClickListener);


        RadioButton doming = (RadioButton)findViewById(R.id.doming);
        doming.setOnClickListener(radioButtonClickListener2);
        RadioButton reming = (RadioButton)findViewById(R.id.reming);
        reming.setOnClickListener(radioButtonClickListener2);
        RadioButton miming = (RadioButton)findViewById(R.id.miming);
        miming.setOnClickListener(radioButtonClickListener2);
        RadioButton faming = (RadioButton)findViewById(R.id.faming);
        faming.setOnClickListener(radioButtonClickListener2);
        RadioButton solming = (RadioButton)findViewById(R.id.solming);
        solming.setOnClickListener(radioButtonClickListener2);
        RadioButton laming = (RadioButton)findViewById(R.id.laming);
        laming.setOnClickListener(radioButtonClickListener2);
        RadioButton siming = (RadioButton)findViewById(R.id.siming);
        siming.setOnClickListener(radioButtonClickListener2);

        txt = findViewById(R.id.textView5);
        txt2 = findViewById(R.id.textView10);
    }
    private Button interval;
    private Button chat;
    private Button klav;
    private Button chore;
    View.OnClickListener radioButtonClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            RadioGroup radioGroup = findViewById(R.id.radio2);
            int checkedRadioButtonId = radioGroup.getCheckedRadioButtonId();

            RadioButton myRadioButton = (RadioButton) findViewById(checkedRadioButtonId);

            String strText;
            strText = myRadioButton.getText().toString();

            if(strText.equals("До, мажор")) {
                Drawable img = getResources().getDrawable(R.drawable.laddo);
                img.setBounds(0, 0, 1200, 300);
                txt.setCompoundDrawables(img, null, null, null);

            }
            if(strText.equals("Ре, мажор")) {
                Drawable img = getResources().getDrawable(R.drawable.redurg);
                img.setBounds(0, 0, 1200, 300);
                txt.setCompoundDrawables(img, null, null, null);

            }
            if(strText.equals("Ми, мажор")) {
                Drawable img = getResources().getDrawable(R.drawable.midurg);
                img.setBounds(0, 0, 1200, 300);
                txt.setCompoundDrawables(img, null, null, null);

            }
            if(strText.equals("Фа, мажор")) {
                Drawable img = getResources().getDrawable(R.drawable.fadurg);
                img.setBounds(0, 0, 1200, 300);
                txt.setCompoundDrawables(img, null, null, null);

            }
            if(strText.equals("Соль, мажор")) {
                Drawable img = getResources().getDrawable(R.drawable.soldurg);
                img.setBounds(0, 0, 1200, 300);
                txt.setCompoundDrawables(img, null, null, null);

            }
            if(strText.equals("Ля, мажор")) {
                Drawable img = getResources().getDrawable(R.drawable.ladurg);
                img.setBounds(0, 0, 1200, 300);
                txt.setCompoundDrawables(img, null, null, null);

            }
            if(strText.equals("Си, мажор")) {
                Drawable img = getResources().getDrawable(R.drawable.sidur);
                img.setBounds(0, 0, 1200, 300);
                txt.setCompoundDrawables(img, null, null, null);

            }
        }
    };
    View.OnClickListener radioButtonClickListener2 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            RadioGroup radioGroup = findViewById(R.id.radio);
            int checkedRadioButtonId = radioGroup.getCheckedRadioButtonId();

            RadioButton myRadioButton = (RadioButton) findViewById(checkedRadioButtonId);

            String strText;
            strText = myRadioButton.getText().toString();

            if(strText.equals("До, минор")) {
                Drawable img = getResources().getDrawable(R.drawable.doming);
                img.setBounds(0, 0, 1200, 300);
                txt2.setCompoundDrawables(img, null, null, null);

            }
            if(strText.equals("Ре, минор")) {
                Drawable img = getResources().getDrawable(R.drawable.reming);
                img.setBounds(0, 0, 1200, 300);
                txt2.setCompoundDrawables(img, null, null, null);

            }
            if(strText.equals("Ми, минор")) {
                Drawable img = getResources().getDrawable(R.drawable.miming);
                img.setBounds(0, 0, 1200, 300);
                txt2.setCompoundDrawables(img, null, null, null);

            }
            if(strText.equals("Фа, минор")) {
                Drawable img = getResources().getDrawable(R.drawable.faming);
                img.setBounds(0, 0, 1200, 300);
                txt2.setCompoundDrawables(img, null, null, null);

            }
            if(strText.equals("Соль, минор")) {
                Drawable img = getResources().getDrawable(R.drawable.solming);
                img.setBounds(0, 0, 1200, 300);
                txt2.setCompoundDrawables(img, null, null, null);

            }
            if(strText.equals("Ля, минор")) {
                Drawable img = getResources().getDrawable(R.drawable.laming);
                img.setBounds(0, 0, 1200, 300);
                txt2.setCompoundDrawables(img, null, null, null);

            }
            if(strText.equals("Си, минор")) {
                Drawable img = getResources().getDrawable(R.drawable.siming);
                img.setBounds(0, 0, 1200, 300);
                txt2.setCompoundDrawables(img, null, null, null);

            }
        }
    };
    TextView txt;
    TextView txt2;
}