package android.example.com.fanharilardian_1202150022_modul3;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Fanharil Ardian on 24/02/2018.
 */

public class Login extends AppCompatActivity {
    private EditText uname;
    private EditText pwd;
    String username, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        // Memunculkan Toast FANHARILARDIAN_1202150022
        getSupportActionBar().hide();
    }


    public void login(View view) {
        // Memasukan isi dari field username pada activity login
        uname = (EditText) findViewById(R.id.fieldusername);
        // Mengambil isi dari field password pada activity Login
        pwd = (EditText) findViewById(R.id.fieldpassword);
        username = uname.getText().toString();
        password = pwd.getText().toString();


        if ((username.contains("EAD"))&&((password.contains("MOBILE")))) {
            Toast.makeText(this, "Login Sukses", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(Login.this, MainMenu.class);
            startActivity(intent);
        } else if ((username.matches("")||password.matches(""))) {
            Toast.makeText(this, "Isikan Username dan Password", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Username atau Password salah", Toast.LENGTH_SHORT).show();
        }
    }


    public void skip(View view) {
        Intent intent = new Intent(Login.this, MainMenu.class);
        startActivity(intent);
    }
}
