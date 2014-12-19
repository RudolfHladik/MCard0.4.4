package com.example.rd.mcard;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.melnykov.fab.FloatingActionButton;

/**
 * Created by RD on 4.8.2014.
 */
public class Sales extends Activity {

    private ShopItem[] shopItems;
    private ShopItem[] favShopItems;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sales);

        favShopItems = null;

        shopItems = new ShopItem[]{
                new ShopItem(R.drawable.ca, getString(R.string.ca)),
                new ShopItem(R.drawable.desigual_logo,getString(R.string.desigual)),
                new ShopItem(R.drawable.soliver_logooo,getString(R.string.soliver)),
                new ShopItem(R.drawable.zara,getString(R.string.zara)),
                new ShopItem(R.drawable.ca, getString(R.string.ca)),
                new ShopItem(R.drawable.desigual_logo,getString(R.string.desigual)),
                new ShopItem(R.drawable.soliver_logooo,getString(R.string.soliver)),
                new ShopItem(R.drawable.zara,getString(R.string.zara))

        };
        if (favShopItems != null) {
            ShopItemAdapter favShopItemAdapter = new ShopItemAdapter(this, R.layout.sales_lv_item, favShopItems);
            ListView favLV = (ListView) findViewById(R.id.fav_list);
            favLV.setAdapter(favShopItemAdapter);
            View favHeader = getLayoutInflater().inflate(R.layout.fav_shop_lv_header, null);
            View header = getLayoutInflater().inflate(R.layout.shop_lv_header, null);
            favLV.addHeaderView(favHeader);
            favLV.setOnItemClickListener(new AdapterView.OnItemClickListener(){
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                    Intent intent;
                    intent = new Intent(getBaseContext(), ShopDetail.class);
                    intent.putExtra("brand", favShopItems[position].title);
                    startActivity(intent);
                }
            });
        }

        ShopItemAdapter shopItemAdapter = new ShopItemAdapter(this, R.layout.sales_lv_item, shopItems);
        ListView salesListView = (ListView) findViewById(R.id.shop_list);
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.attachToListView(salesListView);
        fab.show(false);
        salesListView.setAdapter(shopItemAdapter);

        salesListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                switch (position){
                    case 0: favShopItems = new ShopItem[]{ new ShopItem(R.drawable.ca, getString(R.string.ca))};


                    case 1: favShopItems = new ShopItem[]{ new ShopItem(R.drawable.desigual_logo,getString(R.string.desigual))};

                }



                Intent intent;
                intent = new Intent(getBaseContext(), ShopDetail.class);
                intent.putExtra("brand", shopItems[position].title);
                startActivity(intent);

            }
        });


    }
}
