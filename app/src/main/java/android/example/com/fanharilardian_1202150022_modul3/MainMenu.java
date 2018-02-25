package android.example.com.fanharilardian_1202150022_modul3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import java.util.ArrayList;

/**
 * Created by Fanharil Ardian on 24/02/2018.
 */

public class MainMenu extends AppCompatActivity {
    private RecyclerView RECYCLERVIEW;
    private RecyclerView.Adapter ADAPTERNYA;
    private RecyclerView.LayoutManager layoutManager;
    private ArrayList<String> isiMenu;
    private ArrayList<String> harganya;
    private ArrayList<Integer> gambarMakanannya;

    //Daftar menu dari Napkeen
    private String[] DAFTARMENUNYA = {
            "Ades",
            "Amidis",
            "Aqua",
            "Cleo",
            "Club",
            "Equil",
            "Evian",
            "Le Minerale",
            "Nestle",
            "Pristine",
            "Vit"

    };
    // harga makanannya
    private String[] HARGANYA = {
            "Rp. 15.000",
            "Rp. 20.000",
            "Rp. 24.000",
            "Rp. 15.000",
            "Rp. 16.000",
            "Rp. 22.000",
            "Rp. 21.000",
            "Rp. 26.000",
            "Rp. 17.000",
            "Rp. 13.000",
            "Rp. 19.500"

    };
    // gambar makanannya
    private int[] GAMBARMAKANANNYA = {
            R.drawable.ades,
            R.drawable.amidis,
            R.drawable.aqua,
            R.drawable.cleo,
            R.drawable.club,
            R.drawable.equil,
            R.drawable.evian,
            R.drawable.leminerale,
            R.drawable.nestle,
            R.drawable.pristine,
            R.drawable.vit
    };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        int gridColumnCount = getResources().getInteger(R.integer.grid_column_count);
        // membuat variabel ArrayList untuk menu, harga dan gambar makanannya
        isiMenu = new ArrayList<>();
        harganya = new ArrayList<>();
        gambarMakanannya = new ArrayList<>();
        // jalankan fungsi untuk memunculkan menu, harga dan gambarnya dengan array ke-a
        DaftarItem();

        // cari recyclerview dari activity dengan id reyclerViewAril
        RECYCLERVIEW = (RecyclerView) findViewById(R.id.recyclerViewAril);
        // atur ukuran dari recyclerview agar tidak bergantung pada adapter yang dibuat
        RECYCLERVIEW.setHasFixedSize(true);
        // membuat LinearLayoutManager secara vertikal pada kelas ini
        layoutManager = new LinearLayoutManager(this);
        // jalankan recyclerview dengan tampilan vertikal
        RECYCLERVIEW.setLayoutManager(new GridLayoutManager(this,gridColumnCount));

        //RECYCLERVIEW.setLayoutManager(layoutManager);
        // Mengisi adapter dengan menu, harga dan gambar makanan dari kelas MyAdapter
        ADAPTERNYA = new MyAdapter(isiMenu,harganya,gambarMakanannya);
        // jalankan recyclerview dengan adapter yang telah ditentukan diatas
        RECYCLERVIEW.setAdapter(ADAPTERNYA);

    }

    private void DaftarItem() {
        // melaukan pengulangan sebanyak kurang dari daftar menu
        for (int a=0; a<DAFTARMENUNYA.length; a++){
            // tambahkan isi Menu dengan data pada array ke-a pada string DAFTARMENUNYA
            isiMenu.add(DAFTARMENUNYA[a]);
            // tambahkan isi Menu dengan data pada array ke-a pada string HARGANYA
            harganya.add(HARGANYA[a]);
            // tambahkan isi Menu dengan data pada array ke-a pada string GAMBARMAKANANNYA
            gambarMakanannya.add(GAMBARMAKANANNYA[a]);
        }
    }

}
