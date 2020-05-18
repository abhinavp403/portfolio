package com.example.abhinav.portfolio.ui.education

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.diegodobelo.expandingview.ExpandingList
import com.example.abhinav.portfolio.R

class EducationFragment : Fragment() {

    private var mExpandingList: ExpandingList? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val root = inflater.inflate(R.layout.fragment_education, container, false)
        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        mExpandingList = view.findViewById(R.id.expanding_list_education)
        createItems()
    }

    private fun createItems() {
        addItem(
            "University of Massachusetts Amherst", "Bachelor of Science in Computer Science", "September 2016 - May 2020",
            arrayOf("GPA- 3.38"),
            R.drawable.umass_icon
        )
        addItem(
            "National Public School- HSR Layout", "High School Diploma", "June 2014 - March 2016",
            arrayOf("CBSE Boards- 91.2%"),
            R.drawable.nps_icon
        )
        addItem(
            "GreenWood High School", "High School Diploma", "June 2009 - March 2014",
            arrayOf("ICSE Boards- 95.4%"),
            R.drawable.gwh_icon
        )
        addItem(
            "Corley Elementary School", "Grade Level", "August 2004 - May 2009",
            arrayOf(""),
            R.drawable.corley_icon
        )
        addItem(
            "La Martiniere", "Pre-School", "June 2002 - May 2003",
            arrayOf(""),
            R.drawable.lm_icon
        )
    }

    private fun addItem(title: String, degree: String, dates: String, subItems: Array<String>, iconRes: Int) {
        //Let's create an item with R.layout.expanding_layout_work
        val item = mExpandingList!!.createNewItem(R.layout.expanding_layout_education)

        //If item creation is successful, let's configure it
        if (item != null) {
            item.setIndicatorIconRes(iconRes)
            //It is possible to get any view inside the inflated layout. Let's set the text in the item
            (item.findViewById(R.id.title) as TextView).text = title

            item.createSubItems(subItems.size)
            for (i in 0 until item.subItemsCount) {
                val view = item.getSubItemView(i)
                if(i == 0) {
                    (view.findViewById(R.id.degree) as TextView).text = degree
                    (view.findViewById(R.id.dates) as TextView).text = dates
                }
                configureSubItem(view, subItems[i])
            }
        }
    }

    private fun configureSubItem(view: View, subTitle: String) {
        (view.findViewById(R.id.sub_heading) as TextView).text = subTitle
    }
}
