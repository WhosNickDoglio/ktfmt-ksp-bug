package dev.whosnickdoglio.ktfmt

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Test(
    val something: String
)
