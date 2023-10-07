package com.example.personalfinancetracker01;

import android.content.Intent;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class RegisterActivity extends AppCompatActivity {

    private static final String TAG = "RegisterActivity";
    private EditText etEmail, etPassword, etUserName, etMobileNumber, etRepeatPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        // Hide the action bar (title bar)
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }

        findViewById(R.id.ivBack).setOnClickListener((View view) -> finish());
        findViewById(R.id.llLogin).setOnClickListener(this::onClickOnLogin);
        findViewById(R.id.btnLogin).setOnClickListener(this::onClickOnSignup);
        findViewById(R.id.ivShowPassword).setOnClickListener(view -> onClickOnShowPassword(etPassword, (ImageView) view));
        findViewById(R.id.ivShowRepeatPassword).setOnClickListener(view -> onClickOnShowPassword(etRepeatPassword, (ImageView) view));


        etEmail = findViewById(R.id.etEmail);
        etPassword = findViewById(R.id.etPassword);
        etRepeatPassword = findViewById(R.id.etRepeatPassword);
        etUserName = findViewById(R.id.etUserName);
        etMobileNumber = findViewById(R.id.etMobile);
    }

    private void onClickOnShowPassword(EditText editText, ImageView imageView) {
        if (editText.getInputType() == 129) {
            editText.setInputType(InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD);
            imageView.setImageDrawable(getDrawable(R.drawable.ic_hide_password));
        }else {
            editText.setInputType(129);
            imageView.setImageDrawable(getDrawable(R.drawable.ic_show_password));
        }
        editText.setSelection(editText.length());
    }

    private void onClickOnLogin(View view) {
        finish();
    }

    private void onClickOnSignup(View view) {
        createUser(etEmail.getText().toString(), etPassword.getText().toString());
    }

    private void createUser(String emailId, String password) {
        startActivity(new Intent(RegisterActivity.this, MainActivity.class));
        finish();

    }
}