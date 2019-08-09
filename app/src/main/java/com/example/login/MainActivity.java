package com.example.login;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClick(View v) {
        EditText valorLogin = (EditText) findViewById(R.id.texboxLogin);
        EditText valorNome = (EditText) findViewById(R.id.textboxSenha);

        Anagrama comp = new Anagrama();


        if (comp.comparar(valorLogin.getText().toString(), valorNome.getText().toString())) {
            Toast.makeText(this, String.valueOf("SUCESSO!!!"), Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(this, String.valueOf("ACESSO NEGADO!!!"), Toast.LENGTH_LONG).show();
        }
    }
}
