package com.gorcyn.sample.kotlin

import android.app.AlertDialog
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.ActionBarActivity
import android.support.v7.widget.Toolbar
import android.view.View
import android.widget.TextView

import java.text.DateFormat
import java.util.Date

open class KotlinActivity : ActionBarActivity() {

    protected override fun onCreate(savedInstanceState: Bundle?): Unit {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin)

        val toolbar: Toolbar = findViewById(R.id.toolbar) as Toolbar
        setSupportActionBar(toolbar)

        val time: TextView = findViewById(R.id.time) as TextView
        time.setText(DateFormat.getDateTimeInstance().format(Date()))
    }

    public fun finishActivity(view: View) {
        when (view.getId()) {
            R.id.finish, R.id.hello -> finish()
            else -> alert("You clicked on time!")
        }
    }

    fun alert(message: String) {
        AlertDialog.Builder(this)
            .setTitle(R.string.failure)
            .setMessage(message)
            .setCancelable(false)
            .setPositiveButton(android.R.string.ok, null)
            .show();
    }
}
