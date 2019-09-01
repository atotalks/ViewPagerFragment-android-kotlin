package com.example.viewpagerfragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

open class Type_3: Fragment()
{
    fun newInstance(): Type_3
    {
        val args = Bundle()

        val frag = Type_3()
        frag.arguments = args

        return frag
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View?
    {
        val v = inflater.inflate(R.layout.type_3, container, false)
        return v
    }
}