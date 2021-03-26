package tw.com.pu.gm.csim.s1082821.counter20210319

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*



class MainActivity : AppCompatActivity(), View.OnClickListener, View.OnLongClickListener{
    var counter: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        txv.setOnClickListener(this)
        btn.setOnClickListener(this)
        btn2.setOnClickListener(this)
        btn3.setOnClickListener(this)
        btnHappy.setOnClickListener(object : View.OnClickListener{
            override fun onClick(p0: View?) {
                counter= (1..100).random()
                txv.text = counter.toString()
            }
        })
        txv.setOnLongClickListener(this)

    }
    override fun onClick(view: View) {
        if (view.id.equals(R.id.txv)){
            counter++
        }
        if (view.id.equals(R.id.btn)){
            counter++
        }
        if (view.id.equals(R.id.btn2)){
            counter += 2
        }
        if (view.id.equals(R.id.btn3)){
            counter = 0
        }
        txv.text = counter.toString()
    }
    override fun onLongClick(p0: View?): Boolean {
        counter+=2
        txv.text = counter.toString()
        return true
    }
}