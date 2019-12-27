package com.shagi.vetinary;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class vetinaryRegister extends AppCompatActivity {

    EditText e1,e2,e3,e4,e5,e6,e7,e8,e9,e10,e11,e12;
    Spinner s1;
    Button b1;
    String nme,ad,dis,talu,panch,war,hou,rat,adaa,mail,pho,pass,conf;
    RegisterConstructor c1;
    DatabaseReference reference;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vetinary_register);

        reference= FirebaseDatabase.getInstance().getReference().child("User_Details");

        c1=new RegisterConstructor();

        e1=(EditText)findViewById(R.id.Name);
        e2=(EditText)findViewById(R.id.Address);
        s1=(Spinner)findViewById(R.id.District);
        e3=(EditText)findViewById(R.id.Taluk);
        e4=(EditText)findViewById(R.id.Panchayath);
        e5=(EditText)findViewById(R.id.Wardnumber);
        e6=(EditText)findViewById(R.id.HouseNumber);
        e7=(EditText)findViewById(R.id.Rationcard);
        e8=(EditText)findViewById(R.id.Adhaarcard);
        e9=(EditText)findViewById(R.id.Email);
        e10=(EditText)findViewById(R.id.Phonenumber);
        e11=(EditText)findViewById(R.id.Password);
        e12=(EditText)findViewById(R.id.Confirmpassword);
        b1=(Button)findViewById(R.id.Submit);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nme = e1.getText().toString();
                dis = s1.getSelectedItem().toString().trim();
                ad = e2.getText().toString();
                talu = e3.getText().toString();
                panch = e4.getText().toString();
                war = e5.getText().toString();
                hou = e6.getText().toString();
                rat = e7.getText().toString();
                adaa = e8.getText().toString();
                mail = e9.getText().toString();
                pho = e10.getText().toString();
                pass = e11.getText().toString();
                conf = e12.getText().toString();
                if (nme.isEmpty()) {
                    e1.setError("Name is required");
                    e1.requestFocus();
                } else if (ad.isEmpty()) {
                    e2.setError("Address is required");
                    e2.requestFocus();
                } else if (talu.isEmpty()) {
                    e3.setError("Taluk is required");
                    e3.requestFocus();
                } else if (panch.isEmpty()) {
                    e4.setError("Panchayath is required");
                    e4.requestFocus();
                } else if (war.isEmpty()) {
                    e5.setError("Ward is required");
                    e5.requestFocus();
                } else if (hou.isEmpty()) {
                    e6.setError("House number is required");
                    e6.requestFocus();
                } else if (rat.isEmpty()) {
                    e7.setError("Ration card number is required");
                    e7.requestFocus();
                } else if (adaa.isEmpty()) {
                    e8.setError("Adhaar number is required");
                    e8.requestFocus();
                } else if (mail.isEmpty()) {
                    e9.setError("E-Mail is required");
                    e9.requestFocus();
                } else if (pho.isEmpty()) {
                    e10.setError("Phone number is required");
                    e10.requestFocus();
                } else if (pass.isEmpty()) {
                    e11.setError("Password is required");
                    e11.requestFocus();
                } else {


                    if (conf.equals(pass)) {
                        c1.setName(nme);
                        c1.setAddress(ad);
                        c1.setDistrict(dis);
                        c1.setTaluk(talu);
                        c1.setPanchayath(panch);
                        c1.setWard_no(war);
                        c1.setHouse_no(hou);
                        c1.setRationcard_no(rat);
                        c1.setAdhaar_no(adaa);
                        c1.setEmail(mail);
                        c1.setPhone_no(pho);
                        c1.setPassword(pass);
                        reference.push().setValue(c1).addOnCompleteListener(new OnCompleteListener<Void>() {
                            @Override
                            public void onComplete(@NonNull Task<Void> task) {
                                if(task.isSuccessful())
                                {
                                    Toast.makeText(getApplicationContext(),"sucess",Toast.LENGTH_LONG).show();
                                }
                                else {
                                    Toast.makeText(getApplicationContext(),"error",Toast.LENGTH_LONG).show();
                                }
                            }
                        });

                        e1.setText("");
                        e2.setText("");
                        e3.setText("");
                        e4.setText("");
                        e5.setText("");
                        e6.setText("");
                        e7.setText("");
                        e8.setText("");
                        e9.setText("");
                        e10.setText("");
                        e11.setText("");
                        e12.setText("");
                    } else {
                        Toast.makeText(getApplicationContext(), "password is not same", Toast.LENGTH_LONG).show();
                    }
                }
            }
        });





    }
}
