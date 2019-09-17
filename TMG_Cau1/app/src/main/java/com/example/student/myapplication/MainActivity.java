package com.example.student.myapplication;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvContact;
    ArrayList<Contact> lst;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvContact = (ListView)findViewById(R.id.lvContact);
        lst = new ArrayList<Contact>();

        lst.add(new Contact("Ky Duyen","1990", Color.RED,Color.BLUE));
        lst.add(new Contact("Dang Thu Thao","1995", Color.RED,Color.BLUE));
        lst.add(new Contact("Nguyen Thi Huyen","1989", Color.RED,Color.BLUE));
        lst.add(new Contact("Thanh Huyen","1979", Color.RED,Color.BLUE));
        lst.add(new Contact("Do My Linh","1972", Color.RED,Color.BLUE));
        CustomAdapter customAdaper = new CustomAdapter(this,R.layout.row,lst);
        lvContact.setAdapter(customAdaper);
    }
}
