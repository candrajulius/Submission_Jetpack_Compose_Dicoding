package com.candra.submissionjetpackcomposebootcamp.model

import com.candra.submissionjetpackcomposebootcamp.R

object ProgramsData{

    val programsData = listOf(
        Programs(
            1,
            "C++",
            R.drawable.c,
            "C++ (dibaca: C plus-plus) adalah bahasa pemrograman komputer yang dibuat oleh Bjarne Stroustrup, yang merupakan perkembangan dari bahasa C dikembangkan di Bell Labs (Dennis Ritchie). Pada awal tahun 1970-an, bahasa itu merupakan peningkatan dari bahasa sebelumnya, yaitu B.\n" +
                    "Pada awalnya, bahasa tersebut dirancang sebagai bahasa pemrograman yang dijalankan pada sistem Unix. Pada perkembangannya, versi ANSI (American National Standards Institute) pada bahasa pemrograman C menjadi versi dominan, meskipun versi tersebut sekarang jarang dipakai dalam pengembangan sistem dan jaringan maupun untuk sistem embedded.\n"
        ),
        Programs(
            2,
            "Scala",
            R.drawable.scala,
            "Scala merupakan bahasa pemrograman umum (general purpose) yang mendukung pemrograman berorientasi objek dan pemrograman fungsional. Secara umum, tujuan dibuatnya Scala adalah untuk mengkritisi bahasa pemrograman Java.\n" +
                    "Kode sumber Scala dibuat agar dapat dikompilasi dengan Bytecode Java, sehingga mengakibatkan eksekusi kode berjalan pada mesin virtual Java. Scala menyediakan interoperabilitas bahasa dengan Java, sehingga perpustakaan yang ditulis dalam dua bahasa ini dapat dirujuk langsung di Scala atau kode Java.[1] Seperti Java, Scala adalah merupakan bahasa yang berorientasi objek, dan menggunakan sintaks-kriting mengingatkan pada bahasa pemrograman C\n"
        ),
        Programs(
            3,
            "Java",
            R.drawable.java,
            "Java adalah bahasa pemrograman yang dapat dijalankan di berbagai komputer termasuk telepon genggam. Bahasa ini awalnya dibuat oleh James Gosling saat masih bergabung di Sun Microsystems, yang saat ini merupakan bagian dari Oracle dan dirilis tahun 1995. Bahasa ini banyak mengadopsi sintaksis yang terdapat pada C dan C++ namun dengan sintaksis model objek yang lebih sederhana serta dukungan rutin-rutin aras bawah yang minimal. Aplikasi-aplikasi berbasis java umumnya dikompilasi ke dalam p-code (bytecode) dan dapat dijalankan pada berbagai Mesin Virtual Java (JVM)."
        ),
        Programs(
            4,
            "C#",
            R.drawable.cicasharp,
            "C# (dibaca: see sharp) adalah sebuah bahasa pemrograman berorientasi objek (object-oriented language) yang dikembangkan oleh Microsoft sebagai bagian dari inisiatif kerangka .NET Framework. Bahasa pemrograman ini dibuat berbasiskan bahasa C++ yang telah dipengaruhi oleh aspek-aspek ataupun fitur bahasa yang terdapat pada bahasa-bahasa pemrograman lainnya seperti Java, Delphi, Visual Basic, dan lain-lain dengan beberapa penyederhanaan. Menurut standar ECMA-334 C# Language Specification, nama C# terdiri atas sebuah huruf Latin C (U+0043) yang diikuti oleh tanda pagar yang menandakan angka # (U+0023). Tanda pagar # yang digunakan memang bukan tanda kres dalam seni musik (U+266F), dan tanda pagar # (U+0023) tersebut digunakan karena karakter kres dalam seni musik tidak terdapat di dalam papan tombol standar."
        ),
        Programs(
            5,
            "Golang",
            R.drawable.go,
            "Go (sering disebut sebagai Golang) adalah bahasa pemrograman yang dibuat di Google pada tahun 2009 oleh Robert Griesemer, Rob Pike, dan Ken Thompson. Go adalah bahasa pemrograman sumber terbuka yang mudah, sederhana, efisien. Selain itu, Go memiliki level yang sama dengan Java. Yaitu bahasa pemrograman yang dihimpun dan diketik dalam bahasa C, dengan fitur pengumpulan sampah, penulisan terstruktur, keamanan memori, dan pemrograman yang konkuren serta berurutan. Kompiler dan IDE lainnya disediakan oleh Google dari awal secara bebas dan sumber terbuka."
        ),
        Programs(
            6,
            "JavaScript",
            R.drawable.javascript,
            "JavaScript populer di internet dan dapat bekerja di sebagian besar penjelajah web populer seperti Google Chrome, Internet Explorer (IE), Mozilla Firefox, Netscape dan Opera. Kode JavaScript dapat disisipkan dalam halaman web menggunakan tag script. JavaScript merupakan salah satu teknologi inti World Wide Web selain HTML dan CSS. JavaScript membantu membuat halaman web interaktif dan merupakan bagian aplikasi web yang esensial."
        ),
        Programs(
            7,
            "Pyhton",
            R.drawable.pyhton,
            "Python adalah bahasa pemrograman tujuan umum yang ditafsirkan, tingkat tinggi. Dibuat oleh Guido van Rossum dan pertama kali dirilis pada tahun 1991, filosofi desain Python menekankan keterbacaan kode dengan penggunaan spasi putih yang signifikan. Konstruksi bahasanya dan pendekatan berorientasi objek bertujuan untuk membantu pemrogram menulis kode yang jelas dan logis untuk proyek skala kecil dan besar"
        ),
        Programs(
            8,
            "Kotlin",
            R.drawable.kotlin,
            "Kotlin adalah sebuah bahasa pemrograman dengan pengetikan statis yang berjalan pada Mesin Virtual Java ataupun menggunakan kompiler LLVM yang dapat pula dikompilasikan kedalam bentuk kode sumber JavaScript. Pengembang utamanya berasal dari tim programer dari JetBrains yang bermarkas di Rusia.[2] Meskipun sintaksisnya tidak kompatibel dengan bahasa Java, Kotlin didesain untuk dapat bekerja sama dengan kode bahasa Java dan bergantung kepada kode bahasa Java dari Kelas Pustaka Java yang ada, seperti berbagai framework Java yang ada. Tim Pengembang memutuskan menamakannya Kotlin dengan mengambil nama dari sebuah pulau di Rusia, sebagaimana Java yang mengambil nama dari pulau Jawa di Indonesia.[3] Setelah Google mengumumkan bahwa Kotlin menjadi bahasa kelas satu bagi Android, maka bersama Java dan C++, Kotlin menjadi bahasa resmi untuk pengembangan aplikasi-aplikasi Android"
        ),
        Programs(
            9,
            "Ruby",
            R.drawable.ruby,
            "Ruby pertama kali dibuat oleh seorang programmer Jepang bernama Yukihiro Matsumoto. Pada tahun 1993 Yukihiro ingin membuat sebuah bahasa skripting yang memiliki kemampuan orientasi objek. Pada saat itu pemrograman berorientasi objek sedang berkembang tetapi belum ada bahasa pemrograman scripting yang mendukung pemrograman objek"
        ),
        Programs(
            10,
            "PHP",
            R.drawable.php,
            "Kode PHP biasanya diproses di peladen web oleh interpreter PHP yang diimplementasikan sebagai modul, daemon, atau sebagai Common Gateway Interface (CGI) yang bisa dijalankan. Di server web, hasil dari kode PHP yang ditafsirkan dan dieksekusi (dapat berupa semua jenis data, seperti HTML atau data gambar biner) akan membentuk keseluruhan atau sebagian dari respons HTTP"
        )
    )


}