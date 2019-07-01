package com.technos.mochisrin.gde;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvCategory;
    private ArrayList<Gde> list = new ArrayList<>();
    final String STATE_TITLE = "state_string";
    final String STATE_LIST = "state_list";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.technos.mochisrin.gde.R.layout.activity_main);

        rvCategory = findViewById(com.technos.mochisrin.gde.R.id.rv_category);
        rvCategory.setHasFixedSize(true);

        if (savedInstanceState == null) {
//            setActionBarTitle("Google Developer Expert");
            list.addAll(GdeData.getListData());
            showRecyclerCardView();
        } else {
            String stateTitle = savedInstanceState.getString(STATE_TITLE);
            ArrayList<Gde> stateList = savedInstanceState.getParcelableArrayList(STATE_LIST);
            setActionBarTitle(stateTitle);
            list.addAll(stateList);
        }
    }


    private void showRecyclerCardView(){
        rvCategory.setLayoutManager(new LinearLayoutManager(this));
        CardViewGdeAdapter cardViewGdeAdapter = new CardViewGdeAdapter(this);
        cardViewGdeAdapter.setListGde(list);
        rvCategory.setAdapter(cardViewGdeAdapter);


        ItemClickSupport.addTo(rvCategory).setOnItemClickListener(new ItemClickSupport.OnItemClickListener() {
            @Override
            public void onItemClicked(RecyclerView recyclerView, int position, View v) {
                Gde gde = list.get(position);
                Intent moveIntentWithData = new Intent(MainActivity.this, DetailGde.class);
                moveIntentWithData.putExtra(DetailGde.IMG, gde.getPhoto());
                moveIntentWithData.putExtra(DetailGde.NAME, gde.getName());
                moveIntentWithData.putExtra(DetailGde.STATUS, gde.getRemarks());
                moveIntentWithData.putExtra(DetailGde.DESC, gde.getDesc());

                startActivity(moveIntentWithData);
            }
        });
    }

    private void setActionBarTitle(String title){
        getSupportActionBar().setTitle(title);
    }


    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
//        outState.putString(STATE_TITLE, getSupportActionBar().getTitle().toString());
        outState.putParcelableArrayList(STATE_LIST, list);
    }
}
