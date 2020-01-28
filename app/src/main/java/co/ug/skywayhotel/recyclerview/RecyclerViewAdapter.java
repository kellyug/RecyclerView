package co.ug.skywayhotel.recyclerview;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

import static android.view.LayoutInflater.from;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {
    private static final String TAG = "RecyclerViewAdapter";
    private ArrayList<String> mFlags = new ArrayList<>();
    private ArrayList<String> mCountryNames = new ArrayList<>();
    private Context mContext;

    public RecyclerViewAdapter( Context mContext, ArrayList<String> mFlags, ArrayList<String> mCountryNames) {
        this.mFlags = mFlags;
        this.mCountryNames = mCountryNames;
        this.mContext = mContext;
    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_list_item, parent, false);
        ViewHolder holder = new ViewHolder(view);
       return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        Log.d(TAG, "OnBindViewHolder: method has been successfully called") ;
        Glide.with(mContext)
                .asBitmap()
                .load(mFlags.get(position))
                .into(holder.flag);
        holder.countryName.setText(mCountryNames.get(position));

        holder.parentLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClick: clicked on " + mCountryNames.get(position));
                Toast.makeText(mContext, mCountryNames.get(position), Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return mCountryNames.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        CircleImageView flag;
        TextView countryName;
        RelativeLayout parentLayout;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            flag = itemView.findViewById(R.id.image);
            countryName = itemView.findViewById(R.id.country_name);
            parentLayout = itemView.findViewById(R.id.parent_layout);







        }
    }
}
