package com.mubeen.adapterlistfirst;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
public class MainActivity extends AppCompatActivity {
    private ListView listObj;
    private String [] myData= {"Lahore","Islamabad","Quetta","Karachi","Multan"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialvariable();
        creatingAdapter();

    }
    private void creatingAdapter()
    {
        ArrayAdapter<String> arrayObj=new ArrayAdapter(this,android.R.layout.simple_list_item_1,myData);
        listObj.setAdapter(arrayObj);

        listObj.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {



                if(position==0)
                {
                    Intent intent = new Intent(MainActivity.this, Lahore.class);
                    startActivity(intent);
                }
                else if(position==1)
                {
                    Intent intent1 = new Intent(MainActivity.this, Islamabad.class);
                    startActivity(intent1);
                }
                else if(position==2)
                {
                    Intent intent2 = new Intent(MainActivity.this, Quetta.class);
                    startActivity(intent2);
                }
                else if(position==3)
                {
                    Intent intent3 = new Intent(MainActivity.this, Karachi.class);
                    startActivity(intent3);
                }
                else if(position==4)
                {
                    Intent intent4 = new Intent(MainActivity.this, Multan.class);
                    startActivity(intent4);
                }

            }

        });


    }

    private void initialvariable()
    {
        listObj= findViewById(R.id.List_View);
    }

}
