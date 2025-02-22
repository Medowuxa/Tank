package com.example.battletanks.enums

import com.google.android.material.transition.MaterialFadeThrough

enum class Material(
    val tankConGoThrough: Boolean,
    val bulletCanGoThrough: Boolean,
    val simpleBulletCanDestroy: Boolean
) {
    EMPTY(true,true,true),
    BRICK(false,false,true),
    CONCRETE(false, false,false),
    GRASS(true,true,false),
}
