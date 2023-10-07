package com.example.personalfinancetracker01.auth;
import android.content.Intent;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.personalfinancetracker01.MainActivity;
import com.example.personalfinancetracker01.R;




public class LoginActivity extends AppCompatActivity {

    private EditText etEmail, etPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // Hide the action bar (title bar)
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
        findViewById(R.id.rlSignUp).setOnClickListener(this::onClickOnSignUp);
        findViewById(R.id.btnLogin).setOnClickListener(this::onClickOnLogin);
        etEmail = findViewById(R.id.etEmail);
        etPassword = findViewById(R.id.etPassword);
        findViewById(R.id.btnForgotPassword).setOnClickListener(this::onClickOnResetPassword);
        findViewById(R.id.ivShowPassword).setOnClickListener(view -> onClickOnShowPassword(etPassword, (ImageView) view));
    }

    private void onClickOnSignUp(View v) {
        startActivity(new Intent(LoginActivity.this, RegisterActivity.class));
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

    private void onClickOnLogin(View v) {

        handleLogin(etEmail.getText().toString(), etPassword.getText().toString());
    }

    private void onClickOnResetPassword(View v) {

    }

    private void handleLogin(String email, String password) {

      startActivity(new Intent(LoginActivity.this, MainActivity.class));
      finish();
    }
}