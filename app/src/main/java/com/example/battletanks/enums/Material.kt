package com.example.battletanks.enums

import com.google.android.material.transition.MaterialFadeThrough

enum class Material(val tankConGoThrough: Boolean) {
    EMPTY(true),
    BRICK(false),
    CONCRETE(false),
    GRASS(true),
}
