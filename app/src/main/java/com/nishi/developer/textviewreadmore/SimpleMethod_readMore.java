package com.nishi.developer.textviewreadmore;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class SimpleMethod_readMore extends AppCompatActivity {

    private TextView descText, show, hide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_simple_method_read_more);

        descText = (TextView) findViewById(R.id.description_text);

        show = (TextView) findViewById(R.id.show);

        show.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                System.out.println("Show button");

                show.setVisibility(View.INVISIBLE);

                hide.setVisibility(View.VISIBLE);

                descText.setMaxLines(Integer.MAX_VALUE);

            }
        });

        hide = (TextView) findViewById(R.id.hide);

        hide.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                System.out.println("Hide button");

                hide.setVisibility(View.INVISIBLE);

                show.setVisibility(View.VISIBLE);

                descText.setMaxLines(5);

            }
        });

    }
}
