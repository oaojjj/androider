package com.professionalandroid.apps.androider.navigation.addpost.addstore

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.professionalandroid.apps.androider.R
import kotlinx.android.synthetic.main.activity_searchaddress.*

class SearchAddressActivity : AppCompatActivity(), PickCountryDialog.NoticeDialogListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_searchaddress)

        btn_searchaddress_choosecountry.setOnClickListener {
            val countryPicker = PickCountryDialog()
            countryPicker.show(supportFragmentManager, "country_picker")
        }
    }

    override fun onDialogCompleteClick(value: String) {
        btn_searchaddress_choosecountry.text = value
    }
}