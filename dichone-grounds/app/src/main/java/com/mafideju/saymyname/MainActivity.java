package com.mafideju.saymyname;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button mainButton;
    private TextView mainTitle;
    private EditText mainField;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainButton = findViewById(R.id.mainButton);
        mainTitle = findViewById(R.id.mainTitle);
        mainField = findViewById(R.id.mainField);

        mainButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = mainField.getText().toString();
                if (name.isEmpty()) {
                    mainTitle.setText("Java Android com nóis tudo!!.");
                } else {
                    mainTitle.setText("Java Android com " + name + ".");
                }
            }
        });
    }

    public Button getMainButton() {
        return mainButton;
    }

    public void setMainButton(Button mainButton) {
        this.mainButton = mainButton;
    }

    public TextView getMainTitle() {
        return mainTitle;
    }

    public void setMainTitle(TextView mainTitle) {
        this.mainTitle = mainTitle;
    }
}