package com.gdsc_android.eat_app

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment

class FindAmoutFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.find_amount_fragment, container, false)

        val korButton = view.findViewById<Button>(R.id.kor_button)
        korButton.setOnClickListener {
            val intent = Intent(requireContext(), Kor_record::class.java)
            startActivity(intent)
        }

        return view
    }
}
