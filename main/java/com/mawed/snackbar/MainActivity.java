package com.mawed.snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    Button SnackbarButton;
    LinearLayout linearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SnackbarButton = findViewById(R.id.button_snackbar);
        linearLayout = findViewById(R.id.LinearLayout);

        SnackbarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ShowSnackbar();
            }
        });
    }

    private void ShowSnackbar() {
        Snackbar snackbar = Snackbar.make(linearLayout, "This is a Snackbar", Snackbar.LENGTH_LONG)
                .setAction("Undo", new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar snackbar1 = Snackbar.make(linearLayout,"Undo Successful",Snackbar.LENGTH_LONG);
                snackbar1.show();
            }
        });
        snackbar.show();
    }
}