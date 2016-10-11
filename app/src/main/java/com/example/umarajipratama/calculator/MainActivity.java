package com.example.umarajipratama.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    //deklarasi variabel
    public String str = "";
    Character op = 'q';
    float i,num,numtemp;

    //widget
    EditText showResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //mengambil id dari result_id
        showResult = (EditText) findViewById(R.id.result_id);
    }

    //method untuk insert data
    public void btn0Clicked(View v){
        insert(0);
    }
    
    public void btn1Clicked(View v){
        insert(1);
    }

    public void btn2Clicked(View v){
        insert(2);
    }

    public void btn3Clicked(View v){
        insert(3);
    }

    public void btn4Clicked(View v){
        insert(4);
    }

    public void btn5Clicked(View v){
        insert(5);
    }

    public void btn6Clicked(View v){
        insert(6);
    }

    public void btn7Clicked(View v){
        insert(7);
    }

    public void btn8Clicked(View v){
        insert(8);
    }

    public void btn9Clicked(View v){
        insert(9);
    }

    //end insert data

    //method untuk operasi bilangan

    public void btnplusClicked(View v){
        perfom();
        op = '+';
    }

    public void btnminusClicked(View v){
        perfom();
        op = '-';
    }

    public void btndivideClicked(View v){
        perfom();
        op = '/';
    }

    public void btnmultiClicked(View v){
        perfom();
        op = '*';
    }

    public void btnpersenClicked(View v){
        perfom();
        op = '%';
    }

    //end method operasi bilangan

    //btn hasil atau = memanggil method calculate
    public void btnequalClicked(View v){
        calculate();
    }

    //method reset angka memanggil fungsi reset
    public void btnclearClicked(View v){
        reset();
    }

    //method btn exit memanggil method exit
    public void btnexitClicked(View v){
        exit();
    }

    //method perfom memanggil method calculate noshow
    private void perfom() {
        str = "";
        calculateNoshow();

        numtemp = num;
    }

    private void calculateNoshow() {
        if (op == '+')
            num = numtemp+num;
        else if (op == '-')
            num = numtemp-num;
        else if (op == '/')
            num = numtemp/num;
        else if (op == '*')
            num = numtemp*num;
        else if (op == '%')
            num = numtemp%num;
    }

    public void exit() {
        this.finish();
        Intent intent = new Intent(Intent.ACTION_MAIN);
        intent.addCategory(Intent.CATEGORY_HOME);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }

    private void reset() {
        str = "";
        op = 'q';
        num = 0;
        numtemp = 0;
        showResult.setText("");
    }

    private void calculate() {
        if (op == '+')
            num = numtemp+num;
        else if (op == '-')
            num = numtemp-num;
        else if (op == '/')
            num = numtemp/num;
        else if (op == '*')
            num = numtemp*num;
        else if (op == '%')
            num = numtemp%num;

        showResult.setText(""+num);
    }

    private void insert(int j) {
        str = str + Integer.toString(j);

        num = Integer.valueOf(str).intValue();
        showResult.setText(str);
    }
}
