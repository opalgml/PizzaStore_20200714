package kr.co.tjoeun.pizzastore_20200714.fragments

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_my_page.*
import kr.co.tjoeun.pizzastore_20200714.ChngNicknameActivity
import kr.co.tjoeun.pizzastore_20200714.R

class MyPageFragment : Fragment() {

    val REQ_FOR_NEW_NICKNAME = 1995

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_my_page, container, false)
    }

//    프래그먼ㅌ의 모든 이벤트 처리는 onActivityCreated 에서 처리(동작 처리 담당 함수)!
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

            nickEditBtn.setOnClickListener {

            val myIntent = Intent(activity, ChngNicknameActivity::class.java)

                val resultNick = startActivityForResult(myIntent, REQ_FOR_NEW_NICKNAME)

              }

       }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if(requestCode == REQ_FOR_NEW_NICKNAME)
        {
            if(resultCode == Activity.RESULT_OK)
            {
                val newNick = data?.getStringExtra("chgNickName")
                editNickName.setText(newNick) //editText 태그 값은 setText()로 설정해주어야 함!
            }
        }

    }
}

