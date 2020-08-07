package com.example.klubliga1;

import java.util.ArrayList;

public class KlubData {
    private static String[] klubNames = {
            "Persib Bandung",
            "Bali United",
            "Borneo FC",
            "Persipura Jayapura",
            "PSIS Semarang",
            "PSM Makassar",
            "Persiraja Banda Aceh",
            "Madura United",
            "Persija Jakarta",
            "Persikabo Bogor",
            "Bhayangkara FC",
            "Arema FC",
            "Persik Kediri",
            "Persita Tangerang",
            "Persebaya Surabaya",
            "PSS Sleman",
            "Barito Putera",
            "Persela Lamongan",
    };

    private static String[] klubDetails = {
            "Persib Bandung adalah klub sepak bola Indonesia yang berdiri pada 14 Maret 1933, berbasis di Bandung, Jawa Barat. Persib saat ini bermain di Liga 1 Indonesia 2020 dan menjadi pemuncak klasemen sementara. Julukan mereka adalah Maung Bandung dan Pangeran Biru. Sponsor utama dan terbesar masih di pegang Indofood dan apparel jersey yang terbaru adalah Sportama.",
            "Bali United merupakan sebuah klub sepak bola Indonesia, yang bermarkas Stadion Kapten I Wayan Dipta, Kabupaten Gianyar, Provinsi Bali. Klub ini dulunya bernama Persatuan Sepak Bola Indonesia Samarinda (Persisam). Pada 15 Februari 2015, Putra Samarinda diambil alih pengusaha asal Indonesia, Pieter Tanuri, setelah sebelumnya mengalami kesulitan finansial hingga akhirnya berpindah kandang ke Bali dan mengubah namanya menjadi Bali United.",
            "Borneo FC adalah klub sepak bola Indonesia yang berasal dari Samarinda, Kalimantan Timur, Indonesia. Pada awal berdirinya klub ini bermain di Divisi Utama Liga Indonesia 2014 setelah mengakuisisi klub Perseba Super Bangkalan pada tanggal 7 Maret 2014, menggantikan Persisam Samarinda sebagai Klub asal samarinda, Kalimantan Timur.",
            "Persipura Jayapura adalah sebuah klub sepak bola Indonesia yang bermarkas di Jayapura, Papua. Prestasi tertingginya hingga kini adalah menjadi empat kali juara Liga Indonesia dari tahun 2005 hingga 2013[1]. Di era Perserikatan, prestasi Persipura adalah runner-up Divisi Utama (1980) dan dua kali juara Divisi I (1979 dan 1993).",
            "PSIS Semarang adalah klub sepak bola yang bermarkas di Kota Semarang. Julukan klub ini adalah \"Laskar Mahesa Jenar\". PSIS Semarang adalah klub pertama di Liga Indonesia yang pernah menjadi juara Divisi Utama (1999) dan kemudian terdegradasi ke divisi I pada musim berikutnya (2000). PSIS kemudian berhasil menjuarai kompetisi Divisi I nasional (2001), dan berhak berlaga kembali di kompetisi Divisi Utama Liga Indonesia. PSIS Semarang juga tercatat sebagai klub ketiga yang pernah menjuarai Liga Perserikatan dan Divisi Utama Liga Indonesia, setelah Persib Bandung dan Persebaya Surabaya.",
            "PSM Makassar adalah sebuah tim sepak bola Indonesia yang berbasis di Makassar, Sulawesi Selatan, Indonesia, yang dikenal pasukan Ramang atau Juku Eja. PSM Makassar saat ini bermain di Liga 1. PSM Makassar merupakan salah satu tim terkuat di Indonesia dan telah mewakili Indonesia dalam Liga Champions Asia sebanyak tiga kali. PSM Makassar merupakan tim dengan catatan prestasi paling stabil di pentas Liga Indonesia, dengan sekali menjadi juara, delapan kali runner up, dan hanya sekali gagal masuk putaran final. PSM Makassar adalah tim tertua di Indonesia.",
            "Persiraja Banda Aceh adalah sebuah klub sepak bola Indonesia asal Kota Banda Aceh, ibu kota Provinsi Aceh. Kutaraja merupakan nama lama Kota Banda Aceh. Klub ini didirikan pada tanggal 28 Juli 1957. Prestasi terbaik yang dicapai Persiraja yakni tampil sebagai juara perserikatan pada tahun 1980.",
            "Madura United FC merupakan klub sepak bola asal Indonesia yang berbasis di Pamekasan, Madura. Klub ini sebelumnya bernama Pelita Bandung Raya yang pada waktu itu berlaga di Liga Super Indonesia. Pemilik Pelita Bandung Raya, Ari D. Sutedi akhirnya menjual klubnya ke Achsanul Qosasi, dan kemudian bertransformasi menjadi Madura United FC. Kini, Madura United menjelma menjadi salah satu klub terkuat di liga utama Indonesia.",
            "Persija Jakarta adalah klub sepak bola Indonesia yang berbasis di Jakarta. Persija saat ini berlaga di Liga 1. Persija merupakan salah satu klub sepakbola paling sukses di sejarah sepakbola Indonesia dengan torehan 2 kali juara liga domestik dan 9 kali juara turnamen perserikatan hingga sejauh ini. Persija didirikan pada 28 November 1928, tepat sebulan setelah Sumpah Pemuda, dengan cikal bakal bernama Voetbalbond Indonesische Jacatra (VIJ). VIJ merupakan salah satu klub yang ikut mendirikan Persatuan sepak bola Seluruh Indonesia (PSSI).",
            "Persikabo Bogor adalah sebuah klub sepak bola Indonesia yang dahulu bermarkas di Kabupaten Bogor. Persikabo didirikan pada tanggal 23 Desember 1973 yang dikenal dengan julukan Laskar Padjajaran. Awal tahun 2019 Persikabo melakukan merger dengan klub Liga 1 yaitu PS TIRA yang kemudian nama kedua klub tersebut digabungkan menjadi PS TIRA Persikabo.",
            "Bhayangkara FC adalah sebuah tim sepak bola Indonesia yang dimiliki oleh Polri yang berbasis di Jakarta. Klub ini bermain di Liga 1. Klub ini juga memegang rekor sebagai klub dengan pergantian nama terbanyak di Indonesia, semuanya karena dualisme yang pernah terjadi antara klub ini dengan klub Persebaya Surabaya pada rentang waktu 2010 sampai 2016.",
            "Arema FC adalah sebuah klub sepak bola profesional yang berasal dari Malang, Jawa Timur, Indonesia. Arema didirikan pada tanggal 11 Agustus 1987, Arema mempunyai julukan \"Singo Edan\". Dalam Liga 1, Arema bermarkas di Stadion Kanjuruhan, Kabupaten Malang dan Stadion Gajayana, Kota Malang. Sejak hadir di dunia sepakbola nasional, Arema telah menjadi ikon dari warga Malang Raya (Kota Malang, Kabupaten Malang, Kota Batu) dan sekitarnya. Sebagai perwujudan dari simbol Arema, hampir di setiap sudut kota hingga gang-gang kecil terdapat patung dan gambar singa.",
            "Persik Kediri merupakan klub sepak bola Indonesia yang berbasis di Kota Kediri, Jawa Timur. Tim ini mempunyai kandang di Stadion Brawijaya dan dijuluki Macan Putih. Persik Kediri mulai bermain di Divisi Utama Liga Indonesia pada tahun 2003 dan menjadi juara Liga Indonesia tahun 2007. Klub ini didirikan Pada tanggal 19 Mei 1950.",
            "Persita Tangerang adalah sebuah klub sepak bola Indonesia yang bermarkas di Tangerang. Tim berjuluk Pendekar Cisadane identik dengan kostum ungunya. Pada kompetisi Divisi Utama Liga Indonesia 2015, markas Persita adalah Stadion Maulana Yusuf di Serang. Kemudian pada musim 2018, Persita menggunakan Stadion Sport Center Dasana Indah Kab. Tangerang.",
            "Persebaya Surabaya adalah sebuah klub Sepak bola profesional di Indonesia yang berbasis di Surabaya yang berdiri pada 18 Juni 1927 dengan nama asalnya adalah Soerabajasche Indische Voetbal Bond (SIVB) dan sudah malang melintang dikancah sepak bola Indonesia. Sempat di bekukan oleh PSSI dan disahkan kembali oleh PSSI sebagai anggota di Kongres Tahunan PSSI Bandung pada tanggal 8 Januari 2017.",
            "PSS Sleman merupakan sebuah klub sepak bola yang berbasis di Kabupaten Sleman, Daerah Istimewa Yogyakarta, Indonesia. Klub yang didirikan pada 20 Mei 1976 ini merupakan salah satu klub sepak bola yang disegani di Indonesia dan memiliki julukan sebagai tim Elang Jawa atau Elja. Mereka bermain di Liga 1 dalam sebuah kompetisi sepak bola Indonesia, Liga Indonesia. Prestasi tertingginya dalam kompetisi kasta tertinggi Liga Indonesia adalah dua tahun berturut-turut menempati empat besar pada Divisi Utama Liga Indonesia 2003 dan Divisi Utama Liga Indonesia 2004.",
            "Barito Putera klub sepak bola Indonesia berbasis di Kota Banjarmasin, Kalimantan Selatan, yang bermain di Liga 1 sejak musim 2013. Barito Putera didirikan pada tahun 1988 dan bermarkas di Stadion 17 Mei Banjarmasin. Klub sekota Barito Putera adalah Peseban Banjarmasin yang berlaga di Liga 3 dan klub kota tetangga Martapura FC yang berlaga di Liga 2.",
            "Persela Lamongan atau julukannya Laskar Joko Tingkir adalah sebuah klub sepak bola Indonesia yang bermarkas di Lamongan, Jawa Timur. Persela dikelola oleh PT. Persela Jaya. Meski telah berdiri sejak 18 April 1967, Persela baru mulai menunjukkan eksistensinya di pentas sepak bola nasional setelah kompetisi memasuki era profesional. Itu pun setelah berjalan sembilan tahun, atau tepatnya pada musim 2003 silam, ketika mereka sukses promosi ke Divisi Utama Liga Indonesia, level tertinggi kompetisi sepak bola di tanah air kala itu."
    };

