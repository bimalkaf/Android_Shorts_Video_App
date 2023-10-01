package np.com.bimalkafle.miniclip.util

import android.content.Context
import android.widget.Toast

object UiUtil {

    fun showToast(context : Context,message : String){
        Toast.makeText(context,message,Toast.LENGTH_LONG).show()
    }
}