package kr.co.tjoeun.pizzastore_20200714.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import kr.co.tjoeun.pizzastore_20200714.R
import kr.co.tjoeun.pizzastore_20200714.datas.Order

class OrderAdapter(val mContext:Context, val resid: Int, val mList:List<Order>) : ArrayAdapter<Order>(mContext, resid, mList)
{
    val inf = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        
        var tempRow = convertView
        
        if(tempRow == null)
        {
            tempRow = inf.inflate(R.layout.order_list_item, null)
        }
        val row = tempRow!!
        val data = mList[position]
        
        return row 
    }
}