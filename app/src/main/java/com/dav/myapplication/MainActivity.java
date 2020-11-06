package com.dav.myapplication;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.dav.myapplication.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ActivityMainBinding binding;
    private ProfileRecyclerAdapter profileRecyclerAdapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        showActionBar(true,"Recyclerview");

        binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        binding.setClicks(this);

        profileRecyclerAdapter = new ProfileRecyclerAdapter();

        LinearLayoutManager verticalLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);

        binding.profileRecycler.setLayoutManager(verticalLayoutManager);
        binding.profileRecycler.setHasFixedSize(true);

        binding.profileRecycler.setAdapter(profileRecyclerAdapter);
    }

    protected void showActionBar(boolean show, String title) {

        ActionBar actionBar = getSupportActionBar();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        if (show) {
            actionBar.show();
            actionBar.setTitle(title);
        } else {
            actionBar.hide();
        }
    }

    @Override
    public void onClick(View v) {

    }
}
