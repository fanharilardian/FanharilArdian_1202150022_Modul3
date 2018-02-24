package android.example.com.fanharilardian_1202150022_modul3;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Fanharil Ardian on 24/02/2018.
 */

public class Login extends AppCompatActivity {
    private TextView username;
    private TextView password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        // Memunculkan Toast FANHARILARDIAN_1202150022
        Toast.makeText(this, "FANHARILARDIAN_1202150022", Toast.LENGTH_LONG).show();
    }


    public void login(View view) {
        // Memasukan isi dari field username pada activity login
        username = (TextView) findViewById(R.id.fieldusername);
        // Mengambil isi dari field password pada activity Login
        password = (TextView) findViewById(R.id.fieldpassword);

        if (username.equals("EAD")) {

        }
    }

    /*
    public void PESAN(View view) {
        // memasukan isi dari tombol radio yang telah terpilih ke dalam variabel GRUP dari id radioButton
        GRUP = (RadioGroup) findViewById(R.id.radioGroup);
        // bila radio button terpilih pada radio untuk dine in :
        if (GRUP.getCheckedRadioButtonId()== R.id.rbDineIn){
            Toast.makeText(this, "Dine In terpilih", Toast.LENGTH_SHORT).show();
            // pindah ke activity DineIn
            startActivity(new Intent(this, DineIn.class));

        }
        // bila terpilih selain dine in
        else {
            Toast.makeText(this, "Take Away terpilih", Toast.LENGTH_SHORT).show();
            // pindah ke activity Take Away
            startActivity(new Intent(this, TakeAway.class));
        }

    }*/

}
