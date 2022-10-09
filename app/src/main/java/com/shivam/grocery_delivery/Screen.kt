package com.shivam.grocery_delivery

sealed class Screen(val route: String){
    object mainScreen:Screen("mainScreen")
    object loginScreen:Screen("loginScreen")
    object resetScreen:Screen("resetScreen")
    object detailScreen:Screen("detailScreen")

        fun withArgs(vararg args:String):String{
            return buildString {
                append(route)
                args.forEach {arg ->
                    append( "/$arg")
                }
            }
        }
}
