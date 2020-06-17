package com.dev.abhinav.portfolio.ui.home

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.dev.abhinav.portfolio.R
import com.google.firebase.firestore.FirebaseFirestore

class HomeFragment : Fragment() {

    private var db = FirebaseFirestore.getInstance().collection("Week")

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val quote: TextView = view.findViewById(R.id.quote)
        val movie: TextView = view.findViewById(R.id.movie)
        val book: TextView = view.findViewById(R.id.book)
        val song: TextView = view.findViewById(R.id.song)

        db.get()
            .addOnCompleteListener { task ->
                if (task.isSuccessful) {
                    for (document in task.result!!) {
                        //Log.d("TAG", document.id + " => " + document.getString("quote"))
                        if(document.getString("quote") != null)
                            quote.text = document.getString("quote")
                        if(document.getString("movie") != null)
                            movie.text = document.getString("movie")
                        if(document.getString("book") != null)
                            book.text = document.getString("book")
                        if(document.getString("song") != null)
                            song.text = document.getString("song")
                    }
                } else {
                    Log.d("TAG", "Error getting documents.", task.exception)
                }
            }
    }
}