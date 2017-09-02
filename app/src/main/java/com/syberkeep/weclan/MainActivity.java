package com.syberkeep.weclan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openGroup(View view) {
        switch (view.getId()){
            case R.id.go_to_btn:
                openGroupNumber(1);
                break;
            case R.id.go_to_btn_2:
                openGroupNumber(2);
                break;
        }
    }

    private void openGroupNumber(int i) {
        Intent intent = new Intent(this, ChatActivity.class);
        intent.putExtra("title", "Group " + i);
        startActivity(intent);
    }

    public void createNewClan(View view){
        Toast.makeText(this, "Create a new Clan", Toast.LENGTH_SHORT).show();
    }
}