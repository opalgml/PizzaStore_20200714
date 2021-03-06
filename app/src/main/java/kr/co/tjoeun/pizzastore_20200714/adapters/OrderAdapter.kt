package kr.co.tjoeun.pizzastore_20200714.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.order_list_item.view.*
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

        val storeName = row.findViewById<TextView>(R.id.storeNameTxt)
        val imgSrc = row.findViewById<ImageView>(R.id.cirImg)

        storeName.text = data.name
        Glide.with(mContext).load(data.logoUrl).into(imgSrc)

        return row 
    }
}