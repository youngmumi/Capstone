package com.example.giveback.auth

data class User(
    var email: String,
    var uId: String,
) {
    constructor(): this("", "")
}
