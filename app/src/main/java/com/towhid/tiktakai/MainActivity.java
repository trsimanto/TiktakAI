package com.towhid.tiktakai;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    String mark = "O";
    String mark2 = "X";
    int count = 1;
    String array[] = {"0","1","2","3","4","5","6","7","8","9"};
    TextView click1, click2, click3, click4, click5, click6, click7, click8, click9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        click1 = (TextView) findViewById(R.id.click1);
        click2 = (TextView) findViewById(R.id.click2);
        click3 = (TextView) findViewById(R.id.click3);
        click4 = (TextView) findViewById(R.id.click4);
        click5 = (TextView) findViewById(R.id.click5);
        click6 = (TextView) findViewById(R.id.click6);
        click7 = (TextView) findViewById(R.id.click7);
        click8 = (TextView) findViewById(R.id.click8);
        click9 = (TextView) findViewById(R.id.click9);
    }

    public void click(View view) {
        switch (view.getId()) {

            case R.id.click1:
                if ("1".equals(array[1])) {
                    if (count == 1) {
                        click1.setText(mark);
                        array[1] = mark;
                        count = 0;
                    } else {
                        click1.setText(mark2);
                        array[1] = mark2;
                        count = 1;
                    }
                }
                break;


            case R.id.click2:
                if ("2".equals(array[2])) {
                    if (count == 1) {
                        click2.setText(mark);
                        array[2] = mark;
                        count = 0;
                    } else {
                        click2.setText(mark2);
                        array[2] = mark2;
                        count = 1;
                    }
                }
                break;

            case R.id.click3:
                if ("3".equals(array[3])) {
                    if (count == 1) {
                        click3.setText(mark);
                        array[3] = mark;
                        count = 0;
                    } else {
                        click3.setText(mark2);
                        array[3] = mark2;
                        count = 1;
                    }
                }
                break;
            case R.id.click4:
                if ("4".equals(array[4])) {
                    if (count == 1) {
                        click4.setText(mark);
                        array[4] = mark;
                        count = 0;
                    } else {
                        click4.setText(mark2);
                        array[4] = mark2;
                        count = 1;
                    }
                }
                break;
            case R.id.click5:
                if ("5".equals(array[5])) {
                    if (count == 1) {
                        click5.setText(mark);
                        array[5] = mark;
                        count = 0;
                    } else {
                        click5.setText(mark2);
                        array[5] = mark2;
                        count = 1;
                    }
                }
                break;
            case R.id.click6:
                if ("6".equals(array[6])) {
                    if (count == 1) {
                        click6.setText(mark);
                        array[6] = mark;
                        count = 0;
                    } else {
                        click6.setText(mark2);
                        array[6] = mark2;
                        count = 1;
                    }
                }
                break;

            case R.id.click7:
                if ("7".equals(array[7])) {
                    if (count == 1) {
                        click7.setText(mark);
                        array[7] = mark;
                        count = 0;
                    } else {
                        click7.setText(mark2);
                        array[1] = mark2;
                        count = 1;
                    }
                }
                break;

            case R.id.click8:
                if ("8".equals(array[8])) {
                    if (count == 1) {
                        click8.setText(mark);
                        array[8] = mark;
                        count = 0;
                    } else {
                        click8.setText(mark2);
                        array[8] = mark2;
                        count = 1;
                    }
                }
                break;
            case R.id.click9:
                if ("9".equals(array[9])) {
                    if (count == 1) {
                        click9.setText(mark);
                        array[9] = mark;
                        count = 0;
                    } else {
                        click9.setText(mark2);
                        array[9] = mark2;
                        count = 1;
                    }
                }
                break;

        }
    }

    public void reFresh(View view) {
        for (int i=0;i<=9;i++)
        {
            array[i]=String.valueOf(i);
        }
        click1.setText("");
        click2.setText("");
        click3.setText("");
        click4.setText("");
        click5.setText("");
        click6.setText("");
        click7.setText("");
        click8.setText("");
        click9.setText("");

    }
}
