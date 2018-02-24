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

    private TextView NamaAirMineral,HargaAirMineral,DeskripsiAirMineral;
    private ImageView GambarAirMineral;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_menu);

        NamaAirMineral = (TextView) findViewById(R.id.TVMenuMakanan);
        HargaAirMineral = (TextView) findViewById(R.id.TVHargaMakanan);
        DeskripsiAirMineral = (TextView) findViewById(R.id.deskripsiAirMineral);
        GambarAirMineral = (ImageView) findViewById(R.id.TVGambarMakanan);

        Intent ambilintentdarimyadapter = getIntent();

        String menu = ambilintentdarimyadapter.getStringExtra("Nama Air Mineral");
        String hrga = ambilintentdarimyadapter.getStringExtra("Harga");
        String kmposisi= ambilintentdarimyadapter.getStringExtra("DeskripsiAirMineral");
        Integer gbr = ambilintentdarimyadapter.getIntExtra("gambar",0);

        //penetapan nilai untuk teks dan gambar
        NamaAirMineral.setText(menu);
        HargaAirMineral.setText(hrga);
        DeskripsiAirMineral.setText(kmposisi);
        GambarAirMineral.setImageResource(gbr);


    }

}
