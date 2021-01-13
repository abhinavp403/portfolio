package com.dev.abhinav.portfolio.ui.skills

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.diegodobelo.expandingview.ExpandingList
import com.dev.abhinav.portfolio.R

class SkillsFragment : Fragment() {

    private var mExpandingList: ExpandingList? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val root = inflater.inflate(R.layout.fragment_skills, container, false)
        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        mExpandingList = view.findViewById(R.id.expanding_list_skills)
        createItems()
    }

    private fun createItems() {
        addItem(
            "Mobile Development",
            arrayOf("Java, Kotlin, Flutter, Firestore, Retrofit, UI Design"),
            R.drawable.mobdev_icon
        )
        addItem(
            "Programming Languages",
            arrayOf("Java, Kotlin, Python, C++, JavaScript, HTML"),
            R.drawable.prg_icon
        )
        addItem(
            "Database",
            arrayOf("SQL, NoSQL, Firebase, MongoDB, AWS Amplify"),
            R.drawable.database_icon
        )
        addItem(
            "Frameworks",
            arrayOf("Spring, Hibernate"),
            R.drawable.framework_icon
        )
        addItem(
            "Techniques",
            arrayOf("Software Engineering, App Development, Machine Learning, Web Programming, Image Processing"),
            R.drawable.techniques_icon
        )
        addItem(
            "Soft Skills",
            arrayOf("Leadership, Communication, Organization, Responsibility, Punctuality"),
            R.drawable.softskills_icon
        )
    }

    private fun addItem(skill: String, subItems: Array<String>, iconRes: Int) {
        //Let's create an item with R.layout.expanding_layout_work
        val item = mExpandingList!!.createNewItem(R.layout.expanding_layout_skills)

        //If item creation is successful, let's configure it
        if (item != null) {
            item.setIndicatorIconRes(iconRes)
            //It is possible to get any view inside the inflated layout. Let's set the text in the item
            (item.findViewById(R.id.title) as TextView).text = skill

            item.createSubItems(subItems.size)
            for (i in 0 until item.subItemsCount) {
                val view = item.getSubItemView(i)
                (view.findViewById(R.id.sub_heading) as TextView).text = subItems[i]
            }
        }
    }
}
