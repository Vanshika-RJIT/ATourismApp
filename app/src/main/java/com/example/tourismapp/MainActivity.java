package com.example.tourismapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView l;
    String str[]={"Bhopal","Gwalior","Indore","Mumbai","Kolkata"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        l=findViewById(R.id.list1);
        ArrayAdapter<String> ad = new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_selectable_list_item,str);
        l.setAdapter(ad);
        l.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0)
                {
                    FragmentManager fm = getSupportFragmentManager();
                    FragmentTransaction ft = fm.beginTransaction();
                    Fragment_01 fragment_01= new Fragment_01();
                    ft.replace(R.id.l2,fragment_01);
                    ft.commit();
                }else  if(position==1)
                {  FragmentManager fm = getSupportFragmentManager();
                    FragmentTransaction ft = fm.beginTransaction();
                    Fragment_02 fragment_02= new Fragment_02();
                    ft.replace(R.id.l2,fragment_02);
                    ft.commit();

                } else if(position==2)
                {
                    FragmentManager fm = getSupportFragmentManager();
                    FragmentTransaction ft = fm.beginTransaction();
                    Fragment_03 fragment_03= new Fragment_03();
                    ft.replace(R.id.l2,fragment_03);
                    ft.commit();

                } else if(position==3)
                {
                    FragmentManager fm = getSupportFragmentManager();
                    FragmentTransaction ft = fm.beginTransaction();
                    Fragment_04 fragment_04= new Fragment_04();
                    ft.replace(R.id.l2,fragment_04);
                    ft.commit();

                } else
                {
                    FragmentManager fm = getSupportFragmentManager();
                    FragmentTransaction ft = fm.beginTransaction();
                    Fragment_05 fragment_05= new Fragment_05();
                    ft.replace(R.id.l2,fragment_05);
                    ft.commit();

                }
            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.mymenu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.about_us:
                Toast.makeText(MainActivity.this,"About Us",Toast.LENGTH_SHORT).show();
                break;
            case R.id.Settings:
                Toast.makeText(MainActivity.this,"Settings",Toast.LENGTH_SHORT).show();
                break;
            case R.id.call_us:
                Toast.makeText(MainActivity.this,"Call Us",Toast.LENGTH_SHORT).show();
                break;
            case R.id.log_out:
                Toast.makeText(MainActivity.this,"Log Out",Toast.LENGTH_SHORT).show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}