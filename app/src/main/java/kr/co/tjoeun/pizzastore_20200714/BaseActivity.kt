package kr.co.tjoeun.pizzastore_20200714

import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity: AppCompatActivity() {

    val mContext = this
    abstract fun setValues()
    abstract fun setupEvents()

}