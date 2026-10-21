package kr.ac.kumoh.ce.s20220565.s26w06navigation.navigation

import androidx.navigation3.runtime.NavKey
import kotlinx.serialization.Serializable

sealed interface PokemonRoute : NavKey {
    @kotlinx.serialization.Serializable
    data object PokemonList : PokemonRoute

    @Serializable
    data class PokemonDetail(val pokemonId: Int) : PokemonRoute
}