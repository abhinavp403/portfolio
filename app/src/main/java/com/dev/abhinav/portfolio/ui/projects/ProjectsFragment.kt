package com.dev.abhinav.portfolio.ui.projects

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.diegodobelo.expandingview.ExpandingList
import com.dev.abhinav.portfolio.R

class ProjectsFragment : Fragment() {

    private var mExpandingList: ExpandingList? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val root = inflater.inflate(R.layout.fragment_projects, container, false)
        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        mExpandingList = view.findViewById(R.id.expanding_list_projects)
        createItems()
    }

    private fun createItems() {
        addItem(
            "Recipe App", arrayOf("February 2021"),
            arrayOf("App to retrieve recipe details from recipesapi.herokuapp.com and display it in recycler view with categories differentiated " +
                    "as toggleable chips. App coded using JetPack Compost library in Android Studio Canary which uses kotlin to replace xml for UI specs. " +
                    "MVVM architecture used.\n" +
                    "https://github.com/abhinavp403/RecipeApp"),
            R.drawable.one
        )
        addItem(
            "Stock Update Google Sheets", arrayOf("September 2020"),
            arrayOf("Coded a python script which updates the stocks on my watchlist on a daily basis daily. Finnhub API retrieves information " +
                    "such as open, close, low, high values and puts them in a tabular form in google sheets. Project is uploaded on Google Console, which " +
                    "creates a json file to be shared on your sheets to edit it and establishes an intermediary between code and Google Sheets. " +
                    "It takes about a minute to update data for 20 stocks.\n" +
                    "https://github.com/abhinavp403/stock-update-sheets"),
            R.drawable.two
        )
        addItem(
            "Guide Dog", arrayOf("November 2017"),
            arrayOf("An Android app designed for blind people to help them to identify objects in front of them which in turn " +
                    "helps them navigate around places. It takes a picture using an inbuilt camera that recognizes the object " +
                    "using Clairfai API, speaks out resultant object and detects its distance from user using ultrasound sensors connected to Arduino. " +
                    "https://github.com/abhinavp403/GuideDog"),
            R.drawable.three
        )
        addItem(
            "TravelPlanner", arrayOf("December 2019"),
            arrayOf("A web app which generates the most optimal itinerary of tourist sites/restaurants based on shortest distance and " +
                    "earliest deadline scheduling algorithms of the places provided by user input. It runs on a local server hosted using " +
                    "ExpressJS and retrives data from cloud MongoDB. The distance and travel time between places was calculated in real time " +
                    "using Google's distance matrix API. The webpage was designed using HTML, CSS and bootstrap.\n" +
                    "https://github.com/abhinavp403/TravelPlanners"),
            R.drawable.four
        )
        addItem(
            "Walk Alert", arrayOf("December 2018"),
            arrayOf("Android app in which gives sound alert/vibration to users to start walking for 5 minutes for every 1 hour of sitting. " +
                    "Machine learning techniques were used in Python to train dataset to distinguish between walking and sitting. Purpose " +
                    "of app is to remind employees with desk jobs to move around during their office times.\n" +
                    "https://github.com/abhinavp403/MyActivitiesSolution"),
            R.drawable.five
        )
        addItem(
            "Sign 2 Speech", arrayOf("November 2018"),
            arrayOf("An Android camera app which detects sign language using machine learning algorithms and speaks words aloud " +
                    "in real-time. Tested and trained alphabet signs using Python and converted text-to-speech using Apple Speech API."),
            R.drawable.six
        )
        addItem(
            "Collabarter", arrayOf("February 2017"),
            arrayOf("A website which connects college students on the basis of opposite strengths and weaknesses for the purpose of " +
                    "tutoring. Database of student profiles were stored using Java and website was created using HTML, CSS, PHP.\n" +
                    "https://devpost.com/software/collabarter"),
            R.drawable.seven
        )
        addItem(
            "FacialZheimer", arrayOf("March 2017"),
            arrayOf("Facial recognition web app for Alzheimer patients which helps them to identify people around them. Created " +
                    "the app using JavaScript, HTML and is used by taking a picture on Raspberry Pi camera, matching the image from " +
                    "database and speaking subsequent the name.\n" +
                    "https://devpost.com/software/facialzheimer"),
            R.drawable.eight
        )
        addItem(
            "Misc. Android Studio Projects", arrayOf("August 2017 - Present"),
            arrayOf("Calculator\n" + "Weather App\n" + "Sound Recorder\n" + "Static Google Map\n" + "Dice Roller"),
            R.drawable.nine
        )
    }

    private fun addItem(title: String, dates: Array<String>, subItems: Array<String>, iconRes: Int) {
        val item = mExpandingList!!.createNewItem(R.layout.expanding_layout_projects)
        if (item != null) {
            item.setIndicatorIconRes(iconRes)
            (item.findViewById(R.id.title) as TextView).text = title
            item.createSubItems(subItems.size)
            for (i in 0 until item.subItemsCount) {
                val view = item.getSubItemView(i)
                (view.findViewById(R.id.dates) as TextView).text = dates[i]
                (view.findViewById(R.id.sub_heading) as TextView).text = subItems[i]
            }
        }
    }
}