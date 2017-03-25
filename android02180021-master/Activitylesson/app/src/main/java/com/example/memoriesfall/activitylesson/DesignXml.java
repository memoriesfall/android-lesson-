package com.example.memoriesfall.activitylesson;

import android.app.Activity;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class DesignXml extends Activity {

    RadioButton r1 = null;
    RadioButton r2 = null;
    RadioButton r3 = null;
    RadioButton r4 = null;
    RadioGroup radioGroup = null;
    RadioButton currentButton = null;
    TextView T1 = null;

    public  void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_main);
        radioGroup = (RadioGroup) findViewById(R.id.radiogroup);
        r1 = (RadioButton) findViewById(R.id.a);
        r2 = (RadioButton) findViewById(R.id.b);
        r3 = (RadioButton) findViewById(R.id.c);
        r4 = (RadioButton) findViewById(R.id.d);
        T1 = (TextView) findViewById(R.id.editText);

        radioGroup.setOnCheckedChangeListener(changeradio);
        Button b1_Confirm = (Button) findViewById(R.id.Confirm);
        Button b2_Cancel = (Button) findViewById(R.id.Cancel);
        b1_Confirm.setOnClickListener(new b1_Confirm());
        b2_Cancel.setOnClickListener(new b2_Cancel());
    }

    class b1_Confirm implements OnClickListener{
        public void onClick(View v) {
            if (currentButton.getText().equals("Noctis")) {
                T1.setText("Noctis sent his regard");
            } else {
                T1.setText("Wrong");
            }
        }
    }
    class b2_Cancel implements OnClickListener {

        @Override
        public void onClick(View v) {
            // TODO Auto-generated method stub
            radioGroup.clearCheck();
            setTitle("");
        }

    }

    private RadioGroup.OnCheckedChangeListener changeradio = new RadioGroup.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(RadioGroup group, int checkedId) {
            if (checkedId == r1.getId()) {
                currentButton = r1;
            } else if (checkedId == r2.getId()) {
                currentButton = r2;
            } else if (checkedId == r3.getId()) {
                currentButton = r3;
            } else if (checkedId == r4.getId()) {
                currentButton = r4;
            }

        }
    };


}
