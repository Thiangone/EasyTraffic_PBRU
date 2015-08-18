package th.ac.pbru.mytest.easytraffic;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

/**
 * Created by Lab on 8/18/2015.
 */
public class Myadapter extends BaseAdapter{
  // Explicit
    private Context objContext;
    private int[]iconInts;
    private String[] titleStrings;

    public Myadapter(Context objContext, int[] iconInts, String[] titleStrings) {
        this.objContext = objContext;
        this.iconInts = iconInts;
        this.titleStrings = titleStrings;
    }//Costructor


    @Override
    public int getCount() {
        return titleStrings.length;
    }//ตัวนับ จำนวนข้อมูลที่โยนเข้ามา

    @Override
    public Object getItem(int position) {
        return null;
    }//

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

       
        return null;
    }//getView
}// main Class

