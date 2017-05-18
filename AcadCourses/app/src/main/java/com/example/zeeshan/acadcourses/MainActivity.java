package com.example.zeeshan.acadcourses;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lv_acadgildcourses;
    TextView tv_acadgildcourses;
    ArrayList<String> al_courses;
    Myadapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv_acadgildcourses = (ListView) findViewById(R.id.lv_acadgildcourses);

        al_courses = new ArrayList<>();
        al_courses.add("ANDROID DEVELOPMENT");
        al_courses.add("DIGITAL MARKETING");
        al_courses.add("CLOUD COMPUTING");
        al_courses.add("BUSINESS ANALYTICS");
        al_courses.add("FRONTEND DEVELOPMENT");
        al_courses.add("CORE JAVA");
        al_courses.add("IOS");
        al_courses.add("ROBOTICS");
        al_courses.add("FULL STACK WEB DEVELOPMENT");
        al_courses.add("BIG DATA AND HADOOP DEVELOPMENT ");
        al_courses.add("NODE JS");
        al_courses.add("ADVANCED J2EE");
        al_courses.add("ROBOTICS");
        al_courses.add("APACHE SPARK");
        al_courses.add("ARDUINO");
        al_courses.add("RASBERRY PI");
        al_courses.add("UNITY 2D");
        al_courses.add("CERTIFIED ETHICAL HACKER");
        al_courses.add("ITIL");
        al_courses.add("PRINCE2");



        adapter = new Myadapter();
        lv_acadgildcourses.setAdapter(adapter);

        lv_acadgildcourses.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(MainActivity.this,Main2Activity.class);
                i.putExtra("acadgild", position);
                startActivity(i);
            }
        });

    }
    public class Myadapter extends BaseAdapter {

        @Override
        public int getCount() {
            return al_courses.size();
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            viewholder holder;
            if (convertView == null){
                convertView = getLayoutInflater().inflate(R.layout.row_view,parent,false);
                holder = new viewholder();
                holder.bindview(convertView);
                convertView.setTag(holder);

            }
            else {
                holder = (viewholder)convertView.getTag();
                Log.e("MainActivity","convert view not null");



            }
            holder.tv_acadgildcourses.setText(al_courses.get(position));
            return convertView;
        }
    }
    public class viewholder{
        TextView tv_acadgildcourses;


        void bindview(View convertview){
            tv_acadgildcourses = (TextView) convertview.findViewById(R.id.tv_acadgildcourses);

        }
    }


}