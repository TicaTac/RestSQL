package clm.restsql;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by jbt on 7/17/2016.
 */
public class veganRestAdapter extends ArrayAdapter<veganRest> {
    List <veganRest> veganRestraunts;
    Context c;

    public veganRestAdapter(Context context, int resource, List<veganRest> objects) {
        super(context, resource, objects);
        veganRestraunts=objects;
        c=context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v=convertView;
        if (v==null) {
            //create layout inflater, link to view, inflate
            LayoutInflater viewInflater;
            viewInflater = LayoutInflater.from(getContext());
            v=viewInflater.inflate(R.layout.single_item_1,null);
        }
        veganRest currentRest = veganRestraunts.get(position);
        // catch layout items & link to Array list

        TextView nameTV = (TextView) v.findViewById(R.id.nameTV);
        TextView addressTV = (TextView) v.findViewById(R.id.addressTV);
        ImageView image = (ImageView) v.findViewById(R.id.veganIV);

        nameTV.setText(currentRest.getRestname());
        addressTV.setText(currentRest.getAddress());

        /*if (currentRest.isVegan()){
            image.setImageResource(R.drawable.vegan) ;
        }
        else {
            image.setImageResource(R.drawable.friendly) ;
        } */
        return v;
    }
}
