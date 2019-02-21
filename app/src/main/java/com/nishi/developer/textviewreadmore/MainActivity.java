package com.nishi.developer.textviewreadmore;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.ms.square.android.expandabletextview.ExpandableTextView;

public class MainActivity extends AppCompatActivity {

    private ExpandableTextView expand_text_view;

    private Button btn_second_type;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        expand_text_view = (ExpandableTextView) findViewById(R.id.expand_text_view);

        expand_text_view.setText(getString(R.string.dummy_text1));


        btn_second_type = (Button) findViewById(R.id.btn_second_type);
        btn_second_type.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, SimpleMethod_readMore.class);

                startActivity(intent);

            }
        });

    }
}
