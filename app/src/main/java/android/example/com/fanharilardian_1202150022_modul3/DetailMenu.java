package android.example.com.fanharilardian_1202150022_modul3;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Fanharil Ardian on 24/02/2018.
 */

public class DetailMenu extends AppCompatActivity {

    private TextView NAMAMAKANAN,HARGAMAKANAN,KOMPOSISIMAKANAN;
    private ImageView GAMBARMAKANAN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_menu);

        NAMAMAKANAN = (TextView) findViewById(R.id.TVMenuMakanan);
        HARGAMAKANAN = (TextView) findViewById(R.id.TVHargaMakanan);
        KOMPOSISIMAKANAN = (TextView) findViewById(R.id.daftarKomposisi);
        GAMBARMAKANAN = (ImageView) findViewById(R.id.TVGambarMakanan);

        Intent ambilitem = getIntent();

        String menu = ambilitem.getStringExtra("Nama Menu");
        String hrga = ambilitem.getStringExtra("Harga");
        String kmposisi= ambilitem.getStringExtra("Komposisi");
        Integer gbr = ambilitem.getIntExtra("gambar",0);

        //penetapan nilai untuk teks dan gambar
        NAMAMAKANAN.setText(menu);
        HARGAMAKANAN.setText(hrga);
        KOMPOSISIMAKANAN.setText(kmposisi);
        GAMBARMAKANAN.setImageResource(gbr);


    }

}
