package com.example.ex_button01

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var result_text = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {}
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                if (s!!.length == 3 || s!!.length == 8) {
                    result_text += "-"
                    textView.text = result_text
                }
            }
        })

        button_one.setOnClickListener {
            result_text += 1
            textView.text = result_text
        }

        button_two.setOnClickListener {
            result_text += 2
            textView.text = result_text
        }

        button_three.setOnClickListener {
            result_text += 3
            textView.text = result_text
        }

        button_four.setOnClickListener {
            result_text += 4
            textView.text = result_text
        }

        button_five.setOnClickListener {
            result_text += 5
            textView.text = result_text
        }

        button_six.setOnClickListener {
            result_text += 6
            textView.text = result_text
        }

        button_seven.setOnClickListener {
            result_text += 7
            textView.text = result_text
        }

        button_eight.setOnClickListener {
            result_text += 8
            textView.text = result_text
        }

        button_nine.setOnClickListener {
            result_text += 9
            textView.text = result_text
        }

        button_zero.setOnClickListener {
            result_text += 0
            textView.text = result_text
        }

        button_clear.setOnClickListener {
            result_text = ""
            textView.text = result_text
        }

        button_call.setOnClickListener {
            resultView.text = textView.text
            result_text = ""
            textView.text = result_text
        }
    }
}
