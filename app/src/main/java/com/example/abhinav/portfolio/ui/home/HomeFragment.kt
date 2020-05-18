package com.example.abhinav.portfolio.ui.home

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.abhinav.portfolio.R
import com.google.firebase.firestore.FirebaseFirestore

class HomeFragment : Fragment() {

    private var db = FirebaseFirestore.getInstance()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val root = inflater.inflate(R.layout.fragment_home, container, false)
        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val quote: TextView = view.findViewById(R.id.quote)
        val movie: TextView = view.findViewById(R.id.movie)
        val book: TextView = view.findViewById(R.id.book)
        val song: TextView = view.findViewById(R.id.song)

        db.collection("Week").get()
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
                        if(document.getString("songbook") != null)
                            song.text = document.getString("song")
                    }
                } else {
                    Log.d("TAG", "Error getting documents.", task.exception)
                }
            }

        /*database = FirebaseDatabase.getInstance().getReference("Quotes").child("quote").child("quote")
        val postListener = object : ValueEventListener {
            override fun onDataChange(dataSnapshot: DataSnapshot) {
                // Get Post object and use the values to update the UI
                try {
                    Log.d("TAG", "loadPost:onDataChanged")
                    Log.d("TAG", dataSnapshot.toString())
                    val post = dataSnapshot.getValue()
                    quote.text = post.toString()
                }
                catch(e: Exception) {
                    e.printStackTrace()
                }
            }

            override fun onCancelled(databaseError: DatabaseError) {
                Log.d("TAG", "loadPost:onCancelled", databaseError.toException())
            }
        }
        database.addValueEventListener(postListener)*/
    }
}