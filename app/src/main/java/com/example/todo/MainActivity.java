package com.example.todo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView=findViewById(R.id.listView);
        ArrayList<String> todoItems=new ArrayList<String>();
        final EditText txt=findViewById(R.id.text);
        ArrayAdapter<String> aa;
        aa=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,todoItems);
        listView.setAdapter(aa);

        Button btn=findViewById(R.id.button2);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                todoItems.add(0,txt.getText().toString());
                aa.notifyDataSetChanged();
                txt.setText("");
            }
        });


//        txt.setOnKeyListener(new View.OnKeyListener() {
//            @Override
//            public boolean onKey(View view, int i, KeyEvent keyEvent) {
//                if(keyEvent.getAction() == KeyEvent.ACTION_DOWN)
//                    if(i==KeyEvent.KEYCODE_ENTER){
//                        todoItems.add(0,txt.getText().toString());
//                        aa.notifyDataSetChanged();
//                        txt.setText("");
//                        return true;
//                    }
//                return false;
//            }
//        });
    }

}