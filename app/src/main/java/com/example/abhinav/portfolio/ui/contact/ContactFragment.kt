package com.example.abhinav.portfolio.ui.contact

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import com.airbnb.lottie.LottieAnimationView
import com.example.abhinav.portfolio.R

class ContactFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val root = inflater.inflate(R.layout.fragment_contact, container, false)
        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val icon1: ImageView = view.findViewById(R.id.icon1)
        val icon2: ImageView = view.findViewById(R.id.icon2)
        val icon3: ImageView = view.findViewById(R.id.icon3)
        val icon4: ImageView = view.findViewById(R.id.icon4)
        val fan: LottieAnimationView = view.findViewById(R.id.lav_fan)
        fan.playAnimation()


        icon1.setOnClickListener {
            val intent = Intent()
            intent.action = Intent.ACTION_VIEW
            intent.addCategory(Intent.CATEGORY_BROWSABLE)
            intent.data = Uri.parse("https://www.linkedin.com/in/abhinav-prakash-05")
            startActivity(intent)
        }

        icon2.setOnClickListener {
            val intent = Intent()
            intent.action = Intent.ACTION_VIEW
            intent.addCategory(Intent.CATEGORY_BROWSABLE)
            intent.data = Uri.parse("https://github.com/abhinavp403")
            startActivity(intent)
        }

        icon3.setOnClickListener {
            val intent = Intent()
            intent.action = Intent.ACTION_VIEW
            intent.addCategory(Intent.CATEGORY_BROWSABLE)
            intent.data = Uri.parse("https://abhinavp403.wixsite.com/website")
            startActivity(intent)
        }

        icon4.setOnClickListener {
            val intent = Intent()
            intent.action = Intent.ACTION_VIEW
            intent.addCategory(Intent.CATEGORY_BROWSABLE)
            intent.data = Uri.parse("https://www.instagram.com/abhinavp403/")
            startActivity(intent)
        }
        super.onViewCreated(view, savedInstanceState)
    }
}