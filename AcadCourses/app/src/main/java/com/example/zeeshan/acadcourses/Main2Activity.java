package com.example.zeeshan.acadcourses;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    TextView tv_mentorname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tv_mentorname = (TextView) findViewById(R.id.tv_mentorname);
        Bundle acadgilddata = getIntent().getExtras();
        int acadgildmessage = acadgilddata.getInt("acadgild");
        if (acadgilddata==null){
            Log.e("Main2Activity","Bundle null");
            tv_mentorname.setText("No Data");

        }
        else if (acadgildmessage==0){
            tv_mentorname.setText("Mentor is Venkatesh Raman");

        }
        else if (acadgildmessage==1){
            tv_mentorname.setText("Mentor is Tabish");

        }
        else if (acadgildmessage==2){
            tv_mentorname.setText("Mentor is ABC");

        }
        else if (acadgildmessage==3){
            tv_mentorname.setText("Mentor is Mentor 4");

        }
        else if (acadgildmessage==4){
            tv_mentorname.setText("Mentor is Mentor 5");

        }
        else if (acadgildmessage==5){
            tv_mentorname.setText("Mentor is Mentor 6");

        }
        else if (acadgildmessage==6){
            tv_mentorname.setText("Mentor is Mentor 7");

        }
        else if (acadgildmessage==7){
            tv_mentorname.setText("Mentor is Mentor 8");

        }
        else if (acadgildmessage==8){
            tv_mentorname.setText("Mentor is Mentor 9");

        }
        else if (acadgildmessage==9){
            tv_mentorname.setText("Mentor is Mentor 10");

        }
        else if (acadgildmessage==10){
            tv_mentorname.setText("Mentor is Mentor 11");

        }
        else if (acadgildmessage==11){
            tv_mentorname.setText("Mentor is Mentor 12");

        }
        else if (acadgildmessage==12){
            tv_mentorname.setText("Mentor is Mentor 13");

        }
        else if (acadgildmessage==13){
            tv_mentorname.setText("Mentor is Mentor 14");

        }
        else if (acadgildmessage==14){
            tv_mentorname.setText("Mentor is Mentor 15");

        }
        else if (acadgildmessage==15){
            tv_mentorname.setText("Mentor is Mentor 16");

        }
        else if (acadgildmessage==16){
            tv_mentorname.setText("Mentor is Mentor 17");

        }
        else if (acadgildmessage==17){
            tv_mentorname.setText("Mentor is Mentor 18");

        }
        else if (acadgildmessage==18){
            tv_mentorname.setText("Mentor is Mentor 19");

        }
        else if (acadgildmessage==19){
            tv_mentorname.setText("Mentor is Mentor 20");

        }

    }
}

