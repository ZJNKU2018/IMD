package com.example.hello_toast;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int mCount = 0;
    private TextView mShowCount;
    private Button zbuttonColor;
    private Button cbuttonColor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.show_count);
        zbuttonColor = (Button) findViewById(R.id.button_zero);
        cbuttonColor = (Button) findViewById(R.id.button_count);
    }

    public void showToast(View view) {
        Toast toast = Toast.makeText(this,R.string.toast_message, Toast.LENGTH_SHORT);
        toast.show();
    }

    public void countUp(View view) {
        mCount++;
        if (mShowCount != null) {
            if (mCount % 2 ==0){
                cbuttonColor.setBackgroundColor(Color.parseColor("#FFA500"));
            }
            else {
                cbuttonColor.setBackgroundColor(Color.parseColor("#800080"));
            }
            zbuttonColor.setBackgroundColor(Color.parseColor("#DC143C"));
            mShowCount.setText(Integer.toString(mCount));
        }
    }

    public void ZeroButton(View view) {
        mCount = 0;
        if (mShowCount != null) {
            zbuttonColor.setBackgroundColor(Color.parseColor("#808080"));
            cbuttonColor.setBackgroundColor(Color.parseColor("#6200EE"));
            mShowCount.setText(Integer.toString(mCount));
        }

    }
}
