package kr.co.tjoeun.pizzastore_20200714

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kr.co.tjoeun.pizzastore_20200714.adapters.MainViewPagerAdapter

class MainActivity : BaseActivity() {

//    어뎁터를 멤버변수로 생성
    lateinit var mvpa : MainViewPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupEvents()
        setValues()

    }

    override fun setValues() {

//        뷰페이저용 어뎁터 변수 초기화
        mvpa = MainViewPagerAdapter(supportFragmentManager)
        mainViewPager.adapter = mvpa

//        탭레이아웃의 기능으로 뷰페이저에 붙이기
        mainTabLayout.setupWithViewPager(mainViewPager)

    }

    override fun setupEvents() {

    }
}