    private static int[] klubImages = {
            R.drawable.persib,
            R.drawable.bali_united,
            R.drawable.borneo_fc,
            R.drawable.persipura,
            R.drawable.psis,
            R.drawable.psm,
            R.drawable.persiraja,
            R.drawable.madura_united,
            R.drawable.persija,
            R.drawable.persikabo,
            R.drawable.bhayangkara_fc,
            R.drawable.arema_fc,
            R.drawable.persik,
            R.drawable.persita,
            R.drawable.persebaya,
            R.drawable.pss,
            R.drawable.barito_putera,
            R.drawable.persela
    };

    private static int[] klubStadion = {
            R.drawable.persib_st,
            R.drawable.bali_united_st,
            R.drawable.borneo_fc_st,
            R.drawable.persipura_st,
            R.drawable.psis_st,
            R.drawable.psm_st,
            R.drawable.persiraja_st,
            R.drawable.madura_united_st,
            R.drawable.persija_st,
            R.drawable.persikabo_st,
            R.drawable.bhayangkara_fc_st,
            R.drawable.arema_fc_st,
            R.drawable.persik_st,
            R.drawable.persita_st,
            R.drawable.persebaya_st,
            R.drawable.pss_st,
            R.drawable.barito_putera_st,
            R.drawable.persela_st
    };

