package com.example.democontextmenutranslation2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView tVTranslatedText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tVTranslatedText=findViewById(R.id.textViewTranslatedText);
        registerForContextMenu(tVTranslatedText);
    }
    public void onCreateContextMenu(ContextMenu menu, View v,
                                    ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        getMenuInflater().inflate(R.menu.menu, menu);
    }
    public boolean onContextItemSelected(MenuItem item) {
        if(item.getItemId()==R.id.EnglishSelection) { //check whether the selected menu item ID is 0
            //code for action
            tVTranslatedText.setText("Hello");
            return true; //menu item successfully handled
        }
        else if(item.getItemId()==R.id.italianSelection) { //check if the selected menu item ID is 1
            //code for action;
            tVTranslatedText.setText("Ciao");
            return true;  //menu item successfully handled
        }
        return super.onContextItemSelected(item); //pass menu item to the superclass implementation
    }


}