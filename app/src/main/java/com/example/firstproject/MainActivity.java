package com.example.firstproject;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText num1;
    private EditText num2;
    private int result;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        //各种绑视图
        //把textview的视图绑上去
        textView = (TextView)findViewById(R.id.res);
        //result用字符串的形式设置到textView视图上
        textView.setText(String.valueOf(result));
        num1 = (EditText)findViewById(R.id.num);
        num2 = (EditText)findViewById(R.id.num2);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void addFunc(View view){
        if(String.valueOf(num1.getText()).equals("")||String.valueOf(num2.getText()).equals("")){
            //弹窗
            new AlertDialog.Builder(MainActivity.this)
                    .setTitle("警告").setMessage("输入不能为空，请重新输入").setPositiveButton("我晓得喽",null).show();
        }else{
            result = Integer.parseInt(String.valueOf(num1.getText()))+Integer.parseInt(String.valueOf(num2.getText()));
            textView.setText(String.valueOf(result));
        }
    }
    public void subFunc(View view){
        if(String.valueOf(num1.getText()).equals("")||String.valueOf(num2.getText()).equals("")){
            //弹窗
            new AlertDialog.Builder(MainActivity.this)
                    .setTitle("警告").setMessage("输入不能为空，请重新输入").setPositiveButton("我晓得喽",null).show();
        }else{
            result = Integer.parseInt(String.valueOf(num1.getText()))-Integer.parseInt(String.valueOf(num2.getText()));
            textView.setText(String.valueOf(result));
        }
    }
    public void mulFunc(View view){
        if(String.valueOf(num1.getText()).equals("")||String.valueOf(num2.getText()).equals("")){
            //弹窗
            new AlertDialog.Builder(MainActivity.this)
                    .setTitle("警告").setMessage("输入不能为空，请重新输入").setPositiveButton("我晓得喽",null).show();
        }else{
            result = Integer.parseInt(String.valueOf(num1.getText()))*Integer.parseInt(String.valueOf(num2.getText()));
            textView.setText(String.valueOf(result));
        }
    }
    public void divFunc(View view){
        if(String.valueOf(num1.getText()).equals("")||String.valueOf(num2.getText()).equals("")){
            //弹窗
            new AlertDialog.Builder(MainActivity.this)
                    .setTitle("警告").setMessage("输入不能为空，请重新输入").setPositiveButton("我晓得喽",null).show();
        }else{
            result = Integer.parseInt(String.valueOf(num1.getText()))/Integer.parseInt(String.valueOf(num2.getText()));
            textView.setText(String.valueOf(result));
        }
    }
}
