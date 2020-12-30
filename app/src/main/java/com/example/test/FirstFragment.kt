package com.example.test

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_first.*

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FirstFragment : Fragment() {

    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        var appScheme = "erim://testapp"

        view.findViewById<Button>(R.id.button_first).setOnClickListener {
            val token =  edittextview_first.text.toString()
            if(edittextview_app_scheme.text.toString().isNotEmpty()){
                appScheme = edittextview_app_scheme.text.toString()
            }
            val url = "gastropay://open_payment_with_token?token=$token&sender_app_schema=$appScheme"
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse(url)
            startActivity(intent)
        }
    }
}