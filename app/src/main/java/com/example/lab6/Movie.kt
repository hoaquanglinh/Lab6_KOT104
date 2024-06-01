package com.example.lab6

data class Movie(
    val title: String,
    val duration: String,
    val posterUrl: String,
    val releaseDate: String,
    val genre: String,
    val shortDescription: String,
    val year: String
) {
    companion object {
        fun getSampleMovies() = listOf(
            Movie("Love again", "120 phút", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQYH3aTaWKrOgNLFV2Ofq8I6Y40JemlblsW6w&s", "2024", "tinh cam", "Love Again (tựa Việt Yêu như lần đầu) ban đầu có tên là It's All Coming Back To Me Now - tình khúc nổi danh của Celine Dion kể về một người phụ nữ cô đơn quạnh quẽ trong căn nhà lớn khi người yêu của mình đã ra đi mãi mãi. Một đêm nọ, trong cơn bão, cô gái trong bài hát tưởng như người yêu mình đã quay về, khiến cô cảm nhận được tình yêu mình đánh mất suốt bao lâu nay. Cuối cùng vỡ òa trong hạnh phúc.", "120 phút"),
            Movie("Aquaman", "108 phút", "https://timesofindia.indiatimes.com/photo/90355881.cms", "2024", "tinh cam", "Love Again (tựa Việt Yêu như lần đầu) ban đầu có tên là It's All Coming Back To Me Now - tình khúc nổi danh của Celine Dion kể về một người phụ nữ cô đơn quạnh quẽ trong căn nhà lớn khi người yêu của mình đã ra đi mãi mãi. Một đêm nọ, trong cơn bão, cô gái trong bài hát tưởng như người yêu mình đã quay về, khiến cô cảm nhận được tình yêu mình đánh mất suốt bao lâu nay. Cuối cùng vỡ òa trong hạnh phúc.", "110 phút"),
            Movie("Jungle cruise", "150 phút", "https://timesofindia.indiatimes.com/photo/90355881.cms", "2024", "tinh cam", "Love Again (tựa Việt Yêu như lần đầu) ban đầu có tên là It's All Coming Back To Me Now - tình khúc nổi danh của Celine Dion kể về một người phụ nữ cô đơn quạnh quẽ trong căn nhà lớn khi người yêu của mình đã ra đi mãi mãi. Một đêm nọ, trong cơn bão, cô gái trong bài hát tưởng như người yêu mình đã quay về, khiến cô cảm nhận được tình yêu mình đánh mất suốt bao lâu nay. Cuối cùng vỡ òa trong hạnh phúc.", "98 phút")
        )
    }
}