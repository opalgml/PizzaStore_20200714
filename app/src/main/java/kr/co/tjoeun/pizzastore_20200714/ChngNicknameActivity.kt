package kr.co.tjoeun.pizzastore_20200714

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_chng_nickname.*

class ChngNicknameActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chng_nickname)

        setValues()
        setupEvents()

    }



    override fun setValues() {

    }

    override fun setupEvents() {

        chgNickBtn.setOnClickListener {

//            입력한 닉네임을 받아야 들고 돌아감
            val inputNickName = chgNickEdtTxt.text.toString()

            val resultIntent = Intent()
            resultIntent.putExtra("chgNickName", inputNickName)

            setResult(Activity.RESULT_OK, resultIntent)

            finish()

        }

    }
}