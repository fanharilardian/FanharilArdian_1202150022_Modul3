package android.example.com.fanharilardian_1202150022_modul3;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Fanharil Ardian on 24/02/2018.
 */

public class DetailMenu extends AppCompatActivity {

    private TextView NamaAirMineral,HargaAirMineral,DeskripsiAirMineral, liter;
    private ImageView GambarAirMineral;
    private int liters = 0;
    ImageView gambarBatere;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_menu);

        NamaAirMineral = (TextView) findViewById(R.id.textViewNamaAirMineral);
        HargaAirMineral = (TextView) findViewById(R.id.TVHargaMakanan);
        DeskripsiAirMineral = (TextView) findViewById(R.id.deskripsiAirMineral);
        GambarAirMineral = (ImageView) findViewById(R.id.imageViewAirMineral);

        liter = (TextView)findViewById(R.id.Liter);
        gambarBatere = (ImageView)findViewById(R.id.gallon);

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
        GALON();

    }

    public void isiGalon(View view) {
        liters++;
        GALON();
    }

    public void kosonginGalon(View view) {
        liters--;
        GALON();
    }

    public void GALON(){
        if (liters <= 0 ){
            liter.setText("2L");
            gambarBatere.setImageResource(R.drawable.ic_gallon1);
            Toast.makeText(this,"Galon terisi sedikit!",Toast.LENGTH_SHORT).show();
        }else if (liters == 1){
            liter.setText("5L");
            gambarBatere.setImageResource(R.drawable.ic_gallon2);
        }else if(liters == 2){
            liter.setText("7L");
            gambarBatere.setImageResource(R.drawable.ic_gallon3);
        }else if(liters == 3){
            liter.setText("9L");
            gambarBatere.setImageResource(R.drawable.ic_gallon4);
        }else if(liters == 4){
            liter.setText("11L");
            gambarBatere.setImageResource(R.drawable.ic_gallon5);
        }else if(liters == 5){
            liter.setText("15L");
            gambarBatere.setImageResource(R.drawable.ic_gallon6);
        }else{
            // jika galon mencapai penuh
            liter.setText("19L");
            gambarBatere.setImageResource(R.drawable.ic_gallon7);
            Toast.makeText(this,"Galon sudah penuh!",Toast.LENGTH_SHORT).show();
        }
    }

}
