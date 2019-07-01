package com.technos.mochisrin.gde;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.support.v7.widget.Toolbar;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import de.hdodenhof.circleimageview.CircleImageView;

public class DetailGde extends AppCompatActivity {
    public static final String IMG = "IMG_URL";
    public static final String NAME = "NAME";
    public static final String STATUS = "STATUS";
    public static final String DESC = "DESC";

    TextView myname, remarks, desc;
    CircleImageView img_item_photo;
    Toolbar mToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.technos.mochisrin.gde.R.layout.detail_gde);

        mToolbar = (Toolbar)findViewById(com.technos.mochisrin.gde.R.id.toolbar);
        mToolbar.setTitle(NAME);
        mToolbar.setNavigationIcon(com.technos.mochisrin.gde.R.drawable.ic_arrow_back_black_24dp);

        mToolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        myname = findViewById(com.technos.mochisrin.gde.R.id.tv_item_name);
        remarks = findViewById(com.technos.mochisrin.gde.R.id.tv_item_remarks);
        img_item_photo = findViewById(com.technos.mochisrin.gde.R.id.img_item_photo);
        desc = findViewById(com.technos.mochisrin.gde.R.id.desc);

        String n = getIntent().getStringExtra(NAME);
        String r = getIntent().getStringExtra(STATUS);
        String d = getIntent().getStringExtra(DESC);
        String i = getIntent().getStringExtra(IMG);

        myname.setText(n);
        remarks.setText(r);
        desc.setText(d);
        Glide.with(this)
                .load(i)
                .apply(new RequestOptions().override(350, 550))
                .into(img_item_photo);
    }
}