    private static String[] klubSejak = {
            "14 Maret 1933",
            "1989 (Putra Samarinda)",
            "7 Maret 2014",
            "1 Mei 1963",
            "18 Mei 1932",
            "2 November 1915",
            "1957",
            "10 Januari 2016",
            "28 November 1928",
            "2015",
            "2015",
            "11 Agustus 1987",
            "1950",
            "1953",
            "1927",
            "1976",
            "21 April 1988",
            "18 April 1967"
    };

    private static String[] klubManajer = {
            "Robert Rene Alberts",
            "Stefano Cugurra Teco",
            "Edson Tavares",
            "Jacksen Tiago",
            "Dragan Đukanović",
            "Bojan Hodak",
            "Hendri Susilo",
            "Rahmad Darmawan",
            "Sérgio Farias",
            "Igor Kriushenko",
            "Paul Munster",
            "Roberto Carlos Mario Gómez",
            "Joko Susilo",
            "Widodo Cahyono Putro",
            "Aji Santoso",
            "Dejan Antonić",
            "Djajang Nurjaman",
            "Nil Maizar"
    };

    private static String[] klubBasis = {
            "Bandung, Jawa Barat",
            "Bali",
            "Samarinda, Kalimantan Timur",
            "Jayapura, Papua",
            "Semarang, Jawa Tengah",
            "Makassar, Sulawesi Selatan",
            "Banda Aceh, Aceh",
            "Pulau Madura, Jawa Timur",
            "DKI Jakarta",
            "Bogor, Jawa Barat",
            "Kepolisian RI, Jakarta",
            "Malang, Jawa Timur",
            "Kediri, Jawa Timur",
            "Tangerang, Banten",
            "Surabaya, Jawa Timur",
            "Sleman, Yogyakarta",
            "Banjarmasin, Kalimantan Selatan",
            "Lamongan, Jawa Timur"
    };

    private static String[] stadionama = {
            "Stadion Si Jalak Harupat",
            "Stadion Kapten I Wayan Dipta",
            "Stadion Segiri Samarinda",
            "Stadion Klabat Manado",
            "Stadion dr. H. Moch Soebroto",
            "Stadion Andi Mattalatta",
            "Stadion Harapan Bangsa",
            "Stadion Gelora Ratu Pamelingan",
            "Stadion Gelora Bung Karno",
            "Stadion Pakansari Bogor",
            "Stadion PTIK, Jakarta",
            "Stadion Kanjuruhan",
            "Stadion Brawijaya Kediri",
            "Stadion Benteng Taruna",
            "Stadion Gelora Bung Tomo",
            "Stadion Maguwoharjo",
            "Stadion Demang Lehman Martapura",
            "Stadion Surajaya"
    };

    static ArrayList<Klub> getListData() {
        ArrayList<Klub> list = new ArrayList<>();
        for (int position = 0; position < klubNames.length; position++) {
            Klub klub = new Klub();
            klub.setName(klubNames[position]);
            klub.setDetail(klubDetails[position]);
            klub.setPhoto(klubImages[position]);
            klub.setStadion(klubStadion[position]);
            klub.setBerdiri(klubSejak[position]);
            klub.setManajer(klubManajer[position]);
            klub.setBasis(klubBasis[position]);
            klub.setNamastadion(stadionama[position]);
            list.add(klub);
        }
        return list;
    }
}
