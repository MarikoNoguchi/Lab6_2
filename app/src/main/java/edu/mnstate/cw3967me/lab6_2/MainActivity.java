package edu.mnstate.cw3967me.lab6_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    TextView tvLastName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvLastName = (TextView) findViewById(R.id.lblLastName);
        tvLastName.setText("Jones");
    }//end onCreate
}//end MainActivity
