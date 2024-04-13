package com.muratcangzm.mobilyaarti.data.local

data class FurnitureModel(
    var furnitureName:String,
    var furnitureCategory: FurnitureCategory,
    var furnitureImage: Int,
    var furniturePrice:Int,
    var isInStock: Boolean
)