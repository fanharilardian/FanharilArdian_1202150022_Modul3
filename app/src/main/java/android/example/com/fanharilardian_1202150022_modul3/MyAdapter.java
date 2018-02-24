package android.example.com.fanharilardian_1202150022_modul3;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Fanharil Ardian on 24/02/2018.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    private ArrayList<String> DataRV,DeskripsiRV;
    private ArrayList<Integer> GambarRV;

    public MyAdapter(ArrayList<String> inputData, ArrayList<String> dataDeskripsi, ArrayList<Integer> gambar) {
        DataRV = inputData;
        DeskripsiRV = dataDeskripsi;
        GambarRV = gambar;
    }

    //bbuat kelas untuk menyimpan referensi dari view view yang digunaka untuk sebuah itemm di recycler view
    public class ViewHolder extends RecyclerView.ViewHolder {
        // Membuat variabel TextView, ImageView dan RelativeLayout
        public TextView namaAirMineral, deskripsi;
        public ImageView gambarAirMineral;
        private RelativeLayout ItemList;

        private Context context;

        public ViewHolder(View v) {
            super(v);
            //Untuk Menghubungkan dan Mendapakan Context dari MainActivity
            context = itemView.getContext();

            //deklarasi TextView, ImageView dan LinearLayoout
            namaAirMineral = (TextView) v.findViewById(R.id.namaAirMineral);
            deskripsi = (TextView) v.findViewById(R.id.deskripsi);
            gambarAirMineral = (ImageView) v.findViewById(R.id.gambar);
            ItemList = v.findViewById(R.id.list);

            // isi array berpindah dengan yang sudah ditetapkan

            // kalau List terpilih / di tap
            ItemList.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    // Kalau di tap listnya, arahkan ke kelas DetailMenu
                    Intent intent = new Intent(context,DetailMenu.class);
                    String deskripsi ="";
                    // beri kondisi setiap list pada DetailMenu
                    switch (getAdapterPosition()){
                        case 0 :
                            // Ades
                            intent.putExtra("Nama Air Mineral",DataRV.get(getAdapterPosition()));
                            intent.putExtra("Harga",DeskripsiRV.get(getAdapterPosition()));
                            intent.putExtra("gambar",GambarRV.get(getAdapterPosition()));
                            deskripsi = "Akasha Wira International adalah perusahaan perusahaan yang bergerak di bidang produksi dan distribusi " +
                                    "air minum dalam kemasan. Dulu perusahaan ini bernama PT Ades Waters Indonesia Tbk, kemudian pada tahun 2009 " +
                                    "melalui RUPS berubah namanya menjadi PT Akasha Wira International untuk mengubah citra perseroan. Perusahaan ini " +
                                    "memproduksi dan menjual air minum dalam kemasan di bawah merek dagang dari Vica Royal, AdeS, AdeS Royal dan Nestle Pure Life." +
                                    " Perusahaan juga terlibat dalam bisnis kosmetik.";
                            intent.putExtra("DeskripsiAirMineral",deskripsi);
                            context.startActivity(intent);
                            break;
                        case 1 :
                            // Amidis
                            intent.putExtra("Nama Air Mineral",DataRV.get(getAdapterPosition()));
                            intent.putExtra("Harga",DeskripsiRV.get(getAdapterPosition()));
                            intent.putExtra("gambar",GambarRV.get(getAdapterPosition()));
                            deskripsi = "AMIDIS adalah produk Air Minum Dalam Kemasan (AMDK) yang sudah diproduksi sejak tahun" +
                                    " 1997 dan merupakan air minum distilasi pertama di Indonesia yang telah menjadi salah satu produk " +
                                    "AMDK yang dipercaya karena kualitas mutu dan kemurniannya." +
                                    "AMIDIS sangat memperhatikan kualitas dari produk, berawal dari proses pengolahan air baku melalui kombinasi proses demineralisasi, " +
                                    "penyaringan Reverse Osmosis (RO), pemurnian dengan proses distilasi (penyulingan mencapai suhu 110°C) dan sterilisasi dengan proses " +
                                    "ozonisasi dan proses pengisian yang higienis sehingga menghasilkan air sehat yang terjaga hingga dapat dikonsumsi oleh konsumen." +
                                    "\n" +
                                    "\n" +
                                    "AMIDIS di proses dengan distilasi atau penyulingan yaitu suatu metode pemisahan bahan berdasarkan kemudahan menguap (volatilitas) bahan. " +
                                    "Dalam proses distilasi, air dididihkan hingga mencapai 110° C dalam tekanan atmosfer sehingga menjadi uap air H2O murni " +
                                    ", meninggalkan seluruh bahan kontaminan dan bahan kimia lainnya yang terkandung dalam air. Uap air H2O murni yang sudah terkumpul " +
                                    "kemudian didinginkan kembali ke dalam bentuk cairan (kondensasi) sehingga menghasilkan air murni H2O AMIDIS.\n";
                            intent.putExtra("DeskripsiAirMineral",deskripsi);
                            context.startActivity(intent);
                            break;

                        case 2 :
                            // Aqua
                            intent.putExtra("Nama Air Mineral",DataRV.get(getAdapterPosition()));
                            intent.putExtra("Harga",DeskripsiRV.get(getAdapterPosition()));
                            intent.putExtra("gambar",GambarRV.get(getAdapterPosition()));
                            deskripsi = "Produksi pertama AQUA diluncurkan dalam bentuk kemasan botol kaca ukuran 950 ml dari pabrik di Bekasi. " +
                                    "Harga per botol adalah Rp.75,-." +
                                    "PT Golden Mississippi didirikan sebagai pelopor perusahaan air minum dalam kemasan (AMDK) pertama di Indonesia. Pabrik pertama didirikan di Bekasi." +
                                    "Pabrik AQUA kedua didirikan di Pandaan di Jawa Timur, sebagai upaya agar lebih mendekatkan diri pada konsumen yang berada di wilayah tersebut." +
                                    "Pengembangan produk AQUA dalam bentuk kemasan botol PET 220 ml. Pengembangan ini membuat produk AQUA menjadi lebih berkualitas dan lebih aman untuk dikonsumsi." +
                                    "AQUA menyelenggarakan program AQUA Peduli (AQUA Cares) dengan melakukan daur ulang botol plastik AQUA menjadi materi plastik yang dapat digunakan kembali." +
                                    "AQUA menjadi pabrik air mineral pertama yang menerapkan sistem produksi in line di pabrik Mekarsari. Pemrosesan air dan pembuatan kemasan AQUA dilakukan bersamaan. Hasil sistem in line ini adalah botol AQUA yang baru dibuat dapat segera diisi air bersih di ujung proses produksi, sehingga proses produksi menjadi lebih higienis." +
                                    "Pada 4 September 1998, AQUA dan grup Danone sepakat untuk bergabung. Langkah ini berdampak pada peningkatan kualitas produk dan menempatkan AQUA sebagai produsen air mineral dalam kemasan (AMDK) yang terbesar di Indonesia." +
                                    "Bertepatan dengan pergantian milenium, AQUA meluncurkan produk berlabel Danone-AQUA." +
                                    "AQUA menghadirkan kemasan botol kaca baru 380 ml pada 1 November 2001." +
                                    "\n" +
                                    "\n" +
                                    "AQUA berhasil memenangkan banyak penghargaan di ajang Indonesian Best Brand Award.\n" +
                                    "\n" +
                                    "AQUA mulai memberlakukan Kesepakatan Kerja Bersama [KKB 2002 - 2004] kepada para pekerja pada tanggal 1 Juni 2002." +
                                    "Perluasan kegiatan produksi AQUA Group ditindaklanjuti melalui peresmian pabrik baru di Klaten pada awal tahun 2003. Hal ini didukung dengan upaya mengintegrasikan proses kerja perusahaan melalui penerapan SAP [System Application and Products for Data Processing] dan HRIS [Human Resources Information System]." +
                                    "DANONE membantu korban tsunami di ACEH. Pada tanggal 27 sept, AQUA memproduksi MIZONE,minuman bernutrisi yang merupakan produk dari DANONE. MIZONE hadir dengan dua rasa, orange lime dan passion fruit.";
                            intent.putExtra("DeskripsiAirMineral",deskripsi);
                            context.startActivity(intent);
                            break;
                        case 3 :
                            // Cleo
                            intent.putExtra("Nama Air Mineral",DataRV.get(getAdapterPosition()));
                            intent.putExtra("Harga",DeskripsiRV.get(getAdapterPosition()));
                            intent.putExtra("gambar",GambarRV.get(getAdapterPosition()));
                            deskripsi = "\n" +
                                    "\n" +
                                    "Tanobel berasal dari kata Tan dan Nobel. Tan diambil dari nama keluarga pendiri perusahaan keluarga Tanoko, yang telah berkontribusi aktif dalam menghasilkan produk minuman berkualitas terbaik.\n" +
                                    " \n" +
                                    "\n" +
                                    "Sedangkan Nobel atau Noble berarti pengakuan atas produk berkualitas tinggi dengan pemberian servis yang memuaskan kepada konsumen. Tan dan Nobel melambangkan visi untuk menghasilkan produk dan layanan yang layak mendapatkan penghargaan Nobel.\n" +
                                    " \n" +
                                    "\n" +
                                    "Tanobel adalah identitas perusahaan PT Sariguna Primatirta, produsen Air Minum Dalam Kemasan (AMDK), teh dan juice pertama di Indonesia yang mendapatkan sertifikat Food Safety Management ISO 22000:2005.\n" +
                                    "\n" +
                                    "\n" +
                                    "Tanobel adalah identitas perusahaan PT Sariguna Primatirta, pertama kali beroperasi pada tanggal 17 September 2003 dengan memproduksi Air Minum dalam Kemasan (AMDK) dengan merk Anda.\n" +
                                    "\n" +
                                    "Pada 7 Maret 2004, diluncurkan produk Air Murni Cleo sebagai salah satu produk andalan Tanobel dalam kemasan cup 250 mL, botol 330 mL, 550 mL, 1.200 mL, 6 L dan galon 19 L. Setelah itu, Tanobel melebarkan sayap produksi Air Murni Cleo ke berbagai daerah di Indonesia.\n" +
                                    "\n" +
                                    " \n" +
                                    "\n" +
                                    "Saat ini, Tanobel memiliki pabrik yang dilengkapi dengan proses terintegrasi dari penyediaan bahan baku, pengemasan cup, botol dan galon, hingga produk jadi. Dengan proses pengawasan kualitas yang ketat dan standar produksi yang tinggi, PT Sariguna Primatirta pada Oktober 2008 mendapat pengakuan internasional berupa ISO 9001:2000 dan pada Oktober 2008 mendapatkan ISO 22000:2005.\n" +
                                    "\n" +
                                    "PT Sariguna Primatirta, adalah salah satu perusahaan yang mendapatkan pengakuan dari REBI sebagai Pelopor air minum dalam kemasan dengan oksigen di Indonesia (CLEO).\n" +
                                    "\n" +
                                    "PT Sariguna Primatirta juga mendapatkan penghargaan sebagai berikut : REKOR Muri 2013, WOW Brand 2014, TOP Brand 2014, TOP Brand 2015, TOP Brand 2016, TOP Brand 2017.\n";
                            intent.putExtra("DeskripsiAirMineral",deskripsi);
                            context.startActivity(intent);
                            break;
                        case 4 :
                            // Club
                            intent.putExtra("Nama Air Mineral",DataRV.get(getAdapterPosition()));
                            intent.putExtra("Harga",DeskripsiRV.get(getAdapterPosition()));
                            intent.putExtra("gambar",GambarRV.get(getAdapterPosition()));
                            deskripsi = "Club adalah merek air minum dalam kemasan atau air mineral di Indonesia. Merek ini berasal dari Surabaya dan Pandaan, Pasuruan, Jawa Timur. Club diproduksi oleh PT Tirta Sukses Perkasa (dahulu PT Tirta Bahagia) sejak tahun 1986. Pada bulan November 2013, merek Club diakuisisi oleh PT Indofood CBP Sukses Makmur Tbk." +
                                    "PT Tirta Sukses Perkasa merupakan anak perusahaan dari PT Indofood Asahi Sukses Beverage, yang juga mendistribusikan Pepsi, 7 Up, Mirinda, Tropicana Twister, Ichi Ocha dan Caféla Latte. Pada awalnya nama perusahaannya adalah PT Tirta Bahagia yang didirikan pada tahun 1986 dan memproduksi air mineral dengan merek Club, Viand, Ana dan Chiara. Akibat dari akuisisi oleh Indofood, nama perusahaannya pun berubah. Pada tahun 2014, nama perusahaannya berganti nama menjadi PT Tirta Sukses Perkasa.";
                            intent.putExtra("DeskripsiAirMineral",deskripsi);
                            context.startActivity(intent);
                            break;
                        case 5 :
                            // Equil
                            intent.putExtra("Nama Air Mineral",DataRV.get(getAdapterPosition()));
                            intent.putExtra("Harga",DeskripsiRV.get(getAdapterPosition()));
                            intent.putExtra("gambar",GambarRV.get(getAdapterPosition()));
                            deskripsi = "Equil adalah air mineral anorganik yang di produksi oleh PT Equilindo Asri. Sedang pemilik PT Equilindo Asri adalah Morgen Sutanto. Untuk .lokasi industrinya berada di Vila D’Equilibrium, dan pabrik pengemasan Equil terletak di kaki Gunung Salak, Sukabumi, Jawa Barat.\n" +
                                    "\n" +
                                    "Merk air mineral murni 'Equil' ini sudah cukup dikenal bagi kalangan menengah atas dan ekspatriat. Equil juga sudah sering menjadi pelengkap dan tersaji di hotel bintang lima, meja restoran fine dining, hingga meja Istana Negara saat rapat kabinet." +
                                    "\n" +
                                    "Home » Info dan Tips » Equil adalah Air Mineral Buatan PT Equilindo Asri Bukan Miras\n" +
                                    "Info dan Tips\n" +
                                    "Equil adalah Air Mineral Buatan PT Equilindo Asri Bukan Miras\n" +
                                    "Equil adalah air mineral anorganik yang di produksi oleh PT Equilindo Asri. Sedang pemilik PT Equilindo Asri adalah Morgen Sutanto. Untuk .lokasi industrinya berada di Vila D’Equilibrium, dan pabrik pengemasan Equil terletak di kaki Gunung Salak, Sukabumi, Jawa Barat.\n" +
                                    "\n" +
                                    "Merk air mineral murni 'Equil' ini sudah cukup dikenal bagi kalangan menengah atas dan ekspatriat. Equil juga sudah sering menjadi pelengkap dan tersaji di hotel bintang lima, meja restoran fine dining, hingga meja Istana Negara saat rapat kabinet.\n" +
                                    "\n" +
                                    "Apa Itu Equil?\n" +
                                    "\n" +
                                    "\n" +
                                    "Jika melihat dari sisi kemasannya, Equil nampak begitu elegan dengan botol warna hijau serta lekukan ke bagian atas. Equil memang berbeda dengan air mineral biasa yang umumnya banyak tersedia di warung-warung kecil. Selain harganya yang cukup mahal, Air mineral (Equil) ini juga memiliki kandungan mineral anorganik, yang dapat  digunakan juga untuk berbagai terapi kesehatan.";
                            intent.putExtra("DeskripsiAirMineral",deskripsi);
                            context.startActivity(intent);
                            break;
                        case 6 :
                            // Evian
                            intent.putExtra("Nama Air Mineral",DataRV.get(getAdapterPosition()));
                            intent.putExtra("Harga",DeskripsiRV.get(getAdapterPosition()));
                            intent.putExtra("gambar",GambarRV.get(getAdapterPosition()));
                            deskripsi = "Evian (pengucapan bahasa Perancis: [evjɑ̃ ]) adalah sebuah merek air mineral Perancis yang berasal dari berbagai sumber dekat Évian-les-Bains, di pesisir selatan Lac Léman.\n" +
                                    "\n" +
                                    "Saat ini Evian dimiliki oleh Groupe Danone, sebuah perusahaan multinasional Perancis. Selain air mineral, Groupe Danone memakai nama Evian untuk jajaran produk perawatan kulit organik serta sebuah resor mewah di Perancis.\n" +
                                    "\n" +
                                    "Dalam budaya masyarakat, Evian ditampilkan sebagai produk air kemasan mewah dan mahal. Produk ini disebutkan dalam Murder on the Orient Express karya Agatha Christie. Air kemasan ini populer di kalangan selebriti Hollywood.[1] David LaChapelle membuat foto kampanye Evian yang mempersandingkan seorang supermodel dengan air mancur Evian yang keluar dari patung Yunani; aktor film Sebastian Siegel dicat agar menyerupai patung tersebut oleh Joanne Gair. Selain itu, desainer mode tinggi Jean-Paul Gaultier menjadi perancang botol edisi terbatas tahun 2009.";
                            intent.putExtra("DeskripsiAirMineral",deskripsi);
                            context.startActivity(intent);
                            break;
                        case 7 :
                            // Le Minerale
                            intent.putExtra("Nama Air Mineral",DataRV.get(getAdapterPosition()));
                            intent.putExtra("Harga",DeskripsiRV.get(getAdapterPosition()));
                            intent.putExtra("gambar",GambarRV.get(getAdapterPosition()));
                            deskripsi = "Le Minerale adalah air mineral baru dari Mayora, berupa air mineral pegunungan yang mengandung mineral alami yang dibutuhkan tubuh sehari-hari. Le Minerale, diolah dari sumber mata air pegunungan terpilih, sehingga memiliki kesegaran khas yang ditandai dengan sedikit rasa manis. Kesegaran khas ini berasal dari seimbangnya jumlah kandungan mineral alami dalam Le Minerale. Le Minerale menjaga kandungan mineral tersebut tetap utuh dengan menggunakan teknologi perlindungan mineral pertama di Indonesia, yaitu Mineral Protection System. Kandungan mineral alami diproteksi dengan sempurna, ditandai dengan botol kemasan Le Minerale akan tetap keras sebelum dibuka. Teknologi ini membuat kesegaran khas yang dimiliki Le Minerale tetap terjaga utuh sampai ke tangan konsumen.\n" +
                                    "\n" +
                                    "Artikel ini telah tayang di Kompas.com dengan judul \"Fakta Seputar Air Mineral\", http://lifestyle.kompas.com/read/2015/05/05/092847423/Fakta.Seputar.Air.Mineral.\n" +
                                    "Penulis : advertorial";
                            intent.putExtra("DeskripsiAirMineral",deskripsi);
                            context.startActivity(intent);
                            break;
                        case 8 :
                            // Nestle
                            intent.putExtra("Nama Air Mineral",DataRV.get(getAdapterPosition()));
                            intent.putExtra("Harga",DeskripsiRV.get(getAdapterPosition()));
                            intent.putExtra("gambar",GambarRV.get(getAdapterPosition()));
                            deskripsi = "Air mineral Nestle adalah produk dari perusahaan Nestle Indonesia. Nestlé Indonesia adalah anak perusahaan Nestlé S.A., yang berpusat di Vevey, Swiss, dan telah beroperasi selama 150 tahun.\n" +
                                    "\n" +
                                    "Sebagai perusahaan gizi, kesehatan dan keafiatan terkemuka di dunia, Nestlé mulai beroperasi di Indonesia tahun 1971. Nestlé Indonesia kini mempekerjakan sekitar 3.400 karyawan dan mengoperasikan empat pabrik yaitu Pabrik Kejayan di Jawa Timur untuk mengolah produk susu seperti DANCOW dan BEAR BRAND, Pabrik Panjang di Lampung untuk mengolah kopi instan NESCAFÉ, Pabrik Cikupa di Banten untuk memproduksi produk kembang gula FOX'S, POLO dan CRUNCH, serta Pabrik Karawang di Jawa Barat untuk memproduksi DANCOW, MILO dan CERELAC";
                            intent.putExtra("DeskripsiAirMineral",deskripsi);
                            context.startActivity(intent);
                            break;
                        case 9 :
                            // Pristine
                            intent.putExtra("Nama Air Mineral",DataRV.get(getAdapterPosition()));
                            intent.putExtra("Harga",DeskripsiRV.get(getAdapterPosition()));
                            intent.putExtra("gambar",GambarRV.get(getAdapterPosition()));
                            deskripsi = "Sumber mata air PRISTINE murni dan asli berasal dari Pegunungan Pangrango Gede,30 mil dari Jakarta Selatan ( 1.5 jam dari Jakarta Pusat),berlokasi disamping “ Taman Nasional Pangrango Gede”." +
                                    "PRISTINE bukan Air Mineral biasa karena PRISTINE bukan hanya sekedar menghilangkan dahaga, tapi juga bermanfaat bagi kesehatan. Dengan proses Ionisasi, suatu prosess dimana memisahkan air dan mineral menjadi ion molekul yang lebih kecil" +
                                    "1.Molekul air yang kecil - Cepat Terserap dalam Tubuh.\n" +
                                    "Dengan ukuran molekul Hidrogen yang lebih kecil (microwater) menjadikan proses penyerapan oleh sel tubuh lebih cepat dan efisien.\n" +
                                    "\n" +
                                    "2.pH Lebih Tinggi ( pH 8 – 8.5 ) - Menetralisir Limbah Asam Tubuh.\n" +
                                    "Dengan mengkonsumsi PRISTINE (pH 8 – 8.5 ) setiap hari akan membantu mempertahankan keseimbangan pH tubuh dengan menetralisir limbah asam.\n" +
                                    "\n" +
                                    "3.Ionisasi - Berfungsi Sebagai Anti Oksidan\n" +
                                    "Potensial Reduksi Oksidasi (ORP) PRISTINE adalah negative, yang menunjukkan bahwa PRISTINE dapat menangkal dan menurunkan proses oksidasi yang dapat merusak sel-sel tubuh kita yang sehat. Fungsi ini yang biasanya kita sebut sebagai Anti Oksidan\n" +
                                    "\n" +
                                    "4.Mineral untuk Kesehatan\n" +
                                    "Mengandung mineral-mineral yang terpilih dan seimbang, dapat membantu memperbaiki sel-sel tubuh yang mengalami kerusakan.\n" +
                                    "\n" +
                                    "5.Semuanya Alami dan Murni\n" +
                                    "Tidak mengandung suplemen tambahan, bahan pengawet dan pemanis. PRISTINE alami dan murni, tidak ada efek samping apapun.";
                            intent.putExtra("DeskripsiAirMineral",deskripsi);
                            context.startActivity(intent);
                            break;
                        case 10 :
                            // Vit
                            intent.putExtra("Nama Air Mineral",DataRV.get(getAdapterPosition()));
                            intent.putExtra("Harga",DeskripsiRV.get(getAdapterPosition()));
                            intent.putExtra("gambar",GambarRV.get(getAdapterPosition()));
                            deskripsi = "Sumber mata air yang digunakan oleh VIT telah melalui uji fisika, kimia dan mikrobiologi untuk memastikan pemenuhan standar kualitas yang telah ditetapkan.\n" +
                                    "\n" +
                                    "Komitmen terhadap kualitas ini terus berlanjut di tahap produksi. Proses pembotolan dan pengemasan di seluruh pabrik VIT dilakukan dengan teknologi dan pengawasan mutu yang ketat.\n" +
                                    "\n" +
                                    "Air masuk ke dalam lini produksi dengan melalui proses filtrasi terkontrol dan ozonisasi. Proses filtrasi terkontrol merupakan proses unik yang membedakan VIT dengan merek lainnya. Didukung dengan microfiltration filter 5 micron, 1 micron, dan 0,5 micron, menjadikan air VIT higienis, bersih, serta memiliki kualitas terpercaya. Ozonisasi dilakukan untuk menghilangkan bakteri pathogen penyebab penyakit, hingga menjadikan VIT aman untuk dikonsumsi.\n" +
                                    "\n" +
                                    "Berkat komitmen terhadap kualitas ini, VIT telah berhasil memenuhi standar ISO 9001* dan SNI 01- 3553-2006, serta menerapkan standar HACCP di semua pabrik.";
                            intent.putExtra("DeskripsiAirMineral",deskripsi);
                            context.startActivity(intent);
                            break;
                    }

                }
            });
        }
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // membuat view baru
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.model_menu, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }


    //metode untuk memunculkan detail namamakanan, harga makanan, dan gambar pada recycler view, dan bukan pada detail menu nya
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        // get data dari posisi dalam recycler view tertentu
        final String name = DataRV.get(position);
        final String harga = DeskripsiRV.get(position);
        final Integer gambar = GambarRV.get(position);

        // atur nilai view holder tersebut
        holder.namaAirMineral.setText(name);
        holder.deskripsi.setText(harga);
        holder.gambarAirMineral.setImageResource(gambar);
    }

    @Override
    public int getItemCount() {
        // menampilkan ukuran data dalam recyclerview
        return DataRV.size();
    }
}