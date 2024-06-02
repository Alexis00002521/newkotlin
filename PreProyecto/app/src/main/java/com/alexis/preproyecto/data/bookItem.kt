package com.alexis.preproyecto.data

import com.alexis.preproyecto.R

data class BookItem(
    //primary property
    val titulo: String,
    val genero: Array<String>,
    val autor: String,
    val sinopsis: String,
    val estado: String,
    //property
    val year: Int,
    val isbn: String,
    val editorial: String,
    val idioma: String,
    val precio: Double,
    //check
    val venta: Boolean,
    val intercambio: Boolean,
    //img
    val imagen: Int,

    )


val bookListItem = listOf(
    BookItem("Harry Potter y las reliquias de la muerte",
        arrayOf("Novela", "Fantasia", "Literatura Infantil"),
        "J. K. Rowling","Harry Potter y las reliquias de la Muerte, es el séptimo libro de la serie literaria Harry Potter, escrita por la autora británica J. K. Rowling. El libro se publicó el 21 de julio de 2007, cerrando la serie que empezó diez años antes con la publicación de Harry Potter y la piedra filosofal publicado en 1997",
        "Nuevo",
        2007,
        "9780545010221",
        "uca",
        "Español",
        25.5,
        true,
        false,
        R.drawable.harry_reliquias_muerte

        ),
    BookItem("Harry Potter y la piedra filosofal",
        arrayOf("Novela", "Fantasia", "Literatura Infantil"),
        "J. K. Rowling","Harry Potter y las reliquias de la Muerte, es el séptimo libro de la serie literaria Harry Potter, escrita por la autora británica J. K. Rowling. El libro se publicó el 21 de julio de 2007, cerrando la serie que empezó diez años antes con la publicación de Harry Potter y la piedra filosofal publicado en 1997",
        "Nuevo",
        2007,
        "9780545010221",
        "uca",
        "Español",
        25.5,
        true,
        false,
        R.drawable.harry_piedra_filosofal

    ),
    BookItem("Harry Potter y el caliz de fuego ",
        arrayOf("Novela", "Fantasia", "Literatura Infantil"),
        "J. K. Rowling","Harry Potter y las reliquias de la Muerte, es el séptimo libro de la serie literaria Harry Potter, escrita por la autora británica J. K. Rowling. El libro se publicó el 21 de julio de 2007, cerrando la serie que empezó diez años antes con la publicación de Harry Potter y la piedra filosofal publicado en 1997",
        "Nuevo",
        2007,
        "9780545010221",
        "uca",
        "Español",
        25.5,
        true,
        false,
        R.drawable.harry_caliz_fuego

    ),
    BookItem("Harry Potter y la cámara secreta",
        arrayOf("Novela", "Fantasia", "Literatura Infantil"),
        "J. K. Rowling","Harry Potter y las reliquias de la Muerte, es el séptimo libro de la serie literaria Harry Potter, escrita por la autora británica J. K. Rowling. El libro se publicó el 21 de julio de 2007, cerrando la serie que empezó diez años antes con la publicación de Harry Potter y la piedra filosofal publicado en 1997",
        "Nuevo",
        2007,
        "9780545010221",
        "uca",
        "Español",
        25.5,
        true,
        false,
        R.drawable.harry_camara_secreta

    ),
    BookItem("Harry Potter y el prisionero de Azkaban",
        arrayOf("Novela", "Fantasia", "Literatura Infantil"),
        "J. K. Rowling","Harry Potter y las reliquias de la Muerte, es el séptimo libro de la serie literaria Harry Potter, escrita por la autora británica J. K. Rowling. El libro se publicó el 21 de julio de 2007, cerrando la serie que empezó diez años antes con la publicación de Harry Potter y la piedra filosofal publicado en 1997",
        "Nuevo",
        2007,
        "9780545010221",
        "uca",
        "Español",
        25.5,
        true,
        false,
        R.drawable.harry_prisionero_azkaban

    )

)