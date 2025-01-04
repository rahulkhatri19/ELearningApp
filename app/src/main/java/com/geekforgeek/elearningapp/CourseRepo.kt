package com.geekforgeek.elearningapp

import android.content.Context
import androidx.compose.ui.graphics.Color
import com.geekforgeek.elearningapp.model.CourseModel
import com.geekforgeek.elearningapp.model.ExploreModel
import com.geekforgeek.elearningapp.model.MyCoursesModel
import com.geekforgeek.elearningapp.model.ProfileModel
import org.json.JSONObject

class CourseRepo {

    fun getJsonData(context: Context): JSONObject {
        val jsonData =
            context.assets.open("course_data.json").bufferedReader().use { it.readText() }
        return JSONObject(jsonData)
    }

    fun getHomeCourseData(jsonObject: JSONObject): ArrayList<CourseModel> {
        val courseList = arrayListOf<CourseModel>()
        val jsonArray = jsonObject.getJSONArray("courseList")
        for (i in 0..<jsonArray.length()) {
            val courseData = jsonArray.getJSONObject(i)
            println("Home Course Data" + jsonArray[i])
            courseList.add(
                CourseModel(
                    courseData.optString("courseImage"),
                    courseData.optString("courseTitle"),
                    courseData.optString("rating"),
                    courseData.optString("numberOfGeeks"),
                )
            )
        }
        return courseList
    }

    fun getExploreData(jsonObject: JSONObject): ArrayList<ExploreModel> {
        val exploreList = arrayListOf<ExploreModel>()
        val jsonArray = jsonObject.getJSONArray("exploreList")
        for (i in 0..<jsonArray.length()) {
            val courseData = jsonArray.getJSONObject(i)
            val colorList = arrayListOf<Color>()
            for (j in 0..<courseData.getJSONArray("colorList").length()) {
                val colorHex =
                    android.graphics.Color.parseColor(courseData.getJSONArray("colorList")[j].toString())
                colorList.add(Color(colorHex))
            }
            exploreList.add(
                ExploreModel(
                    courseData.optString("title"),
                    courseData.optString("description"),
                    colorList
                )
            )
            println("Home Explore Data" + jsonArray[i] + "::colorlist:${colorList}")
        }
        return exploreList
    }

    fun myCoursesData(jsonObject: JSONObject): ArrayList<MyCoursesModel> {
        val myCourseList = arrayListOf<MyCoursesModel>()
        val jsonArray = jsonObject.getJSONArray("myCoursesList")
        for (i in 0..<jsonArray.length()) {
            println("Home My Courses Data" + jsonArray[i])
            val courseData = jsonArray.getJSONObject(i)
            myCourseList.add(
                MyCoursesModel(
                    courseData.optString("courseImage"),
                    courseData.optString("courseTitle"),
                    courseData.getBoolean("isPaid"),
                )
            )
        }
        return myCourseList
    }

    fun profileData(jsonObject: JSONObject): ProfileModel {
        val profileData = jsonObject.getJSONObject("profileData")
        println("Home profile Data :: $profileData")
        return ProfileModel(
            profileData.optString("userImage"),
            profileData.optString("userName"),
            profileData.optString("userHandle"),
            profileData.optString("userCollege"),
            profileData.optString("followers"),
            profileData.optString("following"),
            profileData.optString("articles"),
        )
    }
}