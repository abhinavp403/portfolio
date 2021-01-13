package com.dev.abhinav.portfolio.ui.work

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.diegodobelo.expandingview.ExpandingList
import com.dev.abhinav.portfolio.R

class WorkFragment : Fragment() {

    private var mExpandingList: ExpandingList? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val root = inflater.inflate(R.layout.fragment_work, container, false)
        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        mExpandingList = view.findViewById(R.id.expanding_list_work)
        createItems()
    }

    private fun createItems() {
        addItem(
            "Information Resources Group", arrayOf("Java Developer"), arrayOf("June 2020 - Present"),
            arrayOf("- Refactored Hibernate code to JDBC to optimize transaction control processes in client's web application\n" +
                    "- Coded using MVC Architecture in Java on Spring Framework using SQL Database in an Agile environment\n" +
                    "- Performed parallel and uniting tests for quality assurance and provided feedback to business analysts\n" +
                    "- Peer reviews of code conducted regularly to ensure highest quality and consistency"),
            R.drawable.irg_icon
        )
        addItem(
            "Harvesting Farmers Network", arrayOf("Mobile Development Intern"), arrayOf("June 2019 - August 2019"),
            arrayOf("- Interned with Agricultural startup to add multiple features to Android app to improve interface and user experience\n" +
                    "- Implemented feature to share in-app posts on WhatsApp and Facebook using Facebook API and Firebase Dynamic Links to achieve network traffic and promote app on social media\n" +
                    "- Used JavaMail API in backend to send emails to customer support in situations when a new user registers a profile in the app\n" +
                    "- Designed app page to help users select and manage their crops using Recycler view. Added YouTube link on how to grow each crop\n" +
                    "- Created profiles for each user containing details such as personal information, what crops they grow, and their recent activity on the app\n" +
                    "- Re-designed dashboard to make main menu look more intricate and compact\n" +
                    "- Created text box to help users write complain/questions to their local bureaucrats\n" +
                    "- Designed news feed page containing articles related to agriculture"),
            R.drawable.hfn_icon
        )
        addItem(
            "1LearnApp", arrayOf("Mobile Development Intern"), arrayOf("June 2018 - August 2018"),
            arrayOf("- Created feature for EdTech startup’s app that uses algorithm to match students based on opposite weaknesses and strengths which expanded potential userbase to all students enabling goal of peer to peer tutoring\n" +
                    "- Stored, manipulated, retrieved student profiles through Google Cloud Firebase using Android Studio\n" +
                    "- Extracted web data of high school names to EXCEL using Octoparse (Python Script) to match students by school"),
            R.drawable.onelearn_icon
        )
        addItem(
            "Hewlett Packard Enterprise", arrayOf("Android Intern"), arrayOf("June 2017 - July 2017"),
            arrayOf("- Developed database app on Android Studio for storing login info using Shared Preferences and user details that can be queried using Android SQLite tables\n" +
                        "- Presented to mentor and demonstrated functionality of storing user’s basic information which can be modified without code"),
            R.drawable.hpe_icon
        )
        addItem(
            "HoopStop", arrayOf("Product Management Intern"), arrayOf("June 2019 - July 2019"),
            arrayOf("- Assisted in generating a revenue system for cash flow through in-app purchases\n" +
                    "- Brainstormed creative ideas to set up tournament feature for the app such as different types of tournaments and their layouts\n" +
                    "- Developed wire frames for app pages"),
            R.drawable.hoopstop_icon
        )
        addItem(
            "CICS UMass Amherst", arrayOf("Undergraduate Teaching Assistant"), arrayOf("January 2020 - May 2020"),
            arrayOf("- Course CS 328: Mobile Health Sensing and Analytics\n" +
                    "- Conducting weekly labs to help students with assignment\n" +
                    "- Grading projects and online quizzes\n" +
                    "- Answering questions and doubts on Piazza"),
            R.drawable.cics_icon
        )
        addItem(
            "UMass Amherst", arrayOf("Math Paper Grader", "Soccer Referee"), arrayOf("September 2018 - May 2020", "March 2018 - November 2018"),
            arrayOf("- Correcting Weekly quizzes for calculus III/ Differential Equations and giving helpful feedback to professor and students\n",
                    "- Officiated matches for competitive intramural tournament to ensure games are played fairly and safely"),
            R.drawable.umass_icon
        )
    }

    private fun addItem(title: String, role:  Array<String>, dates:  Array<String>, subItems: Array<String>, iconRes: Int) {
        //Let's create an item with R.layout.expanding_layout_work
        val item = mExpandingList!!.createNewItem(R.layout.expanding_layout_work)

        //If item creation is successful, let's configure it
        if (item != null) {
            item.setIndicatorIconRes(iconRes)
            //It is possible to get any view inside the inflated layout. Let's set the text in the item
            (item.findViewById(R.id.title) as TextView).text = title

            item.createSubItems(subItems.size)
            for (i in 0 until item.subItemsCount) {
                val view = item.getSubItemView(i)
                (view.findViewById(R.id.role) as TextView).text = role[i]
                (view.findViewById(R.id.dates) as TextView).text = dates[i]
                (view.findViewById(R.id.sub_heading) as TextView).text = subItems[i]
            }
        }
    }
}