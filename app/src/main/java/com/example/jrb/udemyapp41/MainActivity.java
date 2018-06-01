package com.example.jrb.udemyapp41;

import android.media.Rating;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener,
        SeekBar.OnSeekBarChangeListener, RatingBar.OnRatingBarChangeListener, RadioGroup.OnCheckedChangeListener{

    CheckBox checkBox1;
    CheckBox checkBox2;
    CheckBox checkBox3;
    CheckBox checkBox4;
    CheckBox checkBox5;
    CheckBox checkBox6;
    CheckBox checkBox7;

    SeekBar seekBar;
    RatingBar ratingBar;

    RadioGroup radioGroup;
    RadioButton radioButton1;
    RadioButton radioButton2;
    RadioButton radioButton3;
    RadioButton radioButton4;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkBox1 = (CheckBox)findViewById(R.id.checkbox1);
        checkBox2 = (CheckBox)findViewById(R.id.checkbox2);
        checkBox3 = (CheckBox)findViewById(R.id.checkbox3);
        checkBox4 = (CheckBox)findViewById(R.id.checkbox4);
        checkBox5 = (CheckBox)findViewById(R.id.checkbox5);
        checkBox6 = (CheckBox)findViewById(R.id.checkbox6);
        checkBox7 = (CheckBox)findViewById(R.id.checkbox7);

        seekBar = (SeekBar)findViewById(R.id.seekBar);
        ratingBar = (RatingBar)findViewById(R.id.ratingBar);

        radioGroup = (RadioGroup)findViewById(R.id.radioGroup);
        radioButton1 = (RadioButton)findViewById(R.id.radioButton1);
        radioButton2 = (RadioButton)findViewById(R.id.radioButton2);
        radioButton3 = (RadioButton)findViewById(R.id.radioButton3);
        radioButton4 = (RadioButton)findViewById(R.id.radioButton4);

        checkBox1.setOnCheckedChangeListener(this);
        checkBox2.setOnCheckedChangeListener(this);
        checkBox3.setOnCheckedChangeListener(this);
        checkBox4.setOnCheckedChangeListener(this);
        checkBox5.setOnCheckedChangeListener(this);
        checkBox6.setOnCheckedChangeListener(this);
        checkBox7.setOnCheckedChangeListener(this);

        seekBar.setOnSeekBarChangeListener(this);

        ratingBar.setOnRatingBarChangeListener(this);

        radioGroup.setOnCheckedChangeListener(this);

    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

        switch (buttonView.getId()){
            case R.id.checkbox1:
                if(isChecked){
                    Toast.makeText(this, "Basketball!", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.checkbox2:
                if(isChecked){
                    Toast.makeText(this, "Boxing!", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.checkbox3:
                if(isChecked){
                    Toast.makeText(this, "Kick Boxing!", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.checkbox4:
                if(isChecked){
                    Toast.makeText(this, "Judo!", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.checkbox5:
                if(isChecked){
                    Toast.makeText(this, "Football!", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.checkbox6:
                if(isChecked){
                    Toast.makeText(this, "Taekwondo!", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.checkbox7:
                if(isChecked){
                    Toast.makeText(this, "Swimming!", Toast.LENGTH_SHORT).show();
                }
        }

    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

        Toast.makeText(this, "SeekBar value is "+progress, Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

        Toast.makeText(this, "SeekBar started", Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

        Toast.makeText(this, "SeekBar stopped", Toast.LENGTH_SHORT).show();

    }

    @Override
    public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
        Toast.makeText(this, "Number of Stars are: "+rating, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {

        switch (checkedId){
            case R.id.radioButton1:
                Toast.makeText(this, "Android OS", Toast.LENGTH_SHORT).show();
                break;
            case R.id.radioButton2:
                Toast.makeText(this, "iOS", Toast.LENGTH_SHORT).show();
                break;
            case R.id.radioButton3:
                Toast.makeText(this, "PHP", Toast.LENGTH_SHORT).show();
                break;
            case R.id.radioButton4:
                Toast.makeText(this, "Windows", Toast.LENGTH_SHORT).show();
                break;
        }

    }
}
