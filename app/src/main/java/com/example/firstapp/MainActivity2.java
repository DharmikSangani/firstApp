package com.example.firstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    EditText etxt1,etxt2;
    TextView txtAns;
    int n1,n2,sum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        etxt1=findViewById(R.id.etxt1);
        etxt2=findViewById(R.id.etxt2);
        txtAns=findViewById(R.id.txtAns);

        etxt1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                try {
                    String str1=charSequence.toString();
                    String str2=etxt2.getText().toString();
                    if(str2.isEmpty())
                    {
                        n2=0;
                        etxt2.setError("enter empty");
                    }
                    else
                    {
                        n2= Integer.parseInt(etxt2.getText().toString());
                    }
                    if(str1.isEmpty())
                    {
                        n1=0;
                        etxt1.setError("enter empty");
                    }
                    else
                    {
                        n1= Integer.parseInt(etxt1.getText().toString());
                    }

                     sum = n2+n1;
                    txtAns.setText(""+sum);

                }
                catch (Exception ex)
                {
                    System.out.println("something went wrong...");

                }

            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });


        etxt2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                try {
                    String str2=charSequence.toString();
                    String str1=etxt1.getText().toString();
                    if(str1.isEmpty())
                    {
                        n1=0;
                        etxt1.setError("enter empty");
                    }
                    else
                    {
                        n1= Integer.parseInt(etxt1.getText().toString());
                    }
                    if(str2.isEmpty())
                    {
                        n2=0;
                        etxt2.setError("enter empty");
                    }
                    else
                    {
                        n2= Integer.parseInt(etxt2.getText().toString());
                    }

                     sum = n1+n2;
                    txtAns.setText(""+sum);

                }
                catch (Exception ex)
                {
                    System.out.println("something went wrong...");
                }

            }
            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
    }
}
//        btnAdd.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                  try {
//                      int n1 = Integer.parseInt(etxt1.getText().toString());
//                      int n2 = Integer.parseInt(etxt2.getText().toString());
//                      if (etxt1.getText().toString()==""){
//                          txtAns.setText(""+n1);
//                          System.out.println("hello");
//                      }
//                      if (etxt2.getText().toString()==""){
//                          txtAns.setText(""+n2);
//                          System.out.println("wlcome hello");
//                      }
//                      int sum = n1+n2;
//                      txtAns.setText(""+sum);
//                  }
//                  catch (Exception ex){
//                      System.out.println("something went wrong...");
//                  }
//              }
//
//        });