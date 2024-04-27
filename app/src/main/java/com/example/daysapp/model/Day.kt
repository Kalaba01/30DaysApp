package com.example.daysapp.model

import androidx.annotation.StringRes
import androidx.annotation.DrawableRes

data class Day(
    @StringRes val day: Int,
    @StringRes val title: Int,
    @DrawableRes val img: Int,
    @StringRes val desc: Int
)
