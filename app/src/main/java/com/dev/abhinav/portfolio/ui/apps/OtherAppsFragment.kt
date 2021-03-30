package com.dev.abhinav.portfolio.ui.apps

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.dev.abhinav.portfolio.R

class OtherAppsFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val root = inflater.inflate(R.layout.fragment_otherapps, container, false)
        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val icon1: ImageView = view.findViewById(R.id.icon1)
        val icon2: ImageView = view.findViewById(R.id.icon2)
        val icon3: ImageView = view.findViewById(R.id.icon3)
        val icon4: ImageView = view.findViewById(R.id.icon4)
        val icon5: ImageView = view.findViewById(R.id.icon5)
        val caption1: TextView = view.findViewById(R.id.caption1)
        val caption2: TextView = view.findViewById(R.id.caption2)
        val caption3: TextView = view.findViewById(R.id.caption3)
        val caption4: TextView = view.findViewById(R.id.caption4)
        val caption5: TextView = view.findViewById(R.id.caption5)

        icon1.setOnClickListener {
            val intent = Intent()
            intent.action = Intent.ACTION_VIEW
            intent.addCategory(Intent.CATEGORY_BROWSABLE)
            intent.data = Uri.parse("https://play.google.com/store/apps/details?id=com.dev.abhinav.quotes")
            startActivity(intent)
        }

        caption1.setOnClickListener {
            val intent = Intent()
            intent.action = Intent.ACTION_VIEW
            intent.addCategory(Intent.CATEGORY_BROWSABLE)
            intent.data = Uri.parse("https://play.google.com/store/apps/details?id=com.dev.abhinav.quotes")
            startActivity(intent)
        }

        icon2.setOnClickListener {
            val intent = Intent()
            intent.action = Intent.ACTION_VIEW
            intent.addCategory(Intent.CATEGORY_BROWSABLE)
            intent.data = Uri.parse("https://play.google.com/store/apps/details?id=com.dev.abhinav.smartmusicplayer")
            startActivity(intent)
        }

        caption2.setOnClickListener {
            val intent = Intent()
            intent.action = Intent.ACTION_VIEW
            intent.addCategory(Intent.CATEGORY_BROWSABLE)
            intent.data = Uri.parse("https://play.google.com/store/apps/details?id=com.dev.abhinav.smartmusicplayer")
            startActivity(intent)
        }

        icon3.setOnClickListener {
            val intent = Intent()
            intent.action = Intent.ACTION_VIEW
            intent.addCategory(Intent.CATEGORY_BROWSABLE)
            intent.data = Uri.parse("https://play.google.com/store/apps/details?id=com.dev.abhinav.tic_tac_toe")
            startActivity(intent)
        }

        caption3.setOnClickListener {
            val intent = Intent()
            intent.action = Intent.ACTION_VIEW
            intent.addCategory(Intent.CATEGORY_BROWSABLE)
            intent.data = Uri.parse("https://play.google.com/store/apps/details?id=com.dev.abhinav.tic_tac_toe")
            startActivity(intent)
        }

        icon4.setOnClickListener {
            val intent = Intent()
            intent.action = Intent.ACTION_VIEW
            intent.addCategory(Intent.CATEGORY_BROWSABLE)
            intent.data = Uri.parse("https://play.google.com/store/apps/details?id=com.dev.abhinav.movierater")
            startActivity(intent)
        }

        caption4.setOnClickListener {
            val intent = Intent()
            intent.action = Intent.ACTION_VIEW
            intent.addCategory(Intent.CATEGORY_BROWSABLE)
            intent.data = Uri.parse("https://play.google.com/store/apps/details?id=com.dev.abhinav.movierater")
            startActivity(intent)
        }

        icon5.setOnClickListener {
            val intent = Intent()
            intent.action = Intent.ACTION_VIEW
            intent.addCategory(Intent.CATEGORY_BROWSABLE)
            intent.data = Uri.parse("https://play.google.com/store/apps/details?id=com.dev.abhinav.tennisstats")
            startActivity(intent)
        }

        caption5.setOnClickListener {
            val intent = Intent()
            intent.action = Intent.ACTION_VIEW
            intent.addCategory(Intent.CATEGORY_BROWSABLE)
            intent.data = Uri.parse("https://play.google.com/store/apps/details?id=com.dev.abhinav.tennisstats")
            startActivity(intent)
        }
        super.onViewCreated(view, savedInstanceState)
    }
}