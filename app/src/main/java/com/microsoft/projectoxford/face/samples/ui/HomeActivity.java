package com.microsoft.projectoxford.face.samples.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.microsoft.projectoxford.face.samples.R;
import com.microsoft.projectoxford.face.samples.persongroupmanagement.PersonGroupListActivity;

import static java.lang.System.exit;

public class HomeActivity extends AppCompatActivity {
    private Button take_attendance_button, view_attendance_button, add_students_button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        //splash screen commented............
       /* SplashScreen.show(this, SplashScreen.TERMINAL_ANIMATION);
        );*/

        take_attendance_button=(Button)findViewById(R.id.startNow);
        view_attendance_button=(Button)findViewById(R.id.exit);
        add_students_button=(Button)findViewById(R.id.addStudent);

        take_attendance_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent take_attendance_intent=new Intent(HomeActivity.this,com.microsoft.projectoxford.face.samples.ui.IdentificationActivity.class);
                startActivity(take_attendance_intent);
            }
        });

        view_attendance_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                exit(0);
            }
        });

        add_students_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent add_students_intent=new Intent(HomeActivity.this, PersonGroupListActivity.class);
                startActivity(add_students_intent);
            }
        });
    }
}
