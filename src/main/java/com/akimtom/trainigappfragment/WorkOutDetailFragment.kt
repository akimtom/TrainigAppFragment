package com.akimtom.trainigappfragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.akimtom.trainigappfragment.WorkOut.Companion.workOuts
import kotlinx.android.synthetic.main.fragment_work_out_detail.view.*


/**
 * A simple [Fragment] subclass.
 * Use the [WorkOutDetailFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class WorkOutDetailFragment : Fragment() {
     var  workOutId:Int  = 0



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_work_out_detail, container, false)
    }
    fun setWorkOut(id:Int)
    {
        this.workOutId=id
    }

    override fun onStart() {
        super.onStart()
        var v:View? = view
        if(view!=null)
        {
           var textViewT:TextView? = v?.textTitle
            var textViewD:TextView?= v?.textDescription

            var work:WorkOut =workOuts[workOutId]
            textViewT?.text=work.name
            textViewD?.text=work.description
        }
    }

}