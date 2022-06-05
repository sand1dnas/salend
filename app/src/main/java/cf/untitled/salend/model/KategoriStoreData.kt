package cf.untitled.salend.model

data class KategoriStoreData(
    val _id : String,
    val s_name : String,
    val s_time : String,
    val s_image : String
)

data class KategoriStore(
    val stores : List<KategoriStoreData>?
)
