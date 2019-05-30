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

public class chordton extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chordton);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        chore = (Button) findViewById(R.id.accord);
        interval = (Button) findViewById(R.id.interval);
        chat = (Button) findViewById(R.id.chat);
        gamma = (Button) findViewById(R.id.gamma);
        klav = (Button) findViewById(R.id.klav);
        chore.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick (View v){
                        Intent intent = new Intent(".chord");
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
        gamma.setOnClickListener(
                new View.OnClickListener(){
                    @Override
                    public void onClick (View v){
                        Intent intent = new Intent(".gamma");
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
        RadioButton adur = (RadioButton)findViewById(R.id.adur);
        adur.setOnClickListener(radioButtonClickListener);

        RadioButton gdur = (RadioButton)findViewById(R.id.gdur);
        gdur.setOnClickListener(radioButtonClickListener);

        RadioButton ddur = (RadioButton)findViewById(R.id.ddur);
        ddur.setOnClickListener(radioButtonClickListener);

        RadioButton dddur = (RadioButton)findViewById(R.id.dddur);
        dddur.setOnClickListener(radioButtonClickListener);

        RadioButton bdur = (RadioButton)findViewById(R.id.bdur);
        bdur.setOnClickListener(radioButtonClickListener);

        RadioButton lamin= (RadioButton)findViewById(R.id.lamin);
        lamin.setOnClickListener(radioButtonClickListener2);

        RadioButton mimin= (RadioButton)findViewById(R.id.mimin);
        mimin.setOnClickListener(radioButtonClickListener2);

        RadioButton fadmin= (RadioButton)findViewById(R.id.fadmin);
        fadmin.setOnClickListener(radioButtonClickListener2);

        RadioButton soldmin= (RadioButton)findViewById(R.id.soldmin);
        soldmin.setOnClickListener(radioButtonClickListener2);

        RadioButton ladmin= (RadioButton)findViewById(R.id.ladmin);
        ladmin.setOnClickListener(radioButtonClickListener2);

        txt = findViewById(R.id.textView5);
        txt2 = findViewById(R.id.textView3);
    }
    private Button interval;
    private Button chat;
    private Button klav;
    private Button chore;
    private Button gamma;

    View.OnClickListener radioButtonClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            RadioGroup  radioGroup = findViewById(R.id.radio);
            int checkedRadioButtonId = radioGroup.getCheckedRadioButtonId();

            RadioButton myRadioButton = (RadioButton) findViewById(checkedRadioButtonId);

            String strText;
            strText = myRadioButton.getText().toString();

            if(strText.equals("До мажор")) {
                Drawable img = getResources().getDrawable(R.drawable.domc);
                img.setBounds(0, 0, 800, 400);
                txt.setCompoundDrawables(img, null, null, null);

            }
            if(strText.equals("Соль мажор")) {
                Drawable img = getResources().getDrawable(R.drawable.solmc);
                img.setBounds(0, 0, 800, 400);
                txt.setCompoundDrawables(img, null, null, null);

            }
            if(strText.equals("Ля мажор")) {
                Drawable img = getResources().getDrawable(R.drawable.lamc);
                img.setBounds(0, 0, 800, 400);
                txt.setCompoundDrawables(img, null, null, null);

            }
            if(strText.equals("Си мажор")) {
                Drawable img = getResources().getDrawable(R.drawable.simc);
                img.setBounds(0, 0, 800, 400);
                txt.setCompoundDrawables(img, null, null, null);

            }
            if(strText.equals("До-диез мажор")) {
                Drawable img = getResources().getDrawable(R.drawable.dodmc);
                img.setBounds(0, 0, 800, 400);
                txt.setCompoundDrawables(img, null, null, null);

            }

        }
    };
    View.OnClickListener radioButtonClickListener2 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            RadioGroup  radioGroup = findViewById(R.id.radio2);
            int checkedRadioButtonId = radioGroup.getCheckedRadioButtonId();

            RadioButton myRadioButton = (RadioButton) findViewById(checkedRadioButtonId);

            String strText2;
            strText2 = myRadioButton.getText().toString();

            if(strText2.equals("Ля минор")) {
                Drawable img = getResources().getDrawable(R.drawable.lamin);
                img.setBounds(0, 0, 800, 400);
                txt2.setCompoundDrawables(img, null, null, null);

            }
            if(strText2.equals("Ми минор")) {
                Drawable img = getResources().getDrawable(R.drawable.miminc);
                img.setBounds(0, 0, 800, 400);
                txt2.setCompoundDrawables(img, null, null, null);

            }
            if(strText2.equals("Фа-диез минор")) {
                Drawable img = getResources().getDrawable(R.drawable.fadminc);
                img.setBounds(0, 0, 800, 400);
                txt2.setCompoundDrawables(img, null, null, null);

            }
            if(strText2.equals("Соль-диез минор")) {
                Drawable img = getResources().getDrawable(R.drawable.soldminc);
                img.setBounds(0, 0, 800, 400);
                txt2.setCompoundDrawables(img, null, null, null);

            }
            if(strText2.equals("Ля-диез минор")) {
                Drawable img = getResources().getDrawable(R.drawable.ladminc);
                img.setBounds(0, 0, 800, 400);
                txt2.setCompoundDrawables(img, null, null, null);

            }

        }
    };
    TextView txt, txt2;

}
