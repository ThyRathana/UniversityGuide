package com.example.universityguide;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import java.util.HashMap;
import java.util.Map;

public class LoginActivity extends AppCompatActivity {

    EditText editTextUsername,editTextEmail, editTextPassword;
    Button button_Login;
    TextView textViewRegister;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        editTextUsername = findViewById(R.id.txt_username);
        editTextEmail = findViewById(R.id.txt_email);
        editTextPassword = findViewById(R.id.txt_password);

        button_Login = (Button)findViewById(R.id.btn_login);
        textViewRegister = findViewById(R.id.tv_register);

        button_Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        textViewRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(intent);
            }
        });


//        buttonLogin.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
////                RequestQueue requestQueue = Volley.newRequestQueue(getApplicationContext());
////                String url = "http://192.168.100.209:8000/oauth/token";
////
////                JsonObjectRequest jsonObjReq = new JsonObjectRequest(Request.Method.POST, url, null, new Response.Listener() {
////
////                    @Override
////                    public void onResponse(Object response) {
////                        Log.e("SUCCESS", response.toString());
////
////                    }
////                },
////                    new Response.ErrorListener() {
////
////                        @Override
////                        public void onErrorResponse(VolleyError error) {
////                            Log.e("Error_Volley", error.toString());
////                        }
////                    }) {
////
////                    @Override
////                    protected Map getParams() {
////                        Map params = new HashMap();
////                        params.put("name", "leaphea");
////                        params.put("email", "leaphea@gmail.com");
////                        params.put("password", "123456");
////
////                        return params;
////                    }
////                };
////
////                requestQueue.add(jsonObjReq);
//                Intent intent = new Intent(LoginActivity.this, MainActivity.class);
//                startActivity(intent);
//            }
//        });
    }
}



