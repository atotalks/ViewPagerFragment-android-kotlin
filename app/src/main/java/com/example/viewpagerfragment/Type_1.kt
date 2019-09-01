package com.example.viewpagerfragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

open class Type_1: Fragment()
{
    fun newInstance(): Type_1
    {
        val args = Bundle()

        val frag = Type_1()
        frag.arguments = args

        return frag
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View?
    {
        val v = inflater.inflate(R.layout.type_1, container, false)
        return v
    }
}