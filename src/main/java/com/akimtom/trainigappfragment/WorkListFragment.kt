package com.akimtom.trainigappfragment

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.fragment.app.Fragment
import androidx.fragment.app.ListFragment


class WorkListFragment : ListFragment() {

interface Listener
{
   fun itemCli(id:Long)
}
    private  var listener: Listener?=null


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val names = arrayOfNulls<String>(WorkOut.workOuts.size)
        for (i in names.indices)
        {
            names[i]=WorkOut.workOuts[i].toString()
        }
       var adapter:ArrayAdapter<String> =
           ArrayAdapter(inflater.context,android.R.layout.simple_list_item_1,names)
        listAdapter=adapter

        return super.onCreateView(inflater, container, savedInstanceState)


    }


    override fun onAttach(context: Context) {
        super.onAttach(context)
        this.listener =context as Listener?
    }

    override fun onListItemClick(l: ListView, v: View, position: Int, id: Long) {
       // super.onListItemClick(l, v, position, id)
        listener?.itemCli(id)
    }
